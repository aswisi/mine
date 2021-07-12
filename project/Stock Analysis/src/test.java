import java.io.File;


public class test {
	public static void main(String[] args) {
	    File[] files = new File("src/data").listFiles();
	    showFiles(files);
	}

	public static void showFiles(File[] files) {
	    for (File file : files) {
//	        if (file.isDirectory()) {
//	            System.out.println("Directory: " + file.getName());
//	            showFiles(file.listFiles()); 
//	        } else {
	            System.out.println("File: " + file.getName());
	       // }
	    }
	}

}
