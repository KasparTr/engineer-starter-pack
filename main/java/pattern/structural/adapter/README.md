<h3>Adapter Pattern</h3>
<p><i>
Subclass of Structural patterns. They help to define relationships between objects.[1]
</i></p>

Adapter works between two independent and incompatible interfaces by converting the interface into another interface client expect.
It does so by wrapping an existing class with a new interface so that it becomes compatible with the client’s interface.

<b>Examples</b>:
<p><i>Shape</i> interface is proprietary solution. Circle and Rectangle both implement that and its working well with many dependencies in the project.
<i>GeometricShape</i> was added to the project as an open source dependency. Its very similar to Shape but incompatible with our Drawing class.
Drawing client class can work only with Shape and not GeometricShape. This makes GeometricShape incompatible with our Drawing class. 
See the addShape() and getShapes() method of Drawing class:</p>

<b>Bad options:</b>
1) We change our code and we change/remove our Shape interface and start using the  GeometricShape interface. Or, we can convert the GeometricShape interface into our  Shape interface, if its open source and changes are minimal. But, it's not always possible because of other functionality and code dependency.
2) Continuing with what we are coding, should we not use the ready-to-use code/APIs?

<b>Good option</b>

All we need to have here is an adapter, which makes this ready-to-use code compatible with our code and the  Drawing class.

Now, when we are clear on why we need the adapter, let's take a closer look at what the adapter actually does. Before we start, below is the list of classes/objects used in the adapter pattern:

- Target: This defines the domain-specific interface that the client uses. This is the Shape interface in our example.
- Adaptee: This defines an existing interface that needs adapting. This is the GeometricShape interface in our example.
- Adapter: This adapts the interface from the adaptee to the target interface.
- Client: This collaborates with objects conforming to the Target interface. The Drawing class is the client in our example.
[2]

<b>Sources</b>:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://dzone.com/articles/adapter-design-pattern-in-java