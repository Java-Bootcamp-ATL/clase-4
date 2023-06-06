import java.util.Scanner;

public class QuestionFive {
    public void guestNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero random del 1 - 10 ");
        int guestNumberUser = scanner.nextInt();
        int randomNumber =  (int) (Math.random() * 10);

        if (guestNumberUser == randomNumber){
            System.out.println("Adivinaste el numero ganador");
        }else {
            System.out.println("Fallaste!!!! Sigue intentando en una nueva oportunidad.");
        }
    }
}
