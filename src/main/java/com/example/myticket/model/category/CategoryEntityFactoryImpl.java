package com.example.myticket.model.category;

import org.springframework.stereotype.Component;

@Component
public class CategoryEntityFactoryImpl implements CategoryEntityFactory {

    @Override
    public CategoryEntity create(
            final String name
    ) {
        return CategoryEntity.builder()
                .name(name)
                .build();
    }
}
