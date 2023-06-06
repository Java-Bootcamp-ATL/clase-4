public class QuestionFour {
    public float calculateDiscountRestaurant(float totalToPay, float tips){
        float finalPriceToPay = totalToPay - (totalToPay * tips / 100);

        return finalPriceToPay;
    }
}
