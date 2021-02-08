package service;

import dao.AbstractTravelDAO;
import dao.CityMapper;
import entity.City;
import entity.Travel;

import java.util.List;

public class TravelService {

    private AbstractTravelDAO abstractTravelDAO;

    public TravelService(AbstractTravelDAO abstractTravelDAO) {
        this.abstractTravelDAO = abstractTravelDAO;
    }


    public List<City> getAllCities() {
        return abstractTravelDAO.getAllCities();
    }

    public List<Travel> getTravelByDate() {
        return null;
    }
}
