package ut2_2.exercise1;

public class Main {

  public static void main(String[] args) {
    final int VALOR_MAXIMO = 5000;
    boolean tieneCarnetConducir = true;
    byte mesNumero = 9;
    String mesCadena = "Septiembre";
    String nombreCompleto = "Juan Pérez";
    SEXO sexo = SEXO.M;
    long milisegundosDesde1970 = System.currentTimeMillis();
    float saldoCuentaBancaria = 1000.50f;
    int distanciaTierraJupiter = 590000000;

    System.out.println("Valor máximo no modificable: " + VALOR_MAXIMO);
    System.out.println(
      "Tiene carnet de conducir: " + (tieneCarnetConducir ? "Sí" : "No")
    );
    System.out.println("Mes del año (número): " + mesNumero);
    System.out.println("Mes del año (cadena): " + mesCadena);
    System.out.println("Nombre y apellidos: " + nombreCompleto);
    System.out.println("Sexo: " + (sexo == SEXO.M ? "Masculino" : "Femenino"));
    System.out.println(
      "Milisegundos desde 01/01/1970: " + milisegundosDesde1970 + " ms"
    );
    System.out.println("Saldo de la cuenta bancaria: " + saldoCuentaBancaria + " €");
    System.out.println("Distancia a Júpiter (kms): " + distanciaTierraJupiter + " kms");
  }

  public enum SEXO {
    V,
    M,
  }
}
