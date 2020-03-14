package controller.servlets;

import model.AccountDAO;
import model.AccountEntity;
import model.OrderEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.IOException;

@WebServlet(name = "LogOut", value = "/log_out")
public class LogOutServlet extends HttpServlet implements HttpSessionBindingListener {
    private SessionFactory factory;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/logout_success.jsp").forward(req, resp);
        req.getSession().invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/logout_success.jsp").forward(req, resp);
        req.getSession().invalidate();
    }

    @Override
    public void init() throws ServletException {
        super.init();

    }

    @Override
    public void destroy() {
        super.destroy();
    }


}
