import java.util.Scanner;
public class phone {
    private int area_code;
    private int exchange;
    private int number;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area code: ");
        area_code = scanner.nextInt();
        System.out.print("Enter exchange: ");
        exchange = scanner.nextInt();
        System.out.print("Enter number: ");
        number = scanner.nextInt();
    }

    public void display() {
        System.out.println("(" + area_code + ") " + exchange + "-" + number);
    }

    public static void main(String[] args) {
        phone phone1 = new phone();
        phone1.area_code = 212;
        phone1.exchange = 767;
        phone1.number = 8900;

        phone phone2 = new phone();
        phone2.input();

        System.out.println("Phone 1:");
        phone1.display();

        System.out.println("Phone 2:");
        phone2.display();
    }
}