package dao;

import entity.DetailTicket;
import entity.User;

import java.util.List;

public interface AbstractDetailTicketDAO {
    List<DetailTicket> getListOfTicketsByUserID(Integer id);
    DetailTicket getDetailTicketByTicketId(String ticketId);
}
