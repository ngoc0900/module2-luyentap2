import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String input = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("la mot chuoi doi xung");
        } else {
            System.out.println("k la mot chuoi doi xung");
        }

    }
}
