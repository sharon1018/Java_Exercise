package Thread;

public class Demo {

	public static void main(String[] args) { //main本身也是一個thread
		System.out.println("main start");
		//使用繼承的方式
//		TestThread thread1=new TestThread("thread1");//產生物件並啟動執行序
//		TestThread thread2=new TestThread("thread2");
//		TestThread thread3=new TestThread("thread3");
//		thread1.start();//需有start才會開始執行
//		thread2.start();
//		thread3.start();
		
		//使用runnable的方式 法一
//		TestRunnable tr=new TestRunnable("t1");//產生執行序類別
//		Thread thread1=new Thread(tr);//利用Thread類別建構子中的其中一個可接收參數Runnable物件的建構子
//		thread1.start();
		
		//法二
		Thread thread1=new Thread(new TestRunnable("t1"));//直接使用thread的物件裡面放入runnable的建構子
		Thread thread2=new Thread(new TestRunnable("t2"));
		Thread thread3=new Thread(new TestRunnable("t3"));
		thread1.start();//需有start才會開始執行
		thread2.start();
		thread3.start();
		
		System.out.println("main end");
		

	}

}
