
//import java.lang.reflect.Array;
import java.util.Arrays;

//import java.util.Scanner;

public class twod_sort {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[][] = { { 7, 4, 2, 8 }, { 3, 4, 8, 2 }, { 4, 9, 2, 7 }, { 2, 1, 7, 4 } };
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
