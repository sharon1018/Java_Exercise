package GarbageCollection;

public class GC {
	private String name;
	public GC(String name) {//�غc�l
		this.name=name;
		System.out.println(this.name+" :start");
	}
	
	protected void finalize() { //�Ҧ�����̫�|���檺��k(object���U��) GC�|����
		System.out.println(this.name+" :end");
	}

}
