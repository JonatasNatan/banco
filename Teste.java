import java.util.Scanner;  // fazer entrada de dados

class TesteConta {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta();

    minhaConta.numero = 12345;
    minhaConta.nome = "Elton";
    minhaConta.saldo = 10000;
    minhaConta.tipo = TipoConta.CONTA_CORRENTE;

    System.out.println(" -> Saldo da conta: R$ " + minhaConta.saldo);

    minhaConta.saque(100);      // saque de 100 reais
    minhaConta.deposito(1000);  // deposito de 100 reais
    System.out.println(" -> Saldo da conta: R$ " + minhaConta.saldo);

    Scanner scanner = new Scanner(System.in);

    System.out.print(" -> Digite o valor que deseja sacar: ");
    double quantia = scanner.nextDouble();
    
    if (minhaConta.saque(quantia))
    {
      System.out.println(" * Saque realizado com sucesso!");
    }
    else
    {
      System.out.println(" * Saldo insuficiente!");
    }    
    
    // saque de mil reais
    System.out.println(" -> Saldo da conta: R$ " + minhaConta.saldo);
  }
}
