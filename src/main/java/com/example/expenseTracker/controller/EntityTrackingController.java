package com.example.expenseTracker.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
public class EntityTrackingController {

    public static final Logger log = LoggerFactory.getLogger(EntityTrackingController.class);

    @RequestMapping(path ="/api/getExpense")
    public String getExpense(){
        return "Hii Expense tracking system testing";
    }


}
