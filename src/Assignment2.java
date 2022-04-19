import javax.swing.*;
import java.util.Scanner;

                                       //Using Scanner User Input


//1. WAP to take student details as input and display the result.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        BigInteger phonenumber = scanner.nextBigInteger();
        String Studentdetails = ("Student's name: " +name +"\nStudent's age: " +age +"\nStudent's address: " +address +"\nStudent's phone number: " +phonenumber);
        System.out.println(Studentdetails);
    }
}
*/

//2. WAP to caluculate the sum of four numbers using four numbers.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the 2nd value: ");
        int b = scanner.nextInt();
        System.out.print("Enter the 3rd value: ");
        int c = scanner.nextInt();
        System.out.print("Enter the 4th value: ");
        int d = scanner.nextInt();
        int sum = (a+b+c+d);
        System.out.print("The total sum of asked value is: "+sum);
    }
}*/

//3. calculate the total marks of four subjects of a student and the total percentage secured using user input.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks in Maths: ");
        int m = scanner.nextInt();
        System.out.println("Enter the marks in Science: ");
        int s = scanner.nextInt();
        System.out.println("Enter the marks in Computer: ");
        int c = scanner.nextInt();
        System.out.println("Enter the marks in Nepali: ");
        int n = scanner.nextInt();
        float sum = (m+s+c+n);
        System.out.println(sum);
        float percentage = sum/4;
        System.out.println(percentage);
        String grade = (percentage>70) ? ("First Class") : (percentage>59 && percentage<70)? ("Upper Second Class") : (percentage>49 && percentage<60) ? ("Second Class") : (percentage>39 && percentage<50) ? ("Third Class") : ("Fail");
        System.out.println(grade);
    }
}*/

//4. WAP to take two input from the user and find sum and product.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the 2nd value: ");
        int b = scanner.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("The sum is: " +sum +"\nThe product is: " +product);
    }
}*/

//5. WAP to input double length and breadth and print area of rectangle type casting to int.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();
        double area = length*breadth;
        System.out.println("The area of rectangle: " +area);
        int castedarea = (int) (area);
        System.out.println("The area of rectangle: " +castedarea);
    }
}*/

//6. WAP to take name, roll number and field of interest and print Hey, my name is and my roll number is and my field of interest is.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        int rn = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your field of interest: ");
        String foi = scanner.nextLine();
        System.out.print("Hey, my name is " +name+"." + " my roll number is " +rn+"." + " my field of interest is " +foi+".");
    }
}*/

//7. WAP to take side of square and calculate area and perimeter.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int s = scanner.nextInt();
        double area = s*s;
        double perimeter = s+s+s+s;
        System.out.print("The area of square: "+area +"\nThe perimeter of square: "+perimeter);
    }
}*/

//8. WAP to find a square of a number.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        double s = Math.pow(n,2);
        int casteds = (int) (s);
        System.out.print("The square of the number is: "+casteds);
    }
}*/

//9. WAP to take two different input in different line and print them in same one.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second: ");
        String b = scanner.nextLine();
        System.out.print(a+b);
    }
}
*/

//11. WAP to ask user to input and checks whether all are equal or any of two are equal.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number ");
        int n1= scanner.nextInt();
        System.out.print("Enter the second number ");
        int n2= scanner.nextInt();
        System.out.print("Enter the third number ");
        int n3=scanner.nextInt();
        String result=(n1==n2)&&(n2==n3)?"All numbers are equal":(n1==n2)||(n2==n3)||(n1==n3)?"Two numbers are equal":"None of the numbers are equal";
        System.out.println(result);
    }
}*/

//12. WAP to enter values for two variables and check if a<50 and a<b.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int b = scanner.nextInt();
        String result = (a<50 && a<b) ? ("The condition is true ") : ("The condition is false ");
        System.out.print(result);
    }
}*/

//13. WAP to calculate robert's marks in three subject and find total and percentage.
/*
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in Maths: ");
        int m = scanner.nextInt();
        System.out.print("Enter the marks in Science: ");
        int s = scanner.nextInt();
        System.out.print("Enter the marks in Computer: ");
        int c = scanner.nextInt();
        float sum = (m + s + c);
        System.out.print(sum);
        float percentage = sum / 3;
        System.out.print(percentage);
    }
}   */



                                           //using JOptionPane


//1. WAP to take student details as input and display as result.
/*
public class Assignment2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the name ");
        int rollNo = Integer.parseInt(JOptionPane.showInputDialog("Enter the roll number "));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age "));
        int phoneNo = Integer.parseInt(JOptionPane.showInputDialog("Enter the phone number "));
        JOptionPane.showMessageDialog(null, "Name: " + name + "\n Roll Number: " + rollNo + "\n Age: " + age + "\n Phone Number: " + phoneNo);
    }
}*/

//2. WAP to calculate sum of four numbers using user input.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Enter the fourth number: "));
        int sum = (a + b + c + d);
        JOptionPane.showMessageDialog(null, "Sum of all numbers is "+sum);
    }
}*/

//3. calculate the total marks of four subjects of a student and the total percentage secured using user input.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int maths = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in maths "));
        int nepali = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in nepali "));
        int computer = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in computer "));
        int english = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in english "));
        int total = maths+nepali+computer+english;
        double percentage = total/4;
        String result = percentage>69?"First Class":percentage>59?"Upper Second Class":percentage>49?"Second Class":percentage>39?"Third Class":"Fail";
        JOptionPane.showMessageDialog(null,"Total marks: "+total+"\nPercentage: "+percentage+"%"+"\n Result: "+result);
    }
}*/

//4. WAP to ask two input from the user and find sum and product.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number "));
        int sum = a+b;
        double product = a*b;
        JOptionPane.showMessageDialog(null,"The sum of numbers is "+ sum + "\nThe product of numbers is "+ product);
    }
}
*/

//5. WAP to input double length and breadth and print area of rectangle type casting to int.
/*
public class Assignment2 {
    public static void main(String[] args) {
        double l = Double.parseDouble(JOptionPane.showInputDialog("Enter the length "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the breadth "));
        double area = l*b;
        int castedarea = (int) (area);
        JOptionPane.showMessageDialog(null, "The area of rectangle is "+castedarea);
    }
}
*/

//6. WAP to take name, roll number and field of interest and print Hey, my name is and my roll number is and my field of interest is.
/*
public class Assignment2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the name ");
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter the roll number "));
        String FOI = JOptionPane.showInputDialog("Enter the field of interest ");
        JOptionPane.showMessageDialog(null,"Hey, My name is "+name + "\nMy roll number is "+roll + "\nMy field of interest is "+FOI);
    }
}
*/

//7. WAP to take side of square and calculate area and perimeter.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int s = Integer.parseInt(JOptionPane.showInputDialog("Enter the side of square "));
        int area = s*s;
        int perimeter = s+s+s+s;
        JOptionPane.showMessageDialog(null, "The area of square is "+area + "\nThe perimeter of square is "+ perimeter);
    }
}
*/

//8. WAP to find a square of a number.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to find a square "));
        int square = n*n;
        JOptionPane.showMessageDialog(null, "The square of given number is "+square);
    }
}
*/

//9. WAP to take two different input in different line and print them in same one.
/*
public class Assignment2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Enter the first value ");
        String b = JOptionPane.showInputDialog("Enter the second value ");
        JOptionPane.showMessageDialog(null, a+b);
    }
}
*/

//10. WAP to ask user to input and checks whether all are equal or any of two are equal.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number "));
        String check = (a==b && b==c)? "All number are same" : (a==b)||(b==c)||(c==a)? "Any two are same" : "Neither of them are same";
        JOptionPane.showMessageDialog(null, check);
    }
}
*/

//11. WAP to enter values for two variables and check if a<50 and a<b.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value "));
        String check = (a<50 && a<b)? "True":"False";
        JOptionPane.showMessageDialog(null, check);
    }
}
*/

//12. WAP to calculate robert's marks in three subject and find total and percentage.
/*
public class Assignment2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in mathematics "));
        int s = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in science "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks in computer "));
        int total = m+s+c;
        double percentage = total/3;
        JOptionPane.showMessageDialog(null, "Total marks "+total + "\nTotal percentage "+percentage);
    }
}
*/