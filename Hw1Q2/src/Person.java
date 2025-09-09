public class Person {

    //Fields
    private String firstName;
    private String lastName;
    private int id;


    //Constructor 
    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //toString

    @Override
    public String toString() {
        return "\nFirst Name: " + this.firstName + "\n" + "Last Name: " + this.lastName + " " + "\nID: " + this.id + " ";
    }

    //Accessor Methods
    
    //Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    //Getters

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getID()
    {
        return this.id;
    }

    


}
