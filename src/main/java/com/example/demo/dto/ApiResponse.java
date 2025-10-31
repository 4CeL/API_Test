package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class ApiResponse {
    private List<TransactionDTO> data;
    private List<StatusDTO> status;
}