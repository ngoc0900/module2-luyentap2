import java.util.Arrays;
import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc mang");
        int input = sc.nextInt();
        int[] arr = new int[input];
        System.out.println("nhap vao cac phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr%d",i);
            arr[i] = sc.nextInt();
        }
        System.out.println( Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.printf("phan tu lon nhat cua mang la %d ",max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.printf("phan tu nho nhat cua mang la %d",min);


    }
}
