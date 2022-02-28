// $ANTLR 3.5.1 C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-02-28 19:23:33

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
		"ID", "OCTAL_ESC", "SCAN_ERROR", "STRING", "UNICODE_ESC", "WS"
	};
	public static final int EOF=-1;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g"; }


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


	  public void displayRecognitionError(String[] tokenNames,
	                                       RecognitionException e) {
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			  
			h.handleError(tokenNames, e, hdr, msg);
	  }





	// $ANTLR start "struttura"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:72:1: struttura : musica HEAD corpo ;
	public final void struttura() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:73:2: ( musica HEAD corpo )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:74:2: musica HEAD corpo
			{
			pushFollow(FOLLOW_musica_in_struttura55);
			musica();
			state._fsp--;

			match(input,HEAD,FOLLOW_HEAD_in_struttura59); 
			pushFollow(FOLLOW_corpo_in_struttura64);
			corpo();
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
	// $ANTLR end "struttura"



	// $ANTLR start "musica"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:2: musica : ( . )* ;
	public final void musica() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:8: ( ( . )* )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:10: ( . )*
			{
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:10: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==HEAD) ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= CHAR && LA1_0 <= ESC_SEQ)||(LA1_0 >= HEX_DIGIT && LA1_0 <= WS)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:80:10: .
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
		//catch (RecognitionException re) {	reportError(re);recover(input,re);	}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "musica"



	// $ANTLR start "corpo"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:86:1: corpo : (tit= slot art= slot alb= slot a= anno com= slot gen= genere ) ;
	public final void corpo() throws RecognitionException {
		List<Token> tit =null;
		List<Token> art =null;
		List<Token> alb =null;
		List<Token> a =null;
		List<Token> com =null;
		Token gen =null;

		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:86:7: ( (tit= slot art= slot alb= slot a= anno com= slot gen= genere ) )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:2: (tit= slot art= slot alb= slot a= anno com= slot gen= genere )
			{
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:2: (tit= slot art= slot alb= slot a= anno com= slot gen= genere )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:87:3: tit= slot art= slot alb= slot a= anno com= slot gen= genere
			{
			pushFollow(FOLLOW_slot_in_corpo99);
			tit=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo103);
			art=slot();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo107);
			alb=slot();
			state._fsp--;

			pushFollow(FOLLOW_anno_in_corpo111);
			a=anno();
			state._fsp--;

			pushFollow(FOLLOW_slot_in_corpo115);
			com=slot();
			state._fsp--;

			pushFollow(FOLLOW_genere_in_corpo119);
			gen=genere();
			state._fsp--;

			}

			h.stampaslot(tit); 
			 h.stampaslot(art);
			 h.stampaslot(alb);
			 h.stampaslot(a);
			 h.stampaslot(com);
			 h.stampaslot(gen);
			 
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
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:97:1: slot returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR ;
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
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:99:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:100:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR c29= CHAR c30= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot147); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot151); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot155); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot159); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot163); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot167); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot171); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot175); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot179); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot183); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot189); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot193); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot197); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot201); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot205); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot209); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot213); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot217); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot221); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot225); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot230); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot234); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot238); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot242); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot246); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot250); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot254); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot258); 
			c29=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot262); 
			c30=(Token)match(input,CHAR,FOLLOW_CHAR_in_slot266); 
			p.add(c1);
				p.add(c2);
				p.add(c3);
				p.add(c4);
				p.add(c5);
				p.add(c6);
				p.add(c7);
				p.add(c8);
				p.add(c9);
				p.add(c10);
				p.add(c11);
				p.add(c12);
				p.add(c13);
				p.add(c14);
				p.add(c15);
				p.add(c16);
				p.add(c17);
				p.add(c18);
				p.add(c19);
				p.add(c20);
				p.add(c21);
				p.add(c22);
				p.add(c23);
				p.add(c24);
				p.add(c25);
				p.add(c26);
				p.add(c27);
				p.add(c28);
				p.add(c29);
				p.add(c30);
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



	// $ANTLR start "anno"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:135:1: anno returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR ;
	public final List<Token> anno() throws RecognitionException {
		List<Token> p = null;


		Token c1=null;
		Token c2=null;
		Token c3=null;
		Token c4=null;

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:137:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:138:2: c1= CHAR c2= CHAR c3= CHAR c4= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno293); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno297); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno301); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_anno305); 
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



	// $ANTLR start "genere"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:145:1: genere returns [Token t] : (p= . )* ;
	public final Token genere() throws RecognitionException {
		Token t = null;


		Token p=null;

		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:145:25: ( (p= . )* )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:2: (p= . )*
			{
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:3: (p= . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= CHAR && LA2_0 <= WS)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:146:3: p= .
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
		//catch (RecognitionException re) {	reportError(re);	recover(input,re);}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "genere"



	// $ANTLR start "commento"
	// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:149:1: commento returns [List<Token> p] : c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR ;
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

		 p = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:151:2: (c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:152:4: c1= CHAR c2= CHAR c3= CHAR c4= CHAR c5= CHAR c6= CHAR c7= CHAR c8= CHAR c9= CHAR c10= CHAR c11= CHAR c12= CHAR c13= CHAR c14= CHAR c15= CHAR c16= CHAR c17= CHAR c18= CHAR c19= CHAR c20= CHAR c21= CHAR c22= CHAR c23= CHAR c24= CHAR c25= CHAR c26= CHAR c27= CHAR c28= CHAR
			{
			c1=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento352); 
			c2=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento356); 
			c3=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento360); 
			c4=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento364); 
			c5=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento368); 
			c6=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento372); 
			c7=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento376); 
			c8=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento380); 
			c9=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento384); 
			c10=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento388); 
			c11=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento394); 
			c12=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento398); 
			c13=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento402); 
			c14=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento406); 
			c15=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento410); 
			c16=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento414); 
			c17=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento418); 
			c18=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento422); 
			c19=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento426); 
			c20=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento430); 
			c21=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento435); 
			c22=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento439); 
			c23=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento443); 
			c24=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento447); 
			c25=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento451); 
			c26=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento455); 
			c27=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento459); 
			c28=(Token)match(input,CHAR,FOLLOW_CHAR_in_commento463); 
			p.add(c1);
				p.add(c2);
				p.add(c3);
				p.add(c4);
				p.add(c5);
				p.add(c6);
				p.add(c7);
				p.add(c8);
				p.add(c9);
				p.add(c10);
				p.add(c11);
				p.add(c12);
				p.add(c13);
				p.add(c14);
				p.add(c15);
				p.add(c16);
				p.add(c17);
				p.add(c18);
				p.add(c19);
				p.add(c20);
				p.add(c21);
				p.add(c22);
				p.add(c23);
				p.add(c24);
				p.add(c25);
				p.add(c26);
				p.add(c27);
				p.add(c28);
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

	// Delegated rules



	public static final BitSet FOLLOW_musica_in_struttura55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_HEAD_in_struttura59 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_corpo_in_struttura64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slot_in_corpo99 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_slot_in_corpo103 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_slot_in_corpo107 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_anno_in_corpo111 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_slot_in_corpo115 = new BitSet(new long[]{0x0000000000003FF0L});
	public static final BitSet FOLLOW_genere_in_corpo119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_slot147 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot151 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot155 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot159 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot163 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot167 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot171 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot175 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot179 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot183 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot189 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot193 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot197 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot201 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot205 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot209 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot213 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot217 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot221 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot225 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot230 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot234 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot238 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot242 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot246 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot250 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot254 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot258 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot262 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_slot266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_anno293 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno297 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno301 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_anno305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_commento352 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento356 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento360 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento364 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento368 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento372 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento376 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento380 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento384 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento388 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento394 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento398 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento402 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento406 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento410 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento414 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento418 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento426 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento430 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento435 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento439 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento443 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento447 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento451 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento455 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento459 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CHAR_in_commento463 = new BitSet(new long[]{0x0000000000000002L});
}
