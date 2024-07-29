import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.printf("Faktoriyelini hesaplamak istediğiniz sayiyi girin: ");
        int sayi = inp.nextInt();
        int total = 1;

        for (int i = 1; i <= sayi; i++) {
            total = total * i;
        }
        System.out.println("faktöriyel sonucunuz : "+ total);
    }
}