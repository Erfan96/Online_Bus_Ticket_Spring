package dao;

import entity.DetailTicket;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DetailPerTicketMapper implements RowMapper<DetailTicket> {
    @Override
    public DetailTicket mapRow(ResultSet resultSet, int i) throws SQLException {
        DetailTicket detailTicket = new DetailTicket();
        detailTicket.setTicketId(resultSet.getString("ticket_id"));
        detailTicket.setPassengerName(resultSet.getString("passenger_name"));
        detailTicket.setGender(resultSet.getString("gender"));
        detailTicket.setOrigin(resultSet.getString("name_city"));
        detailTicket.setDestination(resultSet.getString("name_city"));
        detailTicket.setDepartureDate(resultSet.getDate("departure_date"));
        detailTicket.setDepartureTime(resultSet.getString("departure_time"));
        detailTicket.setTravelId(resultSet.getString("travel_id"));
        return detailTicket;
    }
}
