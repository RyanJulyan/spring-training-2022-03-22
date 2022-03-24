package com.example.myticket.model.ticket;

import com.example.myticket.model.category.CategoryEntity;
import com.example.myticket.model.category.CategoryEntityFactory;
import com.example.myticket.model.category.CategoryRepository;
import com.example.myticket.model.dummy.DummyEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TicketRepository extends CrudRepository<TicketEntity, Long> {
}
