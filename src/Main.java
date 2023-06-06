import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pregunta uno de edad de perros");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese los años del perro: ");
        int dogAge = scanner.nextInt();
        QuestionOne ageDog = new QuestionOne();

        System.out.println("Los años del perro son: " + ageDog.CalculateAgeDOg(dogAge));
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Pregunta convertir a kilometros de millas");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese las millas: ");
        double toKilometers = scanner.nextDouble();
        QuestionTwo milla = new QuestionTwo();

        System.out.println("Millas a Kilometros son: " + milla.calculateKilometers(toKilometers));
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Pregunta tres de calcular el precio final de una venta");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese el precio original: ");
        float originalPrice = scanner.nextFloat();
        System.out.print("Ingrese el el descuento (es porcentaje): ");
        float discount = scanner.nextFloat();
        QuestionThree finalPrice = new QuestionThree();

        System.out.println("El precio final es: " + finalPrice.calculateDiscount(originalPrice, discount));
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Pregunta cuatro de pagar el precio final en un restaurante");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese el el total a pagar: ");
        float totalToPay = scanner.nextFloat();
        System.out.print("Ingrese el  descuento (es porcentaje): ");
        float discountRestaurant = scanner.nextFloat();
        QuestionFour finalPriceToPay = new QuestionFour();

        System.out.println("El precio final a pagar es: " + finalPriceToPay.calculateDiscountRestaurant(totalToPay, discountRestaurant));
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Pregunta cinco de adivinar un numero aleatorio del 1 - 10");
        System.out.println("----------------------------------------------------------------------------");
        QuestionFive finalResult = new QuestionFive();

        finalResult.guestNumber();

    }
}