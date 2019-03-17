# Diagram Example

### Interpreter Pattern

![](https://www.baeldung.com/wp-content/uploads/2018/07/Interpreter.png)

### Explanation

Above diagram shows two main entities: the Context and the Expression.

Now, any language needs to be expressed in some way, and the words (expressions) are going to have some meaning based on the given context.

AbstractExpression defines one abstract method which takes the context as a parameter. Thanks to that, each expression will affect the context, change its state and either continue the interpretation or return the result itself.

Therefore, the context is going to be the holder of the global state of processing, and it’s going to be reused during the whole interpretation process.

So what’s the difference between the TerminalExpression and NonTerminalExpression?

A NonTerminalExpression may have one or more other AbstractExpressions associated in it, therefore it can be recursively interpreted. In the end, the process of interpretation has to finish with a TerminalExpression that will return the result.

It’s worth to note that NonTerminalExpression is a composite.

Finally, the role of the client is to create or use an already created abstract syntax tree, which is nothing more than a sentence defined in the created language.




