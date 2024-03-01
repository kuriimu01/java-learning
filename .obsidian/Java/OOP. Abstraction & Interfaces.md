To support the principles of object-oriented programming, all OOP languages, including Java, have three traits in common: encapsulation, polymorphism, and inheritance. Let’s examine each.
## Encapsulation

> *Encapsulation* is a programming mechanism that binds together code and the data it manipulates, and that keeps both safe from outside interference and misuse. In an object-oriented language, code and data can be bound together in such a way that a self-contained black box is created. Within the box are all necessary data and code. When code and data are linked together in this fashion, an object is created. In other words, *an object is the device that supports encapsulation.* 

Within an object, code, data, or both may be private to that object or public. Private code or data is known to and accessible by only another part of the object. That is, private code or data cannot be accessed by a piece of the program that exists outside the object. When code or data is public, other parts of your program can access it even though it is defined within an object. Typically, the public parts of an object are used to provide a controlled interface to the private elements of the object. 

Java’s basic unit of encapsulation is the class. Although the class will be examined in great detail later in this book, the following brief discussion will be helpful now. A class defines the form of an object. It specifies both the data and the code that will operate on that data. Java uses a class specification to construct objects. Objects are instances of a class. Thus, a class is essentially a set of plans that specify how to build an object. 

The code and data that constitute a class are called *members of the class.* Specifically, the data defined by the class are referred to as member variables or instance variables. The code that operates on that data is referred to as member methods or just methods. Method is Java’s term for a subroutine. 

## Polymorphism

>*Polymorphism* (from Greek, meaning “many forms”) is the quality that allows one interface to access a general class of actions. The specific action is determined by the exact nature of the situation. A simple example of polymorphism is found in the steering wheel of an automobile. The steering wheel (i.e., the interface) is the same no matter what type of actual steering mechanism is used. That is, the steering wheel works the same whether your car has manual steering, power steering, or rack-and-pinion steering. Therefore, once you know how to operate the steering wheel, you can drive any type of car. 

The same principle can also apply to programming. For example, consider a stack (which is a first-in, last-out list). You might have a program that requires three different types of stacks. One stack is used for integer values, one for floating-point values, and one for characters. In this case, the algorithm that implements each stack is the same, even though the data being stored differs. In a non-object-oriented language, you would be required to create three different sets of stack routines, with each set using different names. However, because of polymorphism, in Java you can create one general set of stack routines that works for all three specific situations. This way, once you know how to use one stack, you can use them all. 

More generally, the concept of polymorphism is often expressed by the phrase “one interface, multiple methods.” This means that it is possible to design a generic interface to a group of related activities. Polymorphism helps reduce complexity by allowing the same interface to be used to specify a general class of action. It is the compiler’s job to select the specific action (i.e., method) as it applies to each situation. You, the programmer, don’t need to do this selection manually. You need only remember and utilize the general interface.

```Java
// Polymorphism in Java allows objects of different classes to be treated as objects of a common superclass.

// Animal class (superclass)
class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Cat class (subclass)
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat(); // Polymorphism: Cat object treated as Animal

        animal.sound(); // Outputs: Animals make sounds
        cat.sound();    // Outputs: Meow
    }
}

```
## Inheritance

>*Inheritance* is the process by which one object can acquire the properties of another object. This is important because it supports the concept of hierarchical classification. If you think about it, most knowledge is made manageable by hierarchical classifications. 

For example, a Red Delicious apple is part of the classification apple, which in turn is part of the fruit class, which is under the larger class food. That is, the food class possesses certain qualities (edible, nutritious, etc.) which also, logically, apply to its subclass, fruit. In addition to these qualities, the fruit class has specific characteristics (juicy, sweet, etc.) that distinguish it from other food. The apple class defines those qualities specific to an apple (grows on trees, not tropical, etc.). A Red Delicious apple would, in turn, inherit all the qualities of all preceding classes, and would define only those qualities that make it unique. Without the use of hierarchies, each object would have to explicitly define all of its characteristics. 

Using inheritance, an object need only define those qualities that make it unique within its class. It can inherit its general attributes from its parent. Thus, it is the inheritance mechanism that makes it possible for one object to be a specific instance of a more general case

```Java
inheritance example
public class area{
	public static void main(String[] args){
		System.out.println("area");
	}
} 
class Main extends area{
	area();
}](<class Area{
    public static void area(){
        System.out.println("area");
    }
}
class Main extends Area{
    public static void main(String[] args) {
        area();
    }
}

// It will print the area.
```

>*Constructor* - method, that has a same name with class, did not has a type specification, and automatically called whenever object is created.

## What is a Class?

> *Class* is a set of plans that specify how to build an object. A class is a logical abstraction. It is not until an object of that class has been created that a physical representation of that class exists in memory. Recall that the methods and variables that constitute a class are called *members of the class*. The data members are also referred to as *instance variables*.

Objects are instances of a class. When u use `new` keyword, you creating an *instance* of a class
## 🤔 this vs super
### super
Use super when you want to use method from extended file, and overrided it in this file.  Super is parent class.

```Java
// All clases in different files!

public class Animals {  
    int age;  
    String name;  
    
    public Animals(int age, String name) { //Constructor, same name as file
	    this.age=age;
	    this.name=name;
    }  
    public void makeNoise(){  
        System.out.println("I'm an animal!");  
    }  
    public void eat(){  
        System.out.println("eating");  
    }  
}

public class Cat extends Animals {  
	String food;
    public Cat(int age, String name, String food){
	    super(age, name); // Can be used only in constructor
	    this.food=food;
    }
    @Override  
    public void  makeNoise(){  
        super.makeNoise();  
        System.out.println("meow meow");  
    }  
}

class Main {  
    public static void main(String[] args) {  
        Cat myCat = new Cat(3, "Aprilya", "Meat");  
        myCat.makeNoise();  
    }  
}

//But you cant use super in. for example Main class, because it doesnt extended parent class.
```

### this
	Useful for getters and setters

```Java
public class Dog {
	private String name;
	private int age;

	public Dog() {
	// Has to be the very first line of a constructor. Will be used if there is no args
	this("Deffault name", 0);
	}
	
	public Dog(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getAge(){
		return this.age;
	}
}

class Main {  
    public static void main(String[] args) {  
        Dog myDog = new Dog();
        myDog.setName("Patron");
        System.out.println(myDog.getName());  
    }  
}
```

## Abstract classes & methods

> Abstract method can't be in a non abstract class. But if you extend an abstract class into concrete subclass, you need to override it, or make it fully abstract.

``` Java
// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void makeSound();
}

// Concrete subclass
class Cat extends Animal {
    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound(); // Output: Meow
        dog.makeSound(); // Output: Woof
    }
}


```

## Interfaces
var's by default are static final here
methods by default public abstract
