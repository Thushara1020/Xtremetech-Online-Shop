package com.computer.xtremetech.service;

import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategotySevice {
    CategoryResponse add(CategoryRequest request,  MultipartFile file);

    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();

    void delete(String id);
}
