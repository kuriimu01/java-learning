Javas strings are immutable, 
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

>***Offset here - start index number
   Count - amount of char's
***

![[Pasted image 20231223204126.png]]![[Pasted image 20231223204136.png]]
##  📒Must to know String methods

```Java
.lenght()
.toLowerCase()
.toUpperCase()
.trim() - //removes all the unnecesary spaces, except between words 
.substring(1, 4) - // trims words from int index to final index 
.replace('h', 'M') - // replaces char with other char
.startsWith("www") - // returns boolean (T\F)
.endsWith(".com") - // similar to ⤴️
.charAt(int) - // returns char
.indexOf("ab", 1) - // returns index (ababab ➡️ 2 )
.lastIndexOf("ab") - // returns index (ababab ➡️ 4 )
str1.equals(str2) - // returns boolean T\F
str1.equalsIgnoreCase(str2) - // returns reversed boolean T\F
.compareTo() - // returns int value 
```

## 🧑‍💻 .matches()

```Java
binary - [0,1]+
octal - [0-7]+
decimal - [0-9]+
hexadecimal - [0-9A-F]+
```
![[Pasted image 20231228013830.png|450]]

![[Pasted image 20231228013907.png|450]]

![[Pasted image 20231228014521.png|450]]

