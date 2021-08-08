package com.sazegar.APISampleV1.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table (name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "name",length = 80,nullable = false,unique = true)
    private String name;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;
}
