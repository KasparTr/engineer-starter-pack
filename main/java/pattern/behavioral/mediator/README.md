<h3>Mediator</h3>

<p><i>
Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.
</i></p>
<p>
Pattern for defining cooperation and communication between classes.
<p>
Mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each other. If the objects interact with each other directly, the system components are tightly-coupled with each other that makes higher maintainability cost and not hard to extend. Mediator pattern focuses on provide a mediator between objects for communication and help in implementing lose-coupling between objects.

Air traffic controller is a great example of mediator pattern where the airport control room works as a mediator for communication between different flights. Mediator works as a router between objects and it can have it’s own logic to provide way of communication.

The system objects that communicate each other are called Colleagues. Usually we have an interface or abstract class that provides the contract for communication and then we have concrete implementation of mediators.

For our example, we will try to implement a chat application where users can do group chat. Every user will be identified by it’s name and they can send and receive messages. The message sent by any user should be received by all the other users in the group.</p>
[2]


<i>Similar Patterns: </i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1635/interpreter-design-pattern-java