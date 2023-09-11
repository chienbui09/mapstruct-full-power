package com.personal.mapstructfullpower.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestClass {

    @GetMapping("/{text}")
    public String getTextInUpperCase(@PathVariable String text){
        if (!StringUtils.hasText(text)){
            return "EMPTY";
        }
        return text.toUpperCase();
    }
}
