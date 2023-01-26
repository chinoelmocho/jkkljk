/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tabajocalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LAB-2
 */
public class TabajoCalseTest {
    
    public TabajoCalseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tea   (){} /**
     * Test of convertirCelsiusFahrenheit method, of class TabajoCalse.
     */
    @Test
    public void testConvertirCelsiusFahrenheit() {
        System.out.println("convertirCelsiusFahrenheit");
        double celsius = 0.0;
        TabajoCalse instance = new TabajoCalse();
        Double expResult = null;
        Double result = instance.convertirCelsiusFahrenheit(celsius);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerNumeroNegativo method, of class TabajoCalse.
     */
    @Test
    public void testLeerNumeroNegativo() {
        System.out.println("leerNumeroNegativo");
        int numero = 0;
        TabajoCalse instance = new TabajoCalse();
        String expResult = "";
        String result = instance.leerNumeroNegativo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCuadradoYCubo method, of class TabajoCalse.
     */
    @Test
    public void testObtenerCuadradoYCubo() {
        System.out.println("obtenerCuadradoYCubo");
        int numero = 0;
        TabajoCalse instance = new TabajoCalse();
        String expResult = "";
        String result = instance.obtenerCuadradoYCubo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of porcentajeDescuento method, of class TabajoCalse.
     */
    @Test
    public void testPorcentajeDescuento() {
        System.out.println("porcentajeDescuento");
        double precioNormal = 0.0;
        double precioPagado = 0.0;
        TabajoCalse instance = new TabajoCalse();
        Double expResult = null;
        Double result = instance.porcentajeDescuento(precioNormal, precioPagado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Numeros method, of class TabajoCalse.
     */
    @Test
    public void testNumeros() {
        System.out.println("Numeros");
        int num1 = 0;
        int num2 = 0;
        TabajoCalse instance = new TabajoCalse();
        int[] expResult = null;
        int[] result = instance.Numeros(num1, num2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calculadoraperimetro method, of class TabajoCalse.
     */
    @Test
    public void testCalculadoraperimetro() {
        System.out.println("Calculadoraperimetro");
        double base = 0.0;
        double altura = 0.0;
        double area = 0.0;
        double perimetro = 0.0;
        TabajoCalse instance = new TabajoCalse();
        double[] expResult = null;
        double[] result = instance.Calculadoraperimetro(base, altura, area, perimetro);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ejercicio7 method, of class TabajoCalse.
     */
    @Test
    public void testEjercicio7() {
        System.out.println("Ejercicio7");
        double radio = 0.0;
        TabajoCalse instance = new TabajoCalse();
        double[] expResult = null;
        double[] result = instance.Ejercicio7(radio);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ejercicio8 method, of class TabajoCalse.
     */
    @Test
    public void testEjercicio8() {
        System.out.println("Ejercicio8");
        double lado1 = 0.0;
        double lado2 = 0.0;
        double lado3 = 0.0;
        TabajoCalse instance = new TabajoCalse();
        double[] expResult = null;
        double[] result = instance.Ejercicio8(lado1, lado2, lado3);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ejercicio9 method, of class TabajoCalse.
     */
    @Test
    public void testEjercicio9() {
        System.out.println("Ejercicio9");
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        TabajoCalse instance = new TabajoCalse();
        double[] expResult = null;
        double[] result = instance.Ejercicio9(num1, num2, num3);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ejercicio10 method, of class TabajoCalse.
     */
    @Test
    public void testEjercicio10() {
        System.out.println("Ejercicio10");
        int A = 0;
        int B = 0;
        TabajoCalse instance = new TabajoCalse();
        int[] expResult = null;
        int[] result = instance.Ejercicio10(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

rDown() {
    }
    
}
