# Diagram Example

## Discussion
   The State pattern is a solution to the problem of how to make behavior depend on state.
   - Define a "context" class to present a single interface to the outside world.
   - Define a State abstract base class.
   - Represent the different "states" of the state machine as derived
   classes of the State base class.
   - Define state-specific behavior in the appropriate State derived classes.
   - Maintain a pointer to the current "state" in the "context" class.
   - To change the state of the state machine, change the current
   "state" pointer.
   
   The State pattern does not specify where the state transitions will be defined. The choices are two: the "context" object, or each individual State derived class. The advantage of the latter option is ease of adding new State derived classes. The disadvantage is each State derived class has knowledge of (coupling to) its siblings, which introduces dependencies between subclasses.
### State Pattern

![](https://www.programcreek.com/wp-content/uploads/2011/07/state-pattern-class-diagram.jpg)


