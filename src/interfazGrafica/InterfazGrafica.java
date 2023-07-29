package interfazGrafica;

import enumeracion.*;
import javax.swing.JOptionPane;

public class InterfazGrafica {

    public static void main(String[] args) {

        int salir;
        double valorDouble;

        do {
            Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Conversor de Moneda");
            
            if (menu.equals("Conversor de Moneda")) {
                valorDouble = validar("Ingresa la cantidad de dinero que deseas convertir:");
                Object cambioMoneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero: ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yenes", "De Pesos a Wones", "De Dólares a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yenes a Pesos", "De Wones a Pesos"}, "De Pesos a Dólares");
                Divisas.convertirDivisa(cambioMoneda, valorDouble);            

            } else {
                valorDouble = validar("Ingresa el valor de la temperatura que deseas convertir:");
                Object cambioTemperatura = JOptionPane.showInputDialog(null, "Elije una opción para convertir: ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Grados Celcius a Grados Fahrenheit", "Grados Celcius a Grados Kelvin", "Grados Fahrenheit a Grados Celcius", "Grados Fahrenheit a Grados Kelvin", "Grados Kelvin a Grados Celcius", "Grados Kelvin a Grados Fahrenheit"}, "Grados Celcius a Grados Fahrenheit");
                Temperaturas.convertirTemperatura(cambioTemperatura, valorDouble);
            }            

            salir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        } while (salir == 0);
        
        JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static double validar(String mensaje) {
        while (true) {
            String valorIngresasdo = JOptionPane.showInputDialog(null, mensaje, "Input", JOptionPane.QUESTION_MESSAGE);
            try {
                return Double.parseDouble(valorIngresasdo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
