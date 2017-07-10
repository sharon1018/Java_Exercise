package JAVA;

public class L11_method {

	public static void main(String[] args) { //主程式想使用sayHello(在11_method下)方法,因他不是靜態的需要new出來
		L11_method test=new L11_method();
		System.out.println(test.sayHello("Ryan"));
	}
	
	public String sayHello(String name) {   //回傳字串,傳入值也是字串
		String ret="Hello " +name;
		
		return ret;  //把結果回傳出去,須配合上述的資料型態(String)
		
	}
}
