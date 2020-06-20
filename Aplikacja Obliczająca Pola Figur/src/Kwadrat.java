public class Kwadrat {

  static double a, pole, przekatna, obwod;

  static void kwadrat() {

    // System.out.println("Podaj bok A");
    // System.out.print("A: ");

    pole = a * a;
    przekatna = a * Math.sqrt(2);
    obwod = 4 * a;

    pole = Math.round(pole);

    przekatna = Math.round(przekatna * 100);
    przekatna = przekatna / 100;

    obwod = Math.round(obwod);

    // System.out.println("Pole = " + pole);
    // System.out.println("Przek¹tna = " + przekatna);
    // System.out.println("Obwod = " + obwod);

  }

}
