package dominio;

public class Curso extends Atividade{

	
	private int cargaHoraria;
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public String toString()
	{
		return "{Titulo: "+ getTitulo()+"\ndescricao:  "+ getDescricao()+ ""
				+ "\nCarga horária: "+cargaHoraria+"}";
	}
	
	@Override
	public double calcularExperiencia() 
	{
		return EXPERIENCIA_PADRAO*cargaHoraria;
	}
}
