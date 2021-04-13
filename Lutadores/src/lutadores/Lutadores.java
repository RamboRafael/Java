package lutadores;
public class Lutadores {
    public static void main(String[] args) {
       Lutador l[] =  new Lutador[6];{
       
    l[0] = new Lutador("Itadori", "japão", 18, 1.80f, 78.5f, 5, 1, 2);
       // l[0].apresentar();
        
    l[1] = new Lutador("mtusuki", "china", 19, 1.80f, 75.5f, 5, 1, 2);
        //l[1].apresentar();
        
    l[2] = new Lutador("roberto", "Brasil", 28, 1.80f, 90f, 5, 1, 2);
       // l[2].apresentar();
        
    l[3] = new Lutador("doki", "mongolia", 18, 1.80f, 91.5f, 5, 1, 2);
        //l[3].apresentar();
        
    l[4] = new Lutador("juao", "espanha", 18, 1.80f, 61.5f, 5, 1, 2);
      //  l[4].apresentar();
        
    l[5] = new Lutador("jusé", "portugal", 18, 1.80f, 60.5f, 5, 1, 2);
      //  l[5].apresentar();
    }
    
   Luta fc = new Luta();{
        fc.marcarLuta(l[0], l[1]);
        fc.lutar();
    }
        
    }
    
    
    
    
}
