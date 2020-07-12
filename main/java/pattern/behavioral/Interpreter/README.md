<h3>Interpreter</h3>

<p><i>Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.</i></p>
<p>Interpreter pattern defines a representation for the grammar providing a way to include language attributes in the program.[1]</p>
<p>
The best example of interpreter design pattern is java compiler that interprets the java source code into byte code that is understandable by JVM. Google Translator is also an example of interpreter pattern where the input can be in any language and we can get the output interpreted in another language.
</p>

Example:

To implement interpreter pattern, we need to create Interpreter context engine that will do the interpretation work.

Then we need to create different Expression implementations that will consume the functionalities provided by the interpreter context.

Finally we need to create the client that will take the input from user and decide which Expression to use and then generate output for the user.

Let’s understand this with an example where the user input will be of two forms – “<Number> in Binary” or “<Number> in Hexadecimal.” Our interpreter client should return it in format “<Number> in Binary= <Number_Binary_String>” and “<Number> in Hexadecimal= <Number_Binary_String>” respectively.

Our first step will be to write the Interpreter context class that will do the actual interpretation.
[2]


<i>Similar Patterns: </i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1635/interpreter-design-pattern-java