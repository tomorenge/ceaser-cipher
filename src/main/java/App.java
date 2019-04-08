import java.io.Console;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to encrypt and 2 to encrypt");
        int choice=scanner.nextInt();
        if(choice==1) {

        System.out.println("Enter the message to be encrypted in ceasar cipher");
        String message = scanner.nextLine();

        System.out.println("Enter the key ");
        int key = scanner.nextInt();

        System.out.println(CeaserCipher.encrypt(message,key));

    }
}

