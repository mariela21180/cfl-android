public class ClasesMetodos {
    public static void main(String[] args) {
        // MiClase clase1 = new MiClase();
        // MiClase clase2 = new MiClase();
        // clase1.metodo1();
        // System.out.println(clase2.metodo2());

        // Animal animal1 = new Animal("Perro", 7);
        // Animal animal2 = new Animal("Gato", 10);
        // animal1.mostrarDatos();
        // animal2.mostrarDatos();
        // if (animal1.getEdad() > 3) {
        //     System.out.println("Es mayor de 3 años");            
        // }

        Aereo aereo1 = new Aereo("Canario", 3);
        aereo1.mostrarDatos();
        if (aereo1.getEdad() > 3) {
            System.out.println("Es mayor de 3 años");            
        }
        aereo1.setAltura(75);
        aereo1.mostrarDatos();
    }
}

// clase Animal
/**
 * Animal
 */
class Animal {
    private String especie;
    private int edad;

    Animal(String especieIn, int edadIn) {
        especie = especieIn;
        edad = edadIn;
    }

    public void mostrarDatos() {
        System.out.println(especie);
        System.out.println(edad);        
    }

    public int getEdad() {
        return edad;        
    }    
}

/**
 * Aereo
 */
class Aereo extends Animal {
    private int altura;

    Aereo(String especieIn, int edadIn) {
        super(especieIn, edadIn);
    }

    public void setAltura(int alturaIn) {
        altura = alturaIn;
    }      
}
// clase MiClase
/**
 * MiClase
 */
class MiClase {
    // Atributos
    private String atr1;
    private int atr2;
    private float atr3;

    MiClase() {
        atr1 = "";
        atr2 = 0;
        atr3 = 0;
    }

    // Métodos
    public void metodo1() {
        System.out.println("metodo1");
    }
    public String metodo2() {
        return "metodo2";
    }
    
}
