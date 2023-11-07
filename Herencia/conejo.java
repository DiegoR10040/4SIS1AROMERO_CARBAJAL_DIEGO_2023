package Herencia;

public class conejo extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String color;

 

    //se aplica la sobrecarga
    public conejo(String nombre,String raza,String tipoalimento,int edad, String color){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.color = color;
    }


    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void mostrarconejo(){
        System.out.println("El nombre del conejo es: "+ getnombre() + "\n"
        +"La raza del conejo es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El conejo tiene la edad de : "+ getedad() + "\n"
        +"El color del conejo es: "+ color +"\n");
    }
}