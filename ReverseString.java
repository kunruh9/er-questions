/**
 * Created by kyle on 8/7/17.
 */
public class ReverseString {

    public static void main(String args[]) {
        System.out.println(reverse(args[0]));
    }

    public static String reverse(String str) {

        int strlen = str.length();

        char[] reversed = new char[strlen];

        for (int i = 0; i < strlen; i++) {
            reversed[i] = str.charAt(strlen-(i+1));
        }

        return String.copyValueOf(reversed);
    }
}
