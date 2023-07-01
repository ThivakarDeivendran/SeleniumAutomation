package SeleniumChrome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Interview2 {
	public static void main(String[] args) throws IOException {
		File f =new File ("C:\\Users\\user\\Desktop\\folder\\interview.txt");
		String filename = "interview" + System.currentTimeMillis() + ".txt";
		File fnew =new File ("C:\\Users\\user\\Desktop\\folder\\"+ filename);
		FileUtils.copyFile(f, fnew);
	}

}
