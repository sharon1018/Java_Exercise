package Thread;

public class Demo {

	public static void main(String[] args) { //main�����]�O�@��thread
		System.out.println("main start");
		//�ϥ��~�Ӫ��覡
//		TestThread thread1=new TestThread("thread1");//���ͪ���ñҰʰ����
//		TestThread thread2=new TestThread("thread2");
//		TestThread thread3=new TestThread("thread3");
//		thread1.start();//�ݦ�start�~�|�}�l����
//		thread2.start();
//		thread3.start();
		
		//�ϥ�runnable���覡 �k�@
//		TestRunnable tr=new TestRunnable("t1");//���Ͱ�������O
//		Thread thread1=new Thread(tr);//�Q��Thread���O�غc�l�����䤤�@�ӥi�����Ѽ�Runnable���󪺫غc�l
//		thread1.start();
		
		//�k�G
		Thread thread1=new Thread(new TestRunnable("t1"));//�����ϥ�thread������̭���Jrunnable���غc�l
		Thread thread2=new Thread(new TestRunnable("t2"));
		Thread thread3=new Thread(new TestRunnable("t3"));
		thread1.start();//�ݦ�start�~�|�}�l����
		thread2.start();
		thread3.start();
		
		System.out.println("main end");
		

	}

}
