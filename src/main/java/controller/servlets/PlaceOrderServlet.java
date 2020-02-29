package controller.servlets;

import model.AccountEntity;
import model.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.internal.util.PersistenceUtilHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PlaceOrder", value = "/place_order")
public class PlaceOrderServlet extends HttpServlet {
    private SessionFactory factory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/place_order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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


        session.persist(orderEntity);
        session.save(orderEntity);
        transaction.commit();
        session.close();

        req.getRequestDispatcher("/place_order_success.jsp").forward(req, resp);
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
