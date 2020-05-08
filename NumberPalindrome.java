public class NumberPalindrome {
    public static void main(String[] args){
        isPalindrome ( 707 );
    }

    public static boolean isPalindrome (int number){
        int lastDigit = 0;
        do {
            lastDigit = number % 10;
            int reverse = 0;
            reverse = reverse + lastDigit;
            System.out.println ( "last digit = " + lastDigit );

        } while (lastDigit < 0);
        return true;
    }
}
