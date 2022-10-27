package Java10;

class Caaa {
	public int num1;
	public int num2;
}

class Cbbb extends Caaa { //子類別Cbbb
	public void set_sum(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}
}

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		bb.set_sum(5, 10);
		bb.show();
	}

}
