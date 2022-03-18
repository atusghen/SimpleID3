grammar SimpleID3;

options {
	language = Java; k=1;
}

@lexer::header {
	package myID3Compiler;
}

@header {
	package myID3Compiler;
	import myID3Compiler.SimpleID3Handler;
	import java.io.IOException;
	import java.io.StringReader;
	import java.io.FileReader;
}

@members {
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

}

//HEAD: 'TAG'; se uso questa testa da subito errore all'inizio
struttura: ('TAG' corpo);

//musica: .*;//se aggiungo il ? funziona ma da errore in console
 
corpo :
 ( CANC tit=titolo CANC art=artista CANC alb=album CANC a=anno CANC com=commento CANC gen=genere)
 {h.stampaslot(tit); h.stampaslot(art); h.stampaslot(alb); h.stampaslot(a); h.stampaslot(com); h.stampaslot(gen);}|
	;
	
TITLE_HEAD: 'tit:';
titolo returns [List<Token> p]
@init { p = new ArrayList<Token>();}
	:  TITLE_HEAD
	c1=CHAR c2=CHAR c3=CHAR c4=CHAR c5=CHAR c6=CHAR c7=CHAR c8=CHAR c9=CHAR c10=CHAR 
	c11=CHAR c12=CHAR c13=CHAR c14=CHAR c15=CHAR c16=CHAR c17=CHAR c18=CHAR c19=CHAR c20=CHAR
	c21=CHAR c22=CHAR c23=CHAR c24=CHAR c25=CHAR c26=CHAR c27=CHAR c28=CHAR c29=CHAR c30=CHAR
	{p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
	p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
	p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);}
	;
	
ART_HEAD: 'art:';
artista returns [List<Token> p]
@init { p = new ArrayList<Token>();}
	: ART_HEAD
	c1=CHAR c2=CHAR c3=CHAR c4=CHAR c5=CHAR c6=CHAR c7=CHAR c8=CHAR c9=CHAR c10=CHAR 
	c11=CHAR c12=CHAR c13=CHAR c14=CHAR c15=CHAR c16=CHAR c17=CHAR c18=CHAR c19=CHAR c20=CHAR
	c21=CHAR c22=CHAR c23=CHAR c24=CHAR c25=CHAR c26=CHAR c27=CHAR c28=CHAR c29=CHAR c30=CHAR
	{p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
	p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
	p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);}
	;

ALBUM_HEAD:'alb:'; //ho dovuto togliere la a iniziale altrimenti si aspetta la r di art (no sense assoluto perch�
											// si aspetta ALMBU_HEAD secondo l'errore
album returns [List<Token> p]
@init { p = new ArrayList<Token>();}
	: ALBUM_HEAD
	c1=CHAR c2=CHAR c3=CHAR c4=CHAR c5=CHAR c6=CHAR c7=CHAR c8=CHAR c9=CHAR c10=CHAR 
	c11=CHAR c12=CHAR c13=CHAR c14=CHAR c15=CHAR c16=CHAR c17=CHAR c18=CHAR c19=CHAR c20=CHAR
	c21=CHAR c22=CHAR c23=CHAR c24=CHAR c25=CHAR c26=CHAR c27=CHAR c28=CHAR c29=CHAR c30=CHAR
	{p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
	p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
	p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);}
	;

ANNO_HEAD:'ann:'; //problema con la a come sopra
anno returns [List<Token> p]
@init { p = new ArrayList<Token>();}
	: ANNO_HEAD
	c1=CHAR c2=CHAR c3=CHAR c4=CHAR
	{p.add(c1); p.add(c2); p.add(c3); p.add(c4);}
	;

COMMENTO_HEAD:'com:';
commento returns [List<Token> p]
@init { p = new ArrayList<Token>();}
	: COMMENTO_HEAD
  c1=CHAR c2=CHAR c3=CHAR c4=CHAR c5=CHAR c6=CHAR c7=CHAR c8=CHAR c9=CHAR c10=CHAR 
	c11=CHAR c12=CHAR c13=CHAR c14=CHAR c15=CHAR c16=CHAR c17=CHAR c18=CHAR c19=CHAR c20=CHAR
	c21=CHAR c22=CHAR c23=CHAR c24=CHAR c25=CHAR c26=CHAR c27=CHAR c28=CHAR c29=CHAR c30=CHAR
	{p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
	p.add(c11);p.add(c12);p.add(c13);p.add(c14);p.add(c15);p.add(c16);p.add(c17);p.add(c18);p.add(c19);p.add(c20);
	p.add(c21);p.add(c22);p.add(c23);p.add(c24);p.add(c25);p.add(c26);p.add(c27);p.add(c28);p.add(c29);p.add(c30);}
	;
	
/*
track returns [Token t]: 'track:'
 p=.*
 {t=p;};
 */
GENERE_HEAD:'gen:';
genere returns [Token t]: GENERE_HEAD p=.
 {t=p;};

CANC:	 '#';
//INT :	'0'..'9';

 CHAR  :	('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'.'|'?')//|' ')
    ;




WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) //{$channel=HIDDEN;}
    ;

/*
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

ID:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
 

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
/*
fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
*/
SCAN_ERROR	: . ;

