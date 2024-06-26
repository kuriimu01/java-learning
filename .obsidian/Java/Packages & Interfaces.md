
## Understanding and Using Packages in Java

---

#### Introduction to Java Packages

In Java, packages are a fundamental organizing structure that helps manage and organize classes and interfaces into namespaces. They serve several key purposes:

1. **Namespace Management**: Packages prevent naming conflicts by grouping related classes and interfaces under a unique namespace.
2. **Access Control**: They provide a way to restrict access to classes and members by encapsulating them within a package.
3. **Modularity**: Packages support the modularization of code, making it easier to maintain and manage.
4. **Reusability**: Classes grouped into packages can be reused across different projects without naming conflicts.

In essence, packages are directories that house Java files. This hierarchical organization facilitates a more manageable and scalable codebase, especially in large projects.

#### Declaring a Package

To declare a package, the `package` keyword is used at the beginning of a Java file, followed by the package name. The package declaration must be the first line in your Java file (excluding comments).

```java
package com.example.myapp;
```

In this example, `com.example.myapp` is the package name. The convention is to use your company's domain name in reverse, ensuring the uniqueness of your package.

#### Default Package

If you do not specify a package, your classes and interfaces belong to the default package. While this is convenient for small applications or simple examples, it's not recommended for real-world applications due to potential naming conflicts and lack of organization.

#### Creating a Package Hierarchy

Java allows you to create a nested hierarchy of packages, giving you the ability to organize your code into sub-packages.

```java
package com.example.myapp.services;
package com.example.myapp.models;
```

Here, `services` and `models` are sub-packages under `com.example.myapp`.

#### Importing Packages

To use a class or interface from another package, you need to import it. This can be done using the `import` keyword:

```java
import java.util.ArrayList;
```

Alternatively, you can import all classes from a package using the wildcard `*`:

```java
import java.util.*;
```

However, it's a best practice to import only the classes you need to avoid namespace pollution and enhance code readability.

#### Access Control and Packages

Java provides different levels of access control:

1. **Public**: Classes, methods, and variables declared public are accessible from any other class.
2. **Protected**: Accessible within the same package and by subclasses.
3. **Default (Package-Private)**: Accessible only within the same package. This is the default if no access modifier is specified.
4. **Private**: Accessible only within the class they are declared.

By grouping classes into packages and using these access levels, you can control the visibility and encapsulation of your classes and members effectively.

#### Creating and Using Packages: A Practical Example

Let's walk through a practical example of creating and using packages.

1. **Create the Directory Structure**

   Organize your project directory to reflect the package structure. For instance, for `com.example.myapp`, you would create:

   ```
   src/
      com/
         example/
            myapp/
               Main.java
               utils/
                  Helper.java
   ```

2. **Declare the Packages**

   In `Main.java`:

   ```java
   package com.example.myapp;

   import com.example.myapp.utils.Helper;

   public class Main {
       public static void main(String[] args) {
           Helper helper = new Helper();
           helper.printMessage("Hello, Java Packages!");
       }
   }
   ```

   In `Helper.java`:

   ```java
   package com.example.myapp.utils;

   public class Helper {
       public void printMessage(String message) {
           System.out.println(message);
       }
   }
   ```

3. **Compile the Packages**

   Navigate to the `src` directory and compile your classes, specifying the output directory for compiled `.class` files:

   ```bash
   javac -d out com/example/myapp/Main.java com/example/myapp/utils/Helper.java
   ```

4. **Run the Application**

   Run the compiled application, specifying the fully qualified name of the `Main` class:

   ```bash
   java -cp out com.example.myapp.Main
   ```

   This should output: `Hello, Java Packages!`

#### Package Naming Conventions

Java package names should follow specific conventions to maintain clarity and prevent conflicts:

1. **Lowercase**: Package names are typically written in lowercase letters.
2. **Reverse Domain Name**: Start with the reverse of your domain name to ensure uniqueness.
3. **Descriptive**: Use meaningful names that describe the functionality or purpose of the package.

#### Java Built-in Packages

Java provides a rich set of built-in packages that cover most of the functionality required for standard applications. Some commonly used packages include:

- `java.lang`: Contains fundamental classes such as `String`, `System`, and `Math`.
- `java.util`: Provides utility classes including collections framework, event model, and date/time facilities.
- `java.io`: Facilitates input and output through data streams, serialization, and file handling.
- `java.net`: Supports networking capabilities such as URL handling and TCP/IP sockets.

#### Summary

Packages are a vital part of Java's architecture. They help organize code into manageable namespaces, prevent naming conflicts, and control access to classes and members. By adhering to naming conventions and best practices, developers can leverage the full potential of packages to create modular, maintainable, and scalable Java applications.

#### Exercises

1. Create a package structure for a simple banking application with packages for `accounts`, `transactions`, and `users`. Implement basic classes in each package.
2. Modify the provided example to include a `Logger` class in a new `utils.logging` package that formats and prints messages.
3. Explore the `java.util` package and write a program that uses `ArrayList`, `HashMap`, and `Date` from this package.

---
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
