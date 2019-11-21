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

        @PostMapping(path="/add") // Map ONLY POST Requests
        public @ResponseBody String addNewMusic (@RequestParam String song, @RequestParam String style, Map<String, Object> model) {
            Music music = new Music(song, style);
            musicRepository.save(music);

            Iterable<Music> musics = musicRepository.findAll();
            model.put("musics", musics);

            return "Saved";
        }

        @GetMapping(path="/all")
        public @ResponseBody Iterable<Music> getAllUsers() {
            // This returns a JSON or XML with the users
            return musicRepository.findAll();
        }

        @PostMapping("/filter")
        public String filter(@RequestParam String song, Map<String, Object> model){

            List<Music> musics = musicRepository.findBySong(song);
            model.put("musics", musics);

            return "main";
        }
}
