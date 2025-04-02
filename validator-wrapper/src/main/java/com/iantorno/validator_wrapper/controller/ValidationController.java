package com.iantorno.validator_wrapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validator")
public class ValidationController {

    @GetMapping
    String validationTest() {
        return "Hello Validator";
    }

}
