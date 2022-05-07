package myID3Compiler;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import myPackage.Interfaccia;
;

public class SimpleID3Handler {
	public static final int UNDEFINED = -1;	
	public static final int TOKEN_ERROR = 0;	
	public static final int ERR_ON_SYNTAX = 1;	
	public static final int LAST_SYNTAX_ERROR = 10;	
	public static final int MISSING_CHAR = 7;
	
	public int conta = 0;

	List<String> errorList;
	TokenStream lexerStream;

	public SimpleID3Handler (TokenStream ls) {
		System.out.println ("Handler Inizializzato");
		
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
		String s = new String();
		if(conta == 0) {
			System.out.print("Titolo: ");
			for(int i=0;i<T.size();i++)
				s = s + T.get(i).getText();
			conta++;
			System.out.print(s);
			Interfaccia.setData(conta, s);
		} else if(conta == 1) {
			System.out.print("Artista: ");
			for(int i=0;i<T.size();i++)
				s = s + T.get(i).getText();
			conta++;
			System.out.print(s);
			Interfaccia.setData(conta, s);
		} else if(conta == 2) {
			System.out.print("Album: ");
			for(int i=0;i<T.size();i++)
				s = s + T.get(i).getText();
			conta++;
			System.out.print(s);
			Interfaccia.setData(conta, s);
		} else if(conta == 3) {
			System.out.print("Anno: ");
			for(int i=0;i<T.size();i++)
				s = s + T.get(i).getText();
			conta++;
			System.out.print(s);
			Interfaccia.setData(conta, s);
		} else {
			System.out.print("Commento: ");
			for(int i=0;i<T.size();i++)
				s = s + T.get(i).getText();
			conta++;
			System.out.print(s);
			Interfaccia.setData(conta, s);
		}
		System.out.println();
	}
	
	public void stampaslot (Token T)
	{
		char a=T.getText().charAt(0);
		int i=(int)a;
		System.out.println("Genere: "+riconosciGenere(i)+i);
		Interfaccia.setData(6, riconosciGenere(i));
	}
	
	
	public String riconosciGenere (int i)
	{
	//converto prima il char to hex string, poi ne leggo il valore
	//formalmente è una procedura per leggere il valore grezzo del byte, togliendo il formato "char" assegnato dalla lettura
	//tramite token
		//int num = Integer.parseInt(String.format("%04x", i), 16);
		//System.out.println(num);
		switch (i) {
			case 0: return "Blues";
			case 1: return "Classic Rock";
			case 2: return "Country";
			case 3: return "Dance";
			case 4: return "Disco";
			case 5: return "Funk";
			case 6: return "Grunge";
			case 7: return "Hip-Hop";
			case 8: return "Jazz";
			case 9: return "Metal";
			case 10: return "New Age";
			case 11: return "Oldies";
			case 12: return "Other";
			case 13: return "Pop";
			case 14: return "R&B";
			case 15: return "Rap";
			case 16: return "Reggae";
			case 17: return "Rock";
			case 18: return "Techno";
			case 19: return "Industrial";
			case 20: return "Alternative";
			case 21: return "Ska";
			case 22: return "Death Metal";
			case 23: return "Pranks";
			case 24: return "Soundtrack";
			case 25: return "Euro-Techno";
			case 26: return "Ambient";
			case 27: return "Trip-Hop";
			case 28: return "Vocal";
			case 29: return "Jazz+Funk";
			case 30: return "Fusion";
			case 31: return "Trance";
			case 32: return "Classical";
			case 33: return "Instrumental";
			case 34: return "Acid";
			case 35: return "House";
			case 36: return "Game";
			case 37: return "Sound Clip";
			case 38: return "Gospel";
			case 39: return "Noise";
			case 40: return "AlternRock";
			case 41: return "Bass";
			case 42: return "Soul";
			case 43: return "Punk";
			case 44: return "Space";
			case 45: return "Meditative";
			case 46: return "Instrumental Pop";
			case 47: return "Instrumental Rock";
			case 48: return "Ethnic";
			case 49: return "Gothic";
			case 50: return "Darkwave";
			case 51: return "Techno-Industrial";
			case 52: return "Electronic";
			case 53: return "Pop-Folk";
			case 54: return "Eurodance";
			case 55: return "Dream";
			case 56: return "Southern Rock";
			case 57: return "Comedy";
			case 58: return "Cult";
			case 59: return "Gangsta";
			case 60: return "Top 40";
			case 61: return "Christian Rap";
			case 62: return "Pop/Funk";
			case 63: return "Jungle";
			case 64: return "Native American";
			case 65: return "Cabaret";
			case 66: return "New Wave";
			case 67: return "Psychadelic";
			case 68: return "Rave";
			case 69: return "Showtunes";
			case 70: return "Trailer";
			case 71: return "Lo-Fi";
			case 72: return "Tribal";
			case 73: return "Acid Punk";
			case 74: return "Acid Jazz";
			case 75: return "Polka";
			case 76: return "Retro";
			case 77: return "Musical";
			case 78: return "Rock & Roll";
			case 79: return "Hard Rock";
			case 80: return "Folk";
			case 81: return "Folk-Rock";
			case 82: return "National Folk";
			case 83: return "Swing";
			case 84: return "Fast Fusion";
			case 85: return "Bebob";
			case 86: return "Latin";
			case 87: return "Revival";
			case 88: return "Celtic";
			case 89: return "Bluegrass";
			case 90: return "Avantgrade";
			case 91: return "Gothic Rock";
			case 92: return "Progressive Rock";
			case 93: return "Psychedelic Rock";
			case 94: return "Symphonic Rock";
			case 95: return "Slow Rock";
			case 96: return "Big Band";
			case 97: return "Chorus";
			case 98: return "Easy Listening";
			case 99: return "Acoustic";
			case 100: return "Humour";
			case 101: return "Speech";
			case 102: return "Chanson";
			case 103: return "Opera";
			case 104: return "Chamber Music";
			case 105: return "Sonata";
			case 106: return "Symphony";
			case 107: return "Booty Bass";
			case 108: return "Primus";
			case 109: return "Porn Groove";
			case 110: return "Satire";
			case 111: return "Slow Jam";
			case 112: return "Club";
			case 113: return "Tango";
			case 114: return "Samba";
			case 115: return "Folklore";
			case 116: return "Ballad";
			case 117: return "Power Ballad";
			case 118: return "Rhythmic Soul";
			case 119: return "Freestyle";
			case 120: return "Duet";
			case 121: return "Punk Rock";
			case 122: return "Drum Solo";
			case 123: return "A capella";
			case 124: return "Euro-House";
			case 125: return "Dance Hall";
			case 126: return "Goa";
			case 127: return "Drum & Bass";
			
			//test 143 si passa al charset ANSI con numeri sempre tutti diversi
			case 8364: return "Club-House";
			case 65533: return "Hardcore";
			case 8218: return "Terror";
			case 402: return "Indie";
			case 8222: return "Britpop";
			case 8230: return "Negerpunk";
			case 8224: return "Polsk Punk";
			case 8225: return "Beat";
			case 710: return "Christian";
			case 8240: return "Heavy Metal";
			case 352: return "Black Metal";
			case 8249: return "Crossover";
			case 338: return "Contemporary";
			//case 141: return "Christian Rock"; //uguale a Hardcore
			case 381: return "Merengue";
			//case 143: return "Salsa";
			//case 144: return "Trash Metal";
			case 8216: return "Anime";
			case 8217: return "JPop";
			case 8220: return "Synthpop";
			
			default: return "Sconosciuto";
		}
	}

}


