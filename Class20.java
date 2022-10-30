package Java10;
class CRectangle {
	protected int length;
	protected int width;

	public CRectangle(int l, int w) {
		length = l;
		width = w;
	}

	public String toString() {
		String str = "length=" + length + ",width=" + width;
		str += ",area=" + length * width;
		return str;
	}

	public String toString(int a, int b) {
		if (a >= b)
			return super.toString();
		else
			return "Argument Error";
	}
}

public class Class20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rect = new CRectangle(2, 6);
		System.out.println(rect.toString());
		System.out.println(rect.toString(8, 4));
		System.out.println(rect.toString(3, 5));
	}

}
