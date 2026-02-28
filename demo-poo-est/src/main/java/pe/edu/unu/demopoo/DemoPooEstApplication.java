package pe.edu.unu.demopoo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.unu.demopoo.AbstractClasses.AnimalAbstract;
import pe.edu.unu.demopoo.AbstractClasses.PerroAbs;
import pe.edu.unu.demopoo.AbstractClasses.PezAbs;
import pe.edu.unu.demopoo.classes.Animal;
import pe.edu.unu.demopoo.classes.Perro;
import pe.edu.unu.demopoo.classes.Pez;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoPooEstApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoPooEstApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------------------");
        function4();
        //function3();
        //function2();
        //function1();
        //holaMundo();
        System.out.println("---------------------------------");
    }

    public void function4(){ // uso de clases abstractas
        List<AnimalAbstract> mascotas = new ArrayList<>();
        mascotas.add(new PerroAbs("Firulais"));
        mascotas.add(new PezAbs("David"));
        mascotas.forEach(mascota ->{
            mascota.moverse();
            mascota.dormir();
        });
    }

    public void function3(){ //polimorfismo
        List<Animal> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Firulais"));
        mascotas.add(new Pez());
        /*for(Animal animal : mascotas){
            animal.moverse();
        }*/
        mascotas.forEach(animal -> animal.moverse());
    }

    public void function2(){// ejemplo de herencia
        Perro perro = new Perro();
        perro.setNombre("Firalais");
        perro.comer();
        perro.ladrar();
    }

    public void function1(){// instanciacion y encapsulamiento
        Perro perro = new Perro("Firulais");
        System.out.println(perro.getNombre());
        perro.ladrar();
    }

    public void holaMundo(){// simple hola mundo
        System.out.println("Hola mundo!");
    }

}
