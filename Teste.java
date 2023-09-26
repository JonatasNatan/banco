import java.util.Scanner;

class Teste {
    public static void main(String[] args) {
        ContaBanco minhaConta;
        minhaConta = new ContaBanco();
        minhaConta.numero = 65638;
        minhaConta.nome = "Elton";
        minhaConta.saldo = 3000;
        minhaConta.tipo = TipoConta.CONTA_CORRENTE;

        System.out.println("-> Saldo da Conta: R$ " + minhaConta.saldo);
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Digite o valor que deseja sacar: ");

        double quantia = scanner.nextDouble();

        minhaConta.saque(quantia);
        System.out.println("-> Saldo da Conta: R$ " + minhaConta.saldo);

        if (minhaConta.saque(1000)) {
            System.out.println("* Saque realizado com Sucesso!");
        } else {
            System.out.println("* Saldo Insuficiente!");
        }
    }
}
