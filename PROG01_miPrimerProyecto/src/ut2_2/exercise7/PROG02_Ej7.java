package ut2_2.exercise7;

public class PROG02_Ej7 {

  public static void main(String[] args) {
    short x = (short) 4.5;
    int i = 2;
    int j = i * x;
    System.out.println("j = " + j);

    double dx = 2.0;
    char y = (char) 3.0;
    double dz = dx * y;
    System.out.println("dz = " + dz);

    byte bx = 5;
    byte by = 2;
    byte bz = (byte) (bx - by);
    System.out.println("bz (byte) = " + bz);
    System.out.println("bz (int) = " + (int) bz);

    short sx = 5;
    short sy = 2;
    short sz = (short) (sx - sy);
    System.out.println("sz (short) = " + sz);
    sz = (short) (sx + sy);
    System.out.println("sz (short) = " + sz);

    char cx = '\u000F';
    char cy = '\u000E';
    int z = cx - cy;
    System.out.println("z = " + z);
    z = cx - 1;
    System.out.println("z = " + z);
    z = cx;
    System.out.println("z = " + z);

    sx = (short) cx;
    System.out.println("sx = " + sx);

    cx = (char) (sx);
    System.out.println("cx = " + cx);
  }
}
