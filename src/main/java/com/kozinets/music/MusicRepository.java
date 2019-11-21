package com.kozinets.music;

import com.kozinets.music.Music;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicRepository extends CrudRepository<Music, Integer> {
    List<Music> findBySong(String song);
}
