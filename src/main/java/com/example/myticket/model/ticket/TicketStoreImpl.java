package com.example.myticket.model.ticket;

import com.example.myticket.model.category.CategoryEntity;
import com.example.myticket.model.category.CategoryRepository;
import com.example.myticket.model.category.CategoryStore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TicketStoreImpl implements TicketStore {

    private final TicketEntityFactory entityFactory;
    private final CategoryStore categoryStore;
    private final TicketRepository ticketRepository;


    @Override
    public TicketEntity create(
            final String category,
            final String name,
            final String details,
            final String assignedTo
    ) {

        CategoryEntity newCategory = categoryStore.upsert(category);

        TicketEntity newTicket = entityFactory.create(
                newCategory,
                name,
                details,
                assignedTo
        );

        return ticketRepository.save(newTicket);
    }
}
