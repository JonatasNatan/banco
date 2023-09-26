enum TipoConta {
  CONTA_CORRENTE,
  CONTA_POUPANCA,
}

class ContaBanco {
  // Atributos da classe
  int numero;
  String nome;
  double saldo;
  double limite;
  TipoConta tipo;

  // Métodos da classe 
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
  
  
}






