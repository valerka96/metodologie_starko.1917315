package universita;

public class Rettangolo {
	public double x, y, lunghezza, altezza;
	public Rettangolo(double x, double y, double lunghezza, double altezza) {
		this.x = x;
		this.y = y;
		this.altezza = altezza;
		this.lunghezza = lunghezza;
	}
	public void trasla(int x, int y) {
		this.x += x;
		this.y += y;
		this.altezza += y;
		this.lunghezza += x;
	}
	
	public void getDati() {
		double x1 = this.x;
		double y1 = this.altezza;
		double x2 = this.lunghezza;
		double y2 = this.y;
		System.out.println((x1+","+y1)+" -> "+(x2+","+y2));
		
	}

}
