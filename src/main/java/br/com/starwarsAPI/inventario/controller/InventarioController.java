package br.com.starwarsAPI.inventario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starwarsAPI.inventario.model.*;
import br.com.starwarsAPI.inventario.repository.InventarioRepository;

@RestController
@RequestMapping(value = "/api")
public class InventarioController {
	
	@Autowired
	private InventarioRepository inventarios;
	
	@GetMapping("/inventario")
	public List<Inventario> findAll(){
		return inventarios.findAll();
	}
	
	@GetMapping("/listaitem/{id}")
	public Optional<Inventario> findOne(@PathVariable(value = "id") Long id){
		return inventarios.findById(id);
	}
	
	@PostMapping("/addItem")
	public Inventario salvar(@RequestBody Inventario inventario) {
		return inventarios.save(inventario);
	}
}
