package com.example.myticket.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@SpringBootTest
public class DummyControllerTest {

    @Autowired
    private DummyController dummyController;

    @Test
    public void givenRequestWithName_whenSubmittedToController_shouldPersistAndEchoBackName() {
        // Setup fixture
        final String nameFixture = "Bob Hoskins";

        // Setup expectations
        final String expected = "Hello Bob Hoskins!";

        // Exercise SUT
        final String actual = dummyController.submitName(nameFixture);

        // Verify results
        assertThat(actual, equalToIgnoringCase(expected));
    }
}
