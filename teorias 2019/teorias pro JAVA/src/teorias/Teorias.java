package teorias;

import javax.swing.JOptionPane;
import sun.security.util.Length;

public class Teorias {

    public static void main(String[] args) {
        while (true) {
            // validacion de las funciones que sean verdadero para que pertenesca al lenguaje
            String entrada = JOptionPane.showInputDialog("Ingrese palabra");
            if (primerosNumeros(entrada) && ultimoNumero(entrada) && multiploTresySiete(entrada)) {
                        JOptionPane.showMessageDialog(null, "Pertenece");
            } else {
                JOptionPane.showMessageDialog(null, "No Pertenece");
            }
        }
    }
    ///funcion q valida primeros dos numeros
    static Boolean primerosNumeros(String entrada) {
        String regla1 = "44";
        String lenguaje = "1234567890";
        for (int x = 0; x < entrada.length(); x++) {
            int validar = 0;
            for (int j = 0; j < lenguaje.length(); j++) {
                if (entrada.charAt(x) == lenguaje.charAt(j)) validar = 1;   
            }
            if (validar == 1) continue;
            else return false;   
        }
        if (entrada.startsWith(regla1)) return true;
        else return false;
    }

    //metodo validacion ultimo numero
    static Boolean ultimoNumero(String entrada) {
        String regla1 = "7";
        if (entrada.endsWith(regla1))return false;
        
        return true;
    }

    //validar los multiplos de 3 y siete
    static Boolean multiploTresySiete(String entrada) {
        int multipoTres = entrada.length();
        int multiploSiete = entrada.length();
        if (multipoTres % 3 == 0 || multiploSiete % 7 == 0) {
            return true;
        }
        return false;
    }
}
