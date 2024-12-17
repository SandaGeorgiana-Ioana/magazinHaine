package com.magazinHaine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.magazinHaine.entity.ListaProduseleMele;
import com.magazinHaine.entity.Produs;
import com.magazinHaine.service.ListaProduseleMeleService;
import com.magazinHaine.service.ProdusService;

@Controller
public class ProdusController {

    @Autowired
    private ProdusService service;
    @Autowired
    private ListaProduseleMeleService produselemeleService ;
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/produs_inregistart")
    public String produsInregistart() {
        return "produsInregistrat";
    }

    @GetMapping("/produse_disponibile")
    public ModelAndView getAllProdus() {
      List<Produs>list=service.getAllProdus();
     // ModelAndView m=new ModelAndView();
     // m.setViewName("produsList");
     // m.addObject("produs",list);
      return new ModelAndView("produsList","produs",list);
    }

    @PostMapping("/save")
    public String addProdus(@ModelAttribute Produs p) {
        service.save(p);
        return "redirect:/produse_disponibile"; // Redirecționare corectă
    }
    @GetMapping("/produsele_mele")
    public String getProduselemele(Model model){
    	List<ListaProduseleMele>list=produselemeleService.getAllProdus();;
    	model.addAttribute("produs",list);
    	return "Produselemele";
    }
    @RequestMapping("/mylist/{id}")
    public String getListaProduseleMele(@PathVariable("id") int id) {
    	Produs p=service.getProdus_id(id);
    	ListaProduseleMele pr=new ListaProduseleMele(p.getId(),p.getNume(),p.getColectie(),p.getPret());
    	produselemeleService.saveProduseleMele(pr);
    	return " redirect:/produsele_mele";
    }
    
}
