package myPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import myID3Compiler.SimpleID3Parser;

public class ParserLauncher {
	public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {		
	//	int a = 1342;
	  	String fileName = ".\\resources\\input.file";
	  	
		System.out.println ("Parsing con ANTLR");
		
		FileReader fileIn = new FileReader (fileName);

		SimpleID3Parser parser = new SimpleID3Parser(fileIn);
//		SimpleJavaParser parser = new SimpleJavaParser(
//				"public class ParserLauncher {"
//				+ "	public void main () "
//				+ "  { f}"
//				+ "}");
		parser.struttura();
		
		//**
		if (parser.getErrorList().size() == 0)
			System.out.println ("Parsing completato con successo");
		else {
			int i=0;
			System.out.println ("Errori rilevati");
			for (String msg : parser.getErrorList())
				System.out.println (++i + " - " + msg);
		}
		
	}
}
