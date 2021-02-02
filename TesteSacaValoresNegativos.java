public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(200);

        System.out.println(conta.getSaldo());
    }
}