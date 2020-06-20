public class Trojkat {

  static double a, b, c, p, pole, przekatna, obwod, wysokosc, h;

  static void trojkat() {

    // System.out.println("Podaj bok A");
    //
    // System.out.print("A: ");
    //
    // System.out.println("Podaj bok B");
    //
    // System.out.print("B: ");
    //
    // System.out.println("Podaj bok C");
    //
    // System.out.print("C: ");

    double p = (a + b + c) / 2;
    pole = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // wzor Herona

    wysokosc = a * Math.sqrt(1.0 / 3.0) / 2;
    obwod = a + b + c;

    pole = Math.round(pole);

    wysokosc = Math.round(wysokosc * 100);
    wysokosc = wysokosc / 100;

    obwod = Math.round(obwod);

    // System.out.println("Pole = " + pole);
    // System.out.println("Wysokosc = " + wysokosc);
    // System.out.println("Obwod = " + obwod);

  }

}
