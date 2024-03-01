import java.util.Arrays;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao do dai mang");
        int input = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("so nguyen to trong mang la: " );
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr.length-1; j++) {
                boolean check = true;
                if (arr[i] < 2) {
//                    System.out.println(arr[i] + " khong phai so nguyen to");
                    check = false;
                }

                 if (arr[i] % j == 0 && arr[i] >= 2) {
//                    System.out.println(arr[i] + " khong phai so nguyen to");
                    check = false;
                }
                if (check){
                    System.out.print(arr[i] + "\t");
                }
            }

        }

    }
}
