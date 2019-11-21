package com.kozinets.music;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String song;
    private String style;

    public Music(){}
    public Music(String song, String style) {
        this.song = song;
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        id = id;
    }

    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
}
