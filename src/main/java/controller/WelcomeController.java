package controller;

import entity.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.LoginService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;


public class WelcomeController extends AbstractController {
    private LoginService loginService;

    public WelcomeController(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Cookie[] cookie = httpServletRequest.getCookies();

        if (cookie.length >= 2) {
            for (Cookie cook : cookie) {
                if (cook.getName().equals("user")) {

                    User user = loginService.getUserByUsername(String.valueOf(cook));
                    HttpSession session = httpServletRequest.getSession();
                    session.setAttribute("use", user);
                    httpServletRequest.getRequestDispatcher("/search").forward(httpServletRequest, httpServletResponse);
                }
            }
        } else {
            return new ModelAndView("login");
        }


        return null;
    }
}
