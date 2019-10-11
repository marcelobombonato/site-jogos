package br.com.bombonato.sitejogos.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
@Entity(name = "Jogo")
public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigoJogo", nullable=false)
	private Integer codigo;

	@Column(name = "nomeJogo", nullable=false)
	private String nome;
	
	@Column(name = "descricaoJogo", nullable=false)
	private String descricao;
	
	@Column(name = "dataLancamentoJogo", nullable=false)
	private Date dataLancamento;
	
	@Column(name = "caminhoCapaJogo", nullable=false)
	private String caminhoCapa;
	
	@ManyToOne
    @JoinColumn(name="desenvolvedora_codigo", nullable=false)
    private Desenvolvedora desenvolvedora;
	
	@ManyToOne
	@JoinColumn(name="classificacao_codigo", nullable=false)
	private Classificacao classificacao;
	
	@ManyToOne
	@JoinColumn(name="produtora_codigo", nullable=false)
	private Produtora produtora;
	
	@ManyToMany
	@JoinTable(
	  name = "generoJogo", 
	  joinColumns = @JoinColumn(name = "jogo_codigo", nullable=false), 
	  inverseJoinColumns = @JoinColumn(name = "genero_codigo"))
	Set<Genero> generos;
	
	@ManyToMany
	@JoinTable(
	  name = "plataforma_codigo", 
	  joinColumns = @JoinColumn(name = "jogo_codigo", nullable=false), 
	  inverseJoinColumns = @JoinColumn(name = "plataforma_codigo"))
	Set<Plataforma> plataformas;
}
