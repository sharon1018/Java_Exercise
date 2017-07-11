package Abstract;

public abstract class Network {
	public void transfer(String filename){
		connect();
		System.out.println("Transfer"+filename);
		disconnect();
	}
	
	public abstract void connect();
	public abstract void disconnect();
}
