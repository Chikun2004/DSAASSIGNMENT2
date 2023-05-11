package School;
import java.util.*;
import School.Sports;
public interface Sports {
    int score1 = 10;
    int score2 = 20;
}
 class Student implements Sports{
    String name;
    int roll,mark1, mark2;
     public void input() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter student name: ");
         name = scanner.nextLine();
         System.out.print("Enter roll number: ");
         roll = scanner.nextInt();
         System.out.print("Enter mark1: ");
         mark1 = scanner.nextInt();
         System.out.print("Enter mark2: ");
         mark2 = scanner.nextInt();
     }
     public void output() {
         System.out.println("Name: " + name);
         System.out.println("Roll Number: " + roll);
         System.out.println("Mark1: " + mark1);
         System.out.println("Mark2: " + mark2);
     }
     public static void main(String[] args) {
         Student studentTest = new Student();
         studentTest.input();
         int grandTotal = studentTest.mark1 + studentTest.mark2 + score1 +
                 score2;
         System.out.println("Grand Total Mark: " + grandTotal);
         System.out.println("Score: " + (score1 + score2));
     }
 }



