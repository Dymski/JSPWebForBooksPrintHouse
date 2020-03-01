package controller.servlets;

import controller.account.AccountDAO;
import model.AccountEntity;
import model.OrderEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/sign_in")
public class SignInServlet extends HttpServlet {
    private SessionFactory factory;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/sign_in.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        AccountDAO accountDAO = new AccountDAO();
        AccountEntity accountEntity = accountDAO.loginVerification(req, factory);

        if (accountEntity != null) {



            req.getRequestDispatcher("/sign_in_success.jsp").forward(req, resp);
        } else {

            req.getRequestDispatcher("/sign_in_failure.jsp").forward(req, resp);
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
