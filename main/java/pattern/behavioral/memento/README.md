<h3>Memento</h3>

<p><i>Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.</i></p>
<p>
Memento pattern is required when a certain state of an object needs to saved for later usage.</p>
<p>

Memento design pattern is implemented with two objects – Originator and Caretaker.

<b>Originator</b> is the object whose state needs to be saved and restored and it uses an inner class to save the state of Object. The inner class is called Memento and it’s private, so that it can’t be accessed from other objects.

<b>Caretaker</b> is the helper class that is responsible for storing and restoring the Originator’s state through Memento object. Since Memento is private to Originator, Caretaker can’t access it and it’s stored as an Object within the caretaker.
</p>
[2]

<i>Similar Patterns: </i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1635/interpreter-design-pattern-java