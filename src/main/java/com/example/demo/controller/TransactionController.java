package com.example.demo.controller;

import com.example.demo.dto.ApiResponse;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    
    @GetMapping("/transactions")
    public ResponseEntity<ApiResponse> getTransactions() {
        ApiResponse response = transactionService.getAllTransactions();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}