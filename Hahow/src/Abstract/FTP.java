package Abstract;

public class FTP extends Network {//�ݹ�{��H��k

	@Override
	public void connect() {
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
	} 

}
