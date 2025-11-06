/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alons
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }    
    private OperacionesArreglos opa;
    
    @BeforeEach
    public void setUp() {
        opa=new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void pruebasuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada= 35;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void pruebasuma2nulo(){
        float [] entrada =null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void pruebaPromedio1(){
        float[] entrada={10f,20f,30f};
        float salidaEsperada= 20;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void pruebaPromedio2Error(){
        float[] entrada={0f,0f,0f};
        float salidaEsperada= 0;
        
        float salidaReal=opa.calcularPromedio(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void pruebaContarMayores1(){
        float[] entrada={5f,10f,15f,20f};
        float limite=10f;
        int salidaEsperada=2;
        
        int salidaReal=opa.contarMayoresQue(entrada, limite);
        
        assertEquals(salidaEsperada,salidaReal);
    }

    @Test
    public void pruebaContarMayores2Ninguno(){
        float[] entrada={1f,2f,3f};
        float limite=5f;
        int salidaEsperada=0;
        
        int salidaReal=opa.contarMayoresQue(entrada, limite);
        
        assertEquals(salidaEsperada,salidaReal);
    }

    // ------- PRUEBAS 5.4 invertirArreglo ---------
    @Test
    public void pruebaInvertir1(){
        float[] entrada={2f,1f,9f,6f};
        float[] salidaEsperada={6f,9f,1f,2f};
        
        float[] salidaReal=opa.invertirArreglo(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal,0.001f);
    }

    @Test
    public void pruebaInvertir2UnElemento(){
        float[] entrada={10f};
        float[] salidaEsperada={10f};
        
        float[] salidaReal=opa.invertirArreglo(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal,0.001f);
    }

    // ------- PRUEBAS 5.5 valoresAbsolutos ---------
    @Test
    public void pruebaValoresAbsolutos1(){
        float[] entrada={-2f,3f,-4f,5f};
        float[] salidaEsperada={2f,3f,4f,5f};
        
        float[] salidaReal=opa.valoresAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal,0.001f);
    }

    @Test
    public void pruebaValoresAbsolutos2Ceros(){
        float[] entrada={0f,-1f,1f,0f};
        float[] salidaEsperada={0f,1f,1f,0f};
        
        float[] salidaReal=opa.valoresAbsolutos(entrada);
        
        assertArrayEquals(salidaEsperada,salidaReal,0.001f);
    }

}
    

