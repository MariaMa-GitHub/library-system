import java.util.ArrayList;

// person class
public class Person {
    
    // limit for borrowing
    final short MAX_POSSESSIONS = 3;
    
    // person's personal info
    String name;
    short age;
    int cardNum;
    ArrayList<Media> possessions;
    
    // default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.cardNum = 0;
        this.possessions = new ArrayList<Media>();
    }
    // 2-parameter constructor (name and age)
    public Person(String name, short age) {
        this.name = name;
        this.age = age;
        this.cardNum = Library.totalUsers++;
        this.possessions = new ArrayList<Media>();
    }
    
    // get a list of all the items that the person has borrowed
    public String getPossessionList() {
        String itemList = "";
        for (Media item : possessions) {
            itemList += item.title + ", ";
        }
        return (itemList + " ").replace(",  ", "");
    }
    
    // output information about person
    public String toString() {
        return String.format("Information about %s:\n\n- Age: %d\n- Library Card Number: %d\n- Possessions: %s", this.name,
        this.age, this.cardNum, getPossessionList());
    }
}
