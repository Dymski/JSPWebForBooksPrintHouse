package model;


import controller.NbpAPI;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.util.Objects;

public class OrderDAO implements OrderDaoInterfae {
    NbpAPI nbpAPI = new NbpAPI();
    JSONObject jsonObject;

    @Override
    public void saveOrder(HttpServletRequest req, SessionFactory factory) throws Exception {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        OrderEntity orderEntity = new OrderEntity();
        AccountDAO accountDAO = new AccountDAO();

        orderEntity.setAccountEntity(accountDAO.getAccountIdBySessionAttribute(req, factory));


        orderEntity.setBookFormat(req.getParameter("bookFormat"));
        orderEntity.setPaperType(req.getParameter("paperType"));
        orderEntity.setNumberOfCopies(Integer.parseInt(req.getParameter("numberOfCopies")));
        orderEntity.setBlackAndWhitePages(Integer.parseInt(req.getParameter("blackAndWhitePages")));
        orderEntity.setColorPages(Integer.parseInt(req.getParameter("colorPages")));
        orderEntity.setInvoice(req.getParameter("invoice"));
        orderEntity.setPaymentCurrency(req.getParameter("paymentCurrency"));
        if (!Objects.equals(orderEntity.getPaymentCurrency(), "PLN")) {
                jsonObject = new JSONObject(nbpAPI.sendGet(orderEntity.getPaymentCurrency()));
                JSONArray array = jsonObject.getJSONArray("rates");
                for (int i = 0; i < array.length(); i++) {
                    orderEntity.setForexRate(array.getJSONObject(i).getDouble("mid"));
                }
                orderEntity.setFvNumber(nbpAPI.sendGet(orderEntity.getPaymentCurrency()));

        }
        orderEntity.setPriceInPLN(100);
//        orderEntity.setPriceInForeignCurrency(round(orderEntity.getPriceInPLN()/orderEntity.getForexRate()));

//        System.out.println(req.getSession().getAttribute("id"));
//        System.out.println(accountDAO.getAccountIdBySessionAttribute(req,factory));
        accountDAO.getAccountIdBySessionAttribute(req, factory).addOrderEntityToAccountEntity(orderEntity);

        session.save(orderEntity);
        session.persist(orderEntity);
        transaction.commit();
        session.close();
    }

    private double round(double v) {
        double val = v;
        val = val*100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    @Override
    public OrderEntity listOrdersByEmail(String email) {
        return null;
    }
}
