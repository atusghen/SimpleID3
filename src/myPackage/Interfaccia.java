package myPackage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.antlr.runtime.RecognitionException;

import myPackage.Interfaccia;

@SuppressWarnings("serial")
public class Interfaccia extends JPanel {
	
    static JButton button = new JButton("Sfoglia");
    static JCheckBox checkbox158 = new JCheckBox("158 bytes");
    static JCheckBox checkbox128 = new JCheckBox("128 bytes", true);
    static JCheckBox mode = new JCheckBox("Modalità automatica", true);
    static ButtonGroup topGroup = new ButtonGroup();
    //static JLabel sp1 = new JLabel();
    //static JLabel sp2 = new JLabel();
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
    	//BoxLayout bl = new BoxLayout(infopanel, BoxLayout.Y_AXIS);
    	GridLayout gridLayout  = new GridLayout(1, 2);
    	gridLayout.setHgap(20);
    	//gridLayout.setVgap(75);
    	infopanel.setLayout(gridLayout);
    	infopanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        infopanel.setPreferredSize(new Dimension(350, 50));
        //infopanel.setSize(new Dimension(350, 400));        
        
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBackground(new Color(33, 150, 243));
        button.setBorderPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        
        checkbox128.setForeground(Color.BLACK);
        checkbox128.setFocusPainted(false);
        checkbox128.setBorderPainted(false);
        checkbox158.setForeground(Color.BLACK);
        checkbox158.setFocusPainted(false);
        checkbox158.setBorderPainted(false);
        mode.setForeground(Color.BLACK);
        mode.setFocusPainted(false);
        mode.setBorderPainted(false);
        
        checkbox128.setIcon(new ImageIcon(getClass().getResource("checkbox.png")));
        checkbox128.setSelectedIcon(new ImageIcon(getClass().getResource("check.png")));
        checkbox158.setIcon(new ImageIcon(getClass().getResource("checkbox.png")));
        checkbox158.setSelectedIcon(new ImageIcon(getClass().getResource("check.png")));
        mode.setIcon(new ImageIcon(getClass().getResource("checkbox.png")));
        mode.setSelectedIcon(new ImageIcon(getClass().getResource("check.png")));
        
        topGroup.add(checkbox128);
        topGroup.add(checkbox158);
        topGroup.add(mode);
        
        //infopanel.add(sp1);
        //infopanel.add(sp2);
        infopanel.add(button);
        infopanel.add(checkbox128);
        infopanel.add(checkbox158);
        infopanel.add(mode);
        
        jF.getContentPane().add(infopanel);
        jF.pack();
        //jF.setSize(500, 150);
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
    	infopanel.remove(mode);
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
			e1.printStackTrace();
		}
    }
    public boolean checkMode()
    {
    	return checkbox128.isSelected() ? true:false;
    }
    public boolean checkMode2()
    {
    	return mode.isSelected() ? true:false;
    }
}

