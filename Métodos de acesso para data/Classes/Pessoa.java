import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private Date dataNascimento = new Date();

	@SuppressWarnings("deprecation")
	public Pessoa(int dia, int mes, int ano){
		dataNascimento.setDate(dia);
		dataNascimento.setMonth(mes-1);
		dataNascimento.setYear(ano-1900);
	}
	
	private int getAnoNasc(){
		return dataNascimento.getYear();
	}
	
	private int getMesNasc(){
		return dataNascimento.getMonth();
	}
	
	private int getDiaNasc(){
		return dataNascimento.getDate();
	}
	
	public int getIdade(){
		Date dataHoje = new Date();
		
		if (dataHoje.getMonth() > getMesNasc())
			return dataHoje.getYear() - getAnoNasc();
		else if (getMesNasc() == dataHoje.getMonth() && dataHoje.getDate() >= getDiaNasc())
			return dataHoje.getYear() - getAnoNasc();
		else
			return dataHoje.getYear() - getAnoNasc() -1;
	}
	
	public String getSigno(){
		if ((getMesNasc() == 0 && getDiaNasc() >= 21) || 
			(getMesNasc() == 1 && getDiaNasc() <= 19))
				return "Aquário";
		else if ((getMesNasc() == 1 && getDiaNasc() >= 20) || 
				(getMesNasc() == 2 && getDiaNasc() <= 20))
				return "Peixes";
		else if ((getMesNasc() == 2 && getDiaNasc() >= 21) || 
				(getMesNasc() == 3 && getDiaNasc() <= 20))
				return "Áries";
		else if ((getMesNasc() == 3 && getDiaNasc() >= 21) || 
				(getMesNasc() == 4 && getDiaNasc() <= 20))
				return "Touro";
		else if ((getMesNasc() == 4 && getDiaNasc() >= 21) || 
				(getMesNasc() == 5 && getDiaNasc() <= 20))
				return "Gêmeos";
		else if ((getMesNasc() == 5 && getDiaNasc() >= 21) || 
				(getMesNasc() == 6 && getDiaNasc() <= 21))
				return "Câncer";
		else if ((getMesNasc() == 6 && getDiaNasc() >= 22) || 
				(getMesNasc() == 7 && getDiaNasc() <= 22))
				return "Leão";
		else if ((getMesNasc() == 7 && getDiaNasc() >= 23) || 
				(getMesNasc() == 8 && getDiaNasc() <= 22))
				return "Virgem";
		else if ((getMesNasc() == 8 && getDiaNasc() >= 23) || 
				(getMesNasc() == 9 && getDiaNasc() <= 22))
				return "Libra";
		else if ((getMesNasc() == 9 && getDiaNasc() >= 23) || 
				(getMesNasc() == 10 && getDiaNasc() <= 21))
				return "Escorpião";
		else if ((getMesNasc() == 10 && getDiaNasc() >= 22) || 
				(getMesNasc() == 11 && getDiaNasc() <= 21))
				return "Sagitário";
		else if ((getMesNasc() == 11 && getDiaNasc() >= 22) || 
				(getMesNasc() == 0 && getDiaNasc() <= 20))
				return "Capricórnio";
		return "Nenhum";
	}
}
