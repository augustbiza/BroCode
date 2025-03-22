# Increasing and Decreasing
## Increasing
#### Case 1
```java
int x = 4, y = 4;

System.out.println(++x);
System.out.println(y++);
```
#### Output
```
5
4
```
#### Observation
in the end, both x and y are worth 5.
#### Case 2
```java
public static void func(int num) {
        
    System.out.println(num);
}
    
    
public static void main(String[] args) {
	    
	int x = 5, y = 5;
	    
	func(x++);
	func(++y);
}
```
#### Output
```
6
5
```
#### Observation
in the end, both x and y are worth 6.
## Decreasing
#### Case 1
```java
int x = 4, y = 4;

System.out.println(--x);
System.out.println(y--);
```
#### Output
```
3
4
```
#### Observation
in the end, both x and y are worth 3.
#### Case 2
```java
public static void func(int num) {
        
    System.out.println(num);
}
    
    
public static void main(String[] args) {
	    
	int x = 5, y = 5;
	    
	func(x--);
	func(--y);
}
```
#### Output
```
5
4
```
#### Observation
in the end, both x and y are worth 4.