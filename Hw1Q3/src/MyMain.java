//For Question 3

import java.util.LinkedList;
import java.util.Scanner;

public class MyMain {
    
    
    
    static void store(Scanner currentInput, LinkedList<Person> questionThreeList)
    {
        while(currentInput.hasNextLine()){ 

            Person currentPerson = new Person(currentInput.nextLine(), currentInput.nextLine(), currentInput.nextInt());
            questionThreeList.add(currentPerson);
            System.out.println(currentPerson.toString() + "\nAdded successfully!");

             if (currentInput.hasNextLine() == false) { //Check if there's more lines to go, if there aren't break here. 
                break;
            }

            currentInput.nextLine(); //Get to the next entry
            currentInput.nextLine();
        }
       
    }

    static void display(LinkedList<Person> questionThreeList)
    {
       questionThreeList.forEach((index) -> { System.out.println(index.toString()); } ); //Writes to output stream
    }


    static int find(String sid, LinkedList<Person> questionThreeList)
    {
        for (Person entry : questionThreeList) {
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
