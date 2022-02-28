grammar SimpleID3;

options {
	language = Java;
	k=1;
}

@lexer::header {
	package myID3Compiler;
}

@header {
	package myID3Compiler;

// inserite le import per costruttore (vedere @members)
	import myID3Compiler.util.*;
	import myID3Compiler.SimpleJavaHandler;
	import java.io.IOException;
	import java.io.StringReader;
	import java.io.FileReader;
}

// inserito il costruttore
@members {
		SimpleJavaHandler h;
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


}



struttura
 :
 musica
 	HEAD 
 	corpo
 ;

 musica: .*
 ;//se aggiungo il ? funziona ma da errore in console
 
HEAD
: 'TAG';

corpo:
 (slot slot slot anno slot genere)//|(slot slot slot anno commento WS traccia traccia)
	;
	
slot:
	CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR 
	CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR 
	CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR
	;

anno: CHAR CHAR CHAR CHAR;

genere: .*;

commento: 
  CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR 
	CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR 
	CHAR CHAR CHAR CHAR CHAR CHAR CHAR CHAR;


//traccia: .*;


CHAR  :	('a'..'z'|'A'..'Z'|'0'..'9'|' ')
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) //{$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

ID:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
 

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

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

SCAN_ERROR	: . ;
