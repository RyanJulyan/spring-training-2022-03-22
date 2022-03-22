package com.example.myticket.api.dummy;

import com.example.myticket.core.dummy.DummyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class DummyController {

    private final DummyService dummyService;

    @PostMapping("/dummy")
    public String submitName(@RequestBody final String name) {
        return dummyService.submitName(name);
    }
}
