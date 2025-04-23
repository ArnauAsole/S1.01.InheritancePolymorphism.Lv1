package Ex1Lv1;

class Percussion extends Instrument{

    public Percussion(String name, double price) {
        super(name,price);
    }

    public void play() {
        System.out.println("A percussion instrument is playing. ");
    }
}