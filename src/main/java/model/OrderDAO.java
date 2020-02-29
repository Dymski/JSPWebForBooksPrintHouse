package model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.http.HttpServletRequest;

public class OrderDAO implements OrderDaoInterfae {


    @Override
    public void saveOrder(HttpServletRequest req, SessionFactory factory) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        OrderEntity orderEntity = new OrderEntity();

        System.out.println(req.getParameter("bookFormat"));
        System.out.println(req.getParameter("paperType"));
        System.out.println(Integer.parseInt(req.getParameter("numberOfCopies")));
        System.out.println(Integer.parseInt(req.getParameter("blackAndWhitePages")));
        System.out.println(Integer.parseInt(req.getParameter("colorPages")));
        System.out.println(req.getParameter("Invoice"));
        System.out.println(req.getParameter("PaymentCurrency"));


        transaction.commit();
        session.persist(orderEntity);
        session.close();
    }

    @Override
    public OrderEntity listOrdersByEmail(String email) {
        return null;
    }
}
