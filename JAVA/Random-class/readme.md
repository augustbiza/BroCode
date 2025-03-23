# Random class
### How to generate random numbers.
### Steps
1. Import the Random class
```java
import java.util.Scanner;
```
2. Inside de main function create an object of Random
```java
Random rand = new Random();
```
CURRENT VIEW
```java
public static void main(String[] args) {

    Random rand = new Random();
}
```
3. Declare a number data type and give the rand object value;
```java
int a = rand.nextInt();
int a2 = rand.nextInt(-3, 9);

double b = ran.nextDouble();
double b2 = ran.nextDouble(5, 14);
```
#### The int a2 will get a value between -3 and 9 --> [-3, 9[ ] = \[-3, 8] 
#### The int b2 will get a value between 5 and 14 --> [5, 14[ ] = \[5, 13.99999999]
### Boolean
Generate **true** or **false** to a boolean data;
```java
boolean status = rand.nextBoolean();
	    
if(status) System.out.println("Sim");
else System.out.println(("Não"));
	    
System.out.println(status);
```
### Output
#### Option 1: boolean = true;
```
Sim
True
```
#### Option 2: boolean = false;
```
Não
False
```