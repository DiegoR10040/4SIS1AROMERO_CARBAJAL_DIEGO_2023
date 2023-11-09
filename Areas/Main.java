package Areas;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            try {
                System.out.println("Seleccione una figura geométrica:");
                System.out.println("1. Rectángulo");
                System.out.println("2. Círculo");
                System.out.println("3. Triángulo");
                int opcion = entrada.nextInt();

                if (opcion == 1) {
                    System.out.print("Ingrese la longitud del rectángulo: ");
                    double longitud = entrada.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = entrada.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(longitud, ancho);
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                } else if (opcion == 2) {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = entrada.nextDouble();

                    Circulo circulo = new Circulo(radio);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
                } else if (opcion == 3) {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = entrada.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = entrada.nextDouble();

                    Triangulo triangulo = new Triangulo(base, altura);
                    System.out.println("Área: " + triangulo.calcularArea());
                    System.out.println("Perímetro: " + triangulo.calcularPerimetro());
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduzca un número válido.");
            }
        }
    }
}