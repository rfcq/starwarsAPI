package br.com.starwarsAPI.inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starwarsAPI.inventario.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
	public List<Inventario> findAll();
}
