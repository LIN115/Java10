package Java10;
class Caaa {
	private int num;

	public Caaa() {
		this(2);
	}

	public Caaa(int n) {
		num = n;
	}

	public int get() {
		return num;
	}
}

class Cbbb extends Caaa {
	public void show() {
		System.out.println("num=" + get());
	}
}

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		bb.show();
	}

}
