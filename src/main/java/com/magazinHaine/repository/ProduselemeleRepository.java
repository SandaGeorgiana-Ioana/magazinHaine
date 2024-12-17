package com.magazinHaine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magazinHaine.entity.ListaProduseleMele;
@Repository
public interface ProduselemeleRepository extends JpaRepository<ListaProduseleMele,Integer>{

}
