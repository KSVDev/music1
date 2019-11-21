package com.kozinets.music;

import com.kozinets.music.Music;
import org.springframework.data.repository.CrudRepository;

public interface MusicRepository extends CrudRepository<Music, Integer> {

}
