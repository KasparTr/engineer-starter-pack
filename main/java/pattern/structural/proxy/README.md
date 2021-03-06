<h3>Proxy Pattern</h3>
<p><i>
Subclass of Structural patterns. They help to define relationships between objects.
In Proxy pattern an object is a proxy to something else and can control it. It allows the creation and access of anything like a large object in memory, file or other resources.
[1]
</i></p>

Provide a surrogate or placeholder for another object to control access to it.
The definition itself is very clear and proxy design pattern is used when we want to provide controlled access of a functionality.

Let’s say we have a class that can run some command on the system. Now if we are using it, its fine but if we want to give this program to a client application, it can have severe issues because client program can issue command to delete some system files or change some settings that you don’t want.
Here a proxy class can be created to provide controlled access of the program.
[2]

<i>Similar to Facade pattern but used for different purposes. Proxy controls access to but doesn't necessaily hide the implementation details of the underlying class it controls.</i> 

Sources:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1572/proxy-design-pattern
