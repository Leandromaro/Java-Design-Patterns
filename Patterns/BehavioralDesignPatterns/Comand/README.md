# Diagram Example

## Command Pattern

![](http://java.dzone.com/sites/all/files/command_pattern.png)

##
Command declares an interface for all commands, providing a simple execute() method which asks the Receiver of the command to carry out an operation. The Receiver has the knowledge of what to do to carry out the request.  The Invoker holds a command and can get the Command to execute a request by calling the execute method. The Client creates ConcreteCommands and sets a Receiver for the command. The ConcreteCommand defines a binding between the action and the receiver. When the Invoker calls execute the ConcreteCommand will run one or more actions on the Receiver.

The following sequence diagram shows the relationship in a clearer way: 


![](http://java.dzone.com/sites/all/files/command_seq.PNG)
