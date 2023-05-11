import java.util.*;
class Q9
{
    int rollNumber;
    String name;
    String course;
    public void input_Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }
    public void display_Student()
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
class Exam extends Q9
{
    int mark1, mark2, mark3;
    public void input_Marks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }
    public void display_Result()
    {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}
 class Result
{
    public static void main(String[] args)
    {
        Exam[] students = new Exam[5];
        for (int i = 0; i < students.length; i++)
        {
            System.out.println("Enter details of Student " + (i+1) + ":");
            students[i] = new Exam();
            students[i].input_Student();
            students[i].input_Marks();
        }
        for (int i = 0; i < students.length; i++)
        {
            System.out.println("Details of Student " + (i+1) + ":");
            students[i].display_Student();
            students[i].display_Result();
        }
    }
}

