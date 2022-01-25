package com.example.DeltaStudios.repository;

import com.example.DeltaStudios.entity.Tracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TracksRepository extends JpaRepository<Tracks, Integer> {

}
