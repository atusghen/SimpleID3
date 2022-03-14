// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-14 22:12:23

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
		"CHAR", "COMMENTO_HEAD", "GENERE_HEAD", "SCAN_ERROR", "TITLE_HEAD", "WS", 
		"'TAG'"
	};
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int ALBUM_HEAD=4;
	public static final int ANNO_HEAD=5;
	public static final int ART_HEAD=6;
	public static final int CHAR=7;
	public static final int COMMENTO_HEAD=8;
	public static final int GENERE_HEAD=9;
	public static final int SCAN_ERROR=10;
	public static final int TITLE_HEAD=11;
	public static final int WS=12;

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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:1: struttura : ( 'TAG' corpo ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:10: ( ( 'TAG' corpo ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:12: ( 'TAG' corpo )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:12: ( 'TAG' corpo )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:13: 'TAG' corpo
			{
			match(input,13,FOLLOW_13_in_struttura50); 
			pushFollow(FOLLOW_corpo_in_struttura52);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:57:1: corpo : ( (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) |);
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:57:7: ( (tit= titolo art= artista alb= album a= anno com= commento gen= genere ) |)
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
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:2: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
					{
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:2: (tit= titolo art= artista alb= album a= anno com= commento gen= genere )
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:4: tit= titolo art= artista alb= album a= anno com= commento gen= genere
					{
					pushFollow(FOLLOW_titolo_in_corpo69);
					tit=titolo();
					state._fsp--;

					pushFollow(FOLLOW_artista_in_corpo73);
					art=artista();
					state._fsp--;

					pushFollow(FOLLOW_album_in_corpo77);
					alb=album();
					state._fsp--;

					pushFollow(FOLLOW_anno_in_corpo81);
					a=anno();
					state._fsp--;

					pushFollow(FOLLOW_commento_in_corpo85);
					com=commento();
					state._fsp--;

					pushFollow(FOLLOW_genere_in_corpo89);
					gen=genere();
					state._fsp--;

					}

					h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:2: 
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



	// $ANTLR start "titolo"
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:63:1: titolo returns [List<Token> p] : TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:2: ( TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:5: TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITLE_HEAD,FOLLOW_TITLE_HEAD_in_titolo122); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo127); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo131); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo135); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo139); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo143); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo147); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo151); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo155); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo159); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo163); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo169); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo173); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo177); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo181); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo185); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo189); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo193); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo197); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo201); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo205); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo210); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo214); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo218); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo222); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo226); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo230); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo234); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo238); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo242); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo246); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:75:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista276); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista281); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista285); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista289); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista293); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista297); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista301); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista305); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista309); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista313); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista317); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista323); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista327); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista331); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista335); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista339); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista343); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista347); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista351); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista355); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista359); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista364); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista368); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista372); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista376); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista380); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista384); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista388); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista392); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista396); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista400); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:89:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:89:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album428); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album433); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album437); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album441); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album445); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album449); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album453); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album457); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album461); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album465); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album469); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album475); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album479); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album483); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album487); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album491); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album495); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album499); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album503); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album507); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album511); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album516); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album520); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album524); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album528); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album532); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album536); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album540); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album544); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album548); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album552); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:99:1: anno returns [List<Token> p] : ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:101:2: ( ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:101:4: ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno580); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno585); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno589); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno593); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno597); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:107:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:109:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:109:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento625); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento631); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento635); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento639); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento643); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento647); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento651); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento655); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento659); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento663); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento667); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento673); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento677); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento681); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento685); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento689); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento693); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento697); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento701); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento705); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento709); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento714); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento718); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento722); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento726); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento730); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento734); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento738); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento742); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento746); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento750); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:25: ( GENERE_HEAD p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:124:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere774); 
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

	// Delegated rules



	public static final BitSet FOLLOW_13_in_struttura50 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_corpo_in_struttura52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_titolo_in_corpo69 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_artista_in_corpo73 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_album_in_corpo77 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_anno_in_corpo81 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_commento_in_corpo85 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_genere_in_corpo89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITLE_HEAD_in_titolo122 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo127 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo131 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo139 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo143 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo147 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo151 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo155 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo159 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo163 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo169 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo173 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo177 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo181 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo185 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo189 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo193 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo197 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo201 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo205 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo210 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo214 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo218 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo222 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo226 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo230 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo234 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo238 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo242 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_titolo246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista276 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista281 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista285 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista289 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista293 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista297 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista301 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista305 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista309 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista313 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista317 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista323 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista327 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista331 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista335 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista339 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista343 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista347 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista351 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista355 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista359 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista364 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista368 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista372 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista376 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista380 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista384 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista388 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista392 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista396 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_artista400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album428 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album433 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album437 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album441 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album445 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album449 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album453 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album457 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album461 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album465 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album469 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album475 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album479 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album483 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album487 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album491 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album495 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album499 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album503 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album507 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album511 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album516 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album520 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album524 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album528 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album532 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album536 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album540 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album544 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album548 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_album552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno580 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_anno585 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_anno589 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_anno593 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_anno597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento625 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento631 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento635 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento639 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento643 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento647 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento651 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento655 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento659 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento663 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento667 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento673 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento677 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento681 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento685 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento689 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento693 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento697 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento701 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento705 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento709 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento714 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento718 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento722 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento726 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento730 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento734 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento738 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento742 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento746 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_commento750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere774 = new BitSet(new long[]{0x0000000000003FF0L});
}
