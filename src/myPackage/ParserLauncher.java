package myPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.antlr.runtime.RecognitionException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.OutputStreamWriter;

import myID3Compiler.SimpleID3Parser;

public class ParserLauncher{
    ParserLauncher(){}
   
public static char[] getTagFromFile(String name, int offset) throws FileNotFoundException, IOException
{
	//calcolo posizione TAG se esiste
	InputStreamReader fileMp3 = new InputStreamReader(new FileInputStream(name), "Cp1252");//ANSI
	int length=0;
	while(true)
	{
		if(fileMp3.read()=='T') {
			if(fileMp3.read()=='A') {
				if(fileMp3.read()=='G') {break;}else {length=length+2;}
				}else{length++;}
			}
		length++;
	}
	fileMp3.close();
	//System.out.println(length+"<-inizio lettura");
//lettura da posizione TAG trovata in array di char
//se la posizione non è trovata la lettura parte dalla fine del reader, creando di fatto un array vuoto
	fileMp3 = new InputStreamReader(new FileInputStream(name), "Cp1252");
	
	char[] buffer=new char[offset];
//scorrimento a posizione di TAG
		for(int i=0;i<length;i++)
			fileMp3.read();
	//trasferimento in array
		int i=fileMp3.read(buffer, 0, offset);
		fileMp3.close();
		if(i==-1){System.out.println("Marcatore TAG non trovato"); return new char[offset];}
	
	return buffer;
	}


public static InputStreamReader setReaderWithStartSearch(Interfaccia a) throws FileNotFoundException, IOException
{
	//versione con step intermedio di scrittura su file di input, non più necessaria

	String fileName = ".\\resources\\input.file"; //ultima scelta
	int offset = (a.checkMode()) ? 128 :158;
		try{
    		String tagFile=new String(getTagFromFile(a.fileChooser(), offset));
    		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8);
    		writer.write(tagFile);
    		writer.close();	
    		System.out.println(tagFile);}
		catch(NullPointerException e2) 
			{System.out.println("Non selezionato, leggo ultima scelta...");}
		   
		InputStreamReader fileIn = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
		   return fileIn;
}

public static InputStreamReader setReaderNoSearch(Interfaccia a) throws FileNotFoundException, IOException
{
//versione con step intermedio di scrittura su file di input, non più necessaria
	InputStreamReader fileIn = new InputStreamReader(new FileInputStream(a.fileChooser()), "Cp1252");
	return fileIn;
}

public static String setString(Interfaccia a) throws FileNotFoundException, IOException
{

	int offset = (a.checkMode()) ? 128 :158;
	String tagString=new String();
		try {
			 tagString=new String(getTagFromFile(a.fileChooser(), offset));
	//questo out a console è solo di debug, ricordiamo che è da togliere
	//		 System.out.println("Stringa->"+tagString+"<-fine");
			   }catch(NullPointerException e2) {System.out.println("Non selezionato");}
			  
			   return tagString;}

public static void avvio(Interfaccia a) throws FileNotFoundException, IOException, RecognitionException {
	
	SimpleID3Parser parser;
	if(a.checkMode2()) {parser= new SimpleID3Parser(new BufferedReader(setReaderNoSearch(a)));}
	else {parser= new SimpleID3Parser(setString(a));}
	
	System.out.println ("Parsing con ANTLR");
	parser.superstruttura();
		
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
