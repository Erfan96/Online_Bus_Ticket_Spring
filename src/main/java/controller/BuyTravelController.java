package controller;


import entity.City;
import entity.Travel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.TravelService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class BuyTravelController extends AbstractController {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    private TravelService travelService;

    public BuyTravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Integer origin = Integer.valueOf(httpServletRequest.getParameter("origin"));
        Integer destination = Integer.valueOf(httpServletRequest.getParameter("destination"));
        String date = httpServletRequest.getParameter("date");
        List<Travel> travels = travelService.getTravelByDate(origin, destination, parseDate(date));
        City originName = travelService.getCityByID(origin);
        City destinationName = travelService.getCityByID(destination);
        ModelAndView modelAndView = new ModelAndView("buy");
        modelAndView.addObject("date", date);
        modelAndView.addObject("travels", travels);
        modelAndView.addObject("origin", originName);
        modelAndView.addObject("destination", destinationName);
        return modelAndView;
    }

    private static Date parseDate(String date){
        try {
            return new Date(DATE_FORMAT.parse(date).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
