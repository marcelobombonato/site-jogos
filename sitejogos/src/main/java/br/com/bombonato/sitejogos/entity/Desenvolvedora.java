package br.com.bombonato.sitejogos.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
@Entity(name = "Desenvolvedora")
public class Desenvolvedora implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigoDesenvolvedora", nullable=false)
	private Integer codigo;

	@Column(name = "nomeDesenvolvedora", nullable=false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "desenvolvedora_codigo") 
    private Set<Jogo> jogos;
}
