// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-05-03 00:42:48

	package myID3Compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimpleID3Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SimpleID3Lexer() {} 
	public SimpleID3Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimpleID3Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:11:7: ( 'TAG' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:11:9: 'TAG'
			{
			match("TAG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "TITOLO_HEAD"
	public final void mTITOLO_HEAD() throws RecognitionException {
		try {
			int _type = TITOLO_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:76:12: ( 'tit:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:76:14: 'tit:'
			{
			match("tit:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITOLO_HEAD"

	// $ANTLR start "ART_HEAD"
	public final void mART_HEAD() throws RecognitionException {
		try {
			int _type = ART_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:88:9: ( 'art:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:88:11: 'art:'
			{
			match("art:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ART_HEAD"

	// $ANTLR start "ALBUM_HEAD"
	public final void mALBUM_HEAD() throws RecognitionException {
		try {
			int _type = ALBUM_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:100:11: ( 'alb:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:100:12: 'alb:'
			{
			match("alb:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALBUM_HEAD"

	// $ANTLR start "ANNO_HEAD"
	public final void mANNO_HEAD() throws RecognitionException {
		try {
			int _type = ANNO_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:113:10: ( 'ann:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:113:11: 'ann:'
			{
			match("ann:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNO_HEAD"

	// $ANTLR start "COMMENTO_HEAD"
	public final void mCOMMENTO_HEAD() throws RecognitionException {
		try {
			int _type = COMMENTO_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:128:14: ( 'com:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:128:15: 'com:'
			{
			match("com:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENTO_HEAD"

	// $ANTLR start "GENERE_HEAD"
	public final void mGENERE_HEAD() throws RecognitionException {
		try {
			int _type = GENERE_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:140:12: ( 'gen:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:140:13: 'gen:'
			{
			match("gen:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GENERE_HEAD"

	// $ANTLR start "CANC"
	public final void mCANC() throws RecognitionException {
		try {
			int _type = CANC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:147:5: ( '#' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:147:8: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CANC"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:148:4: ( '0' .. '9' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:152:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '?' ) || ( ' ' | '\\t' | '\\r' | '\\n' ) )
			int alt1=3;
			switch ( input.LA(1) ) {
			case '-':
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '?':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt1=1;
				}
				break;
			case '\t':
			case '\n':
			case '\r':
			case ' ':
				{
				alt1=3;
				}
				break;
			default:
				alt1=2;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:152:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '?' )
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:152:47: 
					{
					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:152:48: ( ' ' | '\\t' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:156:12: ( . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:156:14: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:8: ( T__14 | TITOLO_HEAD | ART_HEAD | ALBUM_HEAD | ANNO_HEAD | COMMENTO_HEAD | GENERE_HEAD | CANC | INT | CHAR | SCAN_ERROR )
		int alt2=11;
		int LA2_0 = input.LA(1);
		if ( (LA2_0=='T') ) {
			int LA2_1 = input.LA(2);
			if ( (LA2_1=='A') ) {
				alt2=1;
			}

			else {
				alt2=10;
			}

		}
		else if ( (LA2_0=='t') ) {
			int LA2_2 = input.LA(2);
			if ( (LA2_2=='i') ) {
				alt2=2;
			}

			else {
				alt2=10;
			}

		}
		else if ( (LA2_0=='a') ) {
			switch ( input.LA(2) ) {
			case 'r':
				{
				alt2=3;
				}
				break;
			case 'l':
				{
				alt2=4;
				}
				break;
			case 'n':
				{
				alt2=5;
				}
				break;
			default:
				alt2=10;
			}
		}
		else if ( (LA2_0=='c') ) {
			int LA2_4 = input.LA(2);
			if ( (LA2_4=='o') ) {
				alt2=6;
			}

			else {
				alt2=10;
			}

		}
		else if ( (LA2_0=='g') ) {
			int LA2_5 = input.LA(2);
			if ( (LA2_5=='e') ) {
				alt2=7;
			}

			else {
				alt2=10;
			}

		}
		else if ( (LA2_0=='#') ) {
			alt2=8;
		}
		else if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
			alt2=9;
		}
		else if ( (LA2_0=='-'||LA2_0=='?'||(LA2_0 >= 'A' && LA2_0 <= 'S')||(LA2_0 >= 'U' && LA2_0 <= 'Z')||LA2_0=='b'||(LA2_0 >= 'd' && LA2_0 <= 'f')||(LA2_0 >= 'h' && LA2_0 <= 's')||(LA2_0 >= 'u' && LA2_0 <= 'z')) ) {
			alt2=10;
		}
		else if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
			alt2=10;
		}
		else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\b')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\u001F')||(LA2_0 >= '!' && LA2_0 <= '\"')||(LA2_0 >= '$' && LA2_0 <= ',')||(LA2_0 >= '.' && LA2_0 <= '/')||(LA2_0 >= ':' && LA2_0 <= '>')||LA2_0=='@'||(LA2_0 >= '[' && LA2_0 <= '`')||(LA2_0 >= '{' && LA2_0 <= '\uFFFF')) ) {
			alt2=11;
		}

		else {
			alt2=10;
		}

		switch (alt2) {
			case 1 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:16: TITOLO_HEAD
				{
				mTITOLO_HEAD(); 

				}
				break;
			case 3 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:28: ART_HEAD
				{
				mART_HEAD(); 

				}
				break;
			case 4 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:37: ALBUM_HEAD
				{
				mALBUM_HEAD(); 

				}
				break;
			case 5 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:48: ANNO_HEAD
				{
				mANNO_HEAD(); 

				}
				break;
			case 6 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:58: COMMENTO_HEAD
				{
				mCOMMENTO_HEAD(); 

				}
				break;
			case 7 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:72: GENERE_HEAD
				{
				mGENERE_HEAD(); 

				}
				break;
			case 8 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:84: CANC
				{
				mCANC(); 

				}
				break;
			case 9 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:89: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:93: CHAR
				{
				mCHAR(); 

				}
				break;
			case 11 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:98: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
