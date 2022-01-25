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
public class Tracks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer trId;
    @Column(unique = true, nullable = false, length = 20)
    String trName;
    @Column(nullable = false, length = 40)
    Integer trYear;
    String trLang;
}


