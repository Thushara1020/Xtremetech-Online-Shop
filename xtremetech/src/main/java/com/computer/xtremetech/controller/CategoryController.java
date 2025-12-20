package com.computer.xtremetech.controller;

import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;
import com.computer.xtremetech.service.CategotySevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategotySevice categotySevice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){
        return categotySevice.add(request);

    }
    @GetMapping
    public List<CategoryResponse> fetchCategories(){
        return categotySevice.read();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{categoryId}")
    public void remove(@PathVariable String categoryId){
        try {
            categotySevice.delete(categoryId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
