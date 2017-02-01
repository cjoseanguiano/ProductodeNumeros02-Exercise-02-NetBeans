/*
2. Leer 2 números y mostrar el producto de ellos.
 */
package productodenumerosii;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class ProductodeNumerosII {

    public static int numeroA;
    public static int numeroB;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            int resultado = 0;

            numeroA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero 1"));
            numeroB = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero 2"));

            if ((numeroA & numeroB) != 0) {
                resultado = numeroA * numeroB;
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "El numero es POSITIVO (+) " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "El numero es NEGATIVO (-) " + resultado);
                }
            }
            //JOptionPane.showConfirmDialog(null, "El valor es : " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor numerico" + e);

        }
    }

}
