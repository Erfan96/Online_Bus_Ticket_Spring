package controller;

import entity.DetailTicket;
import entity.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.DetailTicketService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class ListOfTicketsController extends AbstractController {

    private DetailTicketService detailTicketService;

    public ListOfTicketsController(DetailTicketService detailTicketService) {
        this.detailTicketService = detailTicketService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("use");
        List<DetailTicket> ticketList = detailTicketService.getListOfTicketsByUserID(user.getId());
        ModelAndView modelAndView = new ModelAndView("listOfTickets");
        modelAndView.addObject("ticketList", ticketList);
        return modelAndView;
    }
}
