package Abstract;

public class FTP extends Network {//需實現抽象方法

	@Override
	public void connect() {
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
	} 

}
