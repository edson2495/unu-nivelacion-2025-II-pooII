package pe.edu.unu.demopoo.AbstractClasses;

public class PezAbs extends AnimalAbstract{

    public PezAbs() {
    }

    public PezAbs(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se mueve batiendo sus aletas.");
    }

}
