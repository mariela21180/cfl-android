public class FinalTeoria {
    
    // // Ejemplo Constantes
    static final int VALOR_INICIAL = 0;
    static final int VALOR_FINAL = 6;

    public static void main(String[] args) {

        // Ejemplo Constantes
        for (int j = VALOR_INICIAL; j < VALOR_FINAL; j++) {
            System.out.println("For Ciclo j: " + j);
        }
        for (int t = VALOR_INICIAL; t < VALOR_FINAL; t++) {
            System.out.println("For Ciclo t: " + t);
        }
        for (int i = VALOR_INICIAL; i < VALOR_FINAL; i++) {
            System.out.println("For Ciclo i: " + i);
        }

        // Implementación clase Abstracta e interfaces
        Circulo cir = new Circulo(10, 10, 100);
        Cuadrado cuad = new Cuadrado(10, 10, 20);
        
        System.out.println(cir.area());
        System.out.println(cuad.area());
        cir.dibujar();
        cuad.dibujar();

    }   

    /**
     * Clase Abstracta
     */
    public static abstract class Figura {
        protected double x;        
        protected double y;
        public Figura(double xIn, double yIn) {
            this.x = xIn;
            this.y = yIn;
        }        
        public abstract double area();
    }
    public static class Circulo extends Figura implements Dibujable {
        protected double radio;        
        public Circulo(double xIn, double yIn, double radioIn) {
            super(xIn, yIn);
            this.radio = radioIn;
        }        
        public double area(){
            return Math.PI*radio*radio;
        }
        public void dibujar() {
            System.out.println("Dibujando Círculo");
        }
    }
    public static class Cuadrado extends Figura implements Dibujable, Rotable {
        protected double lado;        
        public Cuadrado(double xIn, double yIn, double ladoIn) {
            super(xIn, yIn);
            this.lado = ladoIn;
        }        
        public double area(){
            return lado*lado;
        }
        public void dibujar() {
            System.out.println("Dibujando Cuadrado");
        }
        public void rotar(double grados){
            System.out.println("Rotando Cuadrado " + grados + " grados");
        };
    }

    /**
     * Interfaz
     */
    public interface Dibujable {
        public void dibujar();        
    }
    public interface Rotable {
        public void rotar(double grados);        
    }


}
