
public class Autoridade {

	private String nome, sobrenome;
	private FormatadorNome formatNome;
	
	//Construtor ComTitulo
	public Autoridade(String nome, String sobrenome, FormatadorNome formatNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatNome = formatNome;
	}
	
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public String getTratamento() {
        return formatNome.formatarNome(nome, sobrenome);
    }

}
