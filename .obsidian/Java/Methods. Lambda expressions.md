## Java’s Access Modifiers | Private. Protected. Public. Final


## 🤔 Static vs Non-static (vars and methods)
> In static you can't just use methods from other classes, you need firstly create an object. Non-static variables cant be accessed from a static methods. 
```Java
public static void main {
	Cat myCat = new Cat();
	myCat.meow();
}
```

### 📒 static blocks


## Method overloading and overriding example

```Java
int max(int x,int y){
///....
}
float max(int x,int y){
///....
}
max(10,15) - int method
max(10.f,5.4f) - float method](<// Animal class (superclass)
class Animal {
    // Method overriding
    void sound() {
        System.out.println("Animals make sounds");
    }
    
    // Method overloading
    void eat() {
        System.out.println("Animals eat food");
    }
    
    void eat(String food) {
        System.out.println("Animals eat " + food);
    }
}

// Cat class (subclass)
class Cat extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("Cat says Meow");
    }
    
    // Method overloading
    void eat() {
        System.out.println("Cats eat");
    }
}
```
## Multiple arguments

```Java
static void show(int ...A)
{
	for (int x:A){
		System.out.println(x);
	}
}
show(1, 3, 10) -> 1 3 10
// Also you can parse here an array 
show(new int[] {1,2,3,4}); -> 1 2 3 4

```

#  Lambda Expressions in Java

#### Introduction to Lambda Expressions

Lambda expressions, introduced in Java 8, represent a powerful feature that brings functional programming capabilities to Java. They enable you to write cleaner, more concise, and more flexible code by allowing you to pass behavior as a method argument. Lambda expressions are essentially anonymous functions, providing a simple and clear way to represent a single-method interface (a functional interface) using an expression.

#### Why Use Lambda Expressions?

1. **Readability**: Lambda expressions can make code easier to read and understand by removing boilerplate code.
2. **Conciseness**: They reduce the amount of code you need to write.
3. **Functional Programming**: Lambdas enable functional programming techniques in Java, allowing for more flexible and reusable code.
4. **Parallel Processing**: They work well with Java Streams, enabling efficient and easy parallel processing.

#### Syntax of Lambda Expressions

The basic syntax of a lambda expression is:

```java
(parameters) -> expression
or
(parameters) -> { statements; }
```
#### Examples of Lambda Expressions

**Example 1: A Simple Lambda Expression**

This example demonstrates a simple lambda expression that takes two integers and returns their sum.

```java
(int a, int b) -> a + b
```

**Example 2: Lambda Expression with No Parameters**

This lambda expression prints a message and does not take any parameters.

```java
() -> System.out.println("Hello, World!")
```

**Example 3: Lambda Expression with a Block of Code**

If the body contains multiple statements, it should be enclosed in braces `{}`.

```java
(int x) -> {
    int y = x * 2;
    return y;
}
```

#### Functional Interfaces

Lambda expressions in Java can be used wherever a functional interface is expected. A functional interface is an interface with a single abstract method. Java 8 provides several built-in functional interfaces in the `java.util.function` package, such as `Predicate`, `Consumer`, `Function`, and `Supplier`.

**Example: Using a Functional Interface**

Here's an example of using the `Predicate` functional interface with a lambda expression.

```java
Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;

// Using the predicate to check if a number is even
boolean result = isEven.test(4);  // result is true
```

#### Lambda Expressions and Collections

Lambda expressions can be particularly useful when working with collections. They can be used with methods from the `Collection` framework like `forEach`, `map`, `filter`, etc.

**Example: Iterating through a List**

```java
List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

// Using a lambda expression with forEach
names.forEach(name -> System.out.println(name));
```

**Example: Filtering a List**

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Using a lambda expression with filter to find even numbers
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
```

#### Method References

Method references are a shorthand notation of a lambda expression to call a method. They use the `::` operator.

**Example: Method Reference**

```java
List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

// Using method reference to print names
names.forEach(System.out::println);
```

#### Exercises

1. Write a lambda expression that takes two `String` arguments and returns their concatenation.
```java
public class Main {
    public static void main(String[] args) {
        // Lambda expression to concatenate two strings
        MyInter c = (a, b) -> a + b;

        // Test the lambda expression
        System.out.println(c.concat("Hel", "lo")); // Output: Hello
    }
}

@FunctionalInterface
interface MyInter {
    String concat(String a, String b);
}
```
2. Use a lambda expression to filter a list of integers and find all numbers greater than 10.
3. Implement a `Comparator` for sorting a list of `Person` objects by their age using a lambda expression.
4. Convert a `for` loop that prints each element of a list into a lambda expression using `forEach`.


---



