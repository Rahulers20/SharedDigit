public class SharedDigit {


    public static boolean hasSharedDigit(int digitOne, int digitTwo) {

        if((digitOne >= 10 && digitOne <= 99) && (digitTwo >= 10 && digitTwo <= 99)) {

            int valueOne = 0;
            int valueTwo = 0;
            int valueThree = 0;
            int valueFour = 0;
            

            valueOne = digitOne % 10;
            valueTwo = digitOne / 10;


            valueThree = digitTwo % 10;
            valueFour = digitTwo / 10;


            if((valueOne == valueThree) || (valueOne == valueFour) || (valueTwo == valueThree) || (valueTwo == valueFour)) {
                return true;
            } else return false;
        } else  return false;
    }
}
