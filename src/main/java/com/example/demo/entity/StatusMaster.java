package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "status_master")
@Data
public class StatusMaster {
    
    @Id
    private Integer id;
    
    @Column(name = "name")
    private String name;
}