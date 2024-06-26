![[Pasted image 20231219003903.png|400]]

![[Pasted image 20240315154820.png|400]]
## Important to know

```Java
return Integer.parseInt(str); - //string to int
return varChar - 'O'; - //char to int (if there is only int)
return Integer.toString(int); // int to str
```
## Literals
```Java
int value = 25; // Here 25 is a literal with integer type
area = 3.14 * radius * radius; // Here 3.14 is a literal with !double! type
float f = 3.14f; // The correct way to declare a float literals 
```

```Java
Use ' '  - for char
and " " for String
```
## Constants
```Java
class Main{
    public static final int SIZE = 20;

    public static void main(String[] args){
        System.out.println(SIZE);
    }
}
```
## Scanner

```Java
import java.util.Scanner;  
  
class Main{  
    public static void main(String[] args){  
        Scanner s = new Scanner(System.in);  
        System.out.println("Please enter your name: ");  
        String name = s.nextLine();  
        System.out.println("Hello, my dear " + name);  
    }  
}
```
There are many .next methods, for every data type, like .nextInt() .nextFloat() etc.


```Java
s.useRadix(2);  
int x = s.nextInt();  
System.out.println(x); //Making decimals 0001 - 1; 1111 - 15
```

## First useful program

```Java
import java.util.Scanner;  
  
class Main{  
    public static void main(String[] args){  
        float b, h, area;  
        Scanner s = new Scanner(System.in);  
        System.out.print("Введіть довжину катета: ");  
        b = s.nextFloat();  
        System.out.print("Введіть висоту: ");  
        h = s.nextFloat();  
        area = (float) 0.5*b*h;  
        System.out.println("Площа трикутника: " + area);  
    }  
}
// Don't forget '(float)'
```
```Java
import java.util.Scanner;  
  
class Main{  
    public static void main(String[] args){  
        float a, b, c, halfArea, area;  
        Scanner s = new Scanner(System.in);  
        System.out.print("Введіть довжину катета A: ");  
        a = s.nextFloat();  
        System.out.print("Введіть довжину катета B: ");  
        b = s.nextFloat();  
        System.out.print("Введіть довжину катета C: ");  
        c = s.nextFloat();  
        halfArea = 0.5f*(a+b+c);  
        area = (float) Math.sqrt(halfArea*(halfArea-a)*(halfArea-b)*(halfArea-c));  
        System.out.println("Площа трикутника: " + area);  
    }  
}
```

## Increments

<mark style="background: #AAA;font-size:25;">Base : x++; </mark> 

<mark style="background: #FF5582A6;font-size:25;">But :  y = ++x;</mark> 

## Bitwise operations (АЗІС)
![[Pasted image 20231222200703.png|379]]
## Widening and Narrowing

![[Pasted image 20231223141406.png|375]]
Widening - smaller to larger 

```Java
byte num1 = 10;
short converted = num1; // it will work
```

Narrowing - larger to smaller. Type casting - temporarily changing a var data type

```Java
int num = 10;
byte converted = num; -> will be Error

int num = 10;
byte converted = (byte) num; // Will work. It called type casting 
// If converted number is too large, it will do a strange things with number,
// so try to avoid that.
```
