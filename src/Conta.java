public abstract class Conta implements Iconta{
//Protectedtods as classes filhasconseguem ter acesso
    private static int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0d;
    protected Cliente cliente;
    protected double valorDeposito = 0d;
    protected double valorSaque= 0d;
    protected double valorTranserido = 0d;

    public Conta(Cliente cliente){
       this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("=== Saque ===");
        if(this.saldo < valor ){
            System.out.println("Saldo Insuficiente Para Saque de R$ " + valor);
            System.out.println("Seu saldo R$ "+ this.saldo);
        }else {
            this.saldo -= valor;
            valorSaque = valor;
            System.out.println("Saque R$ "+valorSaque);
        }

    }
    @Override
    public void depositar(double valor) {
        System.out.println("=== Deposito ===");
        this.saldo += valor;
        valorDeposito =valor ;
        System.out.println("Deposito R$ "+valorDeposito);

    }
    @Override
    public void ContaDestinoRecebe(double valor){
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Iconta contaDestino) {
        System.out.println("=== Transferencia ===");
        if(this.saldo < valor){
            System.out.println("Você não tem Saldo para fazer transferencia de R$ "+valor);
            System.out.println("Seu saldo R$ "+ this.saldo);

        }else {
            this.saldo -= valor;
            valorTranserido = valor;
            System.out.println("Transferencia R$ "+valorTranserido);
            //contaDestino.depositar(valor);
            contaDestino.ContaDestinoRecebe(valor);

        }


    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



    //Protected metodo Protegido, so os filhos tem acesso
    protected void imprimiInfosComuns() {
       System.out.println("=== Dados Conta  ===");
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
       // System.out.println(String.format("Agencia: %.2f",this.saldo));
    }

    public abstract void imprimirInfosComuns();
}
