package JAVA;

public class L2_overFlow {

	public static void main(String[] args) {
		float f=3.14f;
		//float f=3.14編譯錯誤因為浮點數預設是double,丟給float會損失4 byte,入需要強制轉型為f
		System.out.println(f);
	}

}
