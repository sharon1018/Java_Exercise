package IO;

public class demo {

	public static void main(String[] args) {
		String fileName="c:\\tmp\\test";
		IOutil.createFolder(fileName);
		String[] files =IOutil.readFolder(fileName);
		for(String name:files) {
			System.out.println(name);
		}
		//IOutil.deleteFolder(fileName);
		//System.out.println("end");
		
	}

}
