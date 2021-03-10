package software.robsoncassiano.learn.staticos.attributes;/*
Atributos estáticos

  Atributos estáticos são atributos,
  onde os valores são compartilhados entre as instâncias da classe.

  NomeDaClasse.atributoEstatico;
 */

public class StaticDemo {
  public static void main(String[] args) {

    final Conta conta = new Conta("Robson");
    System.out.println(conta.getCliente());
    System.out.println(conta.getNumero());

    final Conta conta2 = new Conta("Fulano");
    System.out.println(conta2.getNumero());
    System.out.println(conta2.getCliente());

    final Conta robson = new Conta("Sicrano");
    System.out.println(robson.getNumero());
    System.out.println(robson.getCliente());
  }
}
