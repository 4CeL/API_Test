package com.example.demo.service;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.StatusDTO;
import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.StatusMaster;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.StatusMasterRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    
    @Autowired
    private TransactionRepository transactionRepository;
    
    @Autowired
    private StatusMasterRepository statusMasterRepository;
    
    public ApiResponse getAllTransactions() {
        // Ambil data transactions
        List<Transaction> transactions = transactionRepository.findAll();
        List<TransactionDTO> transactionDTOs = transactions.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        
        // Ambil data status
        List<StatusMaster> statusList = statusMasterRepository.findAll();
        List<StatusDTO> statusDTOs = statusList.stream()
                .map(this::convertStatusToDTO)
                .collect(Collectors.toList());
        
        // Gabungkan response
        ApiResponse response = new ApiResponse();
        response.setData(transactionDTOs);
        response.setStatus(statusDTOs);
        
        return response;
    }
    
    private TransactionDTO convertToDTO(Transaction transaction) {
        TransactionDTO dto = new TransactionDTO();
        BeanUtils.copyProperties(transaction, dto);
        return dto;
    }
    
    private StatusDTO convertStatusToDTO(StatusMaster status) {
        StatusDTO dto = new StatusDTO();
        BeanUtils.copyProperties(status, dto);
        return dto;
    }
}