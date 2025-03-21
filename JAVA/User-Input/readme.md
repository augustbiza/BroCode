# User Input
### How to get information FROM the USER
### Steps
1. import the Scanner class
```java
import java.util.Scanner;
```
2. Inside de main function create an object of Scanner
```java
Scanner scanner = new Scanner(System.in);
```
3. Close the object scanner in the end of the function
```java
scanner.close();
```
CURRENT VIEW
```java
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    scanner.close();
}
```
4. Create data types and assignment them by using the scanner
```java
int age;
double height;
String name;

age = scanner.nextInt();
height = scanner.nextDouble();
name = scanner.nextLine();
```
FINAL VIEW
```java
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        double height;
        String name;

        age = scanner.nextInt();
        height = scanner.nextDouble();
        name = scanner.nextLine();

        scanner.close();
    }
}
```