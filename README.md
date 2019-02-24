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
    - [Flyweight](#flyweight-pattern)
    - [Facade](#facade)
    - [Bridge](#bridge)
    - [Proxy](#proxy)
    - [Decorator](#decorator)


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

## Composite
The Composite pattern helps you to create tree structures of objects without the need to force clients to differentiate between branches and leaves regarding usage.
Composite design patten allows you to have a tree structure and ask each node in the tree structure to perform a task. You can take real life example of a organization. It have general managers and under general managers, there can be managers and  under managers there can be developers.

As described by Gof:

> Compose objects into tree structure to represent part-whole hierarchies. __Composite lets client treat individual objects and compositions of objects uniformly__.

### Where to use
Use the Composite pattern when

 - When you want to represent part-whole hierarchies of objects
 - When you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly.
 
## Flyweight Pattern
This pattern is used to reduce the memory footprint. It can also improve performance in applications where object instantiation is expensive.

Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them after creation. Each time an object is requested, the factory looks up the object in order to check if it’s already been created. If it has, the existing object is returned – otherwise, a new one is created, stored and then returned.

The flyweight object’s state is made up of an invariant component shared with other similar objects (intrinsic) and a variant component which can be manipulated by the client code (extrinsic).

### When to use
  - The number of Objects to be created by application should be huge.
  - The object creation is heavy on memory and it can be time consuming too.
  - The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program.

__It’s very important that the flyweight objects are immutable: any operation on the state must be performed by the factory.__


## Facade
According to GoF Facade design pattern is:

> Provide a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use.

__A facade encapsulates a complex subsystem behind a simple interface__. It hides much of the complexity and makes the subsystem easy to use.

Also, if we need to use the complex subsystem directly, we still can do that; we aren’t forced to use the facade all the time.

Besides a much simpler interface, there’s one more benefit of using this design pattern. __It decouples a client implementation from the complex subsystem__. Thanks to this, we can make changes to the existing subsystem and don’t affect a client.

### Where to use
 - Facade design pattern is more like a helper for client applications, it doesn’t hide subsystem interfaces from the client. Whether to use Facade or not is completely dependent on client code.
 - Facade design pattern can be applied at any point of development, usually when the number of interfaces grow and system gets complex.
 - Subsystem interfaces are not aware of Facade and they shouldn’t have any reference of the Facade interface.
 - Facade design pattern should be applied for similar kind of interfaces, its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
 - We can use Factory pattern with Facade to provide better interface to client systems.

## Bridge
Bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client programs.

According to GoF bridge design pattern is:

> Decouple an abstraction from its implementation so that the two can vary independently

When there are inheritance hierarchies in both interface and implementation then you loose coupling because of interdependence. In other words, Decoupling interface from implementation and hiding implementation detail of abstraction from client is main objectives of bridge design pattern.

The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.

### Where to use
 - Bridge design pattern can be used when both abstraction and implementation can have different hierarchies independently and we want to hide the implementation from the client application.
 - Abstraction and implementation should be bound at compile time.
 - Both abstraction and implementation can have different hierarchies independently. You want to extend both hierarchies by subclassing.
 - Changes in implementation should have no impact on abstraction.
 - If you want to hide implementation of abstraction from client.
 - Best use when you have multiple implementation.

## Proxy
According to GoF Proxy design pattern is:

>Provide a surrogate or placeholder for another object to control access to it. 

The definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.

### Where to use
Proxy design pattern common uses are to control access or to provide a wrapper implementation for better performance.
Java RMI package uses proxy pattern. That’s all for proxy design pattern in java.

## Decorator
Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior. 
We use inheritance or composition to extend the behavior of an object but this is done at compile time and it’s applicable to all the instances of the class. We can’t add any new functionality of remove any existing behavior at runtime – this is when Decorator pattern comes into picture

### Where to use
 - Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. Its easy to maintain and extend when the number of choices are more.
 - The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
 - Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 
 ## Behavioral patterns 
Behavioral patterns provide solution for the better interaction between objects and how to provide lose coupling and flexibility to extend easily

## References
This guide has taken some examples from: 
  - [Journaldev](https://www.journaldev.com/1827/java-design-patterns-example-tutorial).
  - [Dzone](https://dzone.com/articles/design-patterns-the-builder-pattern).
  - [Baeldung](https://www.baeldung.com/java-abstract-factory-pattern).
