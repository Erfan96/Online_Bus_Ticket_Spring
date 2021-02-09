package dao;

import entity.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TicketDAOIml implements AbstractTicketDAO {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_ADD_TICKET = "insert into ticket " +
            "(gender, passenger_name, ticket_id, travel_id, client_user_id) values(?, ?, ?, ?, ?)";
    private final String SQL_DELETE_TICKET_BY_TICKET_ID = "delete from ticket where ticket_id=?";


    public TicketDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean addTicket(Ticket ticket) {
        return this.jdbcTemplate.update
         (SQL_ADD_TICKET, ticket.getGender(), ticket.getPassengerName(),
                 ticket.getTicketId(), ticket.getTravelId(), ticket.getUser_id()) > 0;
    }

    @Override
    public boolean deleteTicketByTicketId(String ticketID) {
        return this.jdbcTemplate.update(SQL_DELETE_TICKET_BY_TICKET_ID, ticketID) > 0;
    }
}
