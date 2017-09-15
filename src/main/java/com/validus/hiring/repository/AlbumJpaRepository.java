package com.validus.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validus.hiring.model.Album;

@Repository
public interface AlbumJpaRepository extends JpaRepository<Album, Long> {

}
