package dao;

import entity.DetailTicket;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListTicketMapper implements RowMapper<DetailTicket> {
    @Override
    public DetailTicket mapRow(ResultSet resultSet, int i) throws SQLException {
       DetailTicket detailTicket = new DetailTicket();
       detailTicket.setTicketId(resultSet.getString("ticket_id"));
       detailTicket.setDepartureDate(resultSet.getDate("departure_date"));
       return detailTicket;
    }
}
