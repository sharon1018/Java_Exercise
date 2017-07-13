package Thread;

public class TestRunnable implements Runnable{ //實作running介面,並實作RUN方法
	private String name;
	public TestRunnable(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+" start");
//		if("thread1".equals(name))
//			Thread.yield();
		try {
			if("t1".equals(name))
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name+" run");
		System.out.println(name+" end");
		
	}

}
