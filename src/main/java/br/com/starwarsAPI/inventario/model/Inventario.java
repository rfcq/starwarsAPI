package br.com.starwarsAPI.inventario.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_INVENTARIO")
public class Inventario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String item;
	private int quantidade;
	private int pontos;
	
	public Inventario() {
		super();
	}
	
	public Inventario(String item, int quantidade, int pontos) {
		super();
		this.item = item;
		this.quantidade = quantidade;
		this.pontos = pontos;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Inventario [id=" + id + ", item=" + item + ", quantidade=" + quantidade + ", pontos=" + pontos + "]";
	}
	
}
