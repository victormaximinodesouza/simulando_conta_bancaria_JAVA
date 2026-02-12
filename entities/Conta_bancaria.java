package entities;
public class Conta_bancaria {
    private String titular;
    private Double saldo;
    private String numeroConta;
    private String cliente;

    public Conta_bancaria(){
    }

    public Conta_bancaria(String titular, Double saldo, String numeroConta, String cliente){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setCliente(String cliente) {        
        this.cliente = cliente;
    }   

    public String getTitular() {
        return titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public String getCliente() {
        return cliente;
    }

    public String cliente(){
        if (cliente == null){
            return "Sem cliente";
        }
        else{
            return cliente;
        }
    }



    @Override
    public String toString(){
        return "Olá: " + getCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getTitular() + ", conta " + 
        getNumeroConta() + " e seu saldo " + 
        getSaldo() + " já está disponível para saque";



    
    }

}
