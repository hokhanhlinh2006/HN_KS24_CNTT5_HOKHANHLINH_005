import java.util.Scanner;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Muc van chuyen");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("khong hop le");
            return;
        }
        List<Double> mucvanchuyen = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print(" " + (i + 1) + ": ");
            double phi = sc.nextDouble();
            mucvanchuyen.add(phi);
        }
    }
}