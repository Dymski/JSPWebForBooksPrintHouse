package model;

import org.hibernate.SessionFactory;

import javax.servlet.http.HttpServletRequest;

public interface AccountDaoInterface {

    public AccountEntity loginVerification(HttpServletRequest req, SessionFactory factory);

}
