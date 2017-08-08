/**
 * Created by kyle on 8/7/17.
 */
public class SumDigits {

    public static void main(String args[]) {
        int arg = Integer.parseInt(args[0]);

        System.out.println(sumDigits(arg));
    }

    public static int sumDigits(int num) {
        int sum = 0;

        if (num < 0)
            num *= -1; // flip sign

        while (num != 0) {
            sum += num % 10; // determines least significant digit and adds it to the sum
            num /= 10; // integer division drops the remainder
        }

        return sum;
    }

}
