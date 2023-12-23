
##  Skeleton

```Java
import java.lang.*  //packages import  (not necessary)
class Main{  //Main class

//public - accessable outside the class; static - without creating an object; void - returns nothing

    public static void main(String[] args){  
        System.out.println("привіт");  
    }  
}
```

JDK - development kit (for compiling) from ORACLE off site 
JRE - (for execution)
JVM - virtual machine (for execution)
## CLI
```
cd\ - return 1 back
dir - directory view 
md DirName - make dir

```

```Java
class Main{  
    public static void main(String[] args){  
        System.out.println("Hello");  
        System.out.println(args[0]);  
    }  
}
```

Output:
![[Pasted image 20231218233211.png]]

So, using args in function, you can write something in cl, and it will be used as a variable args\[i]. 
## How Java execute? Platform independence

![[Pasted image 20231222133529.png|500]]
- Java Virtual Machine (JVM) make Java platform independent. It has interpreter, JIT compiler and converts byte code into machine code.
- JVM's for every operation system are different. JVM for Linux - converts byte code into machine code and can talk to Linux OS.  
