package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "info")
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firsName;
    private String surName;

}
