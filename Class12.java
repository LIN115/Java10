interface Data {
	public void best();// �P�_���@�즨�Z����

	public void failed();// �P�_���@�즨�Z�C�� 60 ��
}

interface Test extends Data {
	public void showData();// ��ܾǥͪ���ƤΥ������Z

	public double average();// �p��ƾǩM�^�媺�������Z
}

class CStu implements Test {
	protected String name;// �m�W
	protected int math;// �ƾǦ��Z
	protected int english;// �^�妨�Z

	public CStu(String n, int m, int eng) {
		name = n;
		math = m;
		english = eng;
	}

	public void show() {
		showData();
		best();
		failed();
	}

	public void best() {
		// TODO Auto-generated method stub
		if (math > english)
			System.out.println(name + "���ƾǤ�^��n");
		else if (english > math)
			System.out.println(name + "���^���Ǧn");
		else
			System.out.println(name + "���ƾǩM�^��@�˦n");
	}

	public void failed() {
		// TODO Auto-generated method stub
		if (math < 60)
			System.out.println(name + "���ƾǳQ���F");
		if (english < 60)
			System.out.println(name + "���^��Q���F");
		if (math >= 60 && english >= 60)
			System.out.println(name + "���ƾǩM�^�峣�ή�");
	}

	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("�m�W:" + name);
		System.out.println("�ƾǦ��Z:" + math);
		System.out.println("�^�妨�Z:" + english);
		System.out.println("�������Z:" + average());

	}

	public double average() {
		// TODO Auto-generated method stub
		return (math + english) / 2.0;
	}
}

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu = new CStu("Judy", 85, 91);
		stu.show();
	}

}
