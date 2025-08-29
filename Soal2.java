

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan bilangan 4: ");
        int d = scanner.nextInt();

        int min = a;
        int max = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Bilangan terkecil: " + min);
        System.out.println("Bilangan terbesar: " + max);
    }
}

    

