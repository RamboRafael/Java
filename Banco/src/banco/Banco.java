package banco;
public class Banco {
    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco();
      
       c1.setTipoConta("cp");
       c1.abrirConta();
       c1.setValor(50);
      // c1.sacar();
      c1.pagarMensal();
      
       c1.info();
    }
    
}