package br.com.starwarsAPI.rebelde.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.starwarsAPI.inventario.model.Inventario;

@Entity
@Table(name="TB_REBELDES")
public class Rebelde implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private int idade;
	private String genero;
	private String latitude;
	private String longitude;
	private String baseNome;
	private String obs;
	
	@OneToMany
	private List<Inventario> inventario;
	
	public Rebelde() {
		
	}
	
	public Rebelde(String nome, int idade, String genero, String latitude, String longitude,
			String baseNome, String obs) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.latitude = latitude;
		this.longitude = longitude;
		this.baseNome = baseNome;
	}
	
	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getBaseNome() {
		return baseNome;
	}

	public void setBaseNome(String baseNome) {
		this.baseNome = baseNome;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Rebelde [id=" + id + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", latitude="
				+ latitude + ", longitude=" + longitude + ", baseNome=" + baseNome + ", obs=" + obs + "]";
	}
	
}
