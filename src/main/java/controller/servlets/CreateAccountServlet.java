package controller.servlets;

import model.AccountEntity;
import model.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDateTime;

@WebServlet(name = "CreateAccount", value = "/create_account")
public class CreateAccountServlet extends HttpServlet {
    private SessionFactory factory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/create_account.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setEmail(req.getParameter("email"));
        accountEntity.setPassword(req.getParameter("password"));
        accountEntity.setCompanyName(req.getParameter("companyName"));
        accountEntity.setCreationDate(LocalDateTime.now());
        accountEntity.setTaxIdentificationNumber(Integer.parseInt(req.getParameter("taxIdentificationNumber")));
        accountEntity.setSecretQuestion(req.getParameter("secretQuestion"));
        accountEntity.setSecretAnswer(req.getParameter("secretAnswer"));
        accountEntity.setNewsletterAgreement(req.getParameter("newsletterAgreement"));


        session.save(accountEntity);
        transaction.commit();
        session.close();

        req.getRequestDispatcher("/create_account_success.jsp").forward(req, resp);
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
