package com.example.myticket.model.ticket;

import com.example.myticket.model.BaseEntity;
import com.example.myticket.model.category.CategoryEntity;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="ticket")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity extends BaseEntity {

    @Column(name = "uuid", nullable = false, unique = true)
    private String uuid;

    @JoinColumn(name = "category_id", nullable = false)
    @ManyToOne
    private CategoryEntity category;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "details", nullable = false)
    private String details;

    @Column(name = "assignedTo", nullable = false)
    private String assignedTo;
}
