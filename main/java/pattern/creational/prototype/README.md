<h3>Prototype Pattern</h3>
<p><i>Subclass of Creational patterns used to implement and support the creation of objects. It’s all about class instantiation.
Creational pattern can be subdivided into class-creation patterns and object-creational patterns.
Class creational patterns use inheritance effectively in the instantiation process.
Object-creation class use delegation effectively to get the task completed.</i></p>

<p>Keywords: <strong>cloning, deep copy, light copy</strong></p>

Prototype pattern uses the clone method to duplicate existing instances to be used as a prototype instance for creating new objects.
This method is used when the new instance is expensive to create and the required objects are similar to existing objects.[1]

It would be easy to understand prototype design pattern with an example.

Suppose we have an Object that loads data from database. Now we need to modify this data in our program multiple times, so it’s not a good idea to create the Object using new keyword and load all the data again from database.
The better approach would be to clone the existing object into a new object and then do the data manipulation.
Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
*It should not be done by any other class*.
However whether to use shallow or deep copy of the Object properties depends on the requirements and its a design decision. [2]

<i>Similar Patterns: structural.flyweight. This pattern also reuses objects to save  resources on expensive operations.</i>

<b>Sources</b>:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1440/prototype-design-pattern-in-java
