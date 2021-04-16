package youtube;
public class YouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video ("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video (" Aula 10 de Java");
      //  System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Junior", 21, "Masculino", "juju");
        g[1] = new Gafanhoto("Keila", 16, "Feminino", "Keilinha");
        
        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0],v[0]);
        visu[0].avaliar(10);
        visu[1] = new Visualizacao(g[0],v[1]);
        visu[2] = new Visualizacao(g[0],v[2]);
        visu[3] = new Visualizacao(g[0],v[0]);
        v[0].Info();
        v[1].Info();
        v[2].Info();
        g[0].info();
        //visu[0].info();
    }
    
}
