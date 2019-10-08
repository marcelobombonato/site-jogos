package avaliacaojogos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String codigo;
	private String nome;
	private String descricao;
	private Date dataLancamento;
	private String caminhoCapa;
	private Genero genero;
	
}
