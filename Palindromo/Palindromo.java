package Palindromo;

import java.util.*; 

public class Palindromo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String cadena  = "";

                System.out.println("Ingresa la palabra u oracion para ver si es palindromo");
            
                cadena = entrada.nextLine();
                String noSpace = cadena.replaceAll(" ", "");
                String invertida = "";

                for(int i = noSpace.length()-1; i>= 0; i--){
                //obtener los caracteres de la cadena
                char car  = noSpace.charAt(i);
                //concatenar 
                invertida += car;
                }

                String salida  = "Cadenas a concatenar:"+ cadena + "\n"+ invertida + "\n";
                 if(noSpace.equalsIgnoreCase(invertida)){
                    //si es verdad 
                    salida += "es palindromo la palabra u oracion \n";
                    System.out.println(salida);

                 }else{
                    salida += "no es palindromo la palabra u oracion \n";
                    System.out.println(salida);
                }
        }
        }
}
