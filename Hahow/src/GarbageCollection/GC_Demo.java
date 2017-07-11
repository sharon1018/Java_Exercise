package GarbageCollection;

public class GC_Demo {

	public static void main(String[] args) {
		GC gc1=new GC("gc1");
		GC gc2=new GC("gc2");
		GC gc3=new GC("gc3");
		
		gc1=null;//這個物件不在被使用
		gc2=null;
		gc3=null;
		
		System.gc();//部會立刻執行,等到JVM確定沒有要使用方法或物件才會停止
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//若移除gc() 就只會有start沒有end
	}

}
