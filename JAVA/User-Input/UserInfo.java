import java.util.Scanner;

class UserInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        double height;

        System.out.println("Please, provide your information:");
        System.out.println("What's your name?  ");
        name = scan.nextLine();
        System.out.println("How old are you?  ");
        age = scan.nextInt();
        System.out.println("How tall are you?  ");
        height = scan.nextDouble();

        System.out.println("Your Information\nName: " + name +"\nAge: " + age + "\nHeight: " + height);

        scan.close();
    }
}