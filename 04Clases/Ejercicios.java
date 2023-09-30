import java.util.Scanner;

class Ejercicios{
    Scanner entrada = new Scanner(System.in);

    char op;

    public void menu(){
        System.out.println("Ejercicios que ahi les quedan de tarea");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear Cuadro Magico");
        System.out.println("d.- Desplazamiento de un cuadrito");
        System.out.println("Elija una opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
                Ejercicio1();
                break;
            case 'b' :
                Ejercicio2();
                break;
            case 'c' :
                Ejercicio3();
                break;
            case 'd' :
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por Jugar :)");
        }
    }
 
    public void Ejercicio1(){

        double num1 = 0.00, suma = 0.00, multi = 1.00;
        char operacion;
        System.out.println("selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");
        
        operacion = entrada.next().charAt(0);
        switch(operacion){
            case 'a':
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
        
                    System.out.println("Escriba el numero que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;

                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: "+ suma);
                break;
            case 'b':
            System.out.println("Para detener la multiplicacion, ingrese el 0");
                do{
        
                    System.out.println("Escriba el numero que desee multiplicar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        multi *= num1;

                    }
                    

                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: "+ multi);
                break;
            case 'c':
                break;
            default:
                System.out.println("opcion no valida, bye");
                break;


        }
        





    }

     public void Ejercicio2(){
        
    }

     public void Ejercicio3(){
        
    }

     public void Ejercicio4(){
        
    }




}