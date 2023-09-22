import java.util.Scanner;

class EstructurasControl{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, numbinario, total, cantidadproducto, num1;
        float precio, resultado, compra;
        String nombreproducto;
        String binario = "";
        char letra;

        do{

            System.out. println("Bienvenido al programa :) ");
            System.out. println("Elige alguna opcion deseada: ");
            System.out. println("1.- Descuento por edad ");
            System.out. println("2.- Convertir numero decimal a binario ");
            System.out. println("3.- Convertir temperaturas ");
            System.out. println("4.- Numeros Positivos y Negativos ");
            System.out. println("5.- Tiendita ");
            System.out. println("6.- Area y Perimetro ");
            System.out. println("7.- Tabla ");
            System.out. println("8.- Factorial ");
            System.out. println("9.- Dibujito ");
            System.out. println("10.- Figura Hueca ");
            System.out. println("11.- Patrones de codigo ");
            System.out. println("12.- Diamante ");
            System.out. println("13.- Calculadora ");
            System.out. println("14.- Salir ");
            










            System.out.println("Deseas repetir el programa?,escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S');
    }


}