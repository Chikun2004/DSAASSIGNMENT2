public class Complex {
    private double real;
    private double imag;

    public void setData(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public Complex add(Complex num1, Complex num2) {
        Complex sum = new Complex();
        sum.real = num1.real + num2.real;
        sum.imag = num1.imag + num2.imag;
        return sum;
    }

    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex();
        num1.setData(2, 3);
        num2.setData(4, -1);
        System.out.print("First complex number: ");
        num1.display();
        System.out.print("Second complex number: ");
        num2.display();
        Complex sum = num1.add(num1, num2);
        System.out.print("Sum of two complex numbers: ");
        sum.display();
    }
}