import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = in.nextInt();

        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        System.out.print("Enter the number of left rotations: ");
        int k = in.nextInt();

        // Normalize rotations in case k > n
        k = k % n;
        in.close();

        System.out.println("Original List: " + list);

        // Perform left rotation
        List<Integer> rotatedList = new ArrayList<>();
        for (int i = k; i < n; i++) {
            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotatedList.add(list.get(i));
        }

        System.out.println("List after " + k + " left rotations: " + rotatedList);
    }
}
