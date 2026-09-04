# PARTE PRACTICA

## 1 Calculadora básica

### Descripción

Programa que permite realizar operaciones de suma, resta, multiplicación y división.

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Basica");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opcion;
        
        while (true) {
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                break;
            }

            System.out.println("Opción no válida." );
        }

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        if (opcion == 1) {
            resultado = num1 + num2;
        } else if (opcion == 2) {
            resultado = num1 - num2;
        } else if (opcion == 3) {
            resultado = num1 * num2;
        } else if (opcion == 4) {
            if (num2 == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
                sc.close();
                return;
            }
            resultado = num1 / num2;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}

## 2. Contar vocales y consonantes

Este programa recibe una palabra y cuenta cuántas vocales y consonantes tiene.

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}

## 3. Invertir una cadena de texto

Este programa recibe un texto y muestra la cadena escrita al revés.

import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);
    }
}
