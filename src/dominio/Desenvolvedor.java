package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor 
{
	private String nome;
	private Set<Atividade> conjuntoAtividadesInscritas = new LinkedHashSet<Atividade>();
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Atividade> getConjuntoAtividadesInscritas() {
		return conjuntoAtividadesInscritas;
	}


	public void setConjuntoAtividadesInscritas(Set<Atividade> conjuntoAtividadesInscritas) {
		this.conjuntoAtividadesInscritas = conjuntoAtividadesInscritas;
	}


	public Set<Atividade> getConjuntoAtividadesConcluidas() {
		return conjuntoAtividadesConcluidas;
	}


	public void setConjuntoAtividadesConcluidas(Set<Atividade> conjuntoAtividadesConcluidas) {
		this.conjuntoAtividadesConcluidas = conjuntoAtividadesConcluidas;
	}

	private Set<Atividade> conjuntoAtividadesConcluidas = new LinkedHashSet<Atividade>();
	
	
	public void progredir() 
	{
		Optional<Atividade> atividadeConcluida =  this.conjuntoAtividadesInscritas.stream().findFirst();;
	
		if(atividadeConcluida.isPresent()) 
		{
			conjuntoAtividadesInscritas.remove(atividadeConcluida.get());
			conjuntoAtividadesConcluidas.add(atividadeConcluida.get());
		}else
		{
			System.out.println("Impossível concluir, não há atividade cadastrada");
		}
		
	}

	
	public double calcularExperienciaTotal() 
	{
		Double experienciaTotal = 0.0;
		
		for (Atividade atividade : conjuntoAtividadesConcluidas) 
		{
			experienciaTotal+= atividade.calcularExperiencia();
		}		
		
		return experienciaTotal;
	}
	
	public void exibirCursos() 
	{
		
	}
	
	public void cadastrarEmBootcamp(Bootcamp bootcamp) 
	{
		getConjuntoAtividadesInscritas().addAll(bootcamp.getConjuntoAtividades());
		bootcamp.getConjuntoDesenvolvedoreInscritos().add(this);
	}
	
}
