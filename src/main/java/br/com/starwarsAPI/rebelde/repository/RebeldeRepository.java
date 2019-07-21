package br.com.starwarsAPI.rebelde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starwarsAPI.rebelde.model.Rebelde;

public interface RebeldeRepository extends JpaRepository<Rebelde, Long>{
	public List<Rebelde> findAll();
}
