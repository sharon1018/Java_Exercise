package Thread;

public class TestThread extends Thread{//�i�H���~�Ӫ��覡,���]���u���~�Ӥ@�ӬG��ĳ�ΤQ�y�������覡
	private String name;
	public TestThread(String name) {//�غc�l
		this.name=name;
	}
	public void run() {
		System.out.println(name+"run");
	}

}
