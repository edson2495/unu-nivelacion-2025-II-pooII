package pe.edu.unu.demopoo.classes;

public class Animal {

    protected String tipo;

    public Animal() {
    }

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public void comer(){
        System.out.println("El animal esta comiendo");
    }

    public void moverse(){
        System.out.println("El animal se esta moviendo!!!");
    }

}
