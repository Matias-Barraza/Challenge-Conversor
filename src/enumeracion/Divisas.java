package enumeracion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public enum Divisas {

    PESO(1),
    DOLAR(273.01),
    EURO(299.81),
    LIBRA(349.43),
    YEN(1.97),
    WON(0.21);

    private final double valor;

    private Divisas(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public static void convertirDivisa(Object cambioMoneda, double monto) {
        
        DecimalFormat df = new DecimalFormat("#.000");
        double convertido;

        String opciones = cambioMoneda.toString();

        switch (opciones) {
            case "De Pesos a Dólares":
                convertido = monto / DOLAR.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Dólares", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Pesos a Euros":
                convertido = monto / EURO.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Euros", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Pesos a Libras":
                convertido = monto / LIBRA.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Libras", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Pesos a Yenes":
                convertido = monto / YEN.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Yenes", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Pesos a Wones":
                convertido = monto / WON.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Wones", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Dólares a Pesos":
                convertido = monto * DOLAR.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Euros a Pesos":
                convertido = monto * EURO.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Libras a Pesos":
                convertido = monto * LIBRA.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Yenes a Pesos":
                convertido = monto * YEN.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "De Wones a Pesos":
                convertido = monto * WON.getValor();
                JOptionPane.showMessageDialog(null, "Tienes $" + df.format(convertido) + " Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

}



