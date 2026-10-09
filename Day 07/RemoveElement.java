import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int val = scanner.nextInt();

        int k = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? " " : ""));
        }
        scanner.close();
    }
}
