package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildException {

	public static void main(String[] args) {
		
		try {
		    FileInputStream fis=new  FileInputStream("src\\day40\\yazi.txt");
		    System.out.println("g�rev tamamland�");
		    int k=0;
		    while((k=fis.read())!=-1) {
		        System.out.print((char)k);
		        
		    }
		    }catch(FileNotFoundException e){
		        System.out.println("Dosya okunam�yor");
		    }catch (IOException a) {
		        System.out.println("Dosya Silinmi� veya ula��lam�yor");
		    }
	}
}
