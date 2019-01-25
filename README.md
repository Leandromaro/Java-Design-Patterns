# Java Design Patterns

Some of the benefits of using design patterns are:

1. Design Patterns are already defined and provides industry standard approach to solve a recurring problem.
2. Using design patterns promotes reusability that leads to more robust and highly maintainable code.
3. Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.

## Table of Contents
  - [Creational Design Patterns](#creational)
    - [Singleton](#singleton)
    - [Factory](#factory-pattern)
    - [Abstract Factory Pattern](#abstract-factory-pattern)
    - [Builder](#builder)
    - [Prototype](#prototype)
  - [Structural Design Patterns](#Structural-Design-Patterns)
    - [Adapter](#adapter-pattern)
    - [Composite](#composite)
 


# Creational Design Patterns

Creational design patterns provide solution to __instantiate__ a object in the best possible way for specific situations

## Singleton
__Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine__. It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of Singleton pattern has always been a controversial topic among developers and it's also considered as an anti-pattern.

#### To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.
  - Private constructor to restrict instantiation of the class from other classes.
  - Private static variable of the same class that is the only instance of the class.
  - Public static method that returns the instance of the class, this is the global access point for outer world to get the     instance of the singleton class.

## Factory Pattern
Factory design pattern __is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class__. This pattern take out the responsibility of instantiation of a class from client program to the factory class. We can apply Singleton pattern on Factory class or make the factory method static.

### Factory Design Pattern Advantages

  - Factory design pattern provides approach to code for interface rather than implementation.
  - Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our    code more robust, less coupled and easy to extend. 
  - Factory pattern provides abstraction between implementation and client classes through inheritance.

### Factory Design Pattern Examples in JDK

java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
valueOf() method in wrapper classes like Boolean, Integer etc.

## Abstract Factory Pattern
Abstract Factory pattern is similar to Factory pattern and it’s factory of factories. This model allows us to create objects that follow a general pattern.

### When to Use Abstract Factory Pattern:

 - The client is independent of how we create and compose the objects in the system
 - The system consists of multiple families of objects, and these families are designed to be used together
 - We need a run-time value to construct a particular dependency

## Builder
Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object. It allows us to write readable, understandable code to set up complex objects.

*The Builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if many of the parameter are optional or of identical type* [Joshua Bloch](https://github.com/jbloch).

## Prototype
Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. __So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs__. This pattern uses __java cloning__ to copy the object.

### When to Use Prototype Design Pattern

It would be easy to understand prototype design pattern with an example. Suppose we have an Object that loads data from database. Now we need to modify this data in our program multiple times, __so it’s not a good idea to create the Object using new keyword__ and load all the data again from database.__The better approach would be to clone the existing object into a new object and then do the data manipulation__.
Prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However whether to use shallow or deep copy of the Object properties depends on the requirements and its a design decision.

# Structural Design Patterns

Structural patterns provide different ways to create a class structure, for example using inheritance and composition to create a large object from small objects.

## Adapter Pattern

Adapter design pattern is one of the structural design pattern and __it’s used so that two unrelated interfaces can work together__. It translate the interface of one class into another interface. This means that we can make classes work together that couldn't otherwise because of incompatible interfaces. The object that joins these unrelated interface is called an __Adapter__. As a real life example, we can think of a mobile charger as an adapter because mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between mobile charging socket and the wall socket.

### Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches (class adapter and object adapter) __however both these approaches produce same result.__
 - Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
 - Object Adapter – This form uses Java Composition and adapter contains the source object.

### Where to use
  - When you want to use an existing class, and its interface does not match the one you need.
  - When you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces.
  - When you want to increase transparency of classes. •When you want to make a pluggable kit.
  
### Usage example
The Java API uses the Adapter pattern, WindowAdapter, ComponentAdapter, ContainerAdapter, FocusAdapter, KeyAdapter, MouseAdapter, MouseMotionAdapter.

## References
This guide has taken some examples from: 
  - [Journaldev](https://www.journaldev.com/1827/java-design-patterns-example-tutorial).
  - [Dzone](https://dzone.com/articles/design-patterns-the-builder-pattern).
  - [Baeldung](https://www.baeldung.com/java-abstract-factory-pattern).




