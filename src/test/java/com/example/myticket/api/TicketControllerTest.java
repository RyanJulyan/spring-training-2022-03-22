package com.example.myticket.api;

import com.example.myticket.api.ticket.CreateTicketRequest;
import com.example.myticket.api.ticket.TicketController;
import com.example.myticket.model.dummy.DummyEntity;
import com.example.myticket.model.ticket.TicketEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TicketControllerTest {

    @Autowired
    private TicketController ticketController;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void givenRequestWithValidTicketDetails_whenSubmittedToController_shouldPersistAndReturnNewGUID() {
        // Setup fixture
        final CreateTicketRequest ticket = new CreateTicketRequest()
                .setCategory("Example Cat")
                .setName("Example Name")
                .setAssignedTo("Example User")
                .setDetails("Example Ticket Details");

        // Exercise SUT
        final String actual = ticketController.createNewTicket(ticket);


        final TicketEntity lastInsertedTicket = findLastInsertedTicket();

        // Verify results
        // -> Assert guid is the last record in the db
        assertEquals(actual, lastInsertedTicket.getUuid());
    }

    private TicketEntity findLastInsertedTicket() {
        return entityManager
                .createQuery("SELECT d FROM TicketEntity d ORDER BY d.id", TicketEntity.class)
                .setMaxResults(1)
                .getResultList()
                .get(0);
    }
}
