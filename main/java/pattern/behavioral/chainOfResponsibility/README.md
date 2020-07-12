<h3>Chain of responsibility</h3>

<p><i>Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.</i></p>[1]

Chain of responsibility pattern defines a way for passing request between a chain of objects.
Used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

A great example of Chain of Responsibility pattern is ATM Dispense machine. The user enters the amount to be dispensed, and the machine dispense amount in terms of defined currency bills such as 50$, 20$, 10$ etc.

If the user enters an amount that is not multiples of 10, it throws error. We will use Chain of Responsibility pattern to implement this solution. The chain will process the request in the same order as below image.
    
    ATM Dispenser -> Dollar 50 Dispenser -> Dollar 20 Dispenser -> Dollas 10 Dispencer
[2]

<i>Similar Patterns:</i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java