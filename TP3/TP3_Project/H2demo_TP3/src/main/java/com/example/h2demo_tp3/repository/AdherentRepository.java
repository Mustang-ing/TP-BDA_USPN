package com.example.h2demo_tp3.repository;


import com.example.h2demo_tp3.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherentRepository extends JpaRepository<Adherent, Long>
{

}
