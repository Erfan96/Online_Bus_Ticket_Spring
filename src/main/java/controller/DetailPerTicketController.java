package controller;


import entity.DetailTicket;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.DetailTicketService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class DetailPerTicketController extends AbstractController {

    private DetailTicketService detailTicketService;

    public DetailPerTicketController(DetailTicketService detailTicketService) {
        this.detailTicketService = detailTicketService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String ticketId = httpServletRequest.getParameter("value");
        DetailTicket detailTicket = detailTicketService.getDetailTicketByTicketId(ticketId);
        ModelAndView modelAndView = new ModelAndView("detailTicket");
        modelAndView.addObject("detail", detailTicket);
        return modelAndView;
    }
}
