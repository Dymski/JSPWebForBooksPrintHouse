package controller.account;

import model.AccountEntity;
import org.hibernate.SessionFactory;

import javax.servlet.http.HttpServletRequest;

public interface AccountDaoInterface {

    AccountEntity loginVerification(HttpServletRequest req, SessionFactory factory);
    AccountEntity createAccountVerification(HttpServletRequest req, SessionFactory factory);

}
