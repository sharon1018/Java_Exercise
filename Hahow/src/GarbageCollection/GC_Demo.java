package GarbageCollection;

public class GC_Demo {

	public static void main(String[] args) {
		GC gc1=new GC("gc1");
		GC gc2=new GC("gc2");
		GC gc3=new GC("gc3");
		
		gc1=null;//�o�Ӫ��󤣦b�Q�ϥ�
		gc2=null;
		gc3=null;
		
		System.gc();//���|�ߨ����,����JVM�T�w�S���n�ϥΤ�k�Ϊ���~�|����
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//�Y����gc() �N�u�|��start�S��end
	}

}
