import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonList { //Wrapper for MyMain.class from question 2

    private LinkedList<Person> currentList; //Linked list for person objects
    private Scanner currentInput; //Input stream for file


    public PersonList(){ // Constructor
        this.currentList = new LinkedList<Person>();    
    }

    public void store(String targetFile) throws IOException{
        this.currentInput = new Scanner(new File(targetFile)); //Plug input stream into target file provided.
         MyMain.store(currentInput, currentList);
    }

    public void display() {
         MyMain.display(currentList);
    }

    public void find(String sid) {
         MyMain.find(sid, currentList);
    }






}
