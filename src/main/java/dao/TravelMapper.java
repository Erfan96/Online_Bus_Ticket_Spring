package dao;

import entity.Travel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TravelMapper implements RowMapper<Travel> {

    @Override
    public Travel mapRow(ResultSet resultSet, int i) throws SQLException {
        Travel travel = new Travel();
        travel.setId(resultSet.getInt("id"));
        travel.setDepartureDate(resultSet.getDate("departure_date"));
        travel.setDepartureTime(resultSet.getString("departure_time"));
        travel.setTravelId(resultSet.getString("travel_id"));
        return travel;
    }
}
