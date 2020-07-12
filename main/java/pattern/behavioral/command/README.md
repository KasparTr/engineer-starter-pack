<h3>Command</h3>

<p><i>Subclass of Behavioral patterns used to define the behavior of the objects. It is concerned with the communication between objects.</i></p>
<p>In this pattern an objects is used for encapsulating every information required for performing action or trigger events in future.[1]</p>
<p>In command pattern, the request is send to the invoker and invoker passes it to the encapsulated command object.

Command object passes the request to the appropriate method of Receiver to perform the specific action.

The client program create the receiver object and then attach it to the Command. Then it creates the invoker object and attach the command object to perform an action.

Now when client program executes the action, it’s processed based on the command and receiver object.
</p>[2]

<i>Similar Patterns: Proxy under structural patterns</i>

<b>Sources</b>:

[1] - https://www.ttmind.com/techpost/Design-Patterns-in-Object-Oriented-Programming-OOP
[2] - https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java