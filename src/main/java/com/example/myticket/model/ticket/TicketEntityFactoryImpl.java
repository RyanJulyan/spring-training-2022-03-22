package com.example.myticket.model.ticket;

import com.example.myticket.model.category.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class TicketEntityFactoryImpl implements TicketEntityFactory {

    @Override
    public TicketEntity create(
            final CategoryEntity category,
            final String name,
            final String details,
            final String assignedTo
    ) {
        String uuid = java.util.UUID.randomUUID().toString();

        return TicketEntity.builder()
                .uuid(uuid)
                .category(category)
                .name(name)
                .details(details)
                .assignedTo(assignedTo)
                .build();
    }
}
