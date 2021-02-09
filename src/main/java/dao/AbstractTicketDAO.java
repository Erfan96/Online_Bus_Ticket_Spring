package dao;

import entity.Ticket;

public interface AbstractTicketDAO {
    boolean addTicket(Ticket ticket);
    boolean deleteTicketByTicketId(String ticketID);
}
