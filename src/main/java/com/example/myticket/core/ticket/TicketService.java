package com.example.myticket.core.ticket;

import com.example.myticket.api.ticket.CreateTicketRequest;

public interface TicketService {

    String submitNewTicket(final CreateTicketRequest ticket);
}
