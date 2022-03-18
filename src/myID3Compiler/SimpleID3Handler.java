package myID3Compiler;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class SimpleID3Handler {
	public static final int UNDEFINED = -1;	
	public static final int TOKEN_ERROR = 0;	
	public static final int ERR_ON_SYNTAX = 1;	
	public static final int LAST_SYNTAX_ERROR = 10;	
	public static final int MISSING_CHAR = 7;
	
	public int conta = 0;
	
	
	//Hashtable<String, VarDescriptor> globalVarTable;
//	Hashtable<String, VarDescriptor> localVarTable;
	//Hashtable<String, MethodDescriptor> methodTable;
	//**
	List<String> errorList;
	TokenStream lexerStream;

	public SimpleID3Handler (TokenStream ls) {
		System.out.println ("Handler Inizializzato");
		//globalVarTable = new Hashtable<String, VarDescriptor> ();
	//	localVarTable = new Hashtable<String, VarDescriptor> ();
		//methodTable = new Hashtable<String, MethodDescriptor> ();
		//**
		errorList = new ArrayList<String>();
		lexerStream = ls;
	}

	public List<String> getErrorList() {
		return errorList;
	}
	
	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		String type = "";
		String st;
		if (e.token.getType() >=0)
			type = tokenNames[e.token.getType()]; 
		if (e.token.getType() == SimpleID3Lexer.SCAN_ERROR)
			st = "Lexical Error " + TOKEN_ERROR + " at ";
		else
			st = "Syntax Error " + ERR_ON_SYNTAX + " at ";
		st +=	"[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine()+1) + "]: " + 
				"Found ";
		st += type;
		

		if (e instanceof MissingTokenException)
		   st = st + m;		
		else /*if(e.token.getType() == MISSING_CHAR)*/
			st += " ('" + e.token.getText() + "')" + m;
		errorList.add(st); 
	}

	// Gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String st;
		if (code == TOKEN_ERROR)
			st = "Lexical Error " + code;
		else if (code < LAST_SYNTAX_ERROR)
			st = "Syntax Error " + code;
		else
			st = "Errore semantico " + code; 
	
		if (tk != null)
			st += " avvenuto qui: [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		st += ". ";

		if (code == TOKEN_ERROR)
			st += "Unrecognized token '" + tk.getText() + "'";
							
		errorList.add(st); 
	}
	
	
	public void stampaslot (List<Token> T)
	{
		if(conta == 0) {
			System.out.print("Titolo: ");
			for(int i=0;i<T.size();i++)
				System.out.print(T.get(i).getText());
			conta++;
		} else if(conta == 1) {
			System.out.print("Artista: ");
			for(int i=0;i<T.size();i++)
				System.out.print(T.get(i).getText());
			conta++;
		} else if(conta == 2) {
			System.out.print("Album: ");
			for(int i=0;i<T.size();i++)
				System.out.print(T.get(i).getText());
			conta++;
		} else if(conta == 3) {
			System.out.print("Anno: ");
			//for(int i=0;i<T.size();i++)	T.get(i).setText("2");
			for(int i=0;i<T.size();i++)
				System.out.print(T.get(i).getText());
			conta++;
			
		} else {
			System.out.print("Commento: ");
			for(int i=0;i<T.size();i++)
				System.out.print(T.get(i).getText());
			conta++;
		}
		System.out.println();
	}
	public void stampaslot (Token T)
	{
		//if(T.getText().charAt(0)==' ') {System.out.println("genere: "+(int)T.getText().charAt(0)); return;}
		char a=T.getText().charAt(0);
		int i=(int)a;
		System.out.println("genere: "+riconosciGenere(i));
	}
	
	public String riconosciGenere (int i)
	{
		switch (i) {
		case 32: return "Blues";
		case 1: return "Classic Rock";
		case 2: return "Country";
		case 3: return "Dance";
		case 4: return "Disco";
			default: return "not recognised";
		}
	}
	/*
	
	
	public VarDescriptor createNewParameter (Token type, Token name) {
		if (type != null && name != null)
			return new VarDescriptor (type.getText(), name.getText());

		return null;
	}
	
	public void addParameterDefition (List<VarDescriptor> list, VarDescriptor pd) {
		list.add(pd);
	}

	public void declareNewMethod (Token t, Token n, List<VarDescriptor> lp) {
		System.out.println ("controllo dichiarazione metodo");
		if (t != null && n != null) {
			String name = n.getText();
			String type = t.getText();
			System.out.println ("METODO " + type + " - " + name);
			
			if (methodTable.containsKey(name)) {
				myErrorHandler(DECLARED_METHOD, n);
				System.out.println ("il metodo " + name + " è gia stato dichiarato.");
			}
			else {
				System.out.println ("sto dichiarando il metodo " + name);
				methodTable.put(name, new MethodDescriptor (type, name, lp));
			}
		} 
		else {
			System.out.println ("*****EEERRRRROOORRRREEEEEE**********");			
		}
		
	}

	public void declareNewVariable (Token t, Token n, String v) {
		if (t != null && n != null) {
			String name = n.getText();
			String type = t.getText();
			
			if (globalVarTable.containsKey(name))
				System.out.println ("la variabile" + name + " in [" + 
						n.getLine() + ", "+ (n.getCharPositionInLine()+1) + 
						"] è gia stata dichiarata.");
			else
				globalVarTable.put(name, new VarDescriptor (type, name, v));
		}
	}
*/
}


