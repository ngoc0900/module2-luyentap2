import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao do dai mang");
        int input = sc.nextInt();sc.nextLine();
        int [] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println( Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        System.out.println("mang so nguyen theo thu tu tang dan la: " + Arrays.toString(arr));
    }
}
