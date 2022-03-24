package com.example.myticket.model.ticket;

import com.example.myticket.model.category.CategoryEntity;

public interface TicketEntityFactory {

    TicketEntity create(
            final CategoryEntity category,
            final String name,
            final String details,
            final String assignedTo
    );
}
