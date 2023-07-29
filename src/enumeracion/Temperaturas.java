package enumeracion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public enum Temperaturas {

    CELCIUS,
    FAHRENHEIT,
    KELVIN;

    public static void convertirTemperatura(Object cambioTemperatura, double grados) {
        DecimalFormat df = new DecimalFormat("#.00");
        double convertido;

        String opciones = cambioTemperatura.toString();

        switch (opciones) {
            case "Grados Celcius a Grados Fahrenheit":
                convertido = (grados * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, grados + " Grados Celcius equivalen a " + df.format(convertido) + " Grados Fahrenheit", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grados Celcius a Grados Kelvin":
                convertido = grados + 273.15;
                JOptionPane.showMessageDialog(null, grados + " Grados Celcius equivalen a " + df.format(convertido) + " Grados Kelvin", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grados Fahrenheit a Grados Celcius":
                convertido = (grados - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, grados + " Grados Fahrenheit equivalen a " + df.format(convertido) + " Grados Celcius", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grados Fahrenheit a Grados Kelvin":
                convertido = (grados - 32) * 5 / 9 + 273.15;
                JOptionPane.showMessageDialog(null, grados + " Grados Fahrenheit equivalen a " + df.format(convertido) + " Grados Kelvin", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grados Kelvin a Grados Celcius":
                convertido = grados - 273.15;
                JOptionPane.showMessageDialog(null, grados + " Grados Kelvin equivalen a " + df.format(convertido) + " Grados Celcius", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grados Kelvin a Grados Fahrenheit":
                convertido = (grados - 273.15) * 9 / 5 + 32;
                JOptionPane.showMessageDialog(null, grados + " Grados Kelvin equivalen a " + df.format(convertido) + " Grados Fahrenheit", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}




