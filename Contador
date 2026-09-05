## 2. Contar vocales y consonantes

Este programa recibe una palabra y cuenta cuántas vocales y consonantes tiene.

import java.util.Scanner;

public class Contador { public static void main(String[] args) { Scanner sc = new Scanner(System.in);

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
