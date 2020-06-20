public class Prostokat {

  static double a, b, pole, przekatna, obwod, potega1, potega2;

  static void prostokat() {

    // System.out.println("Podaj bok A");
    // System.out.print("A: ");

    // System.out.println("Podaj bok B: ");
    // System.out.print("B: ");

    pole = a * b;

    potega1 = Math.pow(a, 2);
    potega2 = Math.pow(b, 2);
    przekatna = Math.sqrt(potega1 + potega2);

    obwod = 2 * a + 2 * b;

    pole = Math.round(pole);

    przekatna = Math.round(przekatna * 100);
    przekatna = przekatna / 100;

    obwod = Math.round(obwod);

    // System.out.println("Pole = " + pole);
    // System.out.println("Przek¹tna = " + przekatna);
    // .out.println("Obwod = " + obwod);

  }

}
