
public class Paciente {
	//Atributos
	double peso;
	double altura;
	
	//Construtor
	Paciente(double p, double a){
		altura = a;
		peso = p;
	}
	
	//Métodos
	public double calcularIMC(){
		return peso/(altura*altura);
	}

	public String diagnostico(){
		if (calcularIMC() < 16.00)
			return "Baixo peso muito grave";
		else if (calcularIMC() < 17.00)
			return "Baixo peso grave";
		else if (calcularIMC() < 18.50)
			return "Baixo peso";
		else if (calcularIMC() < 25.00)
			return "Peso normal";
		else if (calcularIMC() < 30.00)
			return "Sobrepeso";
		else if (calcularIMC() < 35.00)
			return "Obesidade grau I";
		else if (calcularIMC() < 40.00)
			return "Obesidade grau II";
		else 
			return "Obesidade grau III (obesidade mórbida)";
	}

}
