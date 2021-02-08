package service;

import dao.AbstractTravelDAO;
import dao.CityMapper;
import entity.City;
import entity.Travel;

import java.sql.Date;
import java.util.List;

public class TravelService {

    private AbstractTravelDAO abstractTravelDAO;

    public TravelService(AbstractTravelDAO abstractTravelDAO) {
        this.abstractTravelDAO = abstractTravelDAO;
    }


    public List<City> getAllCities() {
        return abstractTravelDAO.getAllCities();
    }

    public List<Travel> getTravelByDate(Integer origin, Integer destination, Date date) {
        return abstractTravelDAO.getTravelByDate(origin, destination, date);
    }

    public City getCityByID(Integer id) {
        return abstractTravelDAO.getCityByID(id);
    }
}
