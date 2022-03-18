// $ANTLR 3.5.1 C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-18 15:21:33

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
		"CANC", "CHAR", "COMMENTO_HEAD", "GENERE_HEAD", "SCAN_ERROR", "TITLE_HEAD", 
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
	public static final int TITLE_HEAD=12;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g"; }


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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:1: struttura : ( 'TAG' corpo ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:10: ( ( 'TAG' corpo ) )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:12: ( 'TAG' corpo )
			{
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:12: ( 'TAG' corpo )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:53:13: 'TAG' corpo
			{
			match(input,14,FOLLOW_14_in_struttura50); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:57:1: corpo : ( ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) |);
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:57:7: ( ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CANC) ) {
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
					// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
					{
					// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
					// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:58:4: CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere
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
					break;
				case 2 :
					// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:2: 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:63:1: titolo returns [List<Token> p] : TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:2: ( TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:65:5: TITLE_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITLE_HEAD,FOLLOW_TITLE_HEAD_in_titolo134); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo139); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo143); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo147); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo151); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo155); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo159); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo163); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo167); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo171); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo175); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo181); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo185); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo189); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo193); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo197); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo201); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo205); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo209); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo213); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo217); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo222); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo226); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo230); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo234); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo238); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo242); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo246); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo250); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo254); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo258); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:75:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:77:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista288); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista293); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista297); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista301); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista305); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista309); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista313); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista317); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista321); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista325); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista329); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista335); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista339); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista343); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista347); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista351); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista355); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista359); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista363); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista367); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista371); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista376); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista380); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista384); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista388); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista392); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista396); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista400); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista404); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista408); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista412); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:88:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:90:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:90:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album453); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album458); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album462); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album466); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album470); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album474); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album478); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album482); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album486); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album490); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album494); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album500); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album504); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album508); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album512); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album516); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album520); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album524); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album528); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album532); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album536); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album541); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album545); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album549); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album553); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album557); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album561); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album565); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album569); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album573); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album577); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:100:1: anno returns [List<Token> p] : ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:102:2: ( ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:102:4: ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno606); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno611); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno615); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno619); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno623); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:108:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:110:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:110:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento651); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento657); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento661); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento665); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento669); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento673); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento677); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento681); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento685); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento689); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento693); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento699); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento703); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento707); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento711); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento715); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento719); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento723); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento727); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento731); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento735); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento740); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento744); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento748); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento752); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento756); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento760); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento764); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento768); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento772); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento776); 
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
	// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:25: ( GENERE_HEAD p= . )
			// C:\\Users\\fabio\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere800); 
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



	public static final BitSet FOLLOW_14_in_struttura50 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_corpo_in_struttura52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CANC_in_corpo67 = new BitSet(new long[]{0x0000000000001000L});
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
	public static final BitSet FOLLOW_TITLE_HEAD_in_titolo134 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo139 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo143 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo147 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo151 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo155 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo159 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo163 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo167 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo171 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo175 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo181 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo185 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo189 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo193 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo197 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo201 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo205 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo209 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo213 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo217 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo222 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo226 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo230 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo234 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo238 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo242 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo250 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo254 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista288 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista293 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista297 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista301 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista305 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista309 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista313 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista317 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista321 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista325 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista329 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista335 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista339 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista343 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista347 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista351 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista355 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista359 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista363 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista371 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista376 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista380 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista384 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista388 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista392 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista396 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista400 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista404 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista408 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album453 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album458 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album462 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album466 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album470 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album474 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album478 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album482 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album486 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album490 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album494 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album500 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album504 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album508 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album512 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album516 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album520 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album524 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album528 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album532 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album536 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album541 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album545 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album549 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album553 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album557 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album561 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album565 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album569 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album573 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno606 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno611 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno615 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno619 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento651 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento657 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento661 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento665 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento669 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento673 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento677 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento681 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento685 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento689 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento693 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento699 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento703 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento707 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento711 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento715 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento719 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento723 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento727 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento731 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento735 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento740 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento744 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento748 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento752 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento756 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento760 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento764 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento768 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento772 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere800 = new BitSet(new long[]{0x0000000000007FF0L});
}
