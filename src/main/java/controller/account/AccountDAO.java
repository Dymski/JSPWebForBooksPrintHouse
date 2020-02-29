package controller.account;

import model.AccountEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

public class AccountDAO implements AccountDaoInterface {

    public AccountDAO() {
    }


    @Override
    public AccountEntity loginVerification(HttpServletRequest req, SessionFactory factory) {
        Session session = factory.openSession();

        AccountEntity accountEntity = null;

        try {
            accountEntity = (AccountEntity) session.createQuery(
                    "select accountEntity from AccountEntity as accountEntity where accountEntity.email = :email")
                    .setParameter("email", req.getParameter("email"))
                    .getSingleResult();

            if (accountEntity.getPassword().equals(req.getParameter("password"))) {
                session.close();
                return accountEntity;
            } else {
                session.close();
                return null;
            }

        } catch (NoResultException e) {
            session.close();
            return null;
        }


    }

    @Override
    public AccountEntity createAccountVerification(HttpServletRequest req, SessionFactory factory) {
        Session session = factory.openSession();

        Object queryObject;

        try {
            queryObject = session.createQuery("select accountEntity from AccountEntity as accountEntity where accountEntity.email = :email")
                    .setParameter("email", req.getParameter("email"))
                    .getSingleResult();
        } catch (NoResultException e) {
            queryObject = null;
        }


        if (queryObject == null) {
            Transaction transaction = session.beginTransaction();
            AccountEntity accountEntity = new AccountEntity();

            accountEntity.setEmail(req.getParameter("email"));
            accountEntity.setPassword(req.getParameter("password"));
            accountEntity.setCompanyName(req.getParameter("companyName"));
            accountEntity.setCreationDate(LocalDateTime.now());
            accountEntity.setTaxIdentificationNumber(req.getParameter("taxIdentificationNumber"));
            accountEntity.setSecretQuestion(req.getParameter("secretQuestion"));
            accountEntity.setSecretAnswer(req.getParameter("secretAnswer"));
            accountEntity.setNewsletterAgreement(req.getParameter("newsletterAgreement"));

            session.save(accountEntity);
            session.persist(accountEntity);
            transaction.commit();
            session.close();

            return accountEntity;

        } else {
            session.close();
            return null;
        }

    }
}
