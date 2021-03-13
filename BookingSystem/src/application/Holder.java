package application;

import java.io.Serializable;

public class Holder implements Serializable
{
	private static final long serialVersionUID = 1L;
	DoubleRoom luxury_doubleroom[] = new DoubleRoom[10]; 
    DoubleRoom deluxe_doubleroom[] = new DoubleRoom[20]; 
    SingleRoom luxury_singleroom[] = new SingleRoom[10]; 
    SingleRoom deluxe_singleroom[] = new SingleRoom[20];
}
