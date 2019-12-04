package br.usjt.clima.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter 
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	
/* Map<String, Integer> cidades = new HashMap<>();
 
        // Add some cidades.
        cidades.put("São Paulo", 5);
        cidades.put("Marília", 3);
        cidades.put("Santo André", 4);
        cidades.put("Cajamar", 10);
 
        System.out.println("Total cidades: " + cidades.size());
 
 
        for (String key : cidades.keySet())
            System.out.println(key + " - " + cidades.get(key));
        System.out.println();
 
        String searchKey = "Marília";
        if (cidades.containsKey(searchKey))
            System.out.println("Found total " + cidades.get(searchKey) + " " + searchKey + " city!\n");
 
        vehicles.clear();
 
        System.out.println("After clear operation, size: " + cidades.size()); */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Double latitude;
	private Double longitude;
	
	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<Clima> climas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public List<Clima> getClimas() {
		return climas;
	}

	public void setClimas(List<Clima> climas) {
		this.climas = climas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
