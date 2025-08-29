
import java.util.Scanner;
import java.util.Random;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        
    
        int start = random.nextInt(kalimat.length() - 2);
        int end = start + random.nextInt(kalimat.length() - start - 1) + 1;
        
        String jawabanBenar = kalimat.substring(start, end);
        
        
        System.out.print("Apa substring dari indeks " + start + " hingga " +  (end - 1) + "? ");
        String jawabanUser = input.nextLine();
        
    
        if (jawabanUser.equals(jawabanBenar)) {
            System.out.println("\u2714 Benar! Keren, kamu jago string!");
        } else {
            System.out.println("\u2718 Kurang tepat. Jawaban benar: " + jawabanBenar);
        }
        
    
    }
}