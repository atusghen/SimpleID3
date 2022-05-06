package myPackage;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.antlr.runtime.RecognitionException;

import myPackage.Interfaccia;

@SuppressWarnings("serial")
public class Interfaccia extends JPanel {
	
	//private JTextField m_userInputCF = new JTextField(16);
    static JButton button = new JButton("Sfoglia");
    static JCheckBox checkbox158 = new JCheckBox("158 bytes");
    public static JCheckBox checkbox128 = new JCheckBox("128 bytes", true);
    static ButtonGroup topGroup = new ButtonGroup();
	static JLabel titolo = new JLabel("TITOLO:");
	static JLabel ti = new JLabel();
	static JLabel artista = new JLabel("ARTISTA:");
	static JLabel ar = new JLabel();
	static JLabel album = new JLabel("ALBUM:");
	static JLabel al = new JLabel();
	static JLabel anno = new JLabel("ANNO:");
	static JLabel an = new JLabel();
	static JLabel commento = new JLabel("COMMENTO:");
	static JLabel co = new JLabel();
	static JLabel genere = new JLabel("GENERE:");
	static JLabel ge = new JLabel();
    static JPanel infopanel = new JPanel();
    
    static JFrame jF = new JFrame("SimpleID3");
    
    
    public Interfaccia(){
    	infopanel.setLayout(new GridLayout(1, 1));
    	infopanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        //infopanel.setLayout(new BorderLayout());
        infopanel.setPreferredSize(new Dimension(300, 50));
        topGroup.add(checkbox128);
        topGroup.add(checkbox158);
        infopanel.add(button);
        infopanel.add(checkbox128);
        infopanel.add(checkbox158);
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
        button.addActionListener(new ActionListener() { 
    	    public void actionPerformed(ActionEvent e) { 
    	       startParsing(e);
        }
       });
  
      
        
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
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
    	infopanel.remove(checkbox158);
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
    
    public String fileChooser() throws NullPointerException
    {
    	  JFileChooser fileChooser = new JFileChooser();
    	  fileChooser.setCurrentDirectory(new File("resources"));
    	  fileChooser.showOpenDialog(Interfaccia.this);
    	  jF.setTitle("SimpleID3-" + fileChooser.getSelectedFile().getName());
    	  return fileChooser.getSelectedFile().getPath();
    }
    
    private void startParsing(ActionEvent e) { 
        try {
        	ParserLauncher.avvio(this);
		} catch (IOException | RecognitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    public boolean checkMode()
    {
    	return checkbox128.isSelected() ? true:false;
    }
}

