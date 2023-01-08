import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initializing Scanner to read user inputs.
        Scanner scanner = new Scanner(System.in);

        // Reading three user inputs.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
    
        // Calculates and prints out the value.
        System.out.println(a * b + c);
    }
}