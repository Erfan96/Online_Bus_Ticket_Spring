package dao;

import entity.DetailTicket;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DetailTicketDAOIml implements AbstractDetailTicketDAO{

    private JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_LIST_TICKETS_FOR_USER = "select ti.ticket_id, tr.departure_date  from ticket ti " +
            "join travel tr on ti.travel_id=tr.id where ti.client_user_id=?";


    public DetailTicketDAOIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<DetailTicket> getListOfTicketsByUserID(Integer id) {
        return this.jdbcTemplate.query(SQL_FIND_LIST_TICKETS_FOR_USER, new Object[]{id}, new ListTicketMapper());
    }
}
