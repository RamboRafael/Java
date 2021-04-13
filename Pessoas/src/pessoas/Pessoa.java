package pessoas;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String no,int id, String se){
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }
    public void fazerAniver(){
        this.idade+=1;
        System.out.println(this.nome+" esta fazendo "+this.idade+" anos.");
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
