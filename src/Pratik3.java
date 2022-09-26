import java.util.Scanner;
public class Pratik3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kenar1, kenar2, kenar3;
        kenar1 = input.nextDouble();
        kenar2 = input.nextDouble();
        kenar3 = input.nextDouble();
        double cevre = kenar1 + kenar2 + kenar3;
        double cevreyarisi = cevre/2;
        double alankare = cevreyarisi * (cevreyarisi-kenar1) * (cevreyarisi-kenar2) * (cevreyarisi-kenar3);
        double alan = Math.sqrt(alankare);
        System.out.println(alan);
    }
}