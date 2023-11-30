package com.example.djavaavance2.Controller;

import com.example.djavaavance2.PersoDAO;
import com.example.djavaavance2.Personnage;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class PerosControler {

    @Autowired

    private PersoDAO persoDao;

    //Récupérer la liste des produits
    @RequestMapping(value = "/Produits", method = RequestMethod.GET)

    public MappingJacksonValue listeProduits() {

        Iterable<Personnage> personnages = persoDao.findAll();

        SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("prixAchat");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);

        MappingJacksonValue personnagesFiltres = new MappingJacksonValue(personnages);


        personnagesFiltres.setFilters(listDeNosFiltres);

        return personnagesFiltres;
    }

    //Récupérer un produit par son Id
 /* @GetMapping(value = "/Produits/{id}")
  public Product afficherUnProduit(@PathVariable int id) {
    return productDao.findById(id);

  }
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


