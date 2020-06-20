public class Trapez {

  static double a, b, c, d, h, pole, wysokosc, obwod;

  static void trapez() {

    // System.out.println("Podaj bok A");
    // System.out.print("A: ");
    //
    // System.out.println("Podaj bok B: ");
    // System.out.print("B: ");
    //
    // System.out.println("Podaj bok C: ");
    // System.out.print("C: ");
    //
    // System.out.println("Podaj bok D: ");
    // System.out.print("D: ");
    //
    // System.out.println("Podaj wysokosc: ");
    // System.out.print("H: ");

    pole = ((a + b) / 2) * h;

    obwod = a + b + c + d;

    wysokosc = 2 * pole / (a + b);

    pole = Math.round(pole);

    wysokosc = Math.round(wysokosc * 100);
    wysokosc = wysokosc / 100;

    obwod = Math.round(obwod);

    // System.out.println("Pole = " + pole);
    // System.out.println("Wysoksc = " + wysokosc);
    // System.out.println("Obwod = " + obwod);

  }

}
