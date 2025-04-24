package Ex1Lv1;

public class Main {
    public static void main(String[] args) {

        Instrument instrument1 = new Wind("Flute",150);
        Instrument instrument2 = new Percussion("Drums", 220);
        Instrument instrument3 = new StringInstrument("Guitar", 300);

        instrument1.play();
        instrument2.play();
        instrument3.play();
        }
    }
