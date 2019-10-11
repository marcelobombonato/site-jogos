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
@Entity(name = "Produtora")
public class Produtora implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigoProdutora", nullable=false)
	private Integer codigo;

	@Column(name = "nomeProdutora", nullable=false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "plataforma_codigo") // we need to duplicate the physical information
    private Set<Jogo> jogos;
}
