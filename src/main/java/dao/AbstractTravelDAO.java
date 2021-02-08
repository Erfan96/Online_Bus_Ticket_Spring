package dao;

import entity.City;
import entity.Travel;

import java.sql.Date;
import java.util.List;

public interface AbstractTravelDAO {

    List<City> getAllCities();
    City getCityByID(Integer id);
    List<Travel> getTravelByDate(Integer origin, Integer destination, Date date);
}
