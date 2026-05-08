package io_Filehandling;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class Pr1 {
 
	public static void main(String[] args) throws IOException {
		// create file
		File f1=new File("Text1.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text1.txt"));
		bw.write("Hello Welcome to python Learning, hi python, hello python, how are you python?\n ");
		bw.write("Python is open source\n");
		bw.write("Indentation is very important for python\n");
		bw.close();
		//read file
		BufferedReader br=new BufferedReader(new FileReader("Text1.txt"));
        String l1;
        while((l1=br.readLine())!=null)
        {
        	System.out.println(l1);
        	l1 = l1.replaceAll("python", "java");
        }
        while((l1=br.readLine())!=null)
        {
        	System.out.println(l1);
        }
        
        br.close();
	}
 
}