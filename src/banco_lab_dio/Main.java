package banco_lab_dio;


public class Main {

    public static void main(String[] args) {
        Banco bancoPrim = new Banco();
        bancoPrim.setNome("BancoInicial");
        Cliente Denki = new Cliente("Denki", "Rua Lido1", "abababa@email.com", "719885577110");
        Denki.setNome("Denki Leal");
        Conta ccorrente = new ContaCorrente(Denki);
        ccorrente.depositar(1540);

        Cliente Mikael = new Cliente("Mikael", "Rua Lido2", "gugu@email.com", "1447711344");
        Conta cpoupanca = new ContaPoupanca(Mikael);
        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(500, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        bancoPrim.mostrarListaCliente();

        Cliente Ayumi = new Cliente("Ayumi", "Rua Lido3", "ayu@email.com", "154100310");
        Conta cpoupanca2 = new ContaPoupanca(Ayumi);
        cpoupanca2.imprimirExtrato();

        bancoPrim.mostrarListaCliente();


    }

}