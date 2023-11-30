package com.example.djavaavance2.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class PerosControler {

    private final RestTemplate restTemplate;


    public PerosControler() {
        this.restTemplate = new RestTemplate();
    }


    @GetMapping("/random")
    public String getRandomNom(){
        String url = "https://random-word-api.herokuapp.com/word";
        String name = restTemplate.getForObject(url,String.class);
        System.out.println(name);
        return  name;
    }
    @GetMapping("/random/perso")
    public Object getRandomPersonnage(){
        int randomNumber = (int)(Math.random() * (4 - 1)+1);//génération d'un entier >= 1 et < 4
        String url = "http://localhost:8081/Personnage/"+randomNumber;
        Object personnage = restTemplate.getForObject(url,Object.class);
        return  personnage;
    }
    /** @GetMapping("/randomPerso")
    private Object getRandomPerso(){
    int random = (int) Math.floor(Math.random()) * (totalOfPersonage.size());
    String uri = "http://localhost:8081/Personnages";
    List <com.example.djavaavance2.Personnage> = restTemplate.getForObject(uri , List.class);
    return ListPersonnage.get(randomId);
    }*/
}


