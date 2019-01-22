#Creational Design Patterns

Creational design patterns provide solution to __instantiate__ a object in the best possible way for specific situations

## Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of Singleton pattern has always been a controversial topic among developers and it's also considered as an anti-pattern.

### To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.
  - Private constructor to restrict instantiation of the class from other classes.
  - Private static variable of the same class that is the only instance of the class.
  - Public static method that returns the instance of the class, this is the global access point for outer world to get the     instance of the singleton class.
