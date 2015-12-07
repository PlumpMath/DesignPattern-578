package Structural.AdapterPattern;

public class FileManagerClient {

	public static void main(String[] args) {
		FileManager f = null;
		String dummyData = "dynamite";
		f = new FileManagerImpl();
		System.out.println("Using file manager: " + f.getClass().toString());
		f.open("dummyfile.dat");
		f.write(0, dummyData.length(), dummyData.getBytes());
		String test = f.read(0, dummyData.length(), dummyData.getBytes());
		System.out.println("Data written and read: " + test);
		f.close();
	}

}
