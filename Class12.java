interface Data {
	public void best();// 判斷那一科成績較高

	public void failed();// 判斷那一科成績低於 60 分
}

interface Test extends Data {
	public void showData();// 顯示學生的資料及平均成績

	public double average();// 計算數學和英文的平均成績
}

class CStu implements Test {
	protected String name;// 姓名
	protected int math;// 數學成績
	protected int english;// 英文成績

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
			System.out.println(name + "的數學比英文好");
		else if (english > math)
			System.out.println(name + "的英文比學好");
		else
			System.out.println(name + "的數學和英文一樣好");
	}

	public void failed() {
		// TODO Auto-generated method stub
		if (math < 60)
			System.out.println(name + "的數學被當掉了");
		if (english < 60)
			System.out.println(name + "的英文被當掉了");
		if (math >= 60 && english >= 60)
			System.out.println(name + "的數學和英文都及格");
	}

	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("姓名:" + name);
		System.out.println("數學成績:" + math);
		System.out.println("英文成績:" + english);
		System.out.println("平均成績:" + average());

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
