

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de calificaciones: ");
            int n = scanner.nextInt();

            // Crea un arreglo para almacenar las calificaciones
            double[] calificaciones = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
                calificaciones[i] = scanner.nextDouble();
            }

            // Calcula el promedio
            double suma = 0;
            double calificacionMaxima = calificaciones[0];
            double calificacionMinima = calificaciones[0];

            for (double calificacion : calificaciones) {
                suma += calificacion;
                if (calificacion > calificacionMaxima) {
                    calificacionMaxima = calificacion;
                }
                if (calificacion < calificacionMinima) {
                    calificacionMinima = calificacion;
                }
            }

            double promedio = suma / n;

            int calificacionesSuperioresAlPromedio = 0;
            int alumnosAprobados = 0;
            int alumnosReprobados = 0;

            for (double calificacion : calificaciones) {
                if (calificacion > promedio) {
                    calificacionesSuperioresAlPromedio++;
                }

                if (calificacion >= 6.0) {
                    alumnosAprobados++;
                } else {
                    alumnosReprobados++;
                }
            }

      
            System.out.println("Calificaciones:");

            for (int i = 0; i < n; i++) {
                System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
            }

            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación más alta: " + calificacionMaxima);
            System.out.println("Calificación más baja: " + calificacionMinima);
            System.out.println("Número de calificaciones superiores al promedio: " + calificacionesSuperioresAlPromedio);
            System.out.println("Alumnos aprobados: " + alumnosAprobados);
            System.out.println("Alumnos reprobados: " + alumnosReprobados);
        }
    }

    

    public void menu() {
    }
}