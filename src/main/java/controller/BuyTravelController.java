package controller;

import entity.Travel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.TravelService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


public class BuyTravelController extends AbstractController {

    private TravelService travelService;

    public BuyTravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        List<Travel> list = (List<Travel>) session.getAttribute("travels");

        for (Travel travel : list) {
            if (httpServletRequest.getParameter(travel.getTravelId()) != null) {
                session.setAttribute("chosen", travel);
            }
        }

        ModelAndView modelAndView = new ModelAndView("buy");
        return modelAndView;
    }
}
