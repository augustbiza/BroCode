import java.util.Scanner;

class Calculate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose two numbers (number 2 can't be ZERO!)");

        double a, b;
        a = scan.nextInt(); 
        b = scan.nextInt();

        System.out.println("A: " + a + ", B: " + b);
        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));

        scan.close();
    }
}