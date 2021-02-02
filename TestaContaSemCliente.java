public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marcela Teresa Silva";
        contaDaMarcela.titular.cpf = "226.153.654-91";
        contaDaMarcela.titular.profissao = "Programadora";
        // Ou Cliente marcela = new Cliente();

        System.out.println(" ");
        System.out.println("Meu nome por completo  : " + contaDaMarcela.titular.nome);
        System.out.println(" ");
        System.out.println("Meu cpf  : " + contaDaMarcela.titular.cpf);
        System.out.println(" ");
        System.out.println("Minha profissao : " + contaDaMarcela.titular.profissao);
        System.out.println(" ");

    }
}