package controller;

import entity.Ticket;
import entity.Travel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.TicketService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

public class SuccessController extends AbstractController {

    private TicketService ticketService;

    public SuccessController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String pName = httpServletRequest.getParameter("passengerName");
        String gender = httpServletRequest.getParameter("gender");

        HttpSession session = httpServletRequest.getSession();
        Travel travel = (Travel) session.getAttribute("chosen");


//        User user = (User) session.getAttribute("use");

        String ticketId = String.valueOf(UUID.randomUUID());
        Ticket ticket = new Ticket();
        ticket.setGender(gender);
        ticket.setPassengerName(pName);
        ticket.setTravelId(travel.getId());
        ticket.setTicketId(ticketId);
        ticket.setUser_id(1);

        if (ticketService.buyTicket(ticket)) {

            String type = maleOrFemale(gender);
            httpServletRequest.setAttribute("type", type);
            httpServletRequest.setAttribute("passenger", pName);
            httpServletRequest.setAttribute("id", ticketId);
            return new ModelAndView("success");
        }
        return new ModelAndView("fail");
    }


    public String maleOrFemale(String gender) {
        if (gender.equals("MALE")) {
            return "Mr.";
        }
        return "Mrs.";
    }
}
