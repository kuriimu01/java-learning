# Enums

## Introduction

Enums (short for enumerations) in Java are a special type of class that represents a group of constants (unchangeable variables, like `final` variables). Enums are used to define collections of constants that make code more readable and less error-prone by grouping related constants together.

## Defining Enums

Enums are defined using the `enum` keyword. Here is a basic example of defining an enum:

```java
public enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
```

In this example, `Transport` is an enum with five constants: `CAR`, `TRUCK`, `AIRPLANE`, `TRAIN`, and `BOAT`.

## Using Enums

Enums can be used in various ways. Here's a simple example demonstrating how to use an enum:

```java
public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        // Output an enum value
        System.out.println("Value of tp: " + tp);
        System.out.println();

        // Use an enum to control a switch statement
        switch (tp) {
            case CAR:
                System.out.println("A car transports people.");
                break;
            case TRUCK:
                System.out.println("A truck transports goods.");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
```

## Enum Methods

### `values()`

The `values()` method returns an array containing all the constants of the enum type in the order they are declared. This can be used to iterate over the constants.

```java
public class EnumDemo2 {
    public static void main(String[] args) {
        System.out.println("Here are all Transport constants:");

        for (Transport t : Transport.values()) {
            System.out.println(t);
        }
    }
}
```

### `valueOf(String name)`

The `valueOf(String name)` method returns the enum constant of the specified enum type with the specified name.

```java
public class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
```

## Advanced Enum Features

Enums in Java can have fields, constructors, and methods, making them much more powerful than simple collections of constants.

### Enums with Fields and Methods

```java
public enum Transport {
    CAR(120), TRUCK(80), AIRPLANE(600), TRAIN(100), BOAT(30);

    private int speed;

    Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class EnumDemo4 {
    public static void main(String[] args) {
        for (Transport t : Transport.values()) {
            System.out.println(t + " travels at " + t.getSpeed() + " km/h.");
        }
    }
}
```

### Enums with Abstract Methods

Enums can also define abstract methods that must be implemented by each constant.

```java
public enum Operation {
    PLUS {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}

public class EnumDemo5 {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 4.0;

        for (Operation op : Operation.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.apply(x, y));
        }
    }
}
```

## EnumSet and EnumMap

Java provides specialized set and map implementations for enums: `EnumSet` and `EnumMap`.

### EnumSet

`EnumSet` is a specialized `Set` implementation for use with enum types. All elements in an `EnumSet` must come from a single enum type.

```java
import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Transport> transportSet = EnumSet.of(Transport.CAR, Transport.BOAT);

        for (Transport t : transportSet) {
            System.out.println(t);
        }
    }
}
```

### EnumMap

`EnumMap` is a specialized `Map` implementation for use with enum keys.

```java
import java.util.EnumMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Transport, String> transportMap = new EnumMap<>(Transport.class);
        transportMap.put(Transport.CAR, "Ford");
        transportMap.put(Transport.BOAT, "Yamaha");

        for (Transport t : transportMap.keySet()) {
            System.out.println(t + " brand: " + transportMap.get(t));
        }
    }
}
```

## Conclusion

Enums in Java provide a powerful and type-safe way to define collections of constants. They enhance code readability and maintainability by grouping related constants together. Advanced features such as fields, methods, and specialized collections (`EnumSet` and `EnumMap`) make enums a versatile tool in the Java programming language. Understanding how to define and use enums effectively can lead to cleaner and more robust code.

# Annotations 

## Introduction

Annotations in Java provide a powerful way to add metadata to your code. Metadata is information about the code that is not part of the code itself but is used by the compiler, development tools, or runtime environments to perform various tasks such as code generation, validation, and documentation.

Annotations can be applied to various elements of Java code, including classes, methods, variables, parameters, and packages. They are a form of syntactic metadata that can be read and processed by annotation processors at compile-time or runtime.

## Basics of Annotations

Annotations are defined using the `@` symbol followed by the annotation name. Java provides a set of built-in annotations, and developers can also create custom annotations. Some common built-in annotations include `@Override`, `@Deprecated`, and `@SuppressWarnings`.

### Built-in Annotations

1. **@Override**
   Indicates that a method is intended to override a method in a superclass.
   ```java
   @Override
   public String toString() {
       return "Example";
   }
   ```

2. **@Deprecated**
   Marks a method, class, or field as deprecated, indicating that it should no longer be used and may be removed in future versions.
   ```java
   @Deprecated
   public void oldMethod() {
       // Old implementation
   }
   ```

3. **@SuppressWarnings**
   Instructs the compiler to suppress specific warnings for the annotated element.
   ```java
   @SuppressWarnings("unchecked")
   public void useRawTypes() {
       List rawList = new ArrayList();
   }
   ```

### Creating Custom Annotations

Custom annotations can be created using the `@interface` keyword. Here is an example of a custom annotation:

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyCustomAnnotation {
    String value();
    int priority() default 1;
}
```

In this example:
- `@Retention(RetentionPolicy.RUNTIME)` indicates that the annotation will be available at runtime.
- `@Target(ElementType.METHOD)` specifies that the annotation can only be applied to methods.

## Using Custom Annotations

Once a custom annotation is defined, it can be used in the code as follows:

```java
public class AnnotationExample {
    
    @MyCustomAnnotation(value = "Test Method", priority = 5)
    public void annotatedMethod() {
        System.out.println("This method is annotated");
    }
}
```

### Processing Annotations

Annotations can be processed at compile-time using annotation processors or at runtime using reflection.

#### Compile-time Processing

Java provides the `javax.annotation.processing` package for creating annotation processors that can process annotations at compile-time. Here is a basic example:

```java
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("MyCustomAnnotation")
public class MyAnnotationProcessor extends AbstractProcessor {
    
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = element.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Processing: " + element.getSimpleName() + " with value: " + annotation.value());
        }
        return true;
    }
}
```

#### Runtime Processing

Annotations can also be processed at runtime using reflection. Here is an example:

```java
import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) throws Exception {
        Method method = AnnotationExample.class.getMethod("annotatedMethod");

        if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Method: " + method.getName());
            System.out.println("Value: " + annotation.value());
            System.out.println("Priority: " + annotation.priority());
        }
    }
}
```