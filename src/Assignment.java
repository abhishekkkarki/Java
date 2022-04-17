//1. Check whether a person can cast a vote or not
/*
public class Assignment {
    public static void main(String[] args) {
        int age = 18;
        String eligibility = (age<=16)? "Can Vote":"Can't Vote";
        System.out.println(eligibility);
    }
}
*/

//2. calculate SI, area of triangle, volume of cube and cuboid.
/*
public class Assignment {
    public static void main(String[] args) {
        int p = 200;
        int t = 1;
        int r = 2;
        float simpleinterest = ((p * t * r) / 100);
        System.out.println(simpleinterest);
    }
}
*/

/*
public class Assignment {
    public static void main(String[] args) {
        int b = 50;
        int h = 3;
        float AOT = (b*h)/2;
        System.out.println(AOT);
    }
}*/

/*
public class Assignment {
    public static void main(String[] args) {
        int a = 3;
        float VOC = a*a*a;
        System.out.println(VOC);
    }
}*/

/*
public class Assignment {
    public static void main(String[] args) {
        int l = 3;
        int b = 4;
        int h = 6;
        float VOCUBOID = l*b*h;
        System.out.println(VOCUBOID);
    }
}*/

// 3. is same as 1.

// 4. calculate the total marks of four subjects of a student and the total percentage secured.
/*
public class Assignment {
    public static void main(String[] args) {
        int maths = 59;
        int science = 60;
        int nepali = 80;
        int computer = 90;
        float sum = (maths + science + nepali + computer);
        float percentage = (sum / 4);
        String Grade = (percentage >= 70) ? "First Class" : (percentage > 59 && percentage < 70) ? "Upper Second Class" : (percentage > 49 && percentage < 60) ? "Second Class" : (percentage > 39 && percentage < 50) ? "Third Class" : "Fail";
        System.out.println(Grade);
    }
}*/

import java.util.Scanner;

/*
//1. Check whether a person can cast a vote or not using user input
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age to Vote: ");
        int age = scanner.nextInt();
        String eligibility = age>=18?("Can Vote"):("Can't Vote");
        System.out.println(eligibility);
    }
}
*/

/*
//2. calculate SI, area of triangle, volume of cube and cuboid using user input.
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = scanner.nextInt();
        System.out.println("Enter time: ");
        int t = scanner.nextInt();
        System.out.println("Enter rate");
        int r = scanner.nextInt();
        float SI = (p*t*r)/100;
        System.out.println(SI);
    }
}*/

/*
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter breadth: ");
        int b = scanner.nextInt();
        System.out.println("Enter height: ");
        int h = scanner.nextInt();
        float AOT = (b*h)/2;
        System.out.println(AOT);
    }
}*/

/*
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = scanner.nextInt();
        float VOC = l*l*l;
        System.out.println(VOC);
    }
}*/

/*
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = scanner.nextInt();
        System.out.println("Enter the breadth: ");
        int b = scanner.nextInt();
        System.out.println("Enter the height: ");
        int h = scanner.nextInt();
        float VOCUBIOD = l*b*h;
        System.out.println(VOCUBIOD);
    }
}*/

// 3. is same as 1.

// 4. calculate the total marks of four subjects of a student and the total percentage secured using user input.
/*
public class Assignment {
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
