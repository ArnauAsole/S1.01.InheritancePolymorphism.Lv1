package Ex2Lv1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car cotxe1 = new Car("Diablo", 740);

        cotxe1.accelerate();
        Car.breaking();

        // Mostrem valors dels atributs
        System.out.println("Brand: " + Car.brand);
        System.out.println("Model: " + Car.model);
        System.out.println("Power: " + cotxe1.power);
    }
}