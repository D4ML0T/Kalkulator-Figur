import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener {

  JPanel panel2 = new JPanel();

  int licznik = 0;
  double A;
  JFrame ramka;
  JButton kwadrat, kolo, prostokat, rownoleglobok, trapez, trojkat;
  JLabel textF, instrukcje;
  JTextField MiejsceNaDane, MiejsceNaDane2, MiejsceNaDane3, MiejsceNaDane4, MiejsceNaDane5;

  public static void main(String[] args) {
    GUI przyciski = new GUI();
    przyciski.zbudujGUI();
  }

  public void zbudujGUI() {

    ramka = new JFrame();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ramka.setSize(1920, 1080);
    kwadrat = new JButton();
    kolo = new JButton();
    prostokat = new JButton();
    rownoleglobok = new JButton();
    trapez = new JButton();
    trojkat = new JButton();

    kwadrat.setText("Kwadrat");
    kolo.setText("Ko這");
    prostokat.setText("Prostokat");
    rownoleglobok.setText("R闚noleglobok");
    trapez.setText("Trapez");
    trojkat.setText("Tr鎩k靖");

    kwadrat.addActionListener(this);
    kolo.addActionListener(this);
    prostokat.addActionListener(this);
    rownoleglobok.addActionListener(this);
    trapez.addActionListener(this);
    trojkat.addActionListener(this);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1, 2));
    panel.add(kwadrat);
    panel.add(kolo);
    panel.add(prostokat);
    panel.add(rownoleglobok);
    panel.add(trapez);
    panel.add(trojkat);

    panel2.setLayout(new GridLayout(8, 1));
    instrukcje = new JLabel("Wybierz figure");
    textF = new JLabel("Tu pojawi sie wynik");

    panel2.add(textF);
    panel2.add(instrukcje);
    panel2.add(panel);
    ramka.add(panel2);
    ramka.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent akcja) {

    if (akcja.getSource() == kwadrat) {

      if (licznik == 0) {
        licznik++;

        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);
        panel2.add(MiejsceNaDane);
        MiejsceNaDane.setText("A");
        instrukcje.setText("PONIZEJ PODAJ WARTOSC BOKU A I NASINIJ PRZYCISK KWADRAT JESZCZE RAZ");
      }

      else if (licznik == 1) {
        try {
          Kwadrat.a = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }

        Kwadrat.kwadrat();
        textF.setText("Pole = " + Kwadrat.pole + " Przekatna = " + Kwadrat.przekatna + " Obwod = "
            + Kwadrat.obwod);
        licznik = 0;
      }

    }

    if (akcja.getSource() == kolo) {
      if (licznik == 0) {
        licznik++;
        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);
        panel2.add(MiejsceNaDane);
        MiejsceNaDane.setText("R");
        instrukcje.setText("PONIZEJ PODAJ WARTOSC PROMIENIA I NASINIJ PRZYCISK KOLO JESZCZE RAZ");
      } else if (licznik == 1) {
        try {
          Kolo.r = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }
        Kolo.kolo();
        textF.setText("Pole = " + Kolo.pole + " Przekatna = " + Kolo.przekatna + " Obwod = "
            + Kolo.obwod + " Promien = " + Kolo.r);
      }
    }

    if (akcja.getSource() == prostokat) {

      if (licznik == 0) {
        licznik++;

        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);

        MiejsceNaDane2 = new JTextField();
        MiejsceNaDane2.setSize(20, 20);

        MiejsceNaDane.setText("A");
        MiejsceNaDane2.setText("B");

        panel2.add(MiejsceNaDane2);
        panel2.add(MiejsceNaDane);

        instrukcje
            .setText("PONIZEJ PODAJ WARTOSC A oraz B I NASINIJ PRZYCISK PROSTOKAT JESZCZE RAZ");
      } else if (licznik == 1) {
        try {
          Prostokat.a = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }

        try {
          Prostokat.b = Double.parseDouble(MiejsceNaDane2.getText());
        } catch (Exception ex) {
        }

        Prostokat.prostokat();

        textF.setText("Pole = " + Prostokat.pole + " Przekatna = " + Prostokat.przekatna
            + " Obwod = " + Prostokat.obwod);
      }
    }

    if (akcja.getSource() == rownoleglobok) {

      if (licznik == 0) {
        licznik++;

        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);

        MiejsceNaDane2 = new JTextField();
        MiejsceNaDane2.setSize(20, 20);

        MiejsceNaDane3 = new JTextField();
        MiejsceNaDane3.setSize(20, 20);

        panel2.add(MiejsceNaDane);
        panel2.add(MiejsceNaDane2);
        panel2.add(MiejsceNaDane3);

        MiejsceNaDane.setText("A");
        MiejsceNaDane2.setText("B");
        MiejsceNaDane3.setText("H");

        instrukcje.setText(
            "PONIZEJ PODAJ WARTOSC A, B ORAZ H I NASINIJ PRZYCISK ROWNOLEGLOBOK JESZCZE RAZ");
      } else if (licznik == 1) {
        try {
          R闚noleg這bok.a = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }

        try {
          R闚noleg這bok.b = Double.parseDouble(MiejsceNaDane2.getText());
        } catch (Exception ex) {
        }

        try {
          R闚noleg這bok.h = Double.parseDouble(MiejsceNaDane2.getText());
        } catch (Exception ex) {
        }

        R闚noleg這bok.rownoleglobok();

        textF.setText("Pole = " + R闚noleg這bok.pole + " Obwod = " + R闚noleg這bok.obwod);
      }
    }

    if (akcja.getSource() == trapez) {

      if (licznik == 0) {
        licznik++;
        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);

        MiejsceNaDane2 = new JTextField();
        MiejsceNaDane2.setSize(20, 20);

        MiejsceNaDane3 = new JTextField();
        MiejsceNaDane3.setSize(20, 20);

        MiejsceNaDane4 = new JTextField();
        MiejsceNaDane4.setSize(20, 20);

        MiejsceNaDane5 = new JTextField();
        MiejsceNaDane5.setSize(20, 20);

        panel2.add(MiejsceNaDane);
        panel2.add(MiejsceNaDane2);
        panel2.add(MiejsceNaDane3);
        panel2.add(MiejsceNaDane4);
        panel2.add(MiejsceNaDane5);

        MiejsceNaDane.setText("A");
        MiejsceNaDane2.setText("B");
        MiejsceNaDane3.setText("C");
        MiejsceNaDane4.setText("D");
        MiejsceNaDane5.setText("H");

        instrukcje.setText(
            "PONIZEJ PODAJ WARTOSC A, B, C, D ORAZ H I NASINIJ PRZYCISK TRAPEZ JESZCZE RAZ");
      } else if (licznik == 1) {
        try {
          Trapez.a = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }

        try {
          Trapez.b = Double.parseDouble(MiejsceNaDane2.getText());
        } catch (Exception ex) {
        }

        try {
          Trapez.c = Double.parseDouble(MiejsceNaDane3.getText());
        } catch (Exception ex) {
        }

        try {
          Trapez.d = Double.parseDouble(MiejsceNaDane4.getText());
        } catch (Exception ex) {
        }

        try {
          Trapez.h = Double.parseDouble(MiejsceNaDane5.getText());
        } catch (Exception ex) {
        }

        Trapez.trapez();

        textF.setText("Pole = " + Trapez.pole + " Wysokosc = " + Trapez.wysokosc + " Obwod = "
            + Trapez.obwod);
      }
    }

    if (akcja.getSource() == trojkat) {

      if (licznik == 0) {
        licznik++;

        MiejsceNaDane = new JTextField();
        MiejsceNaDane.setSize(20, 20);

        MiejsceNaDane2 = new JTextField();
        MiejsceNaDane2.setSize(20, 20);

        MiejsceNaDane3 = new JTextField();
        MiejsceNaDane3.setSize(20, 20);

        panel2.add(MiejsceNaDane);
        panel2.add(MiejsceNaDane2);
        panel2.add(MiejsceNaDane3);

        MiejsceNaDane.setText("A");
        MiejsceNaDane2.setText("B");
        MiejsceNaDane3.setText("C");

        instrukcje.setText("PONIZEJ PODAJ WARTOSC A, B, C I NASINIJ PRZYCISK TROJKAT JESZCZE RAZ");
      } else if (licznik == 1) {
        try {
          Trojkat.a = Double.parseDouble(MiejsceNaDane.getText());
        } catch (Exception ex) {
        }

        try {
          Trojkat.b = Double.parseDouble(MiejsceNaDane2.getText());
        } catch (Exception ex) {
        }

        try {
          Trojkat.c = Double.parseDouble(MiejsceNaDane3.getText());
        } catch (Exception ex) {
        }

        Trojkat.trojkat();

        textF.setText("Pole = " + Trojkat.pole + " Wysokosc = " + Trojkat.wysokosc + " Obwod = "
            + Trojkat.obwod);
      }
    }
  }
}
