package pe.edu.unu.demopoo.AbstractClasses;

public class PerroAbs extends AnimalAbstract{

    public PerroAbs() {
    }

    public PerroAbs(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" corre usando 4 patas.");
    }

}
