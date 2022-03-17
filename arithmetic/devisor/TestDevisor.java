import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestDevisor {
    private static Scanner input = new Scanner(System.in);
    private static int number1;
    private static int number2;

    public static void main(String[] args) {
        System.out.println("Wie soll die erste Zahl lauten?");
        System.out.println("Es sind nur ganze Zahlen im Integer Zahlenbereich erlaubt!");
        System.out.print("Wert: ");
        while (true) {//TODO Infinty Loop with IMExc
            try {if(input.hasNextInt()){
                    number1 = input.nextInt();
                }
                break;
            } catch (InputMismatchException IMExc) {
                System.out.println("Die eingegebene Zahl ist kein Integer oder ist außerhalb des 32 Bit Bereichs.");
                System.out.println(
                        "Deine Zahl sollte eine ganze Zahl sein und zwischen " + Integer.toString(Integer.MIN_VALUE)
                                + " sowie " + Integer.toString(Integer.MAX_VALUE) + " liegen.");
                System.out.println("Versuche es noch einmal!");
            } catch (NoSuchElementException NSEExc) {
                System.out.println("Es fand keine Eingabe statt!");
            } catch (IllegalStateException ISExc) {
                input = new Scanner(System.in);
            }
        }
        System.out.println("Wie soll die zweite Zahl lauten?");
        System.out.println("Es sind wieder nur ganze Zahlen im Integer Zahlenbereich erlaubt!");
        System.out.print("Wert: ");
        while (true) {
            try {
                number2 = input.nextInt();
                break;
            } catch (InputMismatchException IMExc) {
                System.out.println("Die eingegebene Zahl ist kein Integer oder ist außerhalb des 32 Bit Bereichs.");
                System.out.println(
                        "Deine Zahl sollte eine ganze Zhal sein und zwischen " + Integer.toString(Integer.MIN_VALUE)
                                + " sowie " + Integer.toString(Integer.MAX_VALUE) + " liegen.");
                System.out.println("Versuche es noch einmal!");
            } catch (NoSuchElementException NSEExc) {
                System.out.println("Es fand keine Eingabe statt!");
            } catch (IllegalStateException ISExc) {
                input = new Scanner(System.in);
            }

        }
        System.out.println(
                "Der größte gemeinsame Teiler von: " + Integer.toString(number1) + " und " + Integer.toString(number2)
                        + " lautet: " + Integer.toString(Devisor.getGreatestCommundDeviderEuclid(number1, number2)));
        input.close();
    }
}
