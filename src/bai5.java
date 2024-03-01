import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
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
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max){
                max2 = max;
                max = arr[i];
            }
            if (arr[i]<max && arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.println("phan tu lon thu 2 la: "+ max2);
    }
}
