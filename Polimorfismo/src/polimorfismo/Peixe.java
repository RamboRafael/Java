package polimorfismo;
public class Peixe extends Animal{
    protected String corEscama;
    
    public void soltarBolha(){
        System.out.println("Bolhas Saindo da água...");
    }
    

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração de peixe...");   
    }

    @Override
    public void emitirSom() {
        System.out.println("Glup Glup!");  
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
