import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao do dai mang");
        int input = sc.nextInt();sc.nextLine();
        int [] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] ", i);
            String input2 = sc.nextLine();
            Pattern pattern = Pattern.compile("[0-9]{1,}");
            Matcher matcher = pattern.matcher(input2);
            if (matcher.matches()) {
                arr[i] = Integer.parseInt(input2);
            }
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("tong cac gia tri tron mang la :" + sum);
    }
}
