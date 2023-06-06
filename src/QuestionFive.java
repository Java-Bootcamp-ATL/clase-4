import java.util.Scanner;

public class QuestionFive {
    public void guestNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero random del 1 - 100: ");

        int randomNumber =  (int) (Math.random() * 100);
        int count = 0;
        while (count < 3 ){
            int guestNumberUser = scanner.nextInt();
            if (guestNumberUser == randomNumber){
                System.out.println("Adivinaste el numero ganador");
            }else {
                System.out.println("Fallaste!!!! Sigue intentando en una nueva oportunidad.");
                count++;
            }
        }
        if (count == 3){
            System.out.println("Se termino todo los intentos... Perdiste!!!!");
        }
    }
}
