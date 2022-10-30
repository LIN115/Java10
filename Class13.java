interface Show_ans {
	public void show();
}

interface Math extends Show_ans {
	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

class Compute implements Math {

	public int ans;

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		ans = a + b;
	}

	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		ans = a - b;
	}

	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		ans = a * b;
	}

	public void div(int a, int b) {
		// TODO Auto-generated method stub
		ans = a / b;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ans=" + ans);
	}
}

public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp = new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}

}
