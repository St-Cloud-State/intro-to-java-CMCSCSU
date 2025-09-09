## CSCI 430, Homework 1

### Question 2 Folder

1. Create a data type [Person](Hw1Q2\src\Person.java) with three string fields: firstName, lastname and id. The field
id is unique to each person. Add accessor methods, a constructor with three parameters, and the toString()\) method.

2. Create a class [MyMain](Hw1Q2\src\MyMain.java) for the main program. Within the main() program, instantiate a linked
list (use the Java LinkedList class) . Add the following functions(methods) (static methods
within the class MyMain) that the main program will invoke:

- store(<input stream\>, <linked list\>) that reads the data for several persons from the input stream and stores the data in the linked list.

- display(<output stream\>, <linked list\>) that writes the data for all person objects in the linked list, on the output stream, one per line.

-  find(string sid, <linked list\>) that returns the index of the person object in the linked list, that has the same id value as sid (return -1 if no such person exists). This
can be done as a simple search that goes sequentially through all the objects in the linked list.

- Create a [data file](Hw1Q2\dataFile.txt) with data for a few person objects.
- In the [main ](Hw1Q2\src\Main.java)method, call the store() and display() methods to read the data and
display it. Invoke the find method a few times. Compile and test your code.



### Question 3 Folder


3. Construct a different version of the above program as follows:
- (1.) create a data type [PersonList](Hw1Q3\src\PersonList.java) that uses the Java LinkedList, and supports the opera-
tions from Question 2.
- (2) instantiate the PersonList object in the [main](Hw1Q3\src\Main.java) program and invoke its methods (as per
the appropriate syntax), so that program produces the same output.


For this question, I decided to implement [PersonList](Hw1Q3\src\PersonList.java) as a wrapper of [MyMain](Hw1Q3\src\MyMain.java).
