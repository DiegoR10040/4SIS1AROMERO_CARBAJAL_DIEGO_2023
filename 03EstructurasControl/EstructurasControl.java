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

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    break;
                case 2:
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    if(numbinario > 0){
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0 ){
                        binario = "0" + binario;
                    }else{
                        binario = "No se puede convertir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            

            }
            




            System.out.println("Deseas repetir el programa?,escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S');
    }


}