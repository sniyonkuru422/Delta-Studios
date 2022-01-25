package com.example.DeltaStudios.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer proId;
    @Column(unique = true, nullable = false, length = 20)
    String proName;
    @Column(nullable = false, length = 40)
    String proCont;
    String ProQual;
}


