package com.magazinHaine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazinHaine.entity.Produs;
import com.magazinHaine.repository.ProdusRepository;

@Service

public class ProdusService {
	@Autowired
	private ProdusRepository bRepo;
	public void save(Produs p) {
		bRepo.save(p);
}
	public List<Produs>getAllProdus(){
		return bRepo.findAll();
}
	public Produs getProdus_id(int id)
	{
		return bRepo.findById(null).get();
	}
}	