
## <mark style="background: #CACFD9A6;">System.out.printf()\format()</mark>


It works absolutely similar as in C language.

```Java
int a = 15;
System.out.printf("%5d", a);
```

```Output
   15
```
5 means - 5 places for output in sum.

```Java
int a = 15;
System.out.printf("%05d", a);
```

```Output
00015
```
0 - fills empty spaces with 0-s

```Java
int a = -15;  
int b = 20;  
System.out.printf("%(05d \n %(05d", a, b);
```

```Output
 (15) 
    20
```
If  number is negative, it will remove minus, and add brackets.

```Java
int a = -15;  
int b = 20;  
System.out.printf("%+d \n %+d", a, b);
```

```Output
-15
+20
```
'+' will print the sign of a number

## Strings 

Making a String from char's array: 
```Java
char c[] = {'A','D','O', 'L', 'F'};  
String s = new String(c);
```

![[Pasted image 20231223204126.png]]