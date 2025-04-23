package Ex2Lv1;

public class Car {
    // Atributs
    public static final String brand = "Lamborghini"; // no es pot canviar, ni per objecte ni al constructor
    public static String model;                // és compartit per tots els cotxes
    public final int power;                 // es fixa al constructor

    // Constructor
    public Car(String modelInput, int powerInput) {
        model = modelInput;        // com que és estàtic, afectarà tots els objectes
        this.power = powerInput; // final → només es pot assignar un cop
    }

    // Mètode estàtic
    public static void breaking() {
        System.out.println("This vehicle is breaking");
    }

    // Mètode no estàtic
    public void accelerate() {
        System.out.println("This vehicle is accelerating");
    }
}