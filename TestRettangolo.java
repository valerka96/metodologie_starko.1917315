package universita;

public class TestRettangolo extends Rettangolo{
	public TestRettangolo(double x, double y, double altezza, double lunghezza) 
	{
	super(x,y,altezza,lunghezza);
	}
	public static void main(String[] args) {
		
		Rettangolo rettangolo1 = new Rettangolo(0,0,20,10);
		rettangolo1.getDati();
		rettangolo1.trasla(12, 12);
		rettangolo1.getDati();
	}

		
	}
	

