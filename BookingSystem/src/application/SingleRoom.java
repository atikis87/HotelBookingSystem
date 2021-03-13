package application;

import java.io.Serializable;
import java.util.ArrayList;

public class SingleRoom implements Serializable
{
	private static final long serialVersionUID = 1L;
	String name;
    String contact;
    String gender;   
    ArrayList<Food> food =new ArrayList<>();

   //Constructor 1
    SingleRoom()
    {
        this.name = "";
    }
    
    //Constructor 2
    SingleRoom( String name,String contact,String gender )
    {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}
