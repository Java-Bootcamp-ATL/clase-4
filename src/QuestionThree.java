public class QuestionThree {
    public float calculateDiscount(float originalPrice, float discount){
        float finalPrice = originalPrice - (originalPrice * discount / 100);

        return finalPrice;
    }
}
