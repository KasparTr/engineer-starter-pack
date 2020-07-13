<h3>Decorator Pattern</h3>
<p><i>
Subclass of Structural patterns. They help to define relationships between objects.
</i></p>

The Decorator pattern helps to insert functionality to an object dynamically during the run time.[1]

We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable to all the instances of the class.
We can’t add any new functionality of remove any existing behavior at runtime – this is when Decorator pattern comes into picture.

Suppose we want to implement different kinds of cars – we can create interface Car to define the assemble method and then we can have a Basic car, further more we can extend it to Sports car and Luxury Car.
The inheritance hierarchy will look like this:

    Car -> Basic Car -> Sports Car
                        Luxury Car

But if we want to get a car at runtime that has both the features of sports car and luxury car, then the implementation gets complex and
if further more we want to specify which features should be added first, it gets even more complex.
Now imagine if we have ten different kind of cars, the implementation logic using inheritance and composition will be impossible to manage.

To solve this kind of programming situation, we apply a decorator pattern.

Decorator Design Pattern – Important Points
1) Decorator design pattern is helpful in providing runtime modification abilities and hence creates more flexibility. Its easy to maintain and extend when the number of choices grows.
2) The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
3) Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
[2]

Sources:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
