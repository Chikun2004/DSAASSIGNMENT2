import java.util.Scanner;

class Student {
    int Roll;
    String Name;
    int DSA_Mark;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        Roll = sc.nextInt();
        sc.nextLine(); // to consume the newline character left by nextInt()
        System.out.print("Enter Name: ");
        Name = sc.nextLine();
        System.out.print("Enter DSA Mark: ");
        DSA_Mark = sc.nextInt();
    }

    void showdata() {
        System.out.println("Roll No: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Mark: " + DSA_Mark);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // get data for each student
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i+1) + ":");
            students[i].getdata();
        }

        // find the student with highest DSA mark
        int maxDSA = students[0].DSA_Mark;
        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (students[i].DSA_Mark > maxDSA) {
                maxDSA = students[i].DSA_Mark;
                maxIndex = i;
            }
        }

        // display the details of the student with highest DSA mark
        System.out.println("Details of student with highest DSA mark:");
        students[maxIndex].showdata();
    }
}