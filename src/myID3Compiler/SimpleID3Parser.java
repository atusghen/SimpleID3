// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-02 00:24:24

	package myID3Compiler;

// inserite le import per costruttore (vedere @members)
	//import myID3Compiler.util.*;
	import myID3Compiler.SimpleID3Handler;
	import java.io.IOException;
	import java.io.StringReader;
	import java.io.FileReader;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimpleID3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "ESC_SEQ", "HEAD", "HEX_DIGIT", 
		"ID", "OCTAL_ESC", "SCAN_ERROR", "STRING", "UNICODE_ESC", "WS", "'a:'", 
		"'album:'", "'art:'", "'com:'", "'gen:'", "'tit:'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int CHAR=4;
	public static final int ESC_SEQ=5;
	public static final int HEAD=6;
	public static final int HEX_DIGIT=7;
	public static final int ID=8;
	public static final int OCTAL_ESC=9;
	public static final int SCAN_ERROR=10;
	public static final int STRING=11;
	public static final int UNICODE_ESC=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SimpleID3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimpleID3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SimpleID3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g"; }


			SimpleID3Handler h;
	/*		
		  public SimpleJavaParser(String fileIn) throws 
		  								FileNotFoundException, IOException {		
				this(new CommonTokenStream(
								new SimpleJavaLexer(
									new ANTLRReaderStream(
										new FileReader(fileIn)))));
			}
	*/
		  public SimpleID3Parser(FileReader fileIn) throws IOException {		
				this(new CommonTokenStream(
								new SimpleID3Lexer(
										new ANTLRReaderStream(fileIn))));
				h = new SimpleID3Handler (input);
			}
		  public SimpleID3Parser(String docIn) throws IOException {		
				this(new CommonTokenStream(
								new SimpleID3Lexer(
									new ANTLRReaderStream(
												new StringReader (docIn))))); 
				h = new SimpleID3Handler (input);
			}
			
	//**
	  public SimpleID3Handler getHandler() {
	    return h;
	  }
	  
	  public List<String> getErrorList () {
	    return h.getErrorList();
	  }

	  public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			h.handleError(tokenNames, e, hdr, msg);
	  }




	// $ANTLR start "struttura"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:1: struttura : ( musica HEAD corpo ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:10: ( ( musica HEAD corpo ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:66:2: ( musica HEAD corpo )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:66:2: ( musica HEAD corpo )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:66:3: musica HEAD corpo
			{
			pushFollow(FOLLOW_musica_in_struttura51);
			musica();
			state._fsp--;

			match(input,HEAD,FOLLOW_HEAD_in_struttura53); 
			pushFollow(FOLLOW_corpo_in_struttura55);
			corpo();
			state._fsp--;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "struttura"



	// $ANTLR start "musica"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:1: musica : ( . )* ;
	public final void musica() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:7: ( ( . )* )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:9: ( . )*
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:9: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==HEAD) ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= CHAR && LA1_0 <= ESC_SEQ)||(LA1_0 >= HEX_DIGIT && LA1_0 <= 19)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:9: .
					{
					matchAny(input); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "musica"



	// $ANTLR start "corpo"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:73:1: corpo : ( (tit= title art= artist alb= album a= anno com= commento gen= genere ) |);
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:73:7: ( (tit= title art= artist alb= album a= anno com= commento gen= genere ) |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==19) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:2: (tit= title art= artist alb= album a= anno com= commento gen= genere )
					{
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:2: (tit= title art= artist alb= album a= anno com= commento gen= genere )
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:3: tit= title art= artist alb= album a= anno com= commento gen= genere
					{
					pushFollow(FOLLOW_title_in_corpo86);
					tit=title();
					state._fsp--;

					pushFollow(FOLLOW_artist_in_corpo90);
					art=artist();
					state._fsp--;

					pushFollow(FOLLOW_album_in_corpo94);
					alb=album();
					state._fsp--;

					pushFollow(FOLLOW_anno_in_corpo98);
					a=anno();
					state._fsp--;

					pushFollow(FOLLOW_commento_in_corpo102);
					com=commento();
					state._fsp--;

					pushFollow(FOLLOW_genere_in_corpo106);
					gen=genere();
					state._fsp--;

					}

					h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "corpo"



	// $ANTLR start "slot"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:79:1: slot returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> slot() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;
		Token c5=null;
		Token c6=null;
		Token c7=null;
		Token c8=null;
		Token c9=null;
		Token c10=null;
		Token c11=null;
		Token c12=null;
		Token c13=null;
		Token c14=null;
		Token c15=null;
		Token c16=null;
		Token c17=null;
		Token c18=null;
		Token c19=null;
		Token c20=null;
		Token c21=null;
		Token c22=null;
		Token c23=null;
		Token c24=null;
		Token c25=null;
		Token c26=null;
		Token c27=null;
		Token c28=null;
		Token c29=null;
		Token c30=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:81:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:82:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot136); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot140); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot144); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot148); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot152); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot156); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot160); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot164); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot168); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot172); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot178); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot182); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot186); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot190); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot194); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot198); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot202); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot206); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot210); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot214); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot219); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot223); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot227); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot231); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot235); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot239); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot243); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot247); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot251); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot255); 
			p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
				p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
				p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "slot"



	// $ANTLR start "title"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:90:1: title returns [List<Token> p] : 'tit:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> title() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;
		Token c5=null;
		Token c6=null;
		Token c7=null;
		Token c8=null;
		Token c9=null;
		Token c10=null;
		Token c11=null;
		Token c12=null;
		Token c13=null;
		Token c14=null;
		Token c15=null;
		Token c16=null;
		Token c17=null;
		Token c18=null;
		Token c19=null;
		Token c20=null;
		Token c21=null;
		Token c22=null;
		Token c23=null;
		Token c24=null;
		Token c25=null;
		Token c26=null;
		Token c27=null;
		Token c28=null;
		Token c29=null;
		Token c30=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:92:2: ( 'tit:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:92:4: 'tit:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,19,FOLLOW_19_in_title278); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_title283); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_title287); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_title291); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_title295); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_title299); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_title303); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_title307); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_title311); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_title315); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_title319); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_title325); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_title329); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_title333); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_title337); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_title341); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_title345); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_title349); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_title353); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_title357); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_title361); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_title366); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_title370); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_title374); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_title378); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_title382); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_title386); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_title390); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_title394); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_title398); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_title402); 
			p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
				p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
				p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "title"



	// $ANTLR start "artist"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:101:1: artist returns [List<Token> p] : 'art:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> artist() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;
		Token c5=null;
		Token c6=null;
		Token c7=null;
		Token c8=null;
		Token c9=null;
		Token c10=null;
		Token c11=null;
		Token c12=null;
		Token c13=null;
		Token c14=null;
		Token c15=null;
		Token c16=null;
		Token c17=null;
		Token c18=null;
		Token c19=null;
		Token c20=null;
		Token c21=null;
		Token c22=null;
		Token c23=null;
		Token c24=null;
		Token c25=null;
		Token c26=null;
		Token c27=null;
		Token c28=null;
		Token c29=null;
		Token c30=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:103:2: ( 'art:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:103:4: 'art:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,16,FOLLOW_16_in_artist425); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist430); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist434); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist438); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist442); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist446); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist450); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist454); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist458); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist462); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist466); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist472); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist476); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist480); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist484); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist488); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist492); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist496); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist500); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist504); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist508); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist513); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist517); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist521); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist525); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist529); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist533); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist537); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist541); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist545); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist549); 
			p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
				p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
				p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "artist"



	// $ANTLR start "album"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:112:1: album returns [List<Token> p] : 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> album() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;
		Token c5=null;
		Token c6=null;
		Token c7=null;
		Token c8=null;
		Token c9=null;
		Token c10=null;
		Token c11=null;
		Token c12=null;
		Token c13=null;
		Token c14=null;
		Token c15=null;
		Token c16=null;
		Token c17=null;
		Token c18=null;
		Token c19=null;
		Token c20=null;
		Token c21=null;
		Token c22=null;
		Token c23=null;
		Token c24=null;
		Token c25=null;
		Token c26=null;
		Token c27=null;
		Token c28=null;
		Token c29=null;
		Token c30=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:114:2: ( 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:114:4: 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,15,FOLLOW_15_in_album572); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album577); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album581); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album585); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album589); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album593); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album597); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album601); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album605); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album609); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album613); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album619); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album623); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album627); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album631); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album635); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album639); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album643); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album647); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album651); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album655); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album660); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album664); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album668); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album672); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album676); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album680); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album684); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album688); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album692); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album696); 
			p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
				p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
				p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "album"



	// $ANTLR start "anno"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:123:1: anno returns [List<Token> p] : 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:2: ( 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:4: 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,14,FOLLOW_14_in_anno719); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno724); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno728); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno732); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno736); 
			p.add(c1);
				p.add(c2);
				p.add(c3);
				p.add(c4);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "anno"



	// $ANTLR start "commento"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:133:1: commento returns [List<Token> p] : 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> commento() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;
		Token c5=null;
		Token c6=null;
		Token c7=null;
		Token c8=null;
		Token c9=null;
		Token c10=null;
		Token c11=null;
		Token c12=null;
		Token c13=null;
		Token c14=null;
		Token c15=null;
		Token c16=null;
		Token c17=null;
		Token c18=null;
		Token c19=null;
		Token c20=null;
		Token c21=null;
		Token c22=null;
		Token c23=null;
		Token c24=null;
		Token c25=null;
		Token c26=null;
		Token c27=null;
		Token c28=null;
		Token c29=null;
		Token c30=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:135:2: ( 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:135:4: 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,17,FOLLOW_17_in_commento759); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento765); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento769); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento773); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento777); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento781); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento785); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento789); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento793); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento797); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento801); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento807); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento811); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento815); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento819); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento823); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento827); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento831); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento835); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento839); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento843); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento848); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento852); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento856); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento860); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento864); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento868); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento872); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento876); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento880); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento884); 
			p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
				p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
				p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "commento"



	// $ANTLR start "genere"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:148:1: genere returns [Token t] : 'gen:' (p= . )* ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:148:25: ( 'gen:' (p= . )* )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:148:27: 'gen:' (p= . )*
			{
			match(input,18,FOLLOW_18_in_genere901); 
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:3: (p= . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= CHAR && LA3_0 <= 19)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:3: p= .
					{
					p=input.LT(1);
					matchAny(input); 
					}
					break;

				default :
					break loop3;
				}
			}

			t=p;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "genere"

	// Delegated rules



	public static final BitSet FOLLOW_musica_in_struttura51 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_HEAD_in_struttura53 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_corpo_in_struttura55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_title_in_corpo86 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_artist_in_corpo90 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_album_in_corpo94 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_anno_in_corpo98 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_commento_in_corpo102 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_genere_in_corpo106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_slot136 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot140 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot144 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot148 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot152 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot156 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot160 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot164 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot168 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot172 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot178 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot182 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot186 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot190 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot194 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot198 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot202 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot206 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot210 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot214 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot219 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot223 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot227 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot231 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot235 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot239 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot243 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot247 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot251 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_title278 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title283 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title287 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title291 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title295 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title299 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title303 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title307 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title311 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title315 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title319 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title325 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title329 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title333 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title337 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title341 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title345 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title349 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title353 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title357 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title361 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title366 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title370 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title374 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title378 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title382 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title386 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title390 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title394 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title398 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_title402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_artist425 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist430 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist434 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist438 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist442 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist446 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist450 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist454 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist458 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist462 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist466 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist472 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist476 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist480 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist484 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist488 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist492 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist496 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist500 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist504 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist508 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist513 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist517 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist521 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist525 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist529 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist533 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist537 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist541 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist545 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_artist549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_album572 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album577 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album581 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album585 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album589 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album593 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album597 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album601 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album605 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album609 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album613 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album619 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album623 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album627 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album631 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album635 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album639 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album643 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album647 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album651 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album655 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album660 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album664 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album668 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album672 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album676 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album680 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album684 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album688 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album692 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_album696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_anno719 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno724 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno728 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno732 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_commento759 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento765 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento769 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento773 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento777 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento781 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento785 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento789 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento793 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento797 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento801 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento807 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento811 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento815 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento819 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento823 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento827 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento831 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento835 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento839 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento843 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento848 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento852 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento856 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento860 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento864 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento868 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento872 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento876 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento880 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_genere901 = new BitSet(new long[]{0x00000000000FFFF2L});
}
