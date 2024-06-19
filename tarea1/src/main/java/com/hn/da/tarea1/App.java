package com.hn.da.tarea1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo");
        }
        return lado * lado;
    }

    public static double calcularAreaRectangulo(double largo, double ancho) {
        if (largo < 0 || ancho < 0) {
            throw new IllegalArgumentException("El largo y el ancho no pueden ser negativos");
        }
        return largo * ancho;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser negativas");
        }
        return (base * altura) / 2.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            
            try {
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(largo, ancho));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 5);
        scanner.close();
    }
}