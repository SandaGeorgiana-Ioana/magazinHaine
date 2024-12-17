package com.magazinHaine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magazinHaine.entity.Produs;
@Repository

public interface ProdusRepository extends JpaRepository<Produs,Integer>{

}
