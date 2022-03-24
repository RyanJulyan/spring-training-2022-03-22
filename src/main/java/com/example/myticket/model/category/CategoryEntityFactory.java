package com.example.myticket.model.category;

public interface CategoryEntityFactory {

    CategoryEntity create(
            final String name
    );
}
