//For Question 2

import java.util.LinkedList;
import java.util.Scanner;

public class MyMain {
    
    
    
    static void store(Scanner currentInput, LinkedList<Person> questionTwoList)
    {
        while(currentInput.hasNextLine()){ 

            Person currentPerson = new Person(currentInput.nextLine(), currentInput.nextLine(), currentInput.nextInt());
            questionTwoList.add(currentPerson);
            System.out.println(currentPerson.toString() + "\nAdded successfully!");

             if (currentInput.hasNextLine() == false) { //Check if there's more lines to go, if there aren't break here. 
                break;
            }

            currentInput.nextLine(); //Get to the next entry
            currentInput.nextLine();
        }
       
    }

    static void display(LinkedList<Person> questionTwoList)
    {
       questionTwoList.forEach((index) -> { System.out.println(index.toString()); } ); //Writes to output stream
    }


    static int find(String sid, LinkedList<Person> questionTwoList)
    {
        for (Person entry : questionTwoList) {
            int currentID = entry.getID(); //Retain ID of the current person.

             if (currentID == Integer.parseInt(sid)) { //Check if this is the target ID

                System.out.println("ID " + sid + " was found!");
                return currentID;
            
            }
    }

    System.out.println("ID " + sid + " was not found!");
    return -1;

    }

}
