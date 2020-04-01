package model;

import model.OrderEntity;
import org.hibernate.SessionFactory;

import javax.servlet.http.HttpServletRequest;

public interface OrderDaoInterfae {

    void saveOrder(HttpServletRequest req, SessionFactory factory) throws Exception;
    OrderEntity listOrdersByEmail(String email);
}
