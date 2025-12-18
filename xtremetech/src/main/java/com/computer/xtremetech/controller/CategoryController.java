package com.computer.xtremetech.controller;

import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @PostMapping
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){


    }
}
