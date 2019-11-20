package com.kozinets.music;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    private String song;

    public Music(String song) {
        this.song = song;
    }

    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }

    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
}
