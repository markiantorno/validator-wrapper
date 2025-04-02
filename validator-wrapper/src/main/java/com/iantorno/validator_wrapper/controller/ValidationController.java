package com.iantorno.validator_wrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validator")
public class ValidationController {

    //TODO https://www.baeldung.com/spring-rest-openapi-documentation

    @GetMapping
    String validationTest() {
        return "Hello Validator";
    }



}
