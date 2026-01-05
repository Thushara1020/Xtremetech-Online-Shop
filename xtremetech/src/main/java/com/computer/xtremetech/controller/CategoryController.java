package com.computer.xtremetech.controller;

import com.computer.xtremetech.io.CategoryRequest;
import com.computer.xtremetech.io.CategoryResponse;
import com.computer.xtremetech.service.CategotySevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategotySevice categotySevice;

    @PostMapping("/admin/categories")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestPart("category") String categoryString,
                                        @RequestPart("file")MultipartFile file){
        ObjectMapper objectMapper = new ObjectMapper();
        CategoryRequest request = null;
        try {
            request = objectMapper.readValue(categoryString, CategoryRequest.class);
            return categotySevice.add(request , file);
        } catch (JacksonException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Exception occurred while parsing the json:"+ ex.getMessage());
    }

    }
    @GetMapping
    public List<CategoryResponse> fetchCategories(){
        return categotySevice.read();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/admin/categories/{categoryId}")
    public void remove(@PathVariable String categoryId){
        try {
            categotySevice.delete(categoryId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
