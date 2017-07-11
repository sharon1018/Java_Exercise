package GarbageCollection;

public class GC {
	private String name;
	public GC(String name) {//建構子
		this.name=name;
		System.out.println(this.name+" :start");
	}
	
	protected void finalize() { //所有物件最後會執行的方法(object底下的) GC會執行
		System.out.println(this.name+" :end");
	}

}
