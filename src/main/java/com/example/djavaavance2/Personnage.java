package com.example.djavaavance2;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
public class Personnage {

    @Id
    private int id;

        private String name;
        private String type;
        private int life;




        public Personnage(){

        }


        public Personnage(int id, String name, String type, int life) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.life = life;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getLife() {
            return life;
        }

        public void setLife(int life) {
            this.life = life;
        }
        @Override
        public String toString() {
            return
                    "id=" + id +
                            "\n "+ name+ " + name + 0" +
                            "\n type='" + type +
                            "\n life=" + life ;
        }


}

