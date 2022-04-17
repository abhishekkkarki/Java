import java.math.BigInteger;
import java.util.Scanner;

/*
public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        float sum = a+b+c;
        System.out.println(sum);
    }
}*/
/*
public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address ");
        String address = scanner.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
*/
public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal");
        String principal = scanner.nextLine();
        System.out.println("Enter time");
        String time = scanner.nextLine();
        System.out.println("Enter rate");
        String rate = scanner.nextLine();
        int value1 = Integer.parseInt(principal);
        int value2 = Integer.parseInt(time);
        int value3 = Integer.parseInt(rate);
        float SI = (value1*value2*value3)/100;
        System.out.println(SI);
    }
}
