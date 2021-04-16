package youtube;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    public void info(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Exp: " +this.experiencia);
        System.out.println("Login: "+this.login);
        System.out.println("Total assistidos: "+this.totAssistido);
    }
    
    public void viuMaisUm(){
        this.totAssistido ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistid(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
