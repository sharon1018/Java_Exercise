package Thread;

public class TestRunnable implements Runnable{ //��@running����,�ù�@RUN��k
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
