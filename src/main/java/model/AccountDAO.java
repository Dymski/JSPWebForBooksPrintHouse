package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;

public class AccountDAO implements AccountDaoInterface {

    AccountEntity accountEntity = new AccountEntity();
    private SessionFactory factory;

    public AccountDAO() {
    }


    @Override
    public AccountEntity loginVerification(HttpServletRequest req, SessionFactory factory) {

        Session session = factory.openSession();


        AccountEntity accountEntity = (AccountEntity) session.createQuery(
                "select accountEntity from AccountEntity as accountEntity where accountEntity.email = :email")
                .setParameter("email", req.getParameter("email"))
                .getSingleResult();


        System.out.println(accountEntity.getPassword());
        System.out.println(req.getParameter("password"));
        System.out.println(req.getParameter("email"));

        if (accountEntity.getPassword().equals(req.getParameter("password"))) {

            return accountEntity;
        } else {
            return null;
        }
    }
}
