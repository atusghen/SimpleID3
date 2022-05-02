// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-05-03 00:42:48

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
		"CANC", "CHAR", "COMMENTO_HEAD", "GENERE_HEAD", "INT", "SCAN_ERROR", "TITOLO_HEAD", 
		"'TAG'"
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
	public static final int INT=11;
	public static final int SCAN_ERROR=12;
	public static final int TITOLO_HEAD=13;

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
			case CANC:
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:1: corpo : ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) ;
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:7: ( ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:4: CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere
			{
			match(input,CANC,FOLLOW_CANC_in_corpo67); 
			pushFollow(FOLLOW_titolo_in_corpo71);
			tit=titolo();
			state._fsp--;

			match(input,CANC,FOLLOW_CANC_in_corpo73); 
			pushFollow(FOLLOW_artista_in_corpo77);
			art=artista();
			state._fsp--;

			match(input,CANC,FOLLOW_CANC_in_corpo79); 
			pushFollow(FOLLOW_album_in_corpo83);
			alb=album();
			state._fsp--;

			match(input,CANC,FOLLOW_CANC_in_corpo85); 
			pushFollow(FOLLOW_anno_in_corpo89);
			a=anno();
			state._fsp--;

			match(input,CANC,FOLLOW_CANC_in_corpo91); 
			pushFollow(FOLLOW_commento_in_corpo95);
			com=commento();
			state._fsp--;

			match(input,CANC,FOLLOW_CANC_in_corpo97); 
			pushFollow(FOLLOW_genere_in_corpo101);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:59:1: corpo2 : (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) ;
	public final void corpo2() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:59:8: ( (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:3: (tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2 )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:5: tit= slot art= slot alb= slot a= anno2 com= slot gen= genere2
			{
			pushFollow(FOLLOW_slot_in_corpo2121);
			tit=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2125);
			art=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2129);
			alb=slot();
			state._fsp--;

			pushFollow(FOLLOW_anno2_in_corpo2133);
			a=anno2();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo2137);
			com=slot();
			state._fsp--;

			pushFollow(FOLLOW_genere2_in_corpo2141);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:1: slot returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:67:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:68:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot171); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot175); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot179); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot183); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot187); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot191); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot195); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot199); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot203); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot207); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot213); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot217); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot221); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot225); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot229); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot233); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot237); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot241); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot245); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot249); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot254); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot258); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot262); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot266); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot270); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot274); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot278); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot282); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot286); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot290); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:1: titolo returns [List<Token> p] : TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:79:2: ( TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:79:5: TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITOLO_HEAD,FOLLOW_TITOLO_HEAD_in_titolo320); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo325); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo329); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo333); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo337); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo341); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo345); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo349); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo353); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo357); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo361); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo367); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo371); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo375); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo379); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo383); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo387); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo391); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo395); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo399); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo403); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo408); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo412); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo416); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo420); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo424); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo428); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo432); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo436); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo440); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo444); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:89:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:91:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:91:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista474); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista479); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista483); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista487); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista491); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista495); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista499); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista503); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista507); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista511); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista515); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista521); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista525); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista529); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista533); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista537); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista541); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista545); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista549); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista553); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista557); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista562); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista566); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista570); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista574); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista578); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista582); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista586); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista590); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista594); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista598); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:102:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album639); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album644); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album648); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album652); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album656); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album660); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album664); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album668); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album672); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album676); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album680); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album686); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album690); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album694); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album698); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album702); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album706); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album710); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album714); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album718); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album722); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album727); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album731); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album735); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album739); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album743); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album747); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album751); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album755); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album759); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album763); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:114:1: anno returns [List<Token> p] : ANNO_HEAD c1= INT c2= INT c3= INT c4= INT ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:116:2: ( ANNO_HEAD c1= INT c2= INT c3= INT c4= INT )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:116:4: ANNO_HEAD c1= INT c2= INT c3= INT c4= INT
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno792); 
			c1=(Token)match(input,INT,FOLLOW_INT_in_anno797); 
			c2=(Token)match(input,INT,FOLLOW_INT_in_anno801); 
			c3=(Token)match(input,INT,FOLLOW_INT_in_anno805); 
			c4=(Token)match(input,INT,FOLLOW_INT_in_anno809); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:121:1: anno2 returns [List<Token> p] : c1= INT c2= INT c3= INT c4= INT ;
	public final List<Token> anno2() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:123:2: (c1= INT c2= INT c3= INT c4= INT )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:2: c1= INT c2= INT c3= INT c4= INT
			{
			c1=(Token)match(input,INT,FOLLOW_INT_in_anno2836); 
			c2=(Token)match(input,INT,FOLLOW_INT_in_anno2840); 
			c3=(Token)match(input,INT,FOLLOW_INT_in_anno2844); 
			c4=(Token)match(input,INT,FOLLOW_INT_in_anno2848); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:129:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:131:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:131:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento876); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento882); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento886); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento890); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento894); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento898); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento902); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento906); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento910); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento914); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento918); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento924); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento928); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento932); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento936); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento940); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento944); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento948); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento952); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento956); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento960); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento965); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento969); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento973); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento977); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento981); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento985); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento989); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento993); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento997); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento1001); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:141:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:141:25: ( GENERE_HEAD p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:141:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere1023); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:144:1: genere2 returns [Token t] : p= . ;
	public final Token genere2() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:144:26: (p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:144:27: p= .
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



	public static final BitSet FOLLOW_14_in_struttura48 = new BitSet(new long[]{0x0000000000000182L});
	public static final BitSet FOLLOW_corpo_in_struttura51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_corpo2_in_struttura54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CANC_in_corpo67 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_titolo_in_corpo71 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo73 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_artista_in_corpo77 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_album_in_corpo83 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo85 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_anno_in_corpo89 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo91 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_commento_in_corpo95 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo97 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_genere_in_corpo101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slot_in_corpo2121 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2125 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2129 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_anno2_in_corpo2133 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_slot_in_corpo2137 = new BitSet(new long[]{0x0000000000007FF0L});
	public static final BitSet FOLLOW_genere2_in_corpo2141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_slot171 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot175 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot179 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot183 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot187 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot191 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot195 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot199 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot203 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot207 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot213 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot217 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot225 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot229 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot233 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot237 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot241 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot245 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot249 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot254 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot258 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot262 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot266 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot270 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot274 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot278 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot282 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot286 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_slot290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITOLO_HEAD_in_titolo320 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo325 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo329 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo333 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo337 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo341 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo345 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo349 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo353 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo357 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo361 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo371 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo375 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo379 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo383 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo387 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo391 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo395 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo399 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo403 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo408 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo412 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo416 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo420 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo424 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo428 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo432 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo436 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo440 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista474 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista479 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista483 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista487 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista491 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista495 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista499 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista503 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista507 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista511 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista515 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista521 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista525 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista529 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista533 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista537 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista541 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista545 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista549 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista553 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista557 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista562 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista566 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista570 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista574 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista578 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista582 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista586 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista590 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista594 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album639 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album644 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album648 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album652 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album656 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album660 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album664 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album668 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album672 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album676 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album680 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album686 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album690 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album694 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album698 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album702 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album706 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album710 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album714 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album718 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album722 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album727 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album731 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album735 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album739 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album743 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album747 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album751 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album755 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album759 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno792 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno797 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno801 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno805 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_anno2836 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno2840 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno2844 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_anno2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento876 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento882 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento886 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento890 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento894 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento898 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento902 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento906 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento910 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento914 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento918 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento924 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento928 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento932 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento936 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento940 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento944 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento948 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento952 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento956 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento960 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento965 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento969 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento973 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento977 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento981 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento985 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento989 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento993 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento997 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere1023 = new BitSet(new long[]{0x0000000000007FF0L});
}
