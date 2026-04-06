package com.example.addition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addition.dto.request.AdditionRequest;
import com.example.addition.dto.response.AdditionResponse;
import com.example.addition.dto.response.ApiResponse;
import com.example.addition.service.AdditionService;


@RestController
@RequestMapping("/addition")
@CrossOrigin(origins = "http://localhost:5173")
public class AddController {

    private final AdditionService additionService;

    public AddController(AdditionService additionService) {
        this.additionService = additionService;
    }

    @PostMapping
    public ApiResponse<AdditionResponse> getAdditionResult(@RequestBody AdditionRequest req) {
        AdditionResponse response = additionService.calculate(req);
        return new ApiResponse<>("Success", response);
    }

    @GetMapping
    public ApiResponse<List<AdditionResponse>> getEveryAddition() {
        List<AdditionResponse> responses = additionService.getEveryAddition();
        return new ApiResponse<>("Success", responses);
    }
}

