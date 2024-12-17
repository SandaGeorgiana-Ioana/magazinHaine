package com.magazinHaine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazinHaine.entity.ListaProduseleMele;
import com.magazinHaine.repository.ProduselemeleRepository;

@Service
public class ListaProduseleMeleService {
	@Autowired
	private ProduselemeleRepository produselemele;
	public void saveProduseleMele(ListaProduseleMele produs) {
		produselemele.save(produs);
		
	}
	public List<ListaProduseleMele> getAllProdus(){
		return produselemele.findAll();
	}

}
