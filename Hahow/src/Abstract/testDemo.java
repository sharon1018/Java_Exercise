package Abstract;

public class testDemo {

	public static void main(String[] args) {
		// 以多型的方式建立network變數 是FTP之物件
		//並執行NETWORK裡面的TRANSFER
		Network net=new FTP();
		net.transfer("Test.txt");

	}

}
