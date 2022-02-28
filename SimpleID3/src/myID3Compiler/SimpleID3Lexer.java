// $ANTLR 3.5.1 C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g 2022-02-28 19:23:33

	package myID3Compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimpleID3Lexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g"; }

	// $ANTLR start "HEAD"
	public final void mHEAD() throws RecognitionException {
		try {
			int _type = HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:84:3: ( 'TAG' )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:84:3: 'TAG'
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
	// $ANTLR end "HEAD"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:189:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' ) )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
			{
			if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:192:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:200:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:200:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:200:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:200:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:200:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:203:3: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:203:6: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:203:11: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:203:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:203:23: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:209:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:213:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt3=1;
					}
					break;
				case 'u':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:213:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:214:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:215:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:220:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=1;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=3;
					}

				}
				else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
					int LA4_3 = input.LA(3);
					if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
						alt4=2;
					}

					else {
						alt4=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:220:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:221:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:222:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:227:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:227:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:229:12: ( . )
			// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:229:14: .
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
		// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:8: ( HEAD | CHAR | WS | STRING | ID | SCAN_ERROR )
		int alt5=6;
		int LA5_0 = input.LA(1);
		if ( (LA5_0=='T') ) {
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='A') ) {
				alt5=1;
			}

			else {
				alt5=2;
			}

		}
		else if ( (LA5_0==' ') ) {
			alt5=2;
		}
		else if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'S')||(LA5_0 >= 'U' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
			alt5=2;
		}
		else if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r') ) {
			alt5=3;
		}
		else if ( (LA5_0=='\"') ) {
			int LA5_5 = input.LA(2);
			if ( ((LA5_5 >= '\u0000' && LA5_5 <= '\uFFFF')) ) {
				alt5=4;
			}

			else {
				alt5=6;
			}

		}
		else if ( (LA5_0=='\'') ) {
			int LA5_6 = input.LA(2);
			if ( ((LA5_6 >= '\u0000' && LA5_6 <= '&')||(LA5_6 >= '(' && LA5_6 <= '\uFFFF')) ) {
				alt5=5;
			}

			else {
				alt5=6;
			}

		}
		else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||LA5_0=='!'||(LA5_0 >= '#' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '/')||(LA5_0 >= ':' && LA5_0 <= '@')||(LA5_0 >= '[' && LA5_0 <= '`')||(LA5_0 >= '{' && LA5_0 <= '\uFFFF')) ) {
			alt5=6;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}

		switch (alt5) {
			case 1 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:10: HEAD
				{
				mHEAD(); 

				}
				break;
			case 2 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:15: CHAR
				{
				mCHAR(); 

				}
				break;
			case 3 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:20: WS
				{
				mWS(); 

				}
				break;
			case 4 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:23: STRING
				{
				mSTRING(); 

				}
				break;
			case 5 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:30: ID
				{
				mID(); 

				}
				break;
			case 6 :
				// C:\\Users\\greco\\eclipse-LFC\\SimpleID3\\src\\myID3Compiler\\SimpleID3.g:1:33: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
