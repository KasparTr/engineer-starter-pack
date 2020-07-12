<h3>Builder Pattern</h3>

<i>Subclass of Creational patterns used to implement and support the creation of objects. It’s all about class instantiation.
Creational pattern can be subdivided into class-creation patterns and object-creational patterns.
Class creational patterns use inheritance effectively in the instantiation process.
Object-creation class use delegation effectively to get the task completed.</i>

Builder Pattern lets subclasses decide which class to instantiate and allows better control over the construction process.
It enables more readable object creation and lets us provide the fields that are specifically required.[1]

Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
<ol>
<li>Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.</li>
<li>Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.</li>
<li>If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods to set the optional parameters. The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.
</ol>

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
[2]

<i>Similar Patterns: structural.factory. This pattern also helps to create complex objects.</i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1425/builder-design-pattern-in-java