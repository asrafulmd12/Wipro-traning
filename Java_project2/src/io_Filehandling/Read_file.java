package io_Filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read_file {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("sample.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}

