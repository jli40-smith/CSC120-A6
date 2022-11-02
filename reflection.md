Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Inheritance` affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?

My initial impression of Inheritance is that it made my code a lot less redundant, and also more comprehensible. 
The ability to inherit methods and attributes from superclasses so that subclasses may use them without needing to 
write more lines of code made my program shorter in length-- and thus easier to read, edit, and debug. Additionally,
Inheritance makes the relationship between each of my classes fit into a linear hierarchy, and this makes their connections easier 
to understand and relate to the real world. If a person can understand that a cafe, library, and house are all variations of a building, they can easily see why the classes Cafe, Library, and House all "extend" the class Building. 

Mostly, what worked on this assignment was that I was able to implement the requested attributes and methods for each class without 
too much difficulty. What did not work as well initially was figuring out the README instructions which said to initalize a new 
ArrayList and Hashtable for the Library and House classes. I was confused about how and why one would do this, instead of 
initializing a new Arraylist or Hashtable each time one created a new instance of Library or House. I eventually figured out that it 
removes the need for making those attributes (which all start out as empty objects in all instances of the two classes) another parameter  in the constructor-- which is helpful, as it makes the code more parsimonious. 

For someone taking this class in the future, I would recommend reading the documentation for Hashtables very closely and also to 
perform a lot of tests within the main method of each class to make sure that the methods you implemented are all working 
correctly. 

**References** in-line citations look like: //Source [n]  
[1] https://www.geeksforgeeks.org/how-to-iterate-through-hashtable-in-java/ - used code from here to write the code which iterates through the Hashtable 