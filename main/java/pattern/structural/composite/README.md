<h3>Composite Pattern</h3>
<p><i>Subclass of Structural patterns. They help to define relationships between objects.</i></p>

Composite treats a group of objects as a single object and allows to control many of these objects as one.[1]

When we need to create a structure in a way that the objects in the structure has to be treated the same way, we can apply composite design pattern.
Lets understand it with a real life example:

A Diagram is a structure that consists of Objects such as Circle, Lines, Triangle etc.
When we fill the drawing with color (say Red), the same color also gets applied to the Objects in the drawing.
Here drawing is made up of different parts and they all have same operations.

Composite Pattern consists of following objects.

- Base Component – Base component is the interface for all objects in the composition, client program uses base component to work with the objects in the composition. It can be an interface or an abstract class with some methods common to all the objects. In this example, Shape is the base component.
- Leaf – Defines the behaviour for the elements in the composition. It is the building block for the composition and implements base component. It doesn’t have references to other Components. In this example, Triangle is the leaf class. 
- Composite – It consists of leaf elements the implement the operations in base component. In this example, Drawing is the composite class.
[2]


Sources:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1535/composite-design-pattern-in-java
