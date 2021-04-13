package pessoas;
public class Pessoas {
    public static void main(String[] args) {
        Pessoa r []= new Pessoa[3];
        r[0] = new Pessoa("Rafael", 23, "Masculino");
      //  r[0].fazerAniver();
        r[1] = new Pessoa("Carol", 30, "Feminino");
        r[2] = new Pessoa("Ivan", 1, "Masculino");
        
        Livro l[] = new Livro[3];
        l[0] = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", 96, 2, r[0]);
        l[0].detalhes(r[0]);
        l[0].abrir();
        l[0].voltarPag();
        l[0].folhear();
     }
}
