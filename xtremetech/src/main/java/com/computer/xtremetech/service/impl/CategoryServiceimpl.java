package com.computer.xtremetech.service.impl;

import com.computer.xtremetech.entity.CategoryEntity;
import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.service.CategotySevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceimpl implements CategotySevice {

    private final C

    @Override
    public CategoryRequest add(CategoryRequest request) {
        CategoryEntity newCategory = convertToEntity(request);

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
