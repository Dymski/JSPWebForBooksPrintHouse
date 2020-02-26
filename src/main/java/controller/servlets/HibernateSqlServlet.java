package controller.servlets;



import model.AccountEntity;
import model.OrderEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "SQLServlet", value = "/sql")
public class HibernateSqlServlet extends HttpServlet {
    private SessionFactory factory;

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
}
