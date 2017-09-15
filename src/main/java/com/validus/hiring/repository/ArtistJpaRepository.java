package com.validus.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validus.hiring.model.Artist;

@Repository
public interface ArtistJpaRepository extends JpaRepository<Artist, Long> {

}
