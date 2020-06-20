public class Kolo {

  static double obwod, r, pole, przekatna;

  static void kolo() {

    // System.out.println("Podaj promien");

    // System.out.print("r: ");

    pole = Math.PI * r * r;

    przekatna = 2 * r;

    obwod = 2 * Math.PI * r;

    pole = Math.round(pole);
    obwod = Math.round(obwod);
    przekatna = Math.round(przekatna);

    // System.out.println("Pole = " + pole);
    // System.out.println("Przekatna = " + przekatna);
    // System.out.println("Obwod = " + obwod);
    // System.out.println("Promien = " + r);

  }

}
