package br.com.bombonato.sitejogos.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor
@EqualsAndHashCode
@Entity(name = "Genero")
public class Genero implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigoGenero", nullable=false)
	private Integer codigo;

	@Column(name = "nomeGenero", nullable=false)
	private String nome;
	
	
	@JsonIgnore
	@ManyToMany(mappedBy = "generos")
	Set<Jogo> generos;
}
