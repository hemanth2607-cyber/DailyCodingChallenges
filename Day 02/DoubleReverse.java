import java.util.*;
public class DoubleReverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num%10==0 && num>0){
            System.out.print(false);}
        else{System.out.print(true);}

    }
    
}