package controller.servlets;

import model.AccountEntity;
import model.OrderDAO;
import model.OrderEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "PlaceOrder", value = "/place_order")
public class PlaceOrderServlet extends HttpServlet implements HttpSessionBindingListener {
    private SessionFactory factory;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/place_order.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OrderDAO orderDAO = new OrderDAO();
        try {
        orderDAO.saveOrder(req, factory);
        req.getRequestDispatcher("/place_order_success.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
//            req.getRequestDispatcher("/something_went_wrong_view.jsp").forward(req, resp);
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();

        Configuration configuration = new Configuration().configure("META-INF/hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        configuration.addAnnotatedClass(AccountEntity.class);
        configuration.addAnnotatedClass(OrderEntity.class);
        factory = configuration.buildSessionFactory(builder.build());

    }

    @Override
    public void destroy() {
        super.destroy();
    }

}
