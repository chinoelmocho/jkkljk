/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tabajocalse;

import java.util.Scanner;

/**
 *
 * @author LAB-2
 */
public class TabajoCalse {

       public  Double convertirCelsiusFahrenheit(double celsius ){
        var retorno="";
  
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        return fahrenheit;
    }
    
    
    public  String leerNumeroNegativo(int numero) {
        var retorno="";
    
    if (numero < 0) {
        retorno= "El número ingresado es: " + Integer.toString(numero);
        retorno="El número positivo del mismo es: " + Math.abs(numero);
    } else {
        retorno="El número ingresado no es negativo";
    }
    return retorno;
}
    public String obtenerCuadradoYCubo(int numero) {
        var retorno ="";
    int cuadrado = numero * numero;
    int cubo = numero * numero * numero;
    retorno= "El cuadrado de " + Integer.toString(numero) + " es " +  Integer.toString(cuadrado) + " y el cubo es " +  Integer.toString(cubo);
    return retorno;
    }
    public Double porcentajeDescuento(double precioNormal, double precioPagado) {
    double descuento = (precioNormal - precioPagado) / precioNormal * 100;
    return descuento;
}
    

public int[] Numeros(int num1 ,int num2){
	
	System.out.print("Introduzca el primer numero: ");
	
	System.out.printf("Introduzca el segundo numero: ");
	
	
	var retorno=new int[5]; 
                retorno[1]=num1 + num2;
        retorno[2]= num1 - num2;
                retorno[3]=num1 / num2;
                        retorno[4]= num2 - num1;
                                retorno[5]=num2 / num1;
                                       
                        
	return retorno;
	
	
}
    public double[] Calculadoraperimetro(double base,double altura, double area, double perimetro) {
		
		
		//Asignación de valores a las variables
		base = 10;
		altura = 5;
		
		//Cálculo del área y el perímetro
		area = (base * altura) / 2;
		perimetro = base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		//Impresión de resultados
                var retorno=new double[2];
		retorno[0]= area;
		retorno[1]=perimetro;
                return retorno;
		
	}

  
    public double[] Ejercicio7(double radio) {
        
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
var retorno=new double[2];

        retorno[0]= perimetro;
        retorno[1]=area;
        return retorno;
    }
    public double[]Ejercicio8 (double lado1, double lado2, double lado3) {
		//Declaración de variables
		
		double perimetro, semiperimetro, area;
		
		//Asignación de valores a las variables
		
		
		//Cálculo del perímetro
		perimetro = lado1 + lado2 + lado3;
		
		//Cálculo del semiperímetro
		semiperimetro = perimetro / 2;
		
		//Cálculo del área
		area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
		
		//Impresión de resultados
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Semiperímetro: " + semiperimetro);
		System.out.println("Área: " + area);
                var retorno = new double[3];
                retorno[0]=perimetro;
                retorno[1]=semiperimetro;
                retorno[2]=area;
                return retorno;
	}
     public double []  Ejercicio9(double num1,double num2,double num3) {
       


        double sumaTotal = num1 + num2 + num3;

        double porcentaje1 = (num1 * 100) / sumaTotal;
        double porcentaje2 = (num2 * 100) / sumaTotal;
        double porcentaje3 = (num3 * 100) / sumaTotal;
        var retorno= new double[3];
        retorno[0]= porcentaje1;
        retorno[1]=porcentaje2 ;
        retorno[2]=porcentaje3 ;
        return retorno;
        
    }
     public int[] Ejercicio10(int A,int B){
//Declaración de variables


//Lectura de variables


//Intercambio de valores
A = A + B;
B = A - B;
A = A - B;

//Mostrar resultado
var retorno=new int[2];
retorno[0]=A;
retorno[1]=B;
return retorno;
     }
//Fin
}
