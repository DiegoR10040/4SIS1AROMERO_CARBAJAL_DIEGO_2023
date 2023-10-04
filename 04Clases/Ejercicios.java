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

        double num1 = 0.00, suma = 0.00, multi = 1.00, div = 0.00;
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
                System.out.println("Para detener la division, ingrese 0");
        do{
          System.out.println("Ingrese el numero que desee dividir: ");
          num1 = entrada.nextDouble();
          if(num1 !=0){
            div = num1/2;
          }
          System.out.println(div);
          
        }while(num1 !=0);
        System.out.println("El resultado de la operacion es: "+ div);
                break;
            default:
                System.out.println("opcion no valida, bye");
                break;


        }
        





    }

     public void Ejercicio2(){
        double metros=0.00, kg=0.00, velocidad=0.00, cm=100.00, pulgadas=0.0254, gramos=1000, libra=0.453592, ms=0.00;
      double yardas=1.094, millas=0.000621;
      double conversion1, conversion2;
      System.out.println("Selecciona la cantidad que deseas convertir acorde a las siguientes unidades");
      System.out.println("a.- Metros a cm y pulgadas");
      System.out.println("b.- Kilogramos a libras y gramos");
      System.out.println("c.- M/S a Km/h ");
      System.out.println("d.- Metros a yardas y millas");

      op =entrada.next().charAt(0);

      switch(op){

        case 'a':
           System.out.println("Ingrese los metros que desea transformar:");
           metros = entrada.nextDouble();
           conversion1= metros * cm;
           conversion2= metros * pulgadas;
           System.out.println("La cantidad en metros es: " +metros+ "de m a cm son" 
           +conversion1+ " de m a pulgadas son:" +conversion2);
          break;
          case 'b':
          System.out.println("Ingrese los Kilogramos que desea transformar:");
          kg = entrada.nextDouble();
          conversion1= kg * gramos;
          conversion2= kg * libra;
          System.out.println("La cantidad en kilogramos : " +kg+ "de kg a gramos son" 
          +conversion1+ " de kg a libras son:" +conversion2);
         break;
       case 'c':
          System.out.println("Ingrese los metros que desea transformar:");
          metros = entrada.nextDouble();
          conversion1= metros * cm;
          conversion2= metros * pulgadas;
          System.out.println("La cantidad en metros es: " +metros+ "de m a cm son" 
          +conversion1+ " de m a pulgadas son:" +conversion2);
         break;
       case 'd':
         System.out.println("Ingrese los metros que desea transformar: ");
         metros = entrada.nextDouble();
         conversion1= metros * yardas;
         conversion2= metros * millas;
          System.out.println("La cantidad en metros es: " +metros+ "de m a yardas son..." 
          +conversion1+ " de m a millas son:..." +conversion2);
         break;    
       default:
         System.out.println("Opcion no valida");
         break;          
     }
   }

    

     public void Ejercicio3(){
        
    }

     public void Ejercicio4(){
        
    }




}