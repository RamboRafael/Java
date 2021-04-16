package polimorfismo;
public class Ave extends Animal{
protected String corPena;

public void fazerNinho(){
    System.out.println("Fazendo ninho...");
}
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo sementes...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piiiiiu");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
