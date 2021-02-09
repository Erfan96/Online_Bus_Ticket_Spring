package service;

import dao.AbstractTicketDAO;
import entity.Ticket;

public class TicketService {

    private AbstractTicketDAO abstractTicketDAO;

    public TicketService(AbstractTicketDAO abstractTicketDAO) {
        this.abstractTicketDAO = abstractTicketDAO;
    }

    public boolean addTicket(Ticket ticket) {
        return this.abstractTicketDAO.addTicket(ticket);
    }

    public boolean deleteTicketByTicketId(String ticketID) {
        return this.abstractTicketDAO.deleteTicketByTicketId(ticketID);
    }
}
