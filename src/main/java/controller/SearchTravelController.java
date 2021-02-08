package controller;

import entity.City;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.TravelService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class SearchTravelController extends AbstractController {

    private TravelService travelService;

    public SearchTravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<City> cities = travelService.getAllCities();
        ModelAndView modelAndView = new ModelAndView("search");
        modelAndView.addObject("cities", cities);
        return modelAndView;
    }
}
