// $ANTLR 3.5.1 C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-03-18 21:17:36

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
	public static final int SCAN_ERROR=11;
	public static final int TITOLO_HEAD=12;
	public static final int WS=13;

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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:59:12: ( 'tit:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:59:14: 'tit:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:71:9: ( 'art:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:71:11: 'art:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:83:11: ( 'alb:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:83:12: 'alb:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:96:10: ( 'ann:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:96:11: 'ann:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:14: ( 'com:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:104:15: 'com:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:116:12: ( 'gen:' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:116:13: 'gen:'
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
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:120:5: ( '#' )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:120:8: '#'
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:122:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' | '?' ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
			{
			if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "CHAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:125:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:132:12: ( . )
			// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:132:14: .
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
		// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:8: ( T__14 | TITOLO_HEAD | ART_HEAD | ALBUM_HEAD | ANNO_HEAD | COMMENTO_HEAD | GENERE_HEAD | CANC | CHAR | WS | SCAN_ERROR )
		int alt1=11;
		int LA1_0 = input.LA(1);
		if ( (LA1_0=='T') ) {
			int LA1_1 = input.LA(2);
			if ( (LA1_1=='A') ) {
				alt1=1;
			}

			else {
				alt1=9;
			}

		}
		else if ( (LA1_0=='t') ) {
			int LA1_2 = input.LA(2);
			if ( (LA1_2=='i') ) {
				alt1=2;
			}

			else {
				alt1=9;
			}

		}
		else if ( (LA1_0=='a') ) {
			switch ( input.LA(2) ) {
			case 'r':
				{
				alt1=3;
				}
				break;
			case 'l':
				{
				alt1=4;
				}
				break;
			case 'n':
				{
				alt1=5;
				}
				break;
			default:
				alt1=9;
			}
		}
		else if ( (LA1_0=='c') ) {
			int LA1_4 = input.LA(2);
			if ( (LA1_4=='o') ) {
				alt1=6;
			}

			else {
				alt1=9;
			}

		}
		else if ( (LA1_0=='g') ) {
			int LA1_5 = input.LA(2);
			if ( (LA1_5=='e') ) {
				alt1=7;
			}

			else {
				alt1=9;
			}

		}
		else if ( (LA1_0=='#') ) {
			alt1=8;
		}
		else if ( ((LA1_0 >= '-' && LA1_0 <= '.')||(LA1_0 >= '0' && LA1_0 <= '9')||LA1_0=='?'||(LA1_0 >= 'A' && LA1_0 <= 'S')||(LA1_0 >= 'U' && LA1_0 <= 'Z')||LA1_0=='b'||(LA1_0 >= 'd' && LA1_0 <= 'f')||(LA1_0 >= 'h' && LA1_0 <= 's')||(LA1_0 >= 'u' && LA1_0 <= 'z')) ) {
			alt1=9;
		}
		else if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
			alt1=10;
		}
		else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\b')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\u001F')||(LA1_0 >= '!' && LA1_0 <= '\"')||(LA1_0 >= '$' && LA1_0 <= ',')||LA1_0=='/'||(LA1_0 >= ':' && LA1_0 <= '>')||LA1_0=='@'||(LA1_0 >= '[' && LA1_0 <= '`')||(LA1_0 >= '{' && LA1_0 <= '\uFFFF')) ) {
			alt1=11;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 1, 0, input);
			throw nvae;
		}

		switch (alt1) {
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
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:89: CHAR
				{
				mCHAR(); 

				}
				break;
			case 10 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:94: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// C:\\Users\\greco\\git\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:97: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
