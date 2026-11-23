import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String StudentName = s.nextLine();
        int age = s.nextInt();
        int CollegeCode = s.nextInt();
        int StudentId = s.nextInt();
        long MobileNo = s.nextLong();
        double Percentage = s.nextDouble();

        System.out.println("Student Information");
        System.out.println("Student Name: " + StudentName);
        System.out.println("Age: " + age);
        System.out.println("College Code: " + CollegeCode);
        System.out.println("Student Id: " + StudentId);
        System.out.println("Mobile No: " + MobileNo);
        System.out.println("Percentage: " + Percentage);
    }
}
