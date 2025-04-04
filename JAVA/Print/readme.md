# Print
Show info on the screen.  
``` java
System.out.print()
System.out.println()
System.out.printf()
```
### Example 1:
```java
String curse = "Computer Science";
int year = 3;
double grade = 6.9;
```
#### print = System.out.print()
```java
System.out.print(curse);
System.out.print(year);
System.out.print(grade);
```
#### Output
```
Computer Science36.9
```
#### printf = System.out.printf()
```java
System.out.printf("%s", curse);
System.out.printf("%d", year);
System.out.printf("%f", grade);
```
#### Output
```
Computer Science36.900000
```
#### println = System.out.println()
```java
System.out.println(curse);
System.out.println(year);
System.out.println(grade);
```
#### Output
```
Computer Science
3
6.9
```
## blank space - \n
System.out.print() and System.out.printf() have no breake line at the end. You have to add **\n**
#### print
```java
System.out.print("NAMES\n");
System.out.print("Yuna and Akari");

//or

System.out.printf("NAMES\n");
System.out.printf("Yuna and Akari");
```
#### Output
```
NAMES
Yuna and Akari
```