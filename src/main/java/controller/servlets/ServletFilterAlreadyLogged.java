package controller.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

@WebFilter
public class ServletFilterAlreadyLogged implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        if (Objects.nonNull(req.getSession().getAttribute("id"))) {

            request.getRequestDispatcher("/already_logged.jsp").forward(request, response);

        }else {
            chain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
