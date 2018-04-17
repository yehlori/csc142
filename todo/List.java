/*
* @author: Lori Yeh
* @version: todolist doc
*/

// import map object; where we will store everything
import java.util.*;
//class blueprints for List objects
public class List{
    // creating variable length for class List; instruction for the blueprint
    public int length;
    // creating variable name for class List;
    public String name;
    // in order to get ToDo object,
    private Map<String, String> ToDo;

    // contructor function; creates a new instance of this object
    public List(String listName){
        this.name = listName;
        this.length = 0;
        this.ToDo = new HashMap<String, String>();
    }

    public void addItem(String itemName, String description){
        // Add Item to map
        ToDo.put(itemName, description);
        this.length++;
    }

    public void deleteItem(){
        // Add Some code
    }
}
