// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-05-06 19:15:49

	package myID3Compiler;
	import myID3Compiler.SimpleID3Handler;
	import java.io.IOException;
	import java.io.StringReader;
	import java.io.FileReader;
	import java.io.BufferedReader;


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

		  //public SimpleID3Parser(FileReader fileIn) throws IOException {
		  public SimpleID3Parser(BufferedReader fileIn) throws IOException {			
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




	// $ANTLR start "superstruttura"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:1: superstruttura : musica struttura ;
	public final void superstruttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:15: ( musica struttura )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:17: musica struttura
			{
			pushFollow(FOLLOW_musica_in_superstruttura47);
			musica();
			state._fsp--;

			pushFollow(FOLLOW_struttura_in_superstruttura49);
			struttura();
			state._fsp--;

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
	// $ANTLR end "superstruttura"



	// $ANTLR start "musica"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:1: musica : ( . )* ;
	public final void musica() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:8: ( ( . )* )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:10: ( . )*
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:10: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= ALBUM_HEAD && LA1_0 <= WS)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:10: .
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



	// $ANTLR start "struttura"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:1: struttura : 'TAG' ( corpo || corpo2 ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:10: ( 'TAG' ( corpo || corpo2 ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:12: 'TAG' ( corpo || corpo2 )
			{
			match(input,14,FOLLOW_14_in_struttura64); 
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:18: ( corpo || corpo2 )
			int alt2=3;
			switch ( input.LA(1) ) {
			case TITOLO_HEAD:
				{
				alt2=1;
				}
				break;
			case EOF:
				{
				alt2=2;
				}
				break;
			case CHAR:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:19: corpo
					{
					pushFollow(FOLLOW_corpo_in_struttura67);
					corpo();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:25: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:56:26: corpo2
					{
					pushFollow(FOLLOW_corpo2_in_struttura70);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:1: corpo : (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) ;
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:7: ( (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:3: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:3: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:6: tit= titolo art= artista alb= album a= anno com= commento gen= genere
			{
			pushFollow(FOLLOW_titolo_in_corpo89);
			tit=titolo();
			state._fsp--;

			pushFollow(FOLLOW_artista_in_corpo94);
			art=artista();
			state._fsp--;

			pushFollow(FOLLOW_album_in_corpo99);
			alb=album();
			state._fsp--;

			pushFollow(FOLLOW_anno_in_corpo104);
			a=anno();
			state._fsp--;

			pushFollow(FOLLOW_commento_in_corpo109);
			com=commento();
			state._fsp--;

			pushFollow(FOLLOW_genere_in_corpo114);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:64:1: corpo2 : (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) ;
	public final void corpo2() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:64:8: ( (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:5: tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2
			{
			pushFollow(FOLLOW_slot_in_corpo2134);
			tit=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2138);
			art=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2142);
			alb=slot();
			state._fsp--;

			pushFollow(FOLLOW_anno2_in_corpo2146);
			a=anno2();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2150);
			com=slot();
			state._fsp--;

			pushFollow(FOLLOW_genere2_in_corpo2154);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:70:1: slot returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:72:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:73:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot184); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot188); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot192); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot196); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot200); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot204); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot208); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot212); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot216); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot220); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot226); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot230); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot234); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot238); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot242); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot246); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot250); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot254); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot258); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot262); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot267); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot271); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot275); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot279); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot283); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot287); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot291); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot295); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot299); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot303); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:82:1: titolo returns [List<Token> p] : TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:84:2: ( TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:84:5: TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITOLO_HEAD,FOLLOW_TITOLO_HEAD_in_titolo333); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo338); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo342); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo346); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo350); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo354); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo358); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo362); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo366); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo370); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo374); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo380); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo384); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo388); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo392); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo396); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo400); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo404); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo408); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo412); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo416); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo421); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo425); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo429); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo433); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo437); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo441); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo445); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo449); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo453); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo457); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:94:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:96:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:96:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista487); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista492); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista496); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista500); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista504); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista508); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista512); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista516); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista520); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista524); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista528); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista534); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista538); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista542); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista546); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista550); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista554); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista558); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista562); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista566); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista570); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista575); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista579); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista583); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista587); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista591); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista595); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista599); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista603); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista607); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista611); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:107:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:109:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:109:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album652); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album657); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album661); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album665); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album669); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album673); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album677); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album681); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album685); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album689); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album693); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album699); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album703); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album707); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album711); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album715); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album719); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album723); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album727); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album731); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album735); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album740); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album744); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album748); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album752); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album756); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album760); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album764); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album768); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album772); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album776); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:119:1: anno returns [List<Token> p] : ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:121:2: ( ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:121:4: ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno805); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno810); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno814); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno818); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno822); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:126:1: anno2 returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno2() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:128:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:129:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2849); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2853); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2857); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno2861); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:134:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:136:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:136:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento889); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento895); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento899); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento903); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento907); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento911); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento915); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento919); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento923); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento927); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento931); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento937); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento941); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento945); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento949); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento953); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento957); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento961); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento965); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento969); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento973); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento978); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento982); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento986); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento990); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento994); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento998); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento1002); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento1006); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento1010); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento1014); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:25: ( GENERE_HEAD p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere1036); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:1: genere2 returns [Token t] : p= . ;
	public final Token genere2() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:26: (p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:27: p= .
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



	public static final BitSet FOLLOW_musica_in_superstruttura47 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_struttura_in_superstruttura49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_struttura64 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_corpo_in_struttura67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_corpo2_in_struttura70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titolo_in_corpo89 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_artista_in_corpo94 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_album_in_corpo99 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_anno_in_corpo104 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_commento_in_corpo109 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_genere_in_corpo114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slot_in_corpo2134 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2138 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2142 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_anno2_in_corpo2146 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2150 = new BitSet(new long[]{0x0000000000007FF0L});
	public static final BitSet FOLLOW_genere2_in_corpo2154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_slot184 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot188 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot192 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot196 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot200 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot204 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot208 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot212 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot216 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot220 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot226 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot230 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot234 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot238 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot242 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot250 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot254 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot258 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot262 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot267 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot271 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot275 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot279 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot283 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot287 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot291 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot295 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot299 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITOLO_HEAD_in_titolo333 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo338 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo342 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo346 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo350 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo354 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo358 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo362 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo366 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo370 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo374 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo380 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo384 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo388 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo392 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo396 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo400 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo404 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo408 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo412 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo416 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo421 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo425 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo429 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo433 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo437 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo441 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo445 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo449 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo453 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista487 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista492 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista496 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista500 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista504 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista508 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista512 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista516 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista520 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista524 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista528 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista534 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista538 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista542 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista546 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista550 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista554 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista558 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista562 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista566 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista570 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista575 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista579 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista583 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista587 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista591 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista595 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista599 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista603 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista607 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album652 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album657 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album661 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album665 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album669 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album673 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album677 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album681 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album685 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album689 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album693 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album699 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album703 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album707 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album711 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album715 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album719 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album723 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album727 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album731 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album735 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album740 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album744 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album748 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album752 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album756 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album760 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album764 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album768 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album772 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno805 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno810 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno814 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno818 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_anno2849 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2853 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2857 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno2861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento889 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento895 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento899 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento903 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento907 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento911 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento915 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento919 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento923 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento927 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento931 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento937 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento941 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento945 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento949 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento953 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento957 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento961 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento965 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento969 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento973 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento978 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento982 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento986 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento990 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento994 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento998 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento1002 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento1006 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento1010 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere1036 = new BitSet(new long[]{0x0000000000007FF0L});
}
