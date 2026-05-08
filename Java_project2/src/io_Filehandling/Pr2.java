package io_Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class Pr2 {
 
	public static void main(String[] args) throws IOException {
		File file=new File("demo.txt");// name the file
        int count = 0;
        FileReader reader = new FileReader("demo.txt");
        int data;
        while ((data = reader.read()) != -1) {
            //System.out.print((char) data);
            count ++;
        }
        reader.close();
        System.out.println("Total number of characters present: "+count);
 
//        Scanner sc=new Scanner(file);
//      
//      while(sc.hasNextLine())
//      {
//   	   System.out.println(sc.nextLine());
//      }
//      sc.close();
	}
 
}