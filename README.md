# BuilderDesignPattern

StringBuilder is based on builder design pattern.

It's a creational design pattern

It there are many parameters in constructor ordering between them cumbersome,
and constructors become big and many constructor are required.
Also if constructir arugument and data type is same it will throw error

If there are 100 fields this pattern is usefull.

Lets say we build the house then -
addDoor
addWindow 
addRoof
AddWalls
Build()

Return type of intermediatory method will be HouseBuilder only and build will
return house object.

For thready safety we can make put everything in one class and make evrything immutable 
Or use AtomicRefernce inside fields in builder class
Or use Thread Local inside builder class
We can use synchronized but it will slow down the performance


