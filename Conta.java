public class Conta {

    double saldo;
    int agencia;
    Long numero;
    Cliente titular;

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        } else {
            return false;
        }

    }

}