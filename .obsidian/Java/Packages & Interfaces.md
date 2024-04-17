
## Packages

Java project layout

![[Pasted image 20240417205610.png]]

## Interfaces

>*Interfaces* in Java is **a mechanism to achieve abstraction**. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java. 

```Java
public interface Noize {
	public abstract make_noize();
	public default void deff(){
		System.out.println("I'm just a simple animal");
	}
	public static void scream(){
		System.out.println("AAAAAAAAA");
	}
	
}
public class Cat implements Noize {
	@Override
	public make_noize(){
		System.out.println("Meow");
	}	
}
```

> In Java, the default keyword is used in interfaces to define default methods. Default methods were introduced in Java 8 to allow interfaces to have concrete (non-abstract) methods.
>Before Java 8, all methods in interfaces were implicitly abstract, meaning that any class implementing the interface had to provide an implementation for all of its methods. This created issues when a new method needed to be added to an existing interface, as it would break all classes implementing that interface.
   With default methods, interfaces can provide default implementations for methods. Here's how they work:
```Java
interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Stopping the vehicle");
    }
}

// Class implementing Vehicle interface
class Car implements Vehicle {
    // Implementing abstract method
    public void start() {
        System.out.println("Starting the car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Starting the car
        car.stop();  // Output: Stopping the vehicle
    }
}

```

>Also you can use static methods

``` Java
interface Logger {
    // Public static void method
    static void log(String message) {
        System.out.println("Log: " + message);
    }

    // Abstract method
    void write(String message);
}

// Class implementing Logger interface
class ConsoleLogger implements Logger {
    // Implementing abstract method
    public void write(String message) {
        System.out.println("Writing to console: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.write("Hello, world!");
    
        // Calling public static void method
        Logger.log("This is a log message");
    }
}

```

>Variables by default are static final. Methods - public abstract. 
>
>However, starting *from Java 9*, you can include private methods in interfaces to encapsulate common functionality that can be shared among default methods within the interface.
Here's how you can create a *private method* in a Java interface:

```Java
interface ExampleInterface {
    // Public abstract method
    void publicMethod();

    // Default method
    default void defaultMethod() {
        // Call the private method
        privateMethod();
    }

    // Private method
    private void privateMethod() {
        // Implementation of private method
        System.out.println("This is a private method.");
    }
}
```
