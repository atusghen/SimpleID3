package myPackage;

import java.io.FileNotFoundException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.antlr.runtime.RecognitionException;

import myID3Compiler.SimpleID3Parser;

@SuppressWarnings("serial")
public class ParserLauncher extends JPanel {
	
	//private JTextField m_userInputCF = new JTextField(16);
    static JButton button = new JButton("Sfoglia");
    static JCheckBox checkbox160 = new JCheckBox("160 bytes");
    static JCheckBox checkbox128 = new JCheckBox("128 bytes");
    static ButtonGroup topGroup = new ButtonGroup();
	static JLabel titolo = new JLabel("Titolo");
	static JLabel ti = new JLabel();
	static JLabel artista = new JLabel("Artista");
	static JLabel ar = new JLabel();
	static JLabel album = new JLabel("Album");
	static JLabel al = new JLabel();
	static JLabel anno = new JLabel("Anno");
	static JLabel an = new JLabel();
	static JLabel commento = new JLabel("Commento");
	static JLabel co = new JLabel();
	static JLabel genere = new JLabel("Genere");
	static JLabel ge = new JLabel();
    static JPanel infopanel = new JPanel();
    
    static JFrame jF = new JFrame("Inserisci dati");
    
    
    ParserLauncher(){
    	infopanel.setLayout(new GridLayout(1, 1));
    	infopanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        //infopanel.setLayout(new BorderLayout());
        infopanel.setPreferredSize(new Dimension(300, 50));
        topGroup.add(checkbox128);
        topGroup.add(checkbox160);
        infopanel.add(button);
        infopanel.add(checkbox128);
        infopanel.add(checkbox160);
        /*infopanel.add(titolo).setVisible(false);
        infopanel.add(ti).setVisible(false);
        infopanel.add(artista).setVisible(false);
        infopanel.add(ar).setVisible(false);
        infopanel.add(album).setVisible(false);
        infopanel.add(al).setVisible(false);
        infopanel.add(anno).setVisible(false);
        infopanel.add(an).setVisible(false);
        infopanel.add(commento).setVisible(false);
        infopanel.add(co).setVisible(false);
        infopanel.add(genere).setVisible(false);
        infopanel.add(ge).setVisible(false);*/
        
        jF.getContentPane().add(infopanel);
        jF.pack();
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

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

public static char[] getTagFromFile2(String name, int os) throws FileNotFoundException, IOException
{
	FileReader fileMp3 = new FileReader (name);
	int pos=0;
	while(true)
	{
		if(fileMp3.read()==-1) {break;}
		pos++;
	}
	fileMp3.close();
	fileMp3= new FileReader (name);
	
	int offset=os;

	
	for(int i=offset;i<pos;i++)
		fileMp3.read();
	char[] buffer=new char[offset];
	fileMp3.read(buffer, 0, offset);
	
	
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

public void avvio(ParserLauncher a) throws FileNotFoundException, IOException, RecognitionException {
	//ParserLauncher a=new ParserLauncher();
	String fileName = ".\\resources\\input.file"; //ultima scelta
	int offset;
	if(checkbox128.isSelected())
		offset = 128;
	else
		offset = 160;
		
	    	try{
	    		String tagFile=new String(getTagFromFile2(a.fileChooser(), offset));
	    		//String tagFile=new String(getTagFromFile(".\\resources\\test2.mp3"));
	    			
	    		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    		writer.write(tagFile);
	    		writer.close();	
	    		System.out.println(tagFile);
	    		}catch(NullPointerException e2) {System.out.println("Non selezionato, leggo ultima scelta...");}
	

	
	
	
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


public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {
	ParserLauncher a=new ParserLauncher();
	/*String fileName = ".\\resources\\input.file"; //ultima scelta
	    	try{
	    		String tagFile=new String(getTagFromFile2(a.fileChooser()));
	    		//String tagFile=new String(getTagFromFile(".\\resources\\test2.mp3"));
	    			
	    		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    		writer.write(tagFile);
	    		writer.close();	
	    		System.out.println(tagFile);
	    		}catch(NullPointerException e2) {System.out.println("Non selezionato, leggo ultima scelta...");}
	

	
	
	
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
		}*/
	
	button.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	        try {
				a.avvio(a);
			} catch (IOException | RecognitionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    } 
	});
		
	}

public static void setData(int c, String data) {
	infopanel.setPreferredSize(new Dimension(500, 150));
	jF.pack();
    infopanel.add(titolo).setVisible(false);
    infopanel.add(ti).setVisible(false);
    infopanel.add(artista).setVisible(false);
    infopanel.add(ar).setVisible(false);
    infopanel.add(album).setVisible(false);
    infopanel.add(al).setVisible(false);
    infopanel.add(anno).setVisible(false);
    infopanel.add(an).setVisible(false);
    infopanel.add(commento).setVisible(false);
    infopanel.add(co).setVisible(false);
    infopanel.add(genere).setVisible(false);
    infopanel.add(ge).setVisible(false);
	infopanel.setLayout(new GridLayout(6, 2));
	infopanel.remove(button);
	infopanel.remove(checkbox128);
	infopanel.remove(checkbox160);
	titolo.setVisible(true);
    ti.setVisible(true);
    artista.setVisible(true);
    ar.setVisible(true);
    album.setVisible(true);
    al.setVisible(true);
    anno.setVisible(true);
    an.setVisible(true);
    commento.setVisible(true);
    co.setVisible(true);
    genere.setVisible(true);
    ge.setVisible(true);
    if(c == 1)
    	ti.setText(data);
    if(c == 2)
    	ar.setText(data);
    if(c == 3)
    	al.setText(data);
    if(c == 4)
    	an.setText(data);
    if(c == 5)
    	co.setText(data);
    if(c == 6)
	ge.setText(data);
	
}
}
