package ut2_2.exercise3;

public class GetBoolean {

  public static void main(String[] args) {
    boolean var1 = true;
    boolean var2 = true;
    boolean var3 = false;

    int X = 5;
    int Y = -8;
    int Z = 10;

    System.out.println("a)" + (var1 || var2 && var3));
    System.out.println("b)" + ((var1 || var3) && (var2 && !var1)));
    System.out.println("c)" + ((var2 || !var1 || !var3) && var1));
    System.out.println("d)" + ((X > 3 || Y > 3) && Z < -3));
    System.out.println("e)" + ((X + Z == 15) && (Y != 2)));
  }
}
