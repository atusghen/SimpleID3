// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-05-03 11:54:59

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALBUM_HEAD", "ANNO_HEAD", "ART_HEAD", 
		"CANC", "CHAR", "COMMENTO_HEAD", "GENERE_HEAD", "SCAN_ERROR", "TITOLO_HEAD", 
		"WS", "'TAG'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int ALBUM_HEAD=4;
	public static final int ANNO_HEAD=5;
	public static final int ART_HEAD=6;
	public static final int CANC=7;
	public static final int CHAR=8;
	public static final int COMMENTO_HEAD=9;
	public static final int GENERE_HEAD=10;
	public static final int SCAN_ERROR=11;
	public static final int TITOLO_HEAD=12;
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:1: struttura : 'TAG' ( corpo || corpo2 ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:10: ( 'TAG' ( corpo || corpo2 ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:12: 'TAG' ( corpo || corpo2 )
			{
			match(input,14,FOLLOW_14_in_struttura48); 
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:18: ( corpo || corpo2 )
			int alt1=3;
			switch ( input.LA(1) ) {
			case TITOLO_HEAD:
				{
				alt1=1;
				}
				break;
			case EOF:
				{
				alt1=2;
				}
				break;
			case CHAR:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:19: corpo
					{
					pushFollow(FOLLOW_corpo_in_struttura51);
					corpo();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:25: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:26: corpo2
					{
					pushFollow(FOLLOW_corpo2_in_struttura54);
					corpo2();
					state._fsp--;

					}
					break;

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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:1: corpo : (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) ;
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:7: ( (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:3: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:3: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:6: tit= titolo art= artista alb= album a= anno com= commento gen= genere
			{
			pushFollow(FOLLOW_titolo_in_corpo73);
			tit=titolo();
			state._fsp--;

			pushFollow(FOLLOW_artista_in_corpo78);
			art=artista();
			state._fsp--;

			pushFollow(FOLLOW_album_in_corpo83);
			alb=album();
			state._fsp--;

			pushFollow(FOLLOW_anno_in_corpo88);
			a=anno();
			state._fsp--;

			pushFollow(FOLLOW_commento_in_corpo93);
			com=commento();
			state._fsp--;

			pushFollow(FOLLOW_genere_in_corpo98);
			gen=genere();
			state._fsp--;

			}

			h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
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



	// $ANTLR start "corpo2"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:1: corpo2 : (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) ;
	public final void corpo2() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:8: ( (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:61:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:61:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:61:5: tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2
			{
			pushFollow(FOLLOW_slot_in_corpo2118);
			tit=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2122);
			art=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2126);
			alb=slot();
			state._fsp--;

			pushFollow(FOLLOW_anno2_in_corpo2130);
			a=anno2();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2134);
			com=slot();
			state._fsp--;

			pushFollow(FOLLOW_genere2_in_corpo2138);
			gen=genere2();
			state._fsp--;

			}

			h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
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
	// $ANTLR end "corpo2"



	// $ANTLR start "slot"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:66:1: slot returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:68:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:69:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot168); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot172); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot176); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot180); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot184); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot188); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot192); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot196); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot200); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot204); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot210); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot214); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot218); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot222); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot226); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot230); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot234); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot238); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot242); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot246); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot251); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot255); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot259); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot263); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot267); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot271); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot275); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot279); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot283); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot287); 
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



	// $ANTLR start "titolo"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:78:1: titolo returns [List<Token> p] : TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> titolo() throws RecognitionException {
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:2: ( TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:5: TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITOLO_HEAD,FOLLOW_TITOLO_HEAD_in_titolo317); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo322); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo326); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo330); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo334); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo338); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo342); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo346); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo350); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo354); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo358); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo364); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo368); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo372); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo376); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo380); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo384); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo388); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo392); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo396); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo400); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo405); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo409); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo413); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo417); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo421); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo425); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo429); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo433); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo437); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo441); 
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
	// $ANTLR end "titolo"



	// $ANTLR start "artista"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:90:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
	public final List<Token> artista() throws RecognitionException {
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:92:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:92:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista471); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista476); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista480); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista484); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista488); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista492); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista496); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista500); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista504); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista508); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista512); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista518); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista522); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista526); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista530); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista534); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista538); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista542); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista546); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista550); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista554); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista559); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista563); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista567); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista571); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista575); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista579); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista583); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista587); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista591); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista595); 
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
	// $ANTLR end "artista"



	// $ANTLR start "album"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:103:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:105:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:105:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album636); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album641); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album645); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album649); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album653); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album657); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album661); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album665); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album669); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album673); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album677); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album683); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album687); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album691); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album695); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album699); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album703); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album707); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album711); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album715); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album719); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album724); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album728); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album732); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album736); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album740); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album744); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album748); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album752); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album756); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album760); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:115:1: anno returns [List<Token> p] : ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:117:2: ( ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:117:4: ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno789); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno794); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno798); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno802); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno806); 
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



	// $ANTLR start "anno2"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:122:1: anno2 returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno2() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2833); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2837); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2841); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2845); 
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
	// $ANTLR end "anno2"



	// $ANTLR start "commento"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:130:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:132:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:132:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento873); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento879); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento883); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento887); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento891); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento895); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento899); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento903); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento907); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento911); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento915); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento921); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento925); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento929); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento933); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento937); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento941); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento945); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento949); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento953); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento957); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento962); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento966); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento970); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento974); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento978); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento982); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento986); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento990); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento994); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento998); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:142:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:142:25: ( GENERE_HEAD p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:142:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere1020); 
			p=input.LT(1);
			matchAny(input); 
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



	// $ANTLR start "genere2"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:145:1: genere2 returns [Token t] : p= . ;
	public final Token genere2() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:145:26: (p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:145:27: p= .
			{
			p=input.LT(1);
			matchAny(input); 
			t=p;
			}

		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "genere2"

	// Delegated rules



	public static final BitSet FOLLOW_14_in_struttura48 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_corpo_in_struttura51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_corpo2_in_struttura54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titolo_in_corpo73 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_artista_in_corpo78 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_album_in_corpo83 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_anno_in_corpo88 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_commento_in_corpo93 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_genere_in_corpo98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slot_in_corpo2118 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2122 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2126 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_anno2_in_corpo2130 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2134 = new BitSet(new long[]{0x0000000000007FF0L});
	public static final BitSet FOLLOW_genere2_in_corpo2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_slot168 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot172 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot176 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot180 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot184 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot188 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot192 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot196 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot200 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot204 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot210 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot214 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot218 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot222 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot226 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot230 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot234 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot238 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot242 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot255 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot259 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot263 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot267 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot271 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot275 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot279 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot283 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITOLO_HEAD_in_titolo317 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo322 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo326 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo330 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo334 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo338 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo342 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo346 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo350 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo354 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo358 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo364 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo368 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo372 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo376 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo380 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo384 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo388 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo392 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo396 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo400 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo405 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo409 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo413 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo417 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo421 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo425 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo429 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo433 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo437 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista471 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista476 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista480 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista484 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista488 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista492 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista496 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista500 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista504 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista508 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista512 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista518 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista522 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista526 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista530 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista534 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista538 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista542 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista546 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista550 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista554 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista559 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista563 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista567 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista571 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista575 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista579 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista583 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista587 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista591 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album636 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album641 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album645 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album649 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album653 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album657 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album661 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album665 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album669 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album673 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album677 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album683 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album687 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album691 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album695 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album699 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album703 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album707 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album711 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album715 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album719 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album724 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album728 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album732 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album736 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album740 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album744 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album748 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album752 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album756 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno789 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno794 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno798 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno802 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_anno2833 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2837 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2841 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento873 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento879 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento883 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento887 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento891 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento895 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento899 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento903 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento907 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento911 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento915 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento921 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento925 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento929 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento933 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento937 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento941 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento945 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento949 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento953 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento957 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento962 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento966 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento970 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento974 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento978 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento982 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento986 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento990 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento994 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere1020 = new BitSet(new long[]{0x0000000000007FF0L});
}
