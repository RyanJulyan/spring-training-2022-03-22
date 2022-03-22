package com.example.myticket.core.dummy;

import com.example.myticket.model.dummy.DummyEntity;
import org.springframework.stereotype.Component;

@Component
public class DummyEntityFactoryImpl implements DummyEntityFactory {

    @Override
    public DummyEntity create(final String name) {
        return DummyEntity.builder()
                .name(name)
                .build();
    }
}
