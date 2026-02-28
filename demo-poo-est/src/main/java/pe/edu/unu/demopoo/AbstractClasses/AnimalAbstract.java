package pe.edu.unu.demopoo.AbstractClasses;

public abstract class AnimalAbstract {

    //no podemos generar una instancia de esta clase

    //protected nos dice que el atributo va a ser accedido en la clase, y en las clases que hereda
    protected String nombre;

    //metodo abstracto
    public abstract void moverse();

    //metodo concreto
    public void dormir(){
        System.out.println("El esta durmiendo zzz.");
    }

}
