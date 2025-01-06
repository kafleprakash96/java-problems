# Java Programming Basics Guide

## Table of Contents
- [Introduction to Java](#introduction-to-java)
- [Data Types](#data-types)
- [Variables and Constants](#variables-and-constants)
- [Control Flow](#control-flow)
- [Object-Oriented Programming Concepts](#object-oriented-programming-concepts)
- [Exception Handling](#exception-handling)

## Introduction to Java
Java is a class-based, object-oriented programming language designed to be platform-independent. Here's a simple Hello World program:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
---
## Data Types
Java provides two main categories of data types: Primitive and Reference.

### Primitive Data Types
Primitive types are the most basic data types in Java, which hold simple values. They are not objects and are directly stored in memory. Below is a list of primitive data types with examples:

| **Data Type**   | **Size**      | **Default Value** | **Range**                                  | **Example**                         |
|------------------|---------------|-------------------|--------------------------------------------|-------------------------------------|
| `byte`          | 8 bits        | 0                 | -128 to 127                                | `byte byteNum = 127;`               |
| `short`         | 16 bits       | 0                 | -32,768 to 32,767                          | `short shortNum = 32767;`           |
| `int`           | 32 bits       | 0                 | -2,147,483,648 to 2,147,483,647            | `int intNum = 2147483647;`          |
| `long`          | 64 bits       | 0L                | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long longNum = 9223372036854775807L;` |
| `float`         | 32 bits       | 0.0f              | 3.4e-038 to 3.4e+038 (approx)              | `float floatNum = 3.14f;`           |
| `double`        | 64 bits       | 0.0               | 1.7e-308 to 1.7e+308 (approx)              | `double doubleNum = 3.14159;`       |
| `boolean`       | 1 bit         | `false`           | true or false                              | `boolean bool = true;`             |
| `char`          | 16 bits       | \u0000            | 0 to 65,535 (Unicode values)               | `char character = 'A';`            |

### Reference Data Types
Reference types store the memory address of objects. These include classes, arrays, interfaces, and strings. Unlike primitive types, reference types can point to `null`.

| **Type**         | **Example**                          | **Description**                                  |
|------------------|--------------------------------------|------------------------------------------------|
| `String`         | `String text = "Hello, Java!";`    | Immutable sequence of characters               |
| Wrapper Classes  | `Integer wrappedInt = 42;`          | Object representation of primitive types        |

---

## Variables and Constants
Variables are used to store data, whereas constants hold fixed values that cannot be modified after initialization.

### Variable Declaration and Initialization

- **Syntax**:
    ```java
    <data_type> <variable_name> = <value>;
    ```
- Example:
    ```java
    int age = 25;  // Variable declaration and initialization
    final double PI = 3.14159;  // Constant
    ```

| **Type**         | **Usage**                                                                 |
|------------------|---------------------------------------------------------------------------|
| Variable         | Stores data that may change during program execution                     |
| Constant         | Defined using `final` keyword; value cannot be modified after assignment |

### Variable Scope
Variables in Java have specific scopes that define their lifetime and accessibility.

| **Scope Type**    | **Defined In**                 | **Accessible From**                           |
|-------------------|-------------------------------|-----------------------------------------------|
| Local Variable    | Method or block               | Only within the method or block              |
| Instance Variable | Class, outside all methods    | Instance of the class                        |
| Class Variable    | Class with `static` modifier  | Shared among all instances of the class      |

- **Example:**
    ```java
    public class ScopeExample {
        private int instanceVar;  // Instance variable
        static int classVar;      // Class variable
        
        public void method() {
            int localVar = 10;    // Local variable
        }
    }
    ```

| **Scope**         | **Advantages**                    | **Disadvantages**            |
|-------------------|----------------------------------|-------------------------------|
| Local Variable    | Memory-efficient, private usage | Limited accessibility         |
| Instance Variable | Maintains state of an object    | Requires an object instance   |
| Class Variable    | Shared data for all objects     | May lead to unintended access |

---


## Control Flow

### Conditional Statements
```java
// if-else statement
if (condition) {
    // code block
} else if (anotherCondition) {
    // code block
} else {
    // code block
}

// switch statement
switch (value) {
    case 1:
        // code block
        break;
    case 2:
        // code block
        break;
    default:
        // code block
}
```

### Loops
```java
// for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// while loop
int j = 0;
while (j < 5) {
    System.out.println(j);
    j++;
}

// do-while loop
int k = 0;
do {
    System.out.println(k);
    k++;
} while (k < 5);

// for-each loop
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```
---
## Object-Oriented Programming Concepts

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data and code: data in the form of fields (often known as attributes or properties), and code in the form of procedures (often known as methods).

### Classes and Objects
A **class** is a blueprint for creating objects. It defines properties (attributes) and behaviors (methods) that the objects created from the class will have. An **object** is an instance of a class.

#### Example:
```java
public class Car {
    // Instance variables
    private String brand;
    private String model;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Methods
    public void startEngine() {
        System.out.println("Engine started!");
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// Creating objects
Car myCar = new Car("Toyota", "Camry");
myCar.startEngine();
```
In this example, the `Car` class has attributes `brand` and `model`. The `startEngine` method simulates starting the car's engine. An object `myCar` is created and initialized using the constructor.

### Inheritance
**Inheritance** is a mechanism where one class (child class) can acquire the properties and behaviors of another class (parent class). This promotes code reusability.

#### Example:
```java
// Parent class
public class Animal {
    protected String name;

    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// Using inheritance
Dog myDog = new Dog();
myDog.bark(); // Outputs: Dog is barking
myDog.eat();  // Outputs: Dog is eating
```
Here, the `Dog` class inherits the `eat` method from the `Animal` class and overrides it to provide specific functionality.

### Interfaces
An **interface** in Java is a reference type that can contain abstract methods, default methods, and static methods. It is used to achieve abstraction and multiple inheritance in Java.

#### Example:
```java
// Interface definition
public interface Drawable {
    void draw();  // Abstract method

    default void display() {  // Default method
        System.out.println("Displaying");
    }
}

// Interface implementation
public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Using the interface
Drawable circle = new Circle();
circle.draw();    // Outputs: Drawing a circle
circle.display(); // Outputs: Displaying
```
In this example, the `Drawable` interface defines a contract that the `Circle` class must follow by implementing the `draw` method.

### Abstract Classes
An **abstract class** is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body) as well as concrete methods (methods with a body). It is used when some methods should be implemented by derived classes while others remain common.

#### Example:
```java
public abstract class Shape {
    abstract double calculateArea();  // Abstract method

    public void display() {  // Concrete method
        System.out.println("This is a shape");
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

// Using the abstract class
Rectangle rect = new Rectangle(5.0, 3.0);
System.out.println("Area: " + rect.calculateArea()); // Outputs: Area: 15.0
rect.display(); // Outputs: This is a shape
```
In this example, the `Shape` abstract class provides a template. The `Rectangle` class implements the `calculateArea` method and inherits the `display` method.

### Key Differences Between Abstract Classes and Interfaces
| Feature                    | Abstract Class                            | Interface                              |
|----------------------------|-------------------------------------------|----------------------------------------|
| Inheritance                | Can extend one class                     | Can implement multiple interfaces      |
| Methods                    | Can have both abstract and concrete methods | Methods are abstract by default (except `default` and `static`) |
| Fields                     | Can have instance variables              | Can only have constants (static final) |

### Summary
- **Classes and Objects:** Fundamental building blocks; classes define the blueprint, objects are instances.
- **Inheritance:** Allows code reuse and method overriding.
- **Interfaces:** Define a contract for classes to implement; support multiple inheritance.
- **Abstract Classes:** Provide a base for other classes, mixing concrete and abstract methods.

These concepts form the core of OOP in Java, enabling developers to create scalable, maintainable, and reusable code.



## Arrays and Collections

This section covers two fundamental concepts in Java: **Arrays** and the **Collections Framework**. Arrays provide a way to store fixed-size sequential data, while the Collections Framework offers dynamic and flexible data structures to manage objects efficiently.

---

## **Arrays**

### **What is an Array?**
An array in Java is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its size cannot be changed.

### **Array Declaration and Initialization**

#### **Single-Dimensional Array**
```java
// Array declaration and initialization
int[] numbers = new int[5]; // Declare an array with 5 elements
int[] initialized = {1, 2, 3, 4, 5}; // Initialize with values
```

#### **Multi-Dimensional Array**
```java
// Multi-dimensional array (2D array)
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements in a 2D array
System.out.println(matrix[0][1]); // Outputs: 2
```

### **Key Operations with Arrays**
- **Iteration**: Use loops to traverse arrays.
- **Access Elements**: Access using the index (0-based).
- **Limitations**: Fixed size, no built-in methods for adding/removing elements.

### **Example: Iterating Over an Array**
```java
int[] numbers = {10, 20, 30, 40, 50};

// Using a for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Using an enhanced for loop
for (int number : numbers) {
    System.out.println(number);
}
```

---

## **Collections Framework**

The Collections Framework provides a set of classes and interfaces for managing groups of objects. It includes dynamic data structures such as lists, sets, maps, and queues.

### **Key Advantages of Collections over Arrays**
1. Dynamic sizing: Collections can grow or shrink as needed.
2. Built-in utility methods for operations like sorting and searching.
3. Heterogeneous storage (e.g., `List<Object>`).

### **Commonly Used Collections**

#### **ArrayList**
A resizable array that allows duplicate elements and maintains the order of insertion.
```java
import java.util.ArrayList;
import java.util.List;

List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Apple"); // Duplicates are allowed

System.out.println(list); // Output: [Apple, Banana, Apple]
```

#### **HashMap**
A key-value pair-based collection that does not guarantee order.
```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
map.put("Three", 3);

System.out.println(map.get("Two")); // Output: 2
```

#### **HashSet**
A collection that stores unique elements and does not maintain insertion order.
```java
import java.util.HashSet;
import java.util.Set;

Set<String> set = new HashSet<>();
set.add("Unique");
set.add("Values");
set.add("Unique"); // Duplicate ignored

System.out.println(set); // Output: [Unique, Values] (order may vary)
```

---

## **When to Use Arrays vs Collections**

| **Aspect**         | **Arrays**                           | **Collections**                    |
|---------------------|--------------------------------------|-------------------------------------|
| **Size**           | Fixed                               | Dynamic                            |
| **Performance**    | Faster for fixed-size data          | Slightly slower due to overhead    |
| **Features**       | Simple, less flexible               | Rich APIs, flexible                |
| **Usage**          | Suitable for primitive types or simple structures | Preferred for complex data manipulations |

- **Arrays**: Use when you need a fixed-size structure to store elements of the same type.
- **Collections Framework**: Use for dynamic and flexible data structures with built-in utility methods.

---
## Exception Handling
Exception handling in Java is a mechanism to handle runtime errors, ensuring the normal flow of the application. By using exception handling, you can gracefully manage errors and recover from unexpected situations, preventing application crashes.


## Key Components
1. **Try-Catch Block**
    - The `try` block contains code that may throw an exception.
    - The `catch` block catches and handles the exception.
    - Multiple `catch` blocks can be used to handle different types of exceptions.

2. **Finally Block**
    - The `finally` block is optional and contains cleanup code that is always executed, regardless of whether an exception was thrown or not.

3. **Throw Keyword**
    - Used to explicitly throw an exception.

4. **Throws Keyword**
    - Declares exceptions that a method can throw.

5. **Custom Exceptions**
    - You can create your own exceptions by extending the `Exception` class.



### Basic Try-Catch Block
```java
try {
    // Code that might throw an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Handle specific exception
    System.out.println("Cannot divide by zero!");
} catch (Exception e) {
    // Handle general exceptions
    System.out.println("An error occurred!");
} finally {
    // Always executed
    System.out.println("Cleanup code");
}
```
**Try Block**: Contains the line `int result = 10 / 0;` which throws an `ArithmeticException` because division by zero is undefined.

**Catch Blocks**:
    - The first `catch` block catches `ArithmeticException` and prints a specific error message.
    - The second `catch` block catches any other exception types, acting as a fallback.

**Finally Block**: Ensures the cleanup code runs whether an exception occurs or not.

### Output
```
Cannot divide by zero!
Cleanup code
```

---

### Custom Exception
Custom exceptions allow you to define your own error conditions.

```java
// Define a custom exception
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        }
        System.out.println("Valid age.");
    }
}
```

### Explanation
1. **Custom Exception Class**:
    - The `CustomException` class extends `Exception`.
    - It includes a constructor to pass a custom error message.

2. **Using Custom Exceptions**:
    - The `validateAge` method checks if the age is below 18.
    - If true, it throws a `CustomException` with a specific message.

3. **Catching Custom Exceptions**:
    - In the `main` method, the `CustomException` is caught and its message is printed.

### Output
```
Custom Exception: Age must be 18 or older.
```

---

## Best Practices for Exception Handling
1. **Catch Specific Exceptions**: Always catch the most specific exceptions first to handle them appropriately.
2. **Avoid Catch-All Blocks**: Use general `catch (Exception e)` only when absolutely necessary.
3. **Clean Resources in Finally**: Use the `finally` block to close files, connections, or other resources.
4. **Log Exceptions**: Log exceptions for debugging instead of just printing them to the console.
5. **Do Not Suppress Exceptions**: Avoid empty catch blocks as they make debugging harder.
6. **Custom Exceptions**: Use custom exceptions for business logic errors to improve code readability.

