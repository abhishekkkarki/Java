import java.util.Scanner;

/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Weekdays ");
        int weekdays = scanner.nextInt();
        switch (weekdays){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid Input");
        }
    }
}
*/

/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Weekdays ");
        int w = scanner.nextInt();
        if (w==1) {
            System.out.print("Sunday");
        } else if (w==2) {
            System.out.print("Monday");
        } else if (w==3) {
            System.out.print("Tuesday");
        } else if (w==4) {
            System.out.print("Wednesday");
        } else if (w==5) {
            System.out.print("Thursday");
        } else if (w==6) {
            System.out.print("Friday");
        } else if (w==7) {
            System.out.print("Saturday");
        } else {
            System.out.print("Invalid Input");
        }
    }
}
*/

                                                //Assignments of else if
//1. Write a JAVA program to find maximum between two numbers.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter the first number ");
        n1=scanner.nextInt();
        System.out.print("Enter the second number ");
        n2=scanner.nextInt();
        if (n1>n2){
            System.out.println(n1+" is the greatest number.");
        } else{
            System.out.println(n2+" is the greatest number.");
        };
    }
}
*/

//Write a JAVA program to find maximum between three numbers
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter the first number ");
        n1=scanner.nextInt();
        System.out.print("Enter the second number ");
        n2=scanner.nextInt();
        System.out.print("Enter the third number ");
        n3= scanner.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println(n1+" is the greatest number.");
        } else if (n2>=n1 && n2>=n3) {
            System.out.println(n2+" is the greatest number.");
        } else {
            System.out.println(n3+" is the greatest number.");
        }
    }
}
*/

//Write a JAVA program to check whether a number is negative, positive or zero.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num= scanner.nextInt();
        if (num>0){
            System.out.println("The number is positive");
        } else if(num<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("Zero");
        }
    }
}
*/

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num= scanner.nextInt();
        if ((num%5==0)&(num%11==0)){
            System.out.println("The number is divisible by 5 and 11.");
        }
        else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }
    }
}
*/

//Write a JAVA program to check whether a number is even or odd.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.print("Enter the number ");
        num= scanner.nextInt();
        if (num%2==0){
            System.out.println("The number is even.");
        } else{
            System.out.println("The number is odd.");
        }
    }
}
*/

//Write a JAVA program to check whether a year is leap year or not
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int year;
        boolean leap;
        System.out.print("Enter the year ");
        year= scanner.nextInt();
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
*/

//Write a JAVA program to check whether a character is alphabet or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char char1;
        System.out.print("Enter the character ");
        char1= scanner.next().charAt(0);
        if( (Character.isAlphabetic(char1))){
            System.out.println("It is an alphabet.");
        } else{
            System.out.println("It is not an alphabet.");
        }
    }
}
*/

// Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String val;
        System.out.print("Enter the character ");
        val= scanner.nextLine();
        val.toUpperCase();
        if ((val=="A")||(val=="E")||(val=="I")||(val=="O")||(val=="U"))
        {
            System.out.println("It is a vowel");
        } else{
            System.out.println("It is a consonant");
        }
    }
}
*/

//Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= scanner.next().charAt(0);
        if((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.println(char1 + " is an alphabet.");
        } else if(char1 >= '0' && char1 <= '9') {
            System.out.println(char1 + " is a digit.");
        } else {
            System.out.println(char1 + " is a special character.");
        }
    }
}
*/

//Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char char1;
        System.out.print("Enter the character ");
        char1= scanner.next().charAt(0);
        if (Character.isAlphabetic(char1)){
            if (Character.isUpperCase(char1)){
                System.out.println("The character is in Uppercase");
            }
            else{
                System.out.println("The character is in Lowercase");
            }} else{
            System.out.println("The input is not valid");
        }
    }
}
*/

//Write a JAVA program to input week number and print weekday
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekday;
        System.out.print("Enter the week number ");
        weekday = scanner.nextInt();
        if (weekday == 1) {
            System.out.println("Sunday");
        } else if (weekday == 2) {
            System.out.println("Monday");
        }else if (weekday==3){
            System.out.println("Tuesday");
        }else if (weekday==4){
            System.out.println("Wednesday");
        }else if (weekday==5){
            System.out.println("Thursday");
        }else if (weekday==6){
            System.out.println("Friday");
        }else if (weekday==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
*/

//Write a JAVA program to input month number and print number of days in that month.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.print("Enter the month number ");
        num = scanner.nextInt();
        if (num==1){
            System.out.println("January");
        } else if (num==2){
            System.out.println("February");
        }else if (num==3){
            System.out.println("March");
        }else if (num==4){
            System.out.println("April");
        }else if (num==5){
            System.out.println("May");
        }else if (num==6){
            System.out.println("June");
        }else if (num==7){
            System.out.println("July");
        }else if (num==8){
            System.out.println("August");
        }else if (num==9){
            System.out.println("September");
        }else if (num==10){
            System.out.println("October");
        }else if (num==11){
            System.out.println("November");
        }else if (num==12){
            System.out.println("December");
        } else{
            System.out.println("Invalid Input");
        }
    }
}
*/

//Write a JAVA program to count total number of notes in given amount
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int amount,notes;
        System.out.print("Enter the amount ");
        amount= scanner.nextInt();
        notes=amount/5;
        System.out.println("The total number of notes is "+notes);
    }
}
*/

//Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1=scanner.nextInt();
        System.out.print("Enter the angle ");
        a2= scanner.nextInt();
        System.out.print("Enter the angle ");
        a3= scanner.nextInt();
        sum=a1+a2+a3;
        if (sum==180){
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}
*/

//Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, a3;
        System.out.print("Enter the side ");
        a1 = scanner.nextInt();
        System.out.print("Enter the side ");
        a2 = scanner.nextInt();
        System.out.print("Enter the side ");
        a3 = scanner.nextInt();
        if ((a1 < (a2 + a3)) && (a2 < (a1 + a3)) && a3 < (a1 + a2)) {
            System.out.println("The triangle is valid.");
        } else{
            System.out.println("The triangle is not valid.");
        }
    }
}
*/

                                          //Assignments of using switch
//Using switch statement Write a JAVA program to input marks of five subjects Physics,
//Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int maths,physics,computer,chemistry,biology,total,percentage,avg;
        String grade;
        System.out.print("Enter the marks secured in Maths ");
        maths= scanner.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        physics=scanner.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        chemistry=scanner.nextInt();
        System.out.print("Enter the marks secured in Biology ");
        biology=scanner.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        computer=scanner.nextInt();
        total=maths+physics+chemistry+computer+biology;
        percentage=total/5;
        avg=percentage/10;
        switch (avg){
            case 10:
                grade="A";
                break;
                case 9:
                    grade="A";
                    break;
                case 8:
                    grade="B";
                    break;
                case 7:
                    grade="C";
                    break;
                case 6:
                    grade="D";
                    break;
                case 4:
                    grade="E";
                    break;
                    default:
                        grade="F";
                        break;
        }
        System.out.println("Percentage: "+percentage+"%\nGrade: "+grade);
    }
}
*/

//JAVA Program to find the maximum between two numbers
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2,x;
        System.out.print("Enter the first number ");
        n1=scanner.nextInt();
        System.out.print("Enter the second number ");
        n2=scanner.nextInt();
        if (n1>n2){
            x=1;
        } else{
            x=2;
        };
        switch (x){
            case 1:
                System.out.println(n1+" is the greatest number.");
                break;
            default:
                System.out.println(n2+" is the greatest number.");
                break;
        }
    }
}
*/

//JAVA Program to find the maximum between three numbers
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2,n3,x;
        System.out.print("Enter the first number ");
        n1=scanner.nextInt();
        System.out.print("Enter the second number ");
        n2=scanner.nextInt();
        System.out.print("Enter the third number ");
        n3= scanner.nextInt();
        if (n1>=n2 && n1>=n3){
            x=1;
        } else if (n2>=n1 && n2>=n3) {
            x=2;
        } else {
            x=3;
        }
        switch (x){
            case 1:
                System.out.println(n1+" is the greatest number.");
                break;
            case 2:
                System.out.println(n2+" is the greatest number.");
                break;
            default:
                System.out.println(n3+" is the greatest number.");
                break;

        }
    }
}
*/

//JAVA Program to check whether a number is divisible by 5 and 11 or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= scanner.nextInt();
        if ((num%5==0)&(num%11==0)){
            x=1;
        }
        else {
            x=0;
        }
        switch (x){
            case 1:
                System.out.println("The number is divisible by 5 and 11.");
                break;
            default:
                System.out.println("The number is not divisible by both 5 and 11.");
                break;
        }
    }
}
*/

//JAVA Program to check whether a year is a leap year or not
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int year,x;
        System.out.print("Enter the year ");
        year= scanner.nextInt();
        if (year%400==0)
        {
            x=1;
        }
        else if((year%4==0)&&(year%100!=0)) {
            x=1;
        }
        else {
            x=0;
        }
        switch (x){
            case 1:
                System.out.println("It is a leap year.");
                break;
            default:
                System.out.println("It is not a leap year.");
                break;
        }
    }
}
*/

//JAVA Program to check whether a character is an alphabet or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = scanner.next().charAt(0);
        Character.toLowerCase(char1);
        switch (char1) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
                System.out.println("The character is an alphabet.");
                break;
            default:
                System.out.println("The character is not an alphabet.");
        }
    }
}
*/

//JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = scanner.next().charAt(0);
        Character.toLowerCase(char1);
        switch (char1) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("The alphabet is a vowel.");
                break;
            default:
                System.out.println("The alphabet is a consonant.");
                break;
        }
    }
}
*/

//JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1 ;
        char1= scanner.next().charAt(0);
        Character.toLowerCase(char1);
        switch (char1){
            case '0','1','2','3','4','5','6','7','8','9':
                System.out.println("The character is a digit.");
                break;
            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
                System.out.println("The character is an alphabet.");
                break;
            default:
                System.out.println("The character is a special character");
                break;
        }
    }
}
*/

//JAVA Program to check whether a character is an uppercase or lowercase alphabet
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the character ");
        int x;
        char char1 ;
        char1= scanner.next().charAt(0);
        if (Character.isUpperCase(char1)){
            x=1;
        } else {
            x=2;
        }
        switch (x){
            case 1:
                System.out.println("The character is in Uppercase");
                break;
            default:
                System.out.println("The character is in Lowercase");
                break;
        }
    }
}
*/

//JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int weekday;
        System.out.print("Enter the week number ");
        weekday = scanner.nextInt();
        switch (weekday){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
*/

//JAVA Program to take the value from the user as input the month number and print number of
//days in that month. Using switch statement.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter the month number ");
        num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
*/

//JAVA Program to count the total number of notes in a given amount.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int amount,notes;
        System.out.print("Enter the amount ");
        amount= scanner.nextInt();
        switch (amount){
            case 0:
                System.out.println("Invalid Input");
                break;
            default:
                notes=amount/5;
                System.out.println("The total number of notes is "+notes);
                break;
        }
    }
}
*/

//JAVA Program to take the value from the user as input all sides of a triangle and check whether
//the triangle is valid or not.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a1,a2,a3,sum;
        System.out.print("Enter the angle ");
        a1=scanner.nextInt();
        System.out.print("Enter the angle ");
        a2= scanner.nextInt();
        System.out.print("Enter the angle ");
        a3= scanner.nextInt();
        sum=a1+a2+a3;
        switch (sum){
            case 180:
                System.out.println("The triangle is valid.");
                break;
            default:
                System.out.println("The triangle is not valid.");
                break;
        }
    }
}
*/

//JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a1, a2, a3,x;
        System.out.print("Enter the side ");
        a1 = scanner.nextInt();
        System.out.print("Enter the side ");
        a2 = scanner.nextInt();
        System.out.print("Enter the side ");
        a3 = scanner.nextInt();
        if ((a1 == a2) && (a2 == a3)) {
            x=1;
        } else if ((a1 == a2) || (a2 == a3) || (a3 == a1)) {
            x=2;
        } else {
            x=3;
        }
        switch (x){
            case 1:
                System.out.println("The triangle is equilateral.");
                break;
            case 2:
                System.out.println("The triangle is isosceles.");
                break;
            default:
                System.out.println("The triangle is scalene.");
                break;
        }
    }
}
*/

//JAVA Program to find all the roots of a quadratic equation.
/*
public class Switchif {
    public static void main(String[] args) {
        double r1,r2,a,b,c,determinant,sqrt;
        int det1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        a= scanner.nextDouble();
        System.out.println("Enter the value of b ::");
        b= scanner.nextDouble();
        System.out.println("Enter the value of c ::");
        c = scanner.nextDouble();
        determinant = (b*b)-(4*a*c);
        sqrt = Math.sqrt(determinant);
        if (determinant==0)
        {
            det1=0;
        }
        else {
            det1=1;
        };
        switch (det1){
            case 0:
                System.out.println("Root is :: "+(-b + sqrt)/(2*a));
                break;
            default:
                r1 = (-b + sqrt)/(2*a);
                r2 = (-b - sqrt)/(2*a);
                System.out.println("Roots are :: "+ r1 +" and "+r2);
                break;
        }
    }
}
*/

//JAVA Program to calculate profit or loss
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int SP, CP,val,x;
        System.out.print("Enter the cost price ");
        CP = scanner.nextInt();
        System.out.print("Enter the selling price ");
        SP = scanner.nextInt();
        if (SP>CP){
            x=1;
        } else{
            x=0;
        }
        switch (x){
            case 1:
                val=SP-CP;
                System.out.println("Profit: "+val);
                break;
            default:
                val=CP-SP;
                System.out.println("Loss:"+val);
        }
    }
}
*/

//Using switch statement JAVA Program to take the value from the user as input marks of five
//subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and
//grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B,
//Percentage >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E,
//Percentage < 40% : Grade F
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int maths,physics,computer,chemistry,biology,total,percentage,avg;
        String grade;
        System.out.print("Enter the marks secured in Maths ");
        maths= scanner.nextInt();
        System.out.print("Enter the marks secured in Physics ");
        physics=scanner.nextInt();
        System.out.print("Enter the marks secured in Chemistry ");
        chemistry=scanner.nextInt();
        System.out.print("Enter the marks secured in Biology ");
        biology=scanner.nextInt();
        System.out.print("Enter the marks secured in Computer ");
        computer=scanner.nextInt();
        total=maths+physics+chemistry+computer+biology;
        percentage=total/5;
        avg=percentage/10;
        switch (avg){
            case 10:
                grade="A";
                break;
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            case 4:
                grade="E";
                break;
            default:
                grade="F";
                break;
        }
        System.out.println("Percentage: "+percentage+"%\nGrade: "+grade);
    }
}
*/

//JAVA Program to take the value from the user as input the basic salary of an employee and
//calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
//80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA =
//90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
/*
public class Switchif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double da,hra,basic,gross;
        int temp;
        System.out.print("Enter the basic salary ");
        basic= scanner.nextDouble();
        if(basic <= 10000)
        {
            temp=1;
        }
        else if(basic <= 20000)
        {
            temp=2;
        }
        else
        {
            temp=3;
        }
        switch (temp){
            case 1:
                da  = basic * 0.8;
                hra = basic * 0.2;
                break;
            case 2:
                da  = basic * 0.9;
                hra = basic * 0.25;
                break;
            default:
                da  = basic * 0.95;
                hra = basic * 0.3;
                break;
        }
        gross = basic + hra + da;
        System.out.println("The gross salary is Rs."+gross);
    }
}
*/


























