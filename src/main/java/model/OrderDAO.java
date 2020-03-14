package model;


import com.fasterxml.jackson.databind.ObjectMapper;
import controller.NbpAPI;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class OrderDAO implements OrderDaoInterfae {
    NbpAPI nbpAPI = new NbpAPI();
    ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void saveOrder(HttpServletRequest req, SessionFactory factory) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        OrderEntity orderEntity = new OrderEntity();
        AccountDAO accountDAO = new AccountDAO();

        orderEntity.setAccountEntity(accountDAO.getAccountIdBySessionAttribute(req,factory));


        orderEntity.setBookFormat(req.getParameter("bookFormat"));
        orderEntity.setPaperType(req.getParameter("paperType"));
        orderEntity.setNumberOfCopies(Integer.parseInt(req.getParameter("numberOfCopies")));
        orderEntity.setBlackAndWhitePages(Integer.parseInt(req.getParameter("blackAndWhitePages")));
        orderEntity.setColorPages(Integer.parseInt(req.getParameter("colorPages")));
        orderEntity.setInvoice(req.getParameter("invoice"));
        orderEntity.setPaymentCurrency(req.getParameter("paymentCurrency"));
        if(Objects.equals(orderEntity.getPaymentCurrency(),"PLN")){

        } else {
            try {
                objectMapper.readValue()
               orderEntity.setFvNumber(nbpAPI.sendGet(orderEntity.getPaymentCurrency()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        System.out.println(req.getSession().getAttribute("id"));
//        System.out.println(accountDAO.getAccountIdBySessionAttribute(req,factory));
        accountDAO.getAccountIdBySessionAttribute(req,factory).addOrderEntityToAccountEntity(orderEntity) ;

        session.save(orderEntity);
        session.persist(orderEntity);
        session.save(orderEntity);
        session.persist(orderEntity);
        transaction.commit();
        session.close();
    }

    @Override
    public OrderEntity listOrdersByEmail(String email) {
        return null;
    }
}
