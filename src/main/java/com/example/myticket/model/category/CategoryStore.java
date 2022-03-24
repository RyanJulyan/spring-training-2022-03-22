package com.example.myticket.model.category;

import com.example.myticket.model.ticket.TicketEntity;

public interface CategoryStore {

    CategoryEntity upsert(
            final String name
    );
}
