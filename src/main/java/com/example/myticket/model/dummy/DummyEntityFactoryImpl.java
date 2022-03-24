package com.example.myticket.model.dummy;

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
