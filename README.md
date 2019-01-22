# Java Design Patterns

Some of the benefits of using design patterns are:

Design Patterns are already defined and provides industry standard approach to solve a recurring problem, so it saves time if we sensibly use the design pattern. There are many java design patterns that we can use in our java based projects.
Using design patterns promotes reusability that leads to more robust and highly maintainable code. It helps in reducing total cost of ownership (TCO) of the software product.
Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.


#### Index

1. [Singleton](##Singleton)


# Creational Design Patterns

Creational design patterns provide solution to __instantiate__ a object in the best possible way for specific situations

## Singleton
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of Singleton pattern has always been a controversial topic among developers and it's also considered as an anti-pattern.

#### To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.
  - Private constructor to restrict instantiation of the class from other classes.
  - Private static variable of the same class that is the only instance of the class.
  - Public static method that returns the instance of the class, this is the global access point for outer world to get the     instance of the singleton class.




This guide has taken some examples from [Journaldev](https://www.journaldev.com/1827/java-design-patterns-example-tutorial#singleton-pattern).
