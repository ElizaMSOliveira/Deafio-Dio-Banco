public interface Iconta {
//Não faz sentido ser public pq toda interface é por defull se torna so uma redundancia

    public void sacar(double valor);
    public void depositar(double valor);

    void ContaDestinoRecebe(double valor);

    public void transferir(double valor, Iconta contaDestino);
    void imprimirExtato();
}
