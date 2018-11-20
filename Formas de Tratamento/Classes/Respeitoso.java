public class Respeitoso implements FormatadorNome {
    private char genero;
    
    public Respeitoso(char genero) {
        this.genero = genero;
    }
    
    public char getGenero() {
        return genero;
    }
    
    @Override
    public String formatarNome(String nome, String sobrenome) {
        switch (genero)
        {
            case 'm':
            case 'M':
                return "Sr. " + sobrenome;
    
            case 'f':
            case 'F':
                return "Sra. " + sobrenome;
            
            default:
                return null;
        }
    }
}
