package polimorfismo;
public class Cachorro extends Animal{
    protected String corPelo;
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    }

    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Ração para cachorro!");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    
    
}
