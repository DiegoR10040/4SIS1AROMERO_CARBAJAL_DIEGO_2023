package Herencia;

public class huron extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String cantidadcomida;

 

    //se aplica la sobrecarga
    public huron(String nombre,String raza,String tipoalimento,int edad, String cantidadcomida){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.cantidadcomida = cantidadcomida;
    }


    public void setCantidadcomida(String cantidadcomida){
        this.cantidadcomida = cantidadcomida;
    }
    public String getCantidadcomida(){
        return cantidadcomida;
    }

    public void mostrarhuron(){
        System.out.println("El nombre del huron es: "+ getnombre() + "\n"
        +"La raza del huron es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El huron tiene la edad de : "+ getedad() + "\n"
        +"la cantidad de la comida del hueron es: "+ cantidadcomida+"\n");
    }
}
