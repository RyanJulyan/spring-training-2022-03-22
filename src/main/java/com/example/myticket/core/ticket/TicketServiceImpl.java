package com.example.myticket.core.ticket;

import com.example.myticket.api.ticket.CreateTicketRequest;
import com.example.myticket.model.ticket.TicketEntity;
import com.example.myticket.model.ticket.TicketStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketStore ticketStore;

    @Override
    public String submitNewTicket(final CreateTicketRequest ticket) {

        TicketEntity newTicket = ticketStore.create(
                ticket.getCategory(),
                ticket.getName(),
                ticket.getDetails(),
                ticket.getAssignedTo()
        );

        return newTicket.getUuid();
    }
}
