package ut2_2.exercise1;

public class Main {

  public static void main(String[] args) {
    final int valorMaximo = 5000;
    boolean tieneCarnetConducir = true;
    int mesNumero = 9;
    String mesCadena = "Septiembre";
    String nombreCompleto = "Juan Pérez";
    Sexo sexo = Sexo.M; // es un Enum declarado en Sexo.java
    long milisegundosDesde1970 = System.currentTimeMillis();
    double saldoCuentaBancaria = 1000.50;
    double distanciaTierraJupiter = 628.743;

    System.out.println("Valor máximo no modificable: " + valorMaximo);
    System.out.println(
      "Tiene carnet de conducir: " + (tieneCarnetConducir ? "Sí" : "No")
    );
    System.out.println("Mes del año (número): " + mesNumero);
    System.out.println("Mes del año (cadena): " + mesCadena);
    System.out.println("Nombre y apellidos: " + nombreCompleto);
    System.out.println("Sexo: " + (sexo == Sexo.M ? "Masculino" : "Femenino"));
    System.out.println(
      "Milisegundos desde 01/01/1970: " + milisegundosDesde1970
    );
    System.out.println("Saldo de la cuenta bancaria: " + saldoCuentaBancaria);
    System.out.println("Distancia a Júpiter (kms): " + distanciaTierraJupiter);
  }
}
