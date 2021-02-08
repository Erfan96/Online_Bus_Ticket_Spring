package dao;

import entity.City;
import entity.Travel;

import java.util.List;

public interface AbstractTravelDAO {

    List<City> getAllCities();
    List<Travel> getTravelByDate();
}
