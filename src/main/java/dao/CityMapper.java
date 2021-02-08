package dao;

import entity.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CityMapper implements RowMapper<City> {

    @Override
    public City mapRow(ResultSet resultSet, int i) throws SQLException {
        City city = new City();
        city.setName(resultSet.getString("name_city"));
        city.setId(resultSet.getInt("id"));
        return city;
    }
}
