package com.computer.xtremetech.service.impl;

import com.computer.xtremetech.entity.CategoryEntity;
import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;
import com.computer.xtremetech.repository.CategoryRepository;
import com.computer.xtremetech.service.CategotySevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceimpl implements CategotySevice {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryRequest add(CategoryRequest request) {
        CategoryEntity newCategory = convertToEntity(request);
        newCategory = categoryRepository.save(newCategory);
        return convertToResponse(newCategory);

    }

    private CategoryRequest convertToResponse(CategoryEntity newCategory) {
        CategoryResponse.builder()
                .categoryId(newCategory.getCategoryId())
                .name(newCategory.getName())
                .description(newCategory.getDescription())
                .bgColor(newCategory.getBgColor())
                .createdAt(newCategory.getCreatedAt())
                .updatedAt(newCategory.getUpdateAt())
                .build();


    }

    private CategoryEntity convertToEntity(CategoryRequest request) {
        return CategoryEntity.builder()
                .categoryId(UUID.randomUUID().toString())
                .name(request.getName())
                .description(request.getDescription())
                .bgColor(request.getBgColor())
                .build();
    }
}
