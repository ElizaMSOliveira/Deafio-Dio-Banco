public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.println("=== Informaçõe de Conta Poupança ===");
        super.imprimiInfosComuns();

    }
    @Override
    public void imprimirExtato() {
        System.out.println("=== Extrato De Conta Poupança ===");
        System.out.println(String.format("Deposito R$ %.2f",this.valorDeposito));
        System.out.println(String.format("Saque R$ %.2f",this.valorSaque));
        System.out.println(String.format("Transferencia R$ %.2f",this.valorTranserido));
        System.out.println(String.format("Saldo R$ %.2f",this.getSaldo()));


    }
}
