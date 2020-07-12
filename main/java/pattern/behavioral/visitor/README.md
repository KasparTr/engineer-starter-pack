<h3>Visitor</h3>

<p><i>Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.</i></p>
<p>
Visitor pattern allows the developer to add one or more operation  in an object during the run time.<p>
</p>
<p>
Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

For example, think of a Shopping cart where we can add different type of items (Elements). When we click on checkout button, it calculates the total amount to be paid. Now we can have the calculation logic in item classes or we can move out this logic to another class using visitor pattern. Let’s implement this in our example of visitor pattern.
[2]
</p>

<i>Similar Patterns: Uses Composite pattern under Structural patterns</i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1635/interpreter-design-pattern-java