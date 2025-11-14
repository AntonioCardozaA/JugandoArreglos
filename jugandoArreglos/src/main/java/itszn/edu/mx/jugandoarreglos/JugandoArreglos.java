/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/* Probando el webhooks*/

package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author alons
 */
import java.util.Arrays;
public class JugandoArreglos {

    public static void main(String[] args) {

        OperacionesArreglos op = new OperacionesArreglos();

        float[] numeros = {12f, -4.5f, 3.5f, 20f, -8f};

        float suma = op.calcularSuma(numeros);
        float promedio = op.calcularPromedio(numeros);
        int mayores = op.contarMayoresQue(numeros, 5f);
        float[] invertido = op.invertirArreglo(numeros);
        float[] absolutos = op.valoresAbsolutos(numeros);

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Elementos mayores que 5: " + mayores);
        System.out.println("Arreglo invertido: " + Arrays.toString(invertido));
        System.out.println("Valores absolutos: " + Arrays.toString(absolutos));
    }
}
