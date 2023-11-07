package Herencia;

public class hamster extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String complexion;

 

    //se aplica la sobrecarga
    public hamster(String nombre,String raza,String tipoalimento,int edad, String complexion){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.complexion = complexion;
    }


    public void setComplexion(String complexion){
        this.complexion = complexion;
    }
    public String getComplexion(){
        return complexion;
    }

    public void mostrarhamster(){
        System.out.println("El nombre del hamster es: "+ getnombre() + "\n"
        +"La raza del hamster es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El hamster tiene la edad de : "+ getedad() + "\n"
        +"La complexion del hamster es: "+ complexion+"\n");
    }
}