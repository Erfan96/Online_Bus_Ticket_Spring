package dao;

import entity.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TicketDAOIml implements AbstractTicketDAO {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_BUY_TICKET = "insert into ticket " +
            "(gender, passenger_name, ticket_id, travel_id, client_user_id) values(?, ?, ?, ?, ?)";

    public TicketDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean buyTicket(Ticket ticket) {
        return this.jdbcTemplate.update
         (SQL_BUY_TICKET, ticket.getGender(), ticket.getPassengerName(),
                 ticket.getTicketId(), ticket.getTravelId(), ticket.getUser_id()) > 0;
    }
}
