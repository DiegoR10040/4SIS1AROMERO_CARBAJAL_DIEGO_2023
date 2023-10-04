import java.util.Scanner;
import java.lang.Math;

public class Figura{

    //variables
    double lado, altura, base, area, perimetro;
    int opcion;
    char letra;

    //Entrada de datos
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
      //vamos a haccer un programa para calcular el area y perimetro de las figuras
       do{
            System.out.println("Bienvenido al programa de calculos de areas y perimetros");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.Cuadrado");
            System.out.println("2.Rectangulo");
            System.out.println("3.Triangulo");
            System.out.println("Salir");

            //obtener la lectura de la opcion 
            opcion = entrada.nextInt();

            switch(opcion){
                case 1 :
                    Calcularcuadrado();
                    break;
                case 2 :
                    CalcularRectangulo();
                    break;
                case 3 :
                    CalcularTriangulo();
                    break;
                default: 
                    System.out.println("Gracias por elegir este programa");
                    break;
            }
            System.out.println("Deseas repetir el programa digital S");
            letra = entrada.next().charAt(0);

        }while(letra == 'S' || letra == 's');

    }
       
    public void Calcularcuadrado(){
       System.out.println("Ingresa el valor del lado del cuadrado");
        try{
        lado = entrada.nextDouble();
        }catch(Exception e){
            System.out.println(" Ingresa solo numeros ");
            System.out.println(" Error " + e.getMessage());
        } 
             perimetro = lado*4;
             area = lado*lado;
             System.out.println(" El perimetro es de: " + perimetro + " El area es de: " + area);
    }
    
    public void CalcularRectangulo(){
        System.out.println("Ingresa la base del rectangulo");
        try{
        base = entrada.nextDouble();
        }catch(Exception e){
            System.out.println(" Ingresa solo numeros ");
            System.out.println(" Error " + e.getMessage());
        }
         System.out.println("Ingresa la altura del rectangulo");
         try{
        altura = entrada.nextDouble();
        }catch(Exception e){
            System.out.println(" Ingresa solo numeros ");
            System.out.println(" Error " + e.getMessage());
        }
             perimetro = (base*2)+(altura*2);
             area = base*altura;
             System.out.println(" El perimetro es de: " + perimetro + " El area es de: " + area);
    }
    
    public void CalcularTriangulo(){
        System.out.println("Ingresa el lado del triangulo equilatero");
        try{
        lado = entrada.nextDouble();
        }catch(Exception e){
            System.out.println(" Ingresa solo numeros ");
            System.out.println(" Error " + e.getMessage());
        } 
        System.out.println("Ingresa la altura del triangulo equilatero");
        try{
        altura = entrada.nextDouble();
        }catch(Exception e){
            System.out.println(" Ingresa solo numeros ");
            System.out.println(" Error " + e.getMessage());
        } 
             perimetro = lado*3;
             area = (lado * altura) /2;
             System.out.println(" El perimetro es de: " + perimetro + " El area es de: " + area);
    }

       
}