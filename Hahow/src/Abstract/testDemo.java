package Abstract;

public class testDemo {

	public static void main(String[] args) {
		// �H�h�����覡�إ�network�ܼ� �OFTP������
		//�ð���NETWORK�̭���TRANSFER
		Network net=new FTP();
		net.transfer("Test.txt");

	}

}
