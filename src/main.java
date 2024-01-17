import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //initalize scanner
        Scanner scanner = new Scanner(System.in);

        //output and input
        System.out.println("please enter your age: ");
        int age = scanner.nextInt();

        //proccess
        if (age >= 21) {
            System.out.println("You get a wrist band.");
        }
        // end program do nothing if person is younger than 21
    }
}
