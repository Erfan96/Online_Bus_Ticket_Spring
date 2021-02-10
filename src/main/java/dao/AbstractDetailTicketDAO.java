package dao;

import entity.DetailTicket;

import java.util.List;

public interface AbstractDetailTicketDAO {
    List<DetailTicket> getListOfTicketsByUserID(Integer id);
    DetailTicket getDetailTicketByTicketId(String ticketId);
}
