package com.example.myticket.model.dummy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends CrudRepository<DummyEntity, Long> {
}
