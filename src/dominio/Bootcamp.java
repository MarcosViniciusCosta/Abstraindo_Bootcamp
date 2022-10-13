package dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp 
{
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = LocalDate.now().plusDays(60);
	private String nome;
	private String descricao;
	private Set<Desenvolvedor> conjuntoDesenvolvedoreInscritos = new LinkedHashSet<Desenvolvedor>();
	private Set<Atividade> conjuntoAtividades = new LinkedHashSet<Atividade>();
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Desenvolvedor> getConjuntoDesenvolvedoreInscritos() {
		return conjuntoDesenvolvedoreInscritos;
	}
	public void setConjuntoDesenvolvedoreInscritos(Set<Desenvolvedor> conjuntoDesenvolvedoreInscritos) {
		this.conjuntoDesenvolvedoreInscritos = conjuntoDesenvolvedoreInscritos;
	}
	public Set<Atividade> getConjuntoAtividades() {
		return conjuntoAtividades;
	}
	public void setConjuntoAtividades(Set<Atividade> conjuntoAtividades) {
		this.conjuntoAtividades = conjuntoAtividades;
	}
	
	
}
