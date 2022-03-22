package com.example.myticket.api;

import com.example.myticket.core.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DummyController {

    @Autowired
    public DummyController(final DummyService dummyService) {
        this.dummyService = dummyService;
    }

    private final DummyService dummyService;

    @PostMapping("/dummy")
    public String submitName(@RequestBody final String name) {
        return "not correct";
    }
}
