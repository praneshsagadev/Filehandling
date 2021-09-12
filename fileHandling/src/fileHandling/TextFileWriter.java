package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\SELENIUM WORKSPACE\\fileHandling\\file2.txt");

		FileWriter fw = new FileWriter(file, false);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("vcentry");
		bw.newLine();
		bw.write('c');
		bw.write(12000);
		bw.newLine();
		bw.write("automation");
		bw.newLine();
		bw.write("sdsd");
		bw.close();

//		fw.write('c');
//		fw.write("\n");
//		fw.write("vcentry");
//		fw.write("12000");
//		
//		fw.close();
		
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		
		System.out.println("Write Completed");
		
		String text;
		while((text=br.readLine())!=null) {
		
		System.out.println(text);
		
		}
	}

}
