import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    private static final String[] PALABRAS = {"ROBOT","CODIGOS","VARIABLES","PELICULAS","MOTOCICLETA","REGALOS"};
    private static final int PistasDisponibles = 3;
    private static final int PuntosPorLetra = 10;
    private static final int DescuentoPorPista = 5;
    private static final int DescuentoporError = 2;

    /**
     * @param args
     */
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            String palabra = PALABRAS[random.nextInt(PALABRAS.length)];
            char[] PalabraAdivinada = new char[palabra.length()];
            for (int i=0; i< PalabraAdivinada.length; i++){
                PalabraAdivinada[i] = '_';
            }

            int intentos = 0;
            int puntaje = 0;
            int PistasUsadas= 0;
            System.out.println("Bienvenido al Ahorcado de Diego Romero");
            System.out.println("La palabra tiene" + palabra.length() + "letras.");

            while(true){
                System.out.println("palabra: " + String.valueOf(PalabraAdivinada));
                System.out.println("Pistas usadas: " + PistasUsadas + "de" + PistasDisponibles);
                System.out.println("Ingresa una letra: ");
                
                char letra = scanner.next().charAt(0);
                boolean letraAdivinada = false;
                for (int i = 0; i< palabra.length(); i++){
                    if (palabra.charAt(i) == letra){
                        PalabraAdivinada[i] = letra;
                        puntaje += PuntosPorLetra;
                        letraAdivinada = true;
                    }
                }

                if(!letraAdivinada){
                    System.out.println("Letra incorrecta. Pierdes" + DescuentoporError + "puntos.");
                    puntaje -= DescuentoporError;

                }

                intentos ++;
                if (String.valueOf(PalabraAdivinada).equals(palabra)){
                    System.out.println("Felicidades, adivinaste la palabra :)");
                    System.out.println("Palabra: " + String.valueOf(PalabraAdivinada));
                    System.out.println("Puntaje Final: " + puntaje);
                    break; 
                }
                if (intentos % 3 == 0 && PistasUsadas < PistasDisponibles) {
                    mostrarPista(palabra,PalabraAdivinada);
                    PistasUsadas ++;
                    puntaje -= DescuentoPorPista;
                }

            }
        }

    }
    private static void mostrarPista(String palabra, char[] PalabraAdivinada){
        Random random = new Random();
        int opcion = random.nextInt(3);

        switch (opcion){
            case 0:
                System.out.println("Pista: La primera letra de la palabra es: '" + palabra.charAt(0) + "'.");
                break;
            case 1:
                System.out.println("Pista: La ultima letra de la palabra es: '" + palabra.charAt(palabra.length()-1) + "'.");
                break;
            case 2: 
                System.out.println("Pista: La palabra tiene " + palabra.length() + "letras.");
                break;
        }
    }
}
