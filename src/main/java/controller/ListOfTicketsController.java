package controller;

import entity.DetailTicket;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.DetailTicketService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListOfTicketsController extends AbstractController {

    private DetailTicketService detailTicketService;

    public ListOfTicketsController(DetailTicketService detailTicketService) {
        this.detailTicketService = detailTicketService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<DetailTicket> ticketList = detailTicketService.getListOfTicketsByUserID(1);
        ModelAndView modelAndView = new ModelAndView("listOfTickets");
        modelAndView.addObject("ticketList", ticketList);
        return modelAndView;
    }
}
