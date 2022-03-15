import java.util.List;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Eliza Oliveira");
        Cliente Maria = new Cliente();
        Maria.setNome("Maria");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        ContaSalario cs = new ContaSalario(Maria);

        System.out.println("CONTA SALARIO");
        cs.imprimiInfosComuns();
        cs.depositar(50);
        cs.sacar(10);
        cs.transferir(20,poupanca);
        cs.imprimirExtato();

        System.out.println("\nCONTA CORRENTE");
        cc.imprimiInfosComuns();
        cc.depositar(100);
        cc.sacar(50);
        cc.transferir(40,poupanca);
        cc.imprimirExtato();

       System.out.println("\nCONTA POUPANÇA");
        poupanca.imprimiInfosComuns();
        poupanca.depositar(200);
        poupanca.sacar(40);
        poupanca.transferir(150,cc);
        poupanca.imprimirExtato();

       System.out.println("\nNovo Saldo Conta Corrente");
        cc.imprimirExtato();

    }
}
