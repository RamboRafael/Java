package polimorfismo;
public class Lagarto extends Animal{
    protected String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo animais pequenos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Crriii!!!!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
