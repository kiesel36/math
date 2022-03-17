import java.util.Scanner;

public class TestDevisor {
    private static Scanner input = new Scanner(System.in);
    private static int number1;
    private static int number2;

    public static void main(String[] args) {
        System.out.println("Wie soll die erste Zahl lauten?");
        System.out.println("Es sind nur ganze Zahlen im Integer Zahlenbereich erlaubt!");
        System.out.print("Wert: ");
        number1=input.nextInt();
        System.out.println("Wie soll die zweite Zahl lauten?");
        System.out.println("Es sind wieder nur ganze Zahlen im Integer Zahlenbereich erlaubt!");
        System.out.print("Wert: ");
        number2=input.nextInt();
        System.out.println("Der größte gemeinsame Teiler von: "+Integer.toString(number1)+" und "+Integer.toString(number2)+" lautet: "+Integer.toString(Devisor.getGreatestCommundDeviderEuclid(number1, number2)));
    }
}
