package models;

public class Coche {

	public String Matricula;
	
	

	public Coche(String matricula, int hora, int minutos, int segundos) {
		super();
		Matricula = matricula;
		
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	
}
