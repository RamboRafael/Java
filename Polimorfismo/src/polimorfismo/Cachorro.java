package polimorfismo;
public class Cachorro extends Animal{
    protected String corPelo;
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    }
    public void reagir( String frase){
        if("Ola".equals(frase) || "Toma comida".equals(frase)) {
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir( int hora, int min){
        if(hora<12){
            System.out.println("Pedir comida");
        }else{
            System.out.println("Rosnar");
        }
        
    }
    public void reagir(boolean dono){
        if(dono=true){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Latir");
        }
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
