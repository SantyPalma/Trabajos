import java.util.Scanner;

public class Calculadora { public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.println("Calculadora Basica");

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
}
}
