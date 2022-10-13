package dominio;
import java.time.LocalDate;

public class Mentoria extends Atividade
{
	
	private LocalDate dataMentoria;

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
	public String toString()
	{
		return "{Titulo: "+ getTitulo()+"\ndescricao:  "+ getDescricao()+ ""
				+ "\nData: "+dataMentoria+"}";
	}

	public double calcularExperiencia() 
	{	
		return EXPERIENCIA_PADRAO+15.0;
	}
	
}
