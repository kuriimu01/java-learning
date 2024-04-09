
```Java
try {
	meth1();
}
catch(NumberFormatException | NullPointerException e){
	System.out.println("Exception");
	System.out.println("Error: " + e);
}
```

	Practising
```Java
class YouLoxException extends RuntimeException{}  
  
class MyException extends Exception{  
    MyException(){}  
    MyException(String s, Throwable cause){  
        super(s, cause);  
    }  
}  
class Main {  
    public static void meth1(int n){  
        System.out.println(n/0);  
    }  
    public static void main(String[] args) throws MyException {  
        try {  
            meth1(10);  
        }  
        catch(Exception e){  
            System.out.println("Exception: " + e);  
            System.out.println("Cause: " + e.getMessage());  
        }  
        finally {  
            throw new MyException("Today is not your day, sweety", new YouLoxException());  
        }  
    }  
}
```
Result: 
![[Pasted image 20240409194447.png]]
### Custom exceptions 
You need to make a class `ExampleNameException` that extends from `Exception`
```Java
class ExampleNameException extends Exception{
	// When you throw this exception, you will need to add "throws `ExampleNameException`" for every item that will drop it
}
class AnotherExampleNameException extends RuntimeException{ 
	// Using RuntimeException you can avoid this
}
```
### Checked/Unchecked exceptions

![[Pasted image 20240409191717.png]] 
***red - checked; blue - unchecked***

**Checked** exceptions are exceptions that Java makes you deal with, because you just can't compile a file. There will be an error. To avoid this you need to add try-catch block for this exception, or add *`throws NameException`* to your method.
Unchecked is opposite of previous. But you can make them checked, by adding throws.