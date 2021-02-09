package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.TicketService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteTicketController extends AbstractController {

    private TicketService ticketService;

    public DeleteTicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String ticketId = httpServletRequest.getParameter("value");
        ticketService.deleteTicketByTicketId(ticketId);
        httpServletRequest.getRequestDispatcher("/tickets").forward(httpServletRequest, httpServletResponse);
        return null;
    }
}
