package youtube;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto esp, Video vid) {
        this.espectador = esp;
        this.filme = vid;
        esp.viuMaisUm();
        esp.ganharExp();
        vid.setViews(this.filme.getViews()+1);
        
    }
    public void info(){
        System.out.println(this.getEspectador().nome+" Está assistindo a "
                + this.filme.getTitulo());
    }
    
    public void avaliar(int nota){
        filme.setAvaliacao(nota);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
   
}
