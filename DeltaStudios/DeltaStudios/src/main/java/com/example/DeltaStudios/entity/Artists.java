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
public class Artists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer artId;
    @Column(unique = true, nullable = false, length = 20)
    String artName;
    @Column(nullable = false, length = 40)
    Integer artAlb;
    String artSty;
    String artHit;
}
