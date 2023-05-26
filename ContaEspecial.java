public class ContaEspecial extends Conta {
    
    private double limite;

    public ContaEspecial(int numero, Cliente titular, double saldo, double limite){
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public ContaEspecial(int numero, Cliente titular, double limite){
        super(numero, titular);
        this.limite = limite;
    }

    public ContaEspecial(int numero, String nomeTitular, String cpfTitular, double limite){
        super(numero, nomeTitular, cpfTitular);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public String getTipoConta(){
        return "conta especial";
    }


}