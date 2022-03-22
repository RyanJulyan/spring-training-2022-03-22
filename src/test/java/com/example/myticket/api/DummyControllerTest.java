package com.example.myticket.api;

import com.example.myticket.api.dummy.DummyController;
import com.example.myticket.model.dummy.DummyEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DummyControllerTest {

    @Autowired
    private DummyController dummyController;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void givenRequestWithName_whenSubmittedToController_shouldPersistAndReturnGreeting() {
        // Setup fixture
        final String nameFixture = "Bob Hoskins";
        final List<DummyEntity> dummiesBefore = findDummiesByNameOrderedById(nameFixture);

        // Setup expectations
        final String expected = "Hello Bob Hoskins!";

        // Exercise SUT
        final String actual = dummyController.submitName(nameFixture);

        // Verify results
        // -> Assert Dummy entity was persisted
        final List<DummyEntity> dummiesAfter = findDummiesByNameOrderedById(nameFixture);
        assertEquals(dummiesBefore.size()+1, dummiesAfter.size());
        assertEquals(dummiesAfter.get(dummiesAfter.size()-1).getName(), nameFixture);

        // -> Assert greeting is as we expect
        assertEquals(actual, expected);
    }

    private List<DummyEntity> findDummiesByNameOrderedById(final String name) {
        return entityManager
                .createQuery("SELECT d FROM DummyEntity d WHERE d.name = :name ORDER BY d.id", DummyEntity.class)
                .setParameter("name", name)
                .getResultList();
    }
}
