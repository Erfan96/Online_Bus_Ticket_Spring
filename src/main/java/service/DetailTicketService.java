package service;

import dao.AbstractDetailTicketDAO;
import entity.DetailTicket;

import java.util.List;

public class DetailTicketService {

    private AbstractDetailTicketDAO abstractDetailTicketDAO;

    public DetailTicketService(AbstractDetailTicketDAO abstractDetailTicketDAO) {
        this.abstractDetailTicketDAO = abstractDetailTicketDAO;
    }

    public List<DetailTicket> getListOfTicketsByUserID(Integer id) {
        return this.abstractDetailTicketDAO.getListOfTicketsByUserID(id);
    }

    public DetailTicket getDetailTicketByTicketId(String ticketId) {
        return this.abstractDetailTicketDAO.getDetailTicketByTicketId(ticketId);
    }
}
