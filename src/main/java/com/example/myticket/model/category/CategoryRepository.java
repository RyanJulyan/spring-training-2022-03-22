package com.example.myticket.model.category;

import lombok.AllArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByName(final String name);
}
