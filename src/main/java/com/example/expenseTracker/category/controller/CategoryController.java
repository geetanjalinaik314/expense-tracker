package com.example.expenseTracker.category.controller;


import com.example.expenseTracker.category.dto.CategoryFetchDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(path="/api/category", produces="application/json")
public class CategoryController {

    @RequestMapping(path ="/getCategory", method = RequestMethod.GET)
    public List<CategoryFetchDTO> getCategory(){
       // return service.metjodcall();
    }
}
