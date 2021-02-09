package dao;

import entity.Ticket;

public interface AbstractTicketDAO {
    boolean buyTicket(Ticket ticket);
}
