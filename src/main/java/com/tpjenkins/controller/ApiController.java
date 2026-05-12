package com.tpjenkins.controller;

import com.tpjenkins.dto.ApiResponse;
import com.tpjenkins.dto.MessageRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {

    @GetMapping("/health")
    public ApiResponse<String> health() {
        return ApiResponse.ok("Service disponible");
    }

    @PostMapping("/echo")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<String> echo(@Valid @RequestBody MessageRequest request) {
        return ApiResponse.ok(request.message());
    }
}
