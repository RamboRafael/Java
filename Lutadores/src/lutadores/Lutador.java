package lutadores;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //construtor
    public Lutador(String no, String na, int id,
                   float al, float pe, int vi, int de, int em){
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
        
                
    }
    //metodos
    public void apresentar(){
        
        System.out.println("Lutador: "+this.nome);
        System.out.println("Origem: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitorias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
        System.out.println("----------------------------------");
    }
    public void Status(){
       System.out.println("Lutador: "+this.nome);
       System.out.println("Vitorias: "+this.vitorias);
       System.out.println("Derrotas: "+this.derrotas);
       System.out.println("Empates: "+this.empates);
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
        System.out.println(this.nome +" Ganhou a luta");
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
        System.out.println(this.nome+" Perdeu a luta");
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    

    public String getCategoria() {
        return categoria;
    }

 

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setCategoria() {
        if(peso<52.2){
            this.categoria = "Inválido";
        }else if(peso<=70.3){
            this.categoria = "Leve";
        }else if(peso<=83.9){
            this.categoria = "Médio";
        }else{
            this.categoria = "Pesado";
        }
    }

    
   
    
}
