import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhap = sc.nextLine();
        String ra = "";
        for (int i = nhap.length()-1; i >= 0; i--) {
                ra = ra + nhap.charAt(i);
        }
        System.out.println(ra);

    }
}
