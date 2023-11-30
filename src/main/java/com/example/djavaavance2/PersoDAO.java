package com.example.djavaavance2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersoDAO  extends JpaRepository<Personnage , Integer> {
  Personnage findById(int id);
}

