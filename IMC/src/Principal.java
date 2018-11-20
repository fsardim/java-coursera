
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(45, 1.60);
		Paciente p2 = new Paciente(55, 1.65);
		Paciente p3 = new Paciente(80, 1.70);
		
		System.out.println(p1.diagnostico() + ", IMC = " + p1.calcularIMC());
		System.out.println(p2.diagnostico() + ", IMC = " + p2.calcularIMC());
		System.out.println(p3.diagnostico() + ", IMC = " + p3.calcularIMC());
	}

}
