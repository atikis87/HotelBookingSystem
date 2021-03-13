package application;

import java.io.Serializable;

public class Food implements Serializable
{
	private static final long serialVersionUID = 1L;
	float price;
	int itemNo;
    int quantity;
    
    //Constructor
    Food( int itemNo,int quantity )
    {
        this.itemNo = itemNo;
        this.quantity = quantity;
        switch( itemNo )
        {
            case 1: price = quantity*90;
                break;
            case 2: price = quantity*60;
                break;
            case 3: price = quantity*70;
                break;
            case 4: price = quantity*20;
                break;
        }
    }
}
