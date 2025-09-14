
public  class Main{
    public static void main(String[] args) {
        System.out.println("\n       EJEMPLO ENCAPSULAMIENTO \n");
        // nuevo objeto para la clase persona
        Persona persona = new Persona("Nestor", 17);

        // Acceder usando metodos publicos para el nombre y edad
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificar los datos usando los métodos públicos
        persona.setNombre("Ferney");
        persona.setEdad(18);

        // Mostrar nuevos datos
        System.out.println("Nombre actualizado: " + persona.getNombre());
        System.out.println("Edad actualizada: " + persona.getEdad());


        System.out.println("\n       EJEMPLO ABSTRACCION \n");
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();


        System.out.println("\n       EJEMPLO HERENCIA \n");
        Carro carro = new Carro();
        Moto moto = new Moto();
        carro.moviendose(); //metodo que hereda la clase carro de la clase vehiculo
        carro.velocidad(); //metodo propio de la clase carro
        moto.moviendose();
        moto.velocidad();


        System.out.println("\n       EJEMPLO POLIMORFISMO\n");
        Movimiento v1 = new Humano();
        Movimiento v2 = new Ave();

        v1.mover();
        v2.mover();

        // Crear un objeto Estudiante usando record
        Estudiante e1 = new Estudiante("Néstor", 18, 4.5);

        System.out.println("\n       EJEMPLO DE RECORD\n");
        // Acceder a los valores
        System.out.println("Nombre: " + e1.nombre());
        System.out.println("Edad: " + e1.edad());
        System.out.println("Promedio: " + e1.promedio());

        }
    }

    //EJEMMPLO ENCAPSULAMIENTO
 class Persona {

    //Se declaran variables en privadas para que sean ocultas
    private String nombre;
    private int edad;

    // Constructor para crear los datos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // con getter se accede al atributo nombre de manera controlada
    public String getNombre() {
        return nombre;
    }

    //con setter se puede modifidar el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //get para acceder a la edad
    public int getEdad() {
        return edad;
    }

    //set para modificar edad y validacion para que la edad sea correcta
    public void setEdad(int edad) {
        if (edad > 0) { // Validación simple
            this.edad = edad;
        } else {
            System.out.println("La edad tiene que ser mayor a 0");
        }
    }
}

//EJEMPLO ABSTRACCION

abstract class Animal { // Clase abstracta

    //Metodo abstracto (sin implementacion, cualquier clase hija debe implementarlon a su manera)
    abstract void hacerSonido();

    //Metodo con implementacion
    void dormir() {
        System.out.println("El animal esta durmiendo");
    }
}


class Perro extends Animal { // Clase concreta que extiende de la clase abstracta
    //Implementacion del metsodo abstracto
    void hacerSonido() {
        System.out.println("Perro: ¡guau guau!");
    }
}
class Gato extends Animal {
    void hacerSonido() {
        System.out.println("Gato: ¡miau miau!");
    }
}

//EJEMPLO HERENCIA

class Vehiculo{ //Clase principal (padre)
    void moviendose(){  //metodo que heredan las clases carro y moto
        System.out.println("El vehiculo se esta moviendo");
    }
}
class Carro extends Vehiculo{ //clase (hija)
    void velocidad(){ //metodo que agrega la clase hija
        System.out.println("La velocidad del carro es 80 km/h");
    }
}
class Moto extends Vehiculo{ //clase hija
    void velocidad(){
        System.out.println("La velocidad de la moto es de 90 km/h");
    }
}

//EJEMPLO POLIMORFISMO

class Movimiento { //Clase principal
    void mover() { //Metodo principal
        System.out.println("El vehículo se mueve");
    }
}

class Humano extends Movimiento {
    void mover() { //Usa el mismo metodo de la clase principal pero se comporta diferente
        System.out.println("Un humano se mueve caminando");
    }
}

class Ave extends Movimiento {
    void mover() { //Usa el mismo metodo de la clase principal pero se comporta diferente a la clase humano
        System.out.println("Una ave se mueve volando");
    }
}

//EJEMPLO RECORD


 record Estudiante(String nombre, int edad, double promedio) { } //se usa record en vez de class y los campos se definen de una vez
//reduce el codigo repetitivo



