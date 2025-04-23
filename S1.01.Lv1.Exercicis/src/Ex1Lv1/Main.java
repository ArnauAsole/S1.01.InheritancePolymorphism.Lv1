package Ex1Lv1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Instrument instrument1 = new Wind("Flute",150);
        Instrument instrument2 = new Percussion("Drums", 220);
        Instrument instrument3 = new StringInstrument("Guitar", 300);

        instrument1.play();
        instrument2.play();
        instrument3.play();
        }
    }
