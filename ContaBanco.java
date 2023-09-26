enum TipoConta {
  CONTA_CORRENTE,
  CONTA_POUPANCA;
}

class Conta {
  int numero;
  String nome;
  double saldo;
  TipoConta tipo;

  boolean saque(double quantia) {
    if(this.saldo < quantia) {
      return false;        
    }
    else
    {
      this.saldo = this.saldo - quantia;
      return true;
    }  
  }  

  void deposito(double quantia) {
    this.saldo += quantia;   
  } 
}
