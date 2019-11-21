package com.kozinets.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class MusicPlayerController {
        @Autowired
        private MusicRepository musicRepository;

        @PostMapping
        public @ResponseBody String add (@RequestParam String song, @RequestParam String style, Map<String, Object> model) {
            Music music = new Music(song, style);
            musicRepository.save(music);

            Iterable<Music> musics = musicRepository.findAll();
            model.put("musics", musics);

            return "Saved";
        }

        @GetMapping
        public String main(Map<String, Object> model){
            Iterable<Music> musics = musicRepository.findAll();
            model.put("musics", musics);

            return "main";
        }

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Music> getAllUsers() {
            // This returns a JSON or XML with the musics
            return musicRepository.findAll();
        }

        @PostMapping("/filter")
        public String find(@RequestParam String filter, Map<String, Object> model){
            Iterable<Music> musics;
            if(filter != null && !filter.isEmpty()) {
                musics = musicRepository.findBySong(filter);
            }else{
                musics = musicRepository.findAll();
            }
            model.put("musics", musics);
            return "main";
        }
}
