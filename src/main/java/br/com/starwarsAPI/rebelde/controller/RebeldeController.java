package br.com.starwarsAPI.rebelde.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starwarsAPI.rebelde.model.Rebelde;
import br.com.starwarsAPI.rebelde.repository.RebeldeRepository;

@RestController
@RequestMapping(value = "/api")
public class RebeldeController {

	@Autowired
	private RebeldeRepository rebeldes;

	@GetMapping("/listRebels")
	public List<Rebelde> findAll() {
		return rebeldes.findAll();
	}

	@GetMapping("/rebel/{id}")
	public Optional<Rebelde> buscaUm(@PathVariable(value = "id") Long id) {
		return rebeldes.findById(id);
	}

	@PostMapping(path = "/addRebel")
	public Rebelde salvar(@RequestBody Rebelde rebelde) {
		return rebeldes.save(rebelde);
	}
	
}
