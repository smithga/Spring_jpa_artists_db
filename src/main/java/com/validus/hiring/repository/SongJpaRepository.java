package com.validus.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validus.hiring.model.Album;
import com.validus.hiring.model.Song;

@Repository
public interface SongJpaRepository extends JpaRepository<Song, Long> {

}
