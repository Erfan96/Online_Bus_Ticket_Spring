package dao;


import entity.City;
import entity.Travel;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class TravelDAOIml implements AbstractTravelDAO {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_ALL_CITIES = "select * from city";

    public TravelDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<City> getAllCities() {
        return jdbcTemplate.query(SQL_FIND_ALL_CITIES, new CityMapper());
    }

    @Override
    public List<Travel> getTravelByDate() {
        return null;
    }
}
