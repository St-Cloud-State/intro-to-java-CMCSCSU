//CSCI 430
//Homework 1
//Question 3

import java.io.IOException;


public class Main {
     public static void main(String[] args) throws IOException{


        PersonList currentList = new PersonList();

        System.out.println("Testing Store now: ");
        currentList.store("dataFile.txt");
        

        System.out.println("Testing Display now: ");
        currentList.display();
        

        //Find methods

        //Cases that should return something
        System.out.println("Testing Find now: ");
        currentList.find("1");
        currentList.find("2");
        currentList.find("3");
  

        //Cases that shouldn't return anything

        currentList.find("10");
        currentList.find("11");
        currentList.find("12");
     }
}
