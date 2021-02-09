package service;

import dao.AbstractTicketDAO;
import entity.Ticket;

public class TicketService {

    private AbstractTicketDAO abstractTicketDAO;

    public TicketService(AbstractTicketDAO abstractTicketDAO) {
        this.abstractTicketDAO = abstractTicketDAO;
    }

    public boolean buyTicket(Ticket ticket) {
        return this.abstractTicketDAO.buyTicket(ticket);
    }
}
