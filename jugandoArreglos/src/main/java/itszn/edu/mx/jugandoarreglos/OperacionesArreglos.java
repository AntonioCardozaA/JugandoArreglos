/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author alons
 */
public class OperacionesArreglos {
    // 5.1 - Suma de los elementos
    public float calcularSuma(float[] num) {
        if(num==null)
            return 0f;
        float suma = 0f;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }

    // 5.2 - Promedio de los elementos
    public float calcularPromedio(float[] num) {
        if(num == null)
            return 0;
        if (num.length == 0) {
            return 0;
        }
        float suma = calcularSuma(num);
        return suma / num.length;
    }

    // 5.3 - Contar cuántos elementos exceden el límite
    public int contarMayoresQue(float[] num, float limite) {
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    // 5.4 - Invertir el arreglo
    public float[] invertirArreglo(float[] num) {
        float[] invertido = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }

    // 5.5 - Arreglo con los valores absolutos
    public float[] valoresAbsolutos(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }
    
}