// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-07 16:53:50

	package myID3Compiler;
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ART_HEAD", "CHAR", "HEAD", "SCAN_ERROR", 
		"TITLE_HEAD", "WS", "'a:'", "'album:'", "'com:'", "'gen:'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ART_HEAD=4;
	public static final int CHAR=5;
	public static final int HEAD=6;
	public static final int SCAN_ERROR=7;
	public static final int TITLE_HEAD=8;
	public static final int WS=9;

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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:1: struttura : ( HEAD corpo ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:10: ( ( HEAD corpo ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:2: ( HEAD corpo )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:2: ( HEAD corpo )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:4: HEAD corpo
			{
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



	// $ANTLR start "corpo"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:61:1: corpo : ( (tit= title art= artist alb= album a= anno com= commento gen= genere ) |);
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:61:7: ( (tit= title art= artist alb= album a= anno com= commento gen= genere ) |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TITLE_HEAD) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:62:2: (tit= title art= artist alb= album a= anno com= commento gen= genere )
					{
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:62:2: (tit= title art= artist alb= album a= anno com= commento gen= genere )
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:62:4: tit= title art= artist alb= album a= anno com= commento gen= genere
					{
					pushFollow(FOLLOW_title_in_corpo81);
					tit=title();
					state._fsp--;

					pushFollow(FOLLOW_artist_in_corpo85);
					art=artist();
					state._fsp--;

					pushFollow(FOLLOW_album_in_corpo89);
					alb=album();
					state._fsp--;

					pushFollow(FOLLOW_anno_in_corpo93);
					a=anno();
					state._fsp--;

					pushFollow(FOLLOW_commento_in_corpo97);
					com=commento();
					state._fsp--;

					pushFollow(FOLLOW_genere_in_corpo101);
					gen=genere();
					state._fsp--;

					}

					h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:2: 
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



	// $ANTLR start "title"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:1: title returns [List<Token> p] : TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:71:2: ( TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:71:5: TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITLE_HEAD,FOLLOW_TITLE_HEAD_in_title142); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_title147); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_title151); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_title155); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_title159); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_title163); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_title167); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_title171); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_title175); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_title179); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_title183); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_title189); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_title193); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_title197); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_title201); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_title205); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_title209); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_title213); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_title217); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_title221); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_title225); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_title230); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_title234); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_title238); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_title242); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_title246); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_title250); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_title254); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_title258); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_title262); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_title266); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:1: artist returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:82:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:82:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artist289); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist294); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist298); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist302); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist306); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist310); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist314); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist318); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist322); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist326); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist330); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist336); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist340); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist344); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist348); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist352); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist356); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist360); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist364); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist368); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist372); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist377); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist381); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist385); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist389); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist393); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist397); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist401); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist405); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist409); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artist413); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:91:1: album returns [List<Token> p] : 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:93:2: ( 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:93:4: 'album:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,11,FOLLOW_11_in_album436); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album441); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album445); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album449); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album453); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album457); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album461); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album465); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album469); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album473); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album477); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album483); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album487); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album491); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album495); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album499); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album503); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album507); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album511); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album515); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album519); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album524); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album528); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album532); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album536); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album540); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album544); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album548); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album552); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album556); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album560); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:102:1: anno returns [List<Token> p] : 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:2: ( 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:4: 'a:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,10,FOLLOW_10_in_anno583); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno588); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno592); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno596); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno600); 
			p.add(c1); p.add(c2); p.add(c3); p.add(c4);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:109:1: commento returns [List<Token> p] : 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:111:2: ( 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:111:4: 'com:' c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,12,FOLLOW_12_in_commento623); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento629); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento633); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento637); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento641); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento645); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento649); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento653); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento657); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento661); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento665); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento671); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento675); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento679); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento683); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento687); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento691); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento695); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento699); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento703); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento707); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento712); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento716); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento720); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento724); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento728); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento732); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento736); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento740); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento744); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento748); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:1: genere returns [Token t] : 'gen:' (p= . )* ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:25: ( 'gen:' (p= . )* )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:27: 'gen:' (p= . )*
			{
			match(input,13,FOLLOW_13_in_genere765); 
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:3: (p= . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ART_HEAD && LA2_0 <= 13)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:3: p= .
					{
					p=input.LT(1);
					matchAny(input); 
					}
					break;

				default :
					break loop2;
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



	public static final BitSet FOLLOW_HEAD_in_struttura53 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_corpo_in_struttura55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_title_in_corpo81 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_artist_in_corpo85 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_album_in_corpo89 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_anno_in_corpo93 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_commento_in_corpo97 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_genere_in_corpo101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_HEAD_in_title142 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title147 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title151 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title155 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title159 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title163 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title167 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title171 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title175 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title179 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title183 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title189 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title193 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title197 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title201 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title205 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title209 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title213 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title217 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title221 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title225 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title230 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title234 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title238 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title242 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title246 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title250 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title254 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title258 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title262 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_title266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artist289 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist294 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist298 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist302 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist306 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist310 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist314 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist318 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist322 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist326 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist330 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist336 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist340 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist344 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist348 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist352 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist356 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist360 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist364 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist368 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist372 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist377 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist381 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist385 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist389 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist393 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist397 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist401 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist405 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist409 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_artist413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_album436 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album441 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album445 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album449 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album453 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album457 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album461 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album465 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album469 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album473 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album483 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album487 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album491 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album495 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album499 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album503 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album507 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album511 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album515 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album519 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album524 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album528 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album532 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album536 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album540 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album544 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album548 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album552 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album556 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_album560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_anno583 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_anno588 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_anno592 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_anno596 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_anno600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_commento623 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento629 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento633 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento637 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento641 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento645 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento649 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento653 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento657 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento661 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento665 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento671 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento675 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento679 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento683 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento687 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento691 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento695 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento699 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento703 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento707 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento712 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento716 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento720 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento724 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento728 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento732 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento736 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento740 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento744 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHAR_in_commento748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_genere765 = new BitSet(new long[]{0x0000000000003FF2L});
}
