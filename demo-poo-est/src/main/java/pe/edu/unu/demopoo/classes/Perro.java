package pe.edu.unu.demopoo.classes;

public class Perro extends Animal{

    private String nombre;

    public Perro(){
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" esta corriendo con sus patas.");
    }

}
