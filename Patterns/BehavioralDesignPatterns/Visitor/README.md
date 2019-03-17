# Diagram Example

## Structure
The Element hierarchy is instrumented with a "universal method adapter". 
The implementation of accept in each Element derived class is always the same. 
But – it cannot be moved to the Element base class and inherited by all derived classes because a reference to this in the Element class always maps to the base type Element.
When the polymorphic firstDispatch method is called on an abstract First object, the concrete type of that object is "recovered". 
When the polymorphic secondDispatch method is called on an abstract Second object, its concrete type is "recovered". The application functionality appropriate for this pair of types can now be exercised.

### Visitor Pattern

![](https://upload.wikimedia.org/wikipedia/en/d/d9/UML_diagram_of_an_example_of_the_Visitor_design_pattern.png)


