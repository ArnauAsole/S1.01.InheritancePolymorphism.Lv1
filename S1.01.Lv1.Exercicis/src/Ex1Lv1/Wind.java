package Ex1Lv1;

public class Wind extends Instrument {

    static {
        System.out.println("This is an Ex1Lv1.Instrument (static function test)");
    }
    public Wind(String name, double price) {
        super(name,price);
    }

    public void play() {
        System.out.println("A wind instrument is playing. ");
    }

}