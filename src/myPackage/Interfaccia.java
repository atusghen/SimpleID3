package myPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
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
    static JLabel winTitle = new JLabel("Simple ID3 Parser");
    static JLabel spazio = new JLabel(" ");
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
    static JPanel infopanel1 = new JPanel();
    
    static JFrame jF = new JFrame("SimpleID3");
    
    
    public Interfaccia() throws IOException{
    	//BoxLayout bl = new BoxLayout(infopanel, BoxLayout.Y_AXIS);
    	winTitle.setHorizontalAlignment(JLabel.CENTER);
    	winTitle.setVerticalAlignment(JLabel.CENTER);
    	winTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
    	infopanel1.setLayout(new BorderLayout());
    	infopanel1.add(winTitle, BorderLayout.NORTH);
    	infopanel1.setBackground(Color.WHITE);
    	//infopanel1.setOpaque(false);
    	
    	infopanel.setLayout(new GridBagLayout());
    	GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        infopanel.add(button, gbc);
        infopanel.add(spazio, gbc);
        //infopanel.add(new JLabel("3+5="), gbc);
    	//GridLayout gridLayout  = new GridLayout(1, 2);
    	//gridLayout.setHgap(20);
    	//infopanel.getLayout().setVgap(25);

    	infopanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        infopanel.setPreferredSize(new Dimension(500, 200));
        infopanel.setOpaque(false);
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
        button.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        checkbox128.setBackground(Color.WHITE);
        checkbox128.setForeground(Color.BLACK);
        checkbox128.setFocusPainted(false);
        checkbox128.setBorderPainted(false);
        checkbox128.setFont(new Font("SansSerif", Font.PLAIN, 14));
        checkbox128.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        checkbox158.setBackground(Color.WHITE);
        checkbox158.setForeground(Color.BLACK);
        checkbox158.setFocusPainted(false);
        checkbox158.setBorderPainted(false);
        checkbox158.setFont(new Font("SansSerif", Font.PLAIN, 14));
        checkbox158.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mode.setBackground(Color.WHITE);
        mode.setForeground(Color.BLACK);
        mode.setFocusPainted(false);
        mode.setBorderPainted(false);
        mode.setFont(new Font("SansSerif", Font.PLAIN, 14));
        mode.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        InputStream stream = getClass().getResourceAsStream("img/checkbox.png");
        ImageIcon icon= new ImageIcon(ImageIO.read(stream));
        checkbox128.setIcon(icon);
        
        stream = getClass().getResourceAsStream("img/check.png");
        icon= new ImageIcon(ImageIO.read(stream));
        checkbox128.setSelectedIcon(icon);
        
        stream = getClass().getResourceAsStream("img/check.png");
        icon= new ImageIcon(ImageIO.read(stream));
        checkbox158.setSelectedIcon(icon);
        
        stream = getClass().getResourceAsStream("img/checkbox.png");
        icon= new ImageIcon(ImageIO.read(stream));
        checkbox158.setIcon(icon);
        
        stream = getClass().getResourceAsStream("img/checkbox.png");
        icon= new ImageIcon(ImageIO.read(stream));
        mode.setIcon(icon);
        
        stream = getClass().getResourceAsStream("img/check.png");
        icon= new ImageIcon(ImageIO.read(stream));
        mode.setSelectedIcon(icon);
        
        /*checkbox128.setIcon(new ImageIcon(getClass().getResource("../img/checkbox.png")));
        checkbox128.setSelectedIcon(new ImageIcon(getClass().getResource("../img/check.png")));
        checkbox158.setIcon(new ImageIcon(getClass().getResource("../img/checkbox.png")));
        checkbox158.setSelectedIcon(new ImageIcon(getClass().getResource("../img/check.png")));
        mode.setIcon(new ImageIcon(getClass().getResource("../img/checkbox.png")));
        mode.setSelectedIcon(new ImageIcon(getClass().getResource("../img/check.png")));*/
        
        topGroup.add(checkbox128);
        topGroup.add(checkbox158);
        topGroup.add(mode);
        
        //infopanel.add(sp1);
        //infopanel.add(sp2);
        //infopanel.add(button);
        infopanel.add(checkbox128);
        infopanel.add(checkbox158);
        infopanel.add(mode);
        
        infopanel1.add(infopanel);
        
        
        jF.getContentPane().add(infopanel1);
        //jF.getContentPane().add(infopanel);
        //jF.setBackground(Color.WHITE);
        //ImageIcon ii = new ImageIcon(getClass().getResource("check.png"));
        stream = getClass().getResourceAsStream("img/music.png");
        icon= new ImageIcon(ImageIO.read(stream));
        jF.setIconImage(icon.getImage());
        //jF.setIconImage(new ImageIcon(getClass().getResource("img/music.png")).getImage());
        jF.pack();
        jF.setLocationRelativeTo(null);
        jF.setResizable(false);
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
    	//infopanel.setPreferredSize(new Dimension(400, 200));
    	jF.pack();
    	
    	Component[] components = infopanel.getComponents();

    	for (Component singleComponent : components) {
    	   if (singleComponent instanceof JLabel) {
    	       JLabel label = (JLabel) singleComponent;
    	       label.setFont(new Font("SansSerif", Font.PLAIN, 14));
    	   }
    	}
    	
    	//infopanel.setBorder(new EmptyBorder(10, 50, 10, 10));
    	
        //infopanel.add(titolo).setVisible(false);
        //infopanel.add(ti).setVisible(false);
        //infopanel.add(artista).setVisible(false);
        //infopanel.add(ar).setVisible(false);
        /*infopanel.add(album).setVisible(false);
        infopanel.add(al).setVisible(false);
        infopanel.add(anno).setVisible(false);
        infopanel.add(an).setVisible(false);
        infopanel.add(commento).setVisible(false);
        infopanel.add(co).setVisible(false);
        infopanel.add(genere).setVisible(false);
        infopanel.add(ge).setVisible(false);*/
    	infopanel.setLayout(new GridBagLayout());
    	GridBagConstraints gbc = new GridBagConstraints();

    	// Row 0 - Filename
    		// Col 0
    	gbc.gridx = 0;
    	gbc.gridy = 0;
    	gbc.insets = new Insets(5, 0, 0, 10);
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(titolo, gbc);

    		// Col 1
    	gbc.gridx = 1;
    	gbc.gridy = 0;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(ti, gbc);

    		// Col 2
    	gbc.gridx = 0;
    	gbc.gridy = 1;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(artista, gbc);
    	
    	gbc.gridx = 1;
    	gbc.gridy = 1;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(ar, gbc);
    	
    	gbc.gridx = 0;
    	gbc.gridy = 2;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(album, gbc);
    	
    	gbc.gridx = 1;
    	gbc.gridy = 2;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(al, gbc);
    	
    	gbc.gridx = 0;
    	gbc.gridy = 3;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(anno, gbc);
    	
    	gbc.gridx = 1;
    	gbc.gridy = 3;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(an, gbc);
    	
    	gbc.gridx = 0;
    	gbc.gridy = 4;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(commento, gbc);
    	
    	gbc.gridx = 1;
    	gbc.gridy = 4;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(co, gbc);
    	
    	gbc.gridx = 0;
    	gbc.gridy = 5;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(genere, gbc);
    	
    	gbc.gridx = 1;
    	gbc.gridy = 5;
    	gbc.anchor = GridBagConstraints.LINE_START;
    	infopanel.add(ge, gbc);
    	
    	jF.pack();
    	
    	infopanel.remove(button);
    	infopanel.remove(checkbox128);
    	infopanel.remove(checkbox158);
    	infopanel.remove(mode);
    	infopanel.remove(spazio);
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
        jF.pack();
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
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (RecognitionException e1) {
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

