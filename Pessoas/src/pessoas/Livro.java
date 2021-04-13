package pessoas;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String tit, String au, int tot, int atu, Pessoa p){
        this.titulo = tit;
        this.autor = au;
        this.totPag = tot;
        this.pagAtual = atu;
        this.leitor = p;
    }
    
    public void detalhes(Pessoa p){
        this.leitor = p;        
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Total de páginas: "+this.totPag);
        System.out.println("Página atual: "+this.pagAtual);
        System.out.println("Aberto: "+this.aberto);
        System.out.println("Leitor: "+p.getNome()+" "+ p.getIdade()+" Anos");
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Abrindo o livro...");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Fechando o livro...");
    }

    @Override
    public void folhear() {
        if(this.aberto){
            System.out.println("O livro '"+this.getTitulo()+"' está sendo folheado.");
        }else{
            System.out.println("O livro está fechado");
        }
    }

    @Override
    public void avancarPag() {
        if(this.aberto && this.pagAtual<96){
        this.pagAtual  +=1;
            System.out.println("A pagina foi avançada para "+this.pagAtual);
        }else if(this.aberto == false){
            System.out.println("O livro está fechado, não é possivel avançar a página.");
        }else{
            System.out.println("O livro está na ultima página");
    }
    }

    @Override
    public void voltarPag() {
         if(this.aberto && this.pagAtual>1){
        this.pagAtual -=1;
             System.out.println("A pagina foi voltada para "+this.pagAtual);
        }else if(this.aberto == false){
            System.out.println("O livro está fechado, não é possivel voltar a página.");
        }else{
            System.out.println("O livro está na primeira página");
        
    }
}
}
