package Java10;

interface iVolume {
	public void showData();

	public double vol();
}

abstract class CSphere implements iVolume {
	final double PI = 3.14;
	protected int x;
	protected int y;
}

class CCircle extends CSphere {
	protected int radius;

	public CCircle(int a, int b, int r) {
		x = a;
		y = b;
		radius = r;
	}

	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("²y¤ß;(" + x + "," + y + ")");
		System.out.println("¥b®|:" + radius);
		System.out.println("²yÅé¿n:" + vol());
	}

	public double vol() {
		return ((4.0 / 3) * PI * radius * radius*radius);
	}
}

public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir = new CCircle(8, 6, 2);
		cir.showData();
	}

}
