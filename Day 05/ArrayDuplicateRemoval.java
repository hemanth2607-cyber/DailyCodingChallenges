import java.util.Scanner;
public class ArrayDuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }
        if (nums.length == 0) {
            System.out.println("0");
        } else {
            int uniqueCount = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[uniqueCount - 1]) {
                    nums[uniqueCount] = nums[i];
                    uniqueCount++;
                }
            }
            System.out.println(uniqueCount);
        }
        sc.close();
    }
}