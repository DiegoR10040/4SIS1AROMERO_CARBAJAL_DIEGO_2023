package Herencia;

public class perro extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String tamaño;

 

    //se aplica la sobrecarga
    public perro(String nombre,String raza,String tipoalimento,int edad, String tamaño){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.tamaño = tamaño;
    }


    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getTamaño(){
        return tamaño;
    }

    public void mostrarperro(){
        System.out.println("El nombre del perro es: "+ getnombre() + "\n"
        +"La raza del perro es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El perro tiene la edad de : "+ getedad() + "\n"
        +"El tamaño del perro es: "+ tamaño+ "\n");
    }
}