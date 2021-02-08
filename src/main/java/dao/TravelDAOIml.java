package dao;


import entity.City;
import entity.Travel;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;


public class TravelDAOIml implements AbstractTravelDAO {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_ALL_CITIES = "select * from city";
    private final String SQL_FIND_TRAVEL_BY_DATE =
            "select * from travel where origin=? and destination=? and departure_date=?";

    public TravelDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<City> getAllCities() {
        return this.jdbcTemplate.query(SQL_FIND_ALL_CITIES, new CityMapper());
    }

    @Override
    public List<Travel> getTravelByDate(Integer origin, Integer destination, Date date) {
        return this.jdbcTemplate.query(SQL_FIND_TRAVEL_BY_DATE,new Object[]{origin, destination, date}, new TravelMapper());
    }


}
