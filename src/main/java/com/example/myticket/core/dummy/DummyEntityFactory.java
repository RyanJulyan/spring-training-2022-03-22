package com.example.myticket.core.dummy;

import com.example.myticket.model.dummy.DummyEntity;

public interface DummyEntityFactory {

    DummyEntity create(final String name);
}
