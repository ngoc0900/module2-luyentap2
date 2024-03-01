import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);

            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" +arr_new);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao 1 chuoi");
//        String input = sc.nextLine();
//        for (int i = 0; i < input.length()-1; i++) {
//            for (int j = i+1; j < input.length(); j++) {
//                if (input[i]==input[j]) {
//
//                }
//            }
//        }
    }
}
