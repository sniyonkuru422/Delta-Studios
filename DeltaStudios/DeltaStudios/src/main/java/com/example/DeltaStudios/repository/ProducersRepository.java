package com.example.DeltaStudios.repository;

import com.example.DeltaStudios.entity.Producers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducersRepository extends JpaRepository<Producers, Integer> {

}
