package software.robsoncassiano.learn.staticos.attributes;

public class Conta {
  private final int numero;
  private final String cliente;

  private static int contador = 1;

  public Conta(String cliente) {
    this.numero = contador++;
    this.cliente = cliente;
  }

  public String getCliente() {
    return cliente;
  }

  public int getNumero() {
    return numero;
  }
}
