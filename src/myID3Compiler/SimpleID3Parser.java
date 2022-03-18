// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-18 21:17:36

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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:1: struttura : ( 'TAG' corpo ) ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:10: ( ( 'TAG' corpo ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:12: ( 'TAG' corpo )
			{
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:12: ( 'TAG' corpo )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:52:13: 'TAG' corpo
			{
			match(input,14,FOLLOW_14_in_struttura49); 
			pushFollow(FOLLOW_corpo_in_struttura51);
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:1: corpo : ( ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) |);
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:54:7: ( ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere ) |)
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
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
					{
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:2: ( CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere )
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:55:4: CANC tit= titolo CANC art= artista CANC alb= album CANC a= anno CANC com= commento CANC gen= genere
					{
					match(input,CANC,FOLLOW_CANC_in_corpo64); 
					pushFollow(FOLLOW_titolo_in_corpo68);
					tit=titolo();
					state._fsp--;

					match(input,CANC,FOLLOW_CANC_in_corpo70); 
					pushFollow(FOLLOW_artista_in_corpo74);
					art=artista();
					state._fsp--;

					match(input,CANC,FOLLOW_CANC_in_corpo76); 
					pushFollow(FOLLOW_album_in_corpo80);
					alb=album();
					state._fsp--;

					match(input,CANC,FOLLOW_CANC_in_corpo82); 
					pushFollow(FOLLOW_anno_in_corpo86);
					a=anno();
					state._fsp--;

					match(input,CANC,FOLLOW_CANC_in_corpo88); 
					pushFollow(FOLLOW_commento_in_corpo92);
					com=commento();
					state._fsp--;

					match(input,CANC,FOLLOW_CANC_in_corpo94); 
					pushFollow(FOLLOW_genere_in_corpo98);
					gen=genere();
					state._fsp--;

					}

					h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:57:2: 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:60:1: titolo returns [List<Token> p] : TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:62:2: ( TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:62:5: TITOLO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,TITOLO_HEAD,FOLLOW_TITOLO_HEAD_in_titolo131); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo136); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo140); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo144); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo148); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo152); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo156); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo160); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo164); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo168); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo172); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo178); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo182); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo186); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo190); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo194); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo198); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo202); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo206); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo210); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo214); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo219); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo223); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo227); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo231); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo235); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo239); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo243); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo247); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo251); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_titolo255); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:72:1: artista returns [List<Token> p] : ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:2: ( ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:4: ART_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ART_HEAD,FOLLOW_ART_HEAD_in_artista285); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista290); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista294); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista298); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista302); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista306); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista310); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista314); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista318); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista322); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista326); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista332); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista336); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista340); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista344); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista348); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista352); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista356); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista360); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista364); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista368); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista373); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista377); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista381); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista385); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista389); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista393); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista397); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista401); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista405); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_artista409); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:85:1: album returns [List<Token> p] : ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:2: ( ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:4: ALBUM_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,ALBUM_HEAD,FOLLOW_ALBUM_HEAD_in_album450); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_album455); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_album459); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_album463); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_album467); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_album471); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_album475); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_album479); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_album483); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_album487); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_album491); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_album497); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_album501); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_album505); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_album509); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_album513); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_album517); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_album521); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_album525); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_album529); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_album533); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_album538); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_album542); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_album546); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_album550); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_album554); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_album558); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_album562); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_album566); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_album570); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_album574); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:97:1: anno returns [List<Token> p] : ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:99:2: ( ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:99:4: ANNO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			match(input,ANNO_HEAD,FOLLOW_ANNO_HEAD_in_anno603); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno608); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno612); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno616); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno620); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:105:1: commento returns [List<Token> p] : COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:107:2: ( COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:107:4: COMMENTO_HEAD c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			match(input,COMMENTO_HEAD,FOLLOW_COMMENTO_HEAD_in_commento648); 
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento654); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento658); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento662); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento666); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento670); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento674); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento678); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento682); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento686); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento690); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento696); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento700); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento704); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento708); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento712); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento716); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento720); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento724); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento728); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento732); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento737); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento741); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento745); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento749); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento753); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento757); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento761); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento765); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento769); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento773); 
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
	// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:117:1: genere returns [Token t] : GENERE_HEAD p= . ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:117:25: ( GENERE_HEAD p= . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:117:27: GENERE_HEAD p= .
			{
			match(input,GENERE_HEAD,FOLLOW_GENERE_HEAD_in_genere795); 
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



	public static final BitSet FOLLOW_14_in_struttura49 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_corpo_in_struttura51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CANC_in_corpo64 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_titolo_in_corpo68 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo70 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_artista_in_corpo74 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo76 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_album_in_corpo80 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo82 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_anno_in_corpo86 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo88 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_commento_in_corpo92 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CANC_in_corpo94 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_genere_in_corpo98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITOLO_HEAD_in_titolo131 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo136 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo140 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo144 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo148 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo152 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo156 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo160 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo164 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo168 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo172 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo178 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo182 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo186 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo190 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo194 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo198 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo202 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo206 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo210 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo214 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo219 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo223 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo227 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo231 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo235 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo239 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo243 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo247 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_titolo255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ART_HEAD_in_artista285 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista290 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista294 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista298 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista302 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista306 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista310 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista314 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista318 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista322 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista326 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista332 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista336 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista340 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista344 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista348 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista352 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista356 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista360 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista364 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista368 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista373 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista377 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista381 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista385 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista389 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista393 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista397 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista401 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista405 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_artista409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALBUM_HEAD_in_album450 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album455 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album459 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album463 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album467 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album471 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album475 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album479 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album483 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album487 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album491 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album497 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album501 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album505 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album509 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album513 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album517 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album521 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album525 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album529 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album533 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album538 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album542 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album546 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album550 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album554 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album558 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album562 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album566 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album570 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_album574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_HEAD_in_anno603 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno608 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno612 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno616 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_anno620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENTO_HEAD_in_commento648 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento654 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento658 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento662 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento666 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento670 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento674 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento678 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento682 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento686 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento690 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento696 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento700 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento704 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento708 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento712 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento716 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento720 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento724 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento728 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento732 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento737 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento741 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento745 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento749 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento753 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento757 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento761 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento765 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento769 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CHAR_in_commento773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_HEAD_in_genere795 = new BitSet(new long[]{0x0000000000007FF0L});
}
