package com.example.myticket.core.dummy;

import com.example.myticket.core.shared.util.GreetingUtil;
import com.example.myticket.model.dummy.DummyEntity;
import com.example.myticket.model.dummy.DummyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DummyServiceImpl implements DummyService {

    private final DummyRepository repository;
    private final DummyEntityFactory entityFactory;

    @Override
    public String submitName(String name) {
        DummyEntity dummy = entityFactory.create(name);

        dummy = repository.save(dummy);

        final String dummyName = dummy.getName();
        return GreetingUtil.formatNameAsGreeting(dummyName);
    }
}
