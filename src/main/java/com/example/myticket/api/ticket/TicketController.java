package com.example.myticket.api.ticket;

import com.example.myticket.core.ticket.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping("/tickets")
    public String createNewTicket(@RequestBody final CreateTicketRequest ticket) {
        return ticketService.submitNewTicket(ticket);
    }

}
