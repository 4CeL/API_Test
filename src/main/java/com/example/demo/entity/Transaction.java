package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
    
    @Id
    private Integer id;
    
    @Column(name = "product_id")
    private String productID;
    
    @Column(name = "product_name")
    private String productName;
    
    @Column(name = "amount")
    private String amount;
    
    @Column(name = "customer_name")
    private String customerName;
    
    @Column(name = "status")
    private Integer status;
    
    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;
    
    @Column(name = "create_by")
    private String createBy;
    
    @Column(name = "create_on")
    private LocalDateTime createOn;
}