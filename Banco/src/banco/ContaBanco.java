package banco;
public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String Dono;
    private double saldo;
    private String status;
    public double valor;
    
    public void info(){
        System.out.println("Tipo da Conta " +this.tipoConta);
        System.out.println("Status da conta " +this.status);
        System.out.println("Saldo " +this.saldo);
    }
    
    public void abrirConta(){
    this.status = "Ativa";
    if(this.tipoConta .equals ("cc")){
        this.saldo+= 50;
    }else if(this.tipoConta .equals("cp")){
        this.saldo+=150;
    }
    }
    public void fechar(){
        if(saldo==0){
            this.status = "Desativada";
    }
    }
    public double depositar(){
        if(status .equals("Ativa")){
            this.saldo+=this.valor;
    }return 0;
    }
    public double sacar(){
        if(status .equals("Ativa") && this.saldo>=this.valor){
            this.saldo-=this.valor;
    }return 0;
    }
    public void pagarMensal(){
        if(this.tipoConta.equals("cc")){
          this.saldo -= 12;  
        }else{
          this.saldo -=20;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
            
}     