package controller;

import entity.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.LoginService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController extends AbstractController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String username = httpServletRequest.getParameter("userName");
        String password = httpServletRequest.getParameter("password");
        User user = loginService.getUserByUsername(username);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("use", user);

        if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
            Cookie use = new Cookie("user", username);
            Cookie pass = new Cookie("pass", password);
            httpServletResponse.addCookie(use);
            httpServletResponse.addCookie(pass);
            httpServletRequest.getRequestDispatcher("/search").forward(httpServletRequest, httpServletResponse);
        }
        else {
            return new ModelAndView("login");
        }

        return null;
    }
}
