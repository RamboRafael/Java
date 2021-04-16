package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        
       Cachorro dog = new Cachorro();
       dog.setPeso(10.5f);
       dog.setMembros(5);
       dog.setIdade(5);
       dog.setCorPelo("Preto");
     dog.alimentar();
     dog.emitirSom();
     dog.locomover();
     dog.reagir("Ola");
     dog.reagir(false);
     dog.reagir(14, 30);
              
    }
    
}
