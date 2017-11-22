import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int number = 600;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zgadnij jaką liczbę mam na myśli: ");
        int choice = scanner.nextInt();
            if(choice == number){
                System.out.println("zgadłeś!");
            } else {
                if(choice > number){
                    System.out.println("Twoja liczba jest za duża.");
                } else {
                    System.out.println("Twoja liczba jest za mała.");
                }
                System.out.println("Podaj liczbę: ");
                choice = scanner.nextInt();
            }
    }
}
