package com.example.myticket.api.ticket;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class CreateTicketRequest {
    String category;
    String name;
    String details;
    String assignedTo;
}
