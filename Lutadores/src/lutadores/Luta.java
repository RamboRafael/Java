package lutadores;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1,Lutador l2 ){
        if(l1.getCategoria().equals (l2.getCategoria()) && l1 != l2){
        aprovada = true;
        
            System.out.println("Luta entre "+l1.getNome()+" e "+ l2.getNome() +" marcada. ");
        
    } else{
        setAprovada (false);
        System.out.println("Categorias diferentes ou são o mesmo lutador.");
        this.desafiado = null;
        this.desafiante = null;
        }
    }
    public void lutar(){
        if(aprovada == false){
            System.out.println("Luta não pode acontecer");
    }else {
            desafiante.apresentar();
            desafiado.apresentar();
             int vencedor =(int)(0 + Math.random() * (3 - 0));
            switch (vencedor) {
                case 1:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                    break;
                default:
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("A luta empatou!" );
                    break;
            }
        } 
            
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
