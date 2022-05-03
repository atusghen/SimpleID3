package myPackage;

import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.antlr.runtime.RecognitionException;

import myID3Compiler.SimpleID3Parser;

public class ParserLauncher extends JPanel {

public static char[] getTagFromFile(String name) throws FileNotFoundException, IOException
{
	FileReader fileMp3 = new FileReader (name);
	int pos=0;
	while(true)
	{
		if(fileMp3.read()==-1)
		{ break;}
		pos++;
	}
	fileMp3.close();
	fileMp3= new FileReader (name);
	
	for(int i=0;i<pos-128;i++)
		fileMp3.read();
	char[] buffer=new char[160];
	fileMp3.read(buffer, 0, 160);
	
	
	/*
	for(int i=0;i<128;i++)
		System.out.print(buffer[i]);
	System.out.println(pos);
	*/
	fileMp3.close();
	return buffer;
	}

public static char[] getTagFromFile2(String name) throws FileNotFoundException, IOException
{
	FileReader fileMp3 = new FileReader (name);
	int pos=0;
	while(true)
	{
		if(fileMp3.read()=='T') {
		 if(fileMp3.read()=='A') {
			 if(fileMp3.read()=='G') {
				 break;}}}
		pos++;
	}
	fileMp3.close();
	fileMp3= new FileReader (name);
	
	int offset=0;
	if(pos+4=='#') {offset=160;}else {offset=128;}
	
	for(int i=0;i<pos;i++)
		fileMp3.read();
	char[] buffer=new char[160];
	fileMp3.read(buffer, 0, 160);
	
	
	/*
	for(int i=0;i<128;i++)
		System.out.print(buffer[i]);
	System.out.println(pos);
	*/
	fileMp3.close();
	return buffer;
	}


public String fileChooser() throws NullPointerException
{
	  JFileChooser fileChooser = new JFileChooser();
	  fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") 
			  + System.getProperty("file.separator")+ "git"+ System.getProperty("file.separator")+ "SimpleID3"+ System.getProperty("file.separator")+ "resources"));
	  fileChooser.showOpenDialog(ParserLauncher.this);
	  return fileChooser.getSelectedFile().getPath();
	}


public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException 
	{		
	ParserLauncher a=new ParserLauncher();
	String fileName = ".\\resources\\input.file"; //ultima scelta

	try{
		String tagFile=new String(getTagFromFile2(a.fileChooser()));
		//String tagFile=new String(getTagFromFile(".\\resources\\test2.mp3"));
			
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(tagFile);
		writer.close();	
		System.out.println(tagFile);
		}catch(NullPointerException e) {System.out.println("Non selezionato, leggo ultima scelta...");}
	
	
	System.out.println ("Parsing con ANTLR");
		
	FileReader fileIn = new FileReader (fileName);
	SimpleID3Parser parser = new SimpleID3Parser(fileIn);

	parser.struttura();
		
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
