package com.example.DeltaStudios.repository;

import com.example.DeltaStudios.entity.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistsRepository extends JpaRepository<Artists , Integer> {

}