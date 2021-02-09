package dao;

import entity.DetailTicket;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DetailTicketDAOIml implements AbstractDetailTicketDAO{

    private JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_LIST_TICKETS_FOR_USER = "select ti.ticket_id, tr.departure_date  from ticket ti " +
            "join travel tr on ti.travel_id=tr.id where ti.client_user_id=?";
    private final String SQL_GET_DETAIL_FOR_TICKET = "select ti.gender, ti.passenger_name, ti.ticket_id," +
            " c.name_city, c2.name_city, tr.departure_date, tr.departure_time, tr.travel_id from ticket ti " +
            "join travel tr on ti.travel_id=tr.id " +
            "join city c on c.id=tr.origin " +
            "join city c2 on c2.id=tr.destination where ti.ticket_id=?";

    public DetailTicketDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<DetailTicket> getListOfTicketsByUserID(Integer id) {
        return this.jdbcTemplate.query(SQL_FIND_LIST_TICKETS_FOR_USER, new Object[]{id}, new ListTicketMapper());
    }

    @Override
    public DetailTicket getDetailTicketByTicketId(String ticketId) {
        return this.jdbcTemplate.queryForObject(SQL_GET_DETAIL_FOR_TICKET, new Object[]{ticketId}, new DetailPerTicketMapper());
    }
}
