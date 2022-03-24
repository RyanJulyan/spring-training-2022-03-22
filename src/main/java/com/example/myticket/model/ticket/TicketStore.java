package com.example.myticket.model.ticket;

public interface TicketStore {

    TicketEntity create(
            final String category,
            final String name,
            final String details,
            final String assignedTo
    );
}
