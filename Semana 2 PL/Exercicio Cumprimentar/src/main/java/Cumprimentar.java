import java.util.Scanner;

public class Cumprimentar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String person_name = sc.nextLine();

        Pessoa person1 = new Pessoa(person_name);

    }
}
