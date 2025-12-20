package com.computer.xtremetech.service;

import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;

import java.util.List;

public interface CategotySevice {
    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();
}
