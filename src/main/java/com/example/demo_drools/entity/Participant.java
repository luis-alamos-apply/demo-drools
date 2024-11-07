package com.example.demo_drools.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Participant {

    private String name;
    private int age;
    private int creditScore;
    private long annualSalary;
    private long existingDebt;
    private long loanAmount;
}