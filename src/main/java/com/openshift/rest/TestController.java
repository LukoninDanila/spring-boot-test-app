package com.openshift.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Test: Проверка отклика приложения")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation("Проверка реста")
    @GetMapping
    public String sendMetric() {
        return "Test rest done.";
    }

}
