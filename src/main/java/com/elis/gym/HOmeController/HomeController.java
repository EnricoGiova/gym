package com.elis.gym.HOmeController;

import com.elis.gym.model.Utente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController
{

    @GetMapping("/{id}")
    public String getId(@PathVariable("id") int id){
        return "ID: "+id;
    }
    @GetMapping ("/post")
    public  String postId(@RequestParam ("id") int id){
        return "ID ricevuto: "+id;
    }

    @PostMapping ("/utente")
        public String getUtente(@RequestBody Utente utente){
        return utente.toString();
        }
}
