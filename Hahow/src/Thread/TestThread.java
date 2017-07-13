package Thread;

public class TestThread extends Thread{//可以用繼承的方式,但因為只能繼承一個故建議用十座介面的方式
	private String name;
	public TestThread(String name) {//建構子
		this.name=name;
	}
	public void run() {
		System.out.println(name+"run");
	}

}
