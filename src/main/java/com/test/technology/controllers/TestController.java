package com.test.technology.controllers;

import com.test.technology.commons.Output;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    private final Output output;

    public TestController(Output output) {
        this.output = output;
    }

    @GetMapping("")
    public ResponseEntity<?> authTest(HttpServletRequest request) {
        String result = "test";
        return output.send(result);
    }
}
