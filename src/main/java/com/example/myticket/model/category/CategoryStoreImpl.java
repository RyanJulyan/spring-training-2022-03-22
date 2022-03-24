package com.example.myticket.model.category;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CategoryStoreImpl implements CategoryStore {

    private final CategoryEntityFactory entityFactory;
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryEntity upsert(
            final String name
    ) {
        Optional<CategoryEntity> optionalCategory = categoryRepository.findByName(name);

        if (optionalCategory.isPresent()) {
            return optionalCategory.get();
        }
        CategoryEntity category = entityFactory.create(name);

        return categoryRepository.save(category);
    }
}
