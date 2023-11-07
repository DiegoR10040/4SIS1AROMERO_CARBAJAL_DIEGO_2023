package Herencia;

public class cuyo extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String genero;

 

    //se aplica la sobrecarga
    public cuyo(String nombre,String raza,String tipoalimento,int edad, String genero){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.genero = genero;
    }


    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void mostrarcuyo(){
        System.out.println("El nombre del cuyo es: "+ getnombre() + "\n"
        +"La raza del cuyo es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El cuyo tiene la edad de : "+ getedad() + "\n"
    +"El genero del conejo es: "+ genero+"\n");
}
}
