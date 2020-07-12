<h3>Bridge Pattern</h3>
<p><i>Subclass of Structural patterns. They help to define relationships between objects.</i></p>

Bridge pattern is used to Decouple an abstraction from its implementation so that the two can vary independently
The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.[2]

<b>Example</b>:

    Shape <interface>
    Color <interface>
    RedColor implements Color
    
    // Implementtion of Shape
    Triangle implements Shape {
        Color color;    //color interface is coupled with Shape implementation! Bridge pattern can fix this.
        
        Triangle(Color color){
            this.color = color;
        }
    }

On the above example, an abstraction (interface) needs to be decoupled from implementation (Triangle).
To achieve this, Bridge pattern is used. 

Sources:
[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1491/bridge-design-pattern-java
