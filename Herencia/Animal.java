package Herencia;

import java.util.Scanner;

public class Animal {

    //principio de encapsulamiento Es poder restrimgir el acceso a los datos, vamos a poder agrupar
    //en una clase el acceso a los diferentes atributos y metodos u objetos de la clase para que no puedan ser modificados 
    //desde otro lugar

    //definir las variables
    private String nombre, raza, tipoalimento;
    private int edad;

    //se debe de crear el constructor, el contructor sirve para poder declarar
    //la existencia de una clase, para poder inicializar las variables, 
    //para crear las instancias de una clase 

    public Animal(){
        //contructor por defecto
    }

    //cuando  existe una construccion del objeto, de acuerdo a las necesidades
    //por parte del usuario es necesario utilizar la sobrecarga de lso metodos
    //en este caso la sobre carga del contructor

    //parametros del registro
    public Animal (String nom,String raza,String tipoalimento,int edad){
        //pero como son privados los atributos, debemos tener una forma de  acceso
        //la palabra reservada this, nos sirve para poder acceder a los atributos privados

        this.nombre = nom;
        this.raza = raza;
        this.tipoalimento = tipoalimento;
        this.edad = edad;
    }

    //para poder modificar los valores  de la asignacion, es necesario poder utilizar los metodos:
    //getter and setter
    //get ----obtener ----recibir
    //set ----asignar ----enviar
    
    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nom){
        this.nombre = nom;
    }

    public String getraza(){
        return raza;
    }

    public void setraza(String raza){
        this.raza = raza;
    }

    public String gettipoalimento(){
        return tipoalimento;
    }

    public void settipoalimento(String tipoalimento){
        this.tipoalimento = tipoalimento;
    }

    public int getedad(){
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;
    }


     //variables
    int opcion;
    char letra;
   
    //Entrada de datos
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
      //vamos a haccer un programa para calcular el area y perimetro de las figuras
       do{
            System.out.println("Bienvenido al programa donde muestra informacion de una mascota");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.Perro");
            System.out.println("2.Hamster");
            System.out.println("3.conejo");
            System.out.println("4.cuyo");
            System.out.println("5.Huron");
            System.out.println("Salir");

            //obtener la lectura de la opcion 
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                perro Perro = new perro("Rocky", "Doberman","Purina Dog Chow",1,"Alto");
                Perro.mostrarperro();
                    break;
                case 2 :
                hamster Hamster = new hamster("Hamtaro", "Ni idea xD","Semillas de girasol",2,"Gordito");
                Hamster.mostrarhamster();
                    break;
                case 3 :
                conejo Conejo = new conejo("Bugs Bunny", "rara","Zanahorias",81,"Gris");
                Conejo.mostrarconejo();
                    break;
                case 4 :
                    cuyo Cuyo = new cuyo("bibito", "Cavia intermedia","cunipic",1,"macho");
                Cuyo.mostrarcuyo();
                    break;
                case 5 :
                    huron Huron = new huron("uranio", "Hurón Whippet","carne",5,"mucha");
                Huron.mostrarhuron();
                    break;
                default: 
                    System.out.println("Gracias por elegir este programa");
                    break;
            }
            System.out.println("Deseas repetir el programa digital S");
            letra = entrada.next().charAt(0);

        }while (letra == 's' || letra == 'S');
    }
}