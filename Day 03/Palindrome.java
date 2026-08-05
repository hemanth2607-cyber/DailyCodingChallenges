import java.util.*;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.print(false);
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        System.out.print(reverse == xcopy);
        sc.close();
    } 
}
