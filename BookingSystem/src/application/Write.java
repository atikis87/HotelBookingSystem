package application;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Write implements Runnable
{
	    Holder hotel_ob;
	    Write(Holder hotel_ob)
	    {
	        this.hotel_ob = hotel_ob;
	    }
	    @Override
	    public void run() 
	    {
	        try{
	        FileOutputStream fout = new FileOutputStream("src/backup/booking.txt"); //specify the save path 
	        ObjectOutputStream oos = new ObjectOutputStream(fout);
	        oos.writeObject(hotel_ob);
	        oos.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println("Error in writing " + e);
	        }         
	        
	    }
	    
}
