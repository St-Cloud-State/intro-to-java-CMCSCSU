//CSCI 430
//Homework 1
//Question 2

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws IOException{

        LinkedList<Person> currentList = new LinkedList<Person>(); 
        Scanner currentInput = new Scanner(new File("dataFile.txt"));

        System.out.println("Testing Store now: ");
        MyMain.store(currentInput, currentList);
        

        System.out.println("Testing Display now: ");
        MyMain.display(currentList);

        //Find methods

        //Cases that should return something
        System.out.println("Testing Find now: ");
        MyMain.find("1", currentList);
        MyMain.find("2", currentList);
        MyMain.find("3", currentList);
  

        //Cases that shouldn't return anything
        MyMain.find("10", currentList);
        MyMain.find("11", currentList);
        MyMain.find("12", currentList);
     }
}
