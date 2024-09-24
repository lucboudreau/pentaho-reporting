/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/
/* Generated By:JavaCC: Do not edit this line. GeneratedFormulaParserTokenManager.java */
package org.pentaho.reporting.libraries.formula.parser;

public class GeneratedFormulaParserTokenManager implements GeneratedFormulaParserConstants {
  public java.io.PrintStream debugStream = System.out;

  public void setDebugStream( java.io.PrintStream ds ) {
    debugStream = ds;
  }

  private final int jjStopAtPos( int pos, int kind ) {
    jjmatchedKind = kind;
    jjmatchedPos = pos;
    return pos + 1;
  }

  private final int jjMoveStringLiteralDfa0_0() {
    switch( curChar ) {
      case 37:
        jjmatchedKind = 39;
        return jjMoveNfa_0( 0, 0 );
      case 38:
        jjmatchedKind = 38;
        return jjMoveNfa_0( 0, 0 );
      case 40:
        jjmatchedKind = 19;
        return jjMoveNfa_0( 0, 0 );
      case 41:
        jjmatchedKind = 20;
        return jjMoveNfa_0( 0, 0 );
      case 42:
        jjmatchedKind = 29;
        return jjMoveNfa_0( 0, 0 );
      case 43:
        jjmatchedKind = 27;
        return jjMoveNfa_0( 0, 0 );
      case 44:
        jjmatchedKind = 13;
        return jjMoveNfa_0( 0, 0 );
      case 45:
        jjmatchedKind = 28;
        return jjMoveNfa_0( 0, 0 );
      case 47:
        jjmatchedKind = 30;
        return jjMoveNfa_0( 0, 0 );
      case 59:
        jjmatchedKind = 18;
        return jjMoveNfa_0( 0, 0 );
      case 60:
        jjmatchedKind = 36;
        return jjMoveStringLiteralDfa1_0( 0x600000000L );
      case 61:
        jjmatchedKind = 32;
        return jjMoveNfa_0( 0, 0 );
      case 62:
        jjmatchedKind = 37;
        return jjMoveStringLiteralDfa1_0( 0x800000000L );
      case 63:
        jjmatchedKind = 23;
        return jjMoveNfa_0( 0, 0 );
      case 78:
        return jjMoveStringLiteralDfa1_0( 0x1000000000000L );
      case 91:
        jjmatchedKind = 21;
        return jjMoveNfa_0( 0, 0 );
      case 93:
        jjmatchedKind = 22;
        return jjMoveNfa_0( 0, 0 );
      case 94:
        jjmatchedKind = 31;
        return jjMoveNfa_0( 0, 0 );
      case 110:
        return jjMoveStringLiteralDfa1_0( 0x1000000000000L );
      case 123:
        jjmatchedKind = 24;
        return jjMoveNfa_0( 0, 0 );
      case 124:
        jjmatchedKind = 26;
        return jjMoveNfa_0( 0, 0 );
      case 125:
        jjmatchedKind = 25;
        return jjMoveNfa_0( 0, 0 );
      default:
        return jjMoveNfa_0( 0, 0 );
    }
  }

  private final int jjMoveStringLiteralDfa1_0( long active0 ) {
    try {
      curChar = input_stream.readChar();
    } catch ( java.io.IOException e ) {
      return jjMoveNfa_0( 0, 0 );
    }
    switch( curChar ) {
      case 61:
        if ( ( active0 & 0x400000000L ) != 0L ) {
          jjmatchedKind = 34;
          jjmatchedPos = 1;
        } else if ( ( active0 & 0x800000000L ) != 0L ) {
          jjmatchedKind = 35;
          jjmatchedPos = 1;
        }
        break;
      case 62:
        if ( ( active0 & 0x200000000L ) != 0L ) {
          jjmatchedKind = 33;
          jjmatchedPos = 1;
        }
        break;
      case 85:
        return jjMoveStringLiteralDfa2_0( active0, 0x1000000000000L );
      case 117:
        return jjMoveStringLiteralDfa2_0( active0, 0x1000000000000L );
      default:
        break;
    }
    return jjMoveNfa_0( 0, 1 );
  }

  private final int jjMoveStringLiteralDfa2_0( long old0, long active0 ) {
    if ( ( ( active0 &= old0 ) ) == 0L ) {
      return jjMoveNfa_0( 0, 1 );
    }
    try {
      curChar = input_stream.readChar();
    } catch ( java.io.IOException e ) {
      return jjMoveNfa_0( 0, 1 );
    }
    switch( curChar ) {
      case 76:
        return jjMoveStringLiteralDfa3_0( active0, 0x1000000000000L );
      case 108:
        return jjMoveStringLiteralDfa3_0( active0, 0x1000000000000L );
      default:
        break;
    }
    return jjMoveNfa_0( 0, 2 );
  }

  private final int jjMoveStringLiteralDfa3_0( long old0, long active0 ) {
    if ( ( ( active0 &= old0 ) ) == 0L ) {
      return jjMoveNfa_0( 0, 2 );
    }
    try {
      curChar = input_stream.readChar();
    } catch ( java.io.IOException e ) {
      return jjMoveNfa_0( 0, 2 );
    }
    switch( curChar ) {
      case 76:
        if ( ( active0 & 0x1000000000000L ) != 0L ) {
          jjmatchedKind = 48;
          jjmatchedPos = 3;
        }
        break;
      case 108:
        if ( ( active0 & 0x1000000000000L ) != 0L ) {
          jjmatchedKind = 48;
          jjmatchedPos = 3;
        }
        break;
      default:
        break;
    }
    return jjMoveNfa_0( 0, 3 );
  }

  private final void jjCheckNAdd( int state ) {
    if ( jjrounds[ state ] != jjround ) {
      jjstateSet[ jjnewStateCnt++ ] = state;
      jjrounds[ state ] = jjround;
    }
  }

  private final void jjAddStates( int start, int end ) {
    do {
      jjstateSet[ jjnewStateCnt++ ] = jjnextStates[ start ];
    } while ( start++ != end );
  }

  private final void jjCheckNAddTwoStates( int state1, int state2 ) {
    jjCheckNAdd( state1 );
    jjCheckNAdd( state2 );
  }

  private final void jjCheckNAddStates( int start, int end ) {
    do {
      jjCheckNAdd( jjnextStates[ start ] );
    } while ( start++ != end );
  }

  private final void jjCheckNAddStates( int start ) {
    jjCheckNAdd( jjnextStates[ start ] );
    jjCheckNAdd( jjnextStates[ start + 1 ] );
  }

  static final long[] jjbitVec0 = {
    0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
  };
  static final long[] jjbitVec2 = {
    0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
  };

  private final int jjMoveNfa_0( int startState, int curPos ) {
    int strKind = jjmatchedKind;
    int strPos = jjmatchedPos;
    int seenUpto;
    input_stream.backup( seenUpto = curPos + 1 );
    try {
      curChar = input_stream.readChar();
    } catch ( java.io.IOException e ) {
      throw new Error( "Internal Error" );
    }
    curPos = 0;
    int[] nextStates;
    int startsAt = 0;
    jjnewStateCnt = 38;
    int i = 1;
    jjstateSet[ 0 ] = startState;
    int j, kind = 0x7fffffff;
    for (; ; ) {
      if ( ++jjround == 0x7fffffff ) {
        ReInitRounds();
      }
      if ( curChar < 64 ) {
        long l = 1L << curChar;
        MatchLoop:
        do {
          switch( jjstateSet[ --i ] ) {
            case 0:
              if ( ( 0x1ffffffffL & l ) != 0L ) {
                if ( kind > 1 ) {
                  kind = 1;
                }
              } else if ( ( 0x3ff000000000000L & l ) != 0L ) {
                if ( kind > 8 ) {
                  kind = 8;
                }
                jjCheckNAddStates( 0, 5 );
              } else if ( curChar == 46 ) {
                jjCheckNAddTwoStates( 17, 21 );
              } else if ( curChar == 34 ) {
                jjCheckNAddStates( 6, 8 );
              } else if ( curChar == 36 ) {
                if ( kind > 40 ) {
                  kind = 40;
                }
                jjCheckNAddTwoStates( 8, 9 );
              } else if ( curChar == 45 ) {
                jjstateSet[ jjnewStateCnt++ ] = 1;
              }
              break;
            case 1:
              if ( curChar == 45 ) {
                jjCheckNAddStates( 9, 11 );
              }
              break;
            case 2:
              if ( ( 0xffffffffffffdbffL & l ) != 0L ) {
                jjCheckNAddStates( 9, 11 );
              }
              break;
            case 3:
              if ( ( 0x2400L & l ) != 0L && kind > 2 ) {
                kind = 2;
              }
              break;
            case 4:
              if ( curChar == 10 && kind > 2 ) {
                kind = 2;
              }
              break;
            case 5:
              if ( curChar == 13 ) {
                jjstateSet[ jjnewStateCnt++ ] = 4;
              }
              break;
            case 6:
              if ( curChar == 45 ) {
                jjstateSet[ jjnewStateCnt++ ] = 1;
              }
              break;
            case 7:
              if ( curChar != 36 ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjCheckNAddTwoStates( 8, 9 );
              break;
            case 8:
              if ( ( 0x3ff001000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjCheckNAddTwoStates( 8, 9 );
              break;
            case 9:
              if ( curChar != 46 ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjCheckNAdd( 10 );
              break;
            case 10:
              if ( ( 0x3ff001000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjCheckNAdd( 10 );
              break;
            case 11:
            case 12:
              if ( curChar == 34 ) {
                jjCheckNAddStates( 6, 8 );
              }
              break;
            case 13:
              if ( curChar == 34 ) {
                jjstateSet[ jjnewStateCnt++ ] = 12;
              }
              break;
            case 14:
              if ( ( 0xfffffffbffffffffL & l ) != 0L ) {
                jjCheckNAddStates( 6, 8 );
              }
              break;
            case 15:
              if ( curChar == 34 && kind > 42 ) {
                kind = 42;
              }
              break;
            case 16:
              if ( curChar == 46 ) {
                jjCheckNAddTwoStates( 17, 21 );
              }
              break;
            case 17:
              if ( ( 0x3ff000000000000L & l ) != 0L ) {
                jjCheckNAddTwoStates( 17, 18 );
              }
              break;
            case 19:
              if ( ( 0x280000000000L & l ) != 0L ) {
                jjCheckNAdd( 20 );
              }
              break;
            case 20:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 43 ) {
                kind = 43;
              }
              jjCheckNAdd( 20 );
              break;
            case 21:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 43 ) {
                kind = 43;
              }
              jjCheckNAdd( 21 );
              break;
            case 23:
              if ( ( 0xfffffcffffffffffL & l ) != 0L ) {
                jjCheckNAddTwoStates( 23, 24 );
              }
              break;
            case 25:
            case 26:
              if ( curChar == 34 ) {
                jjCheckNAddStates( 12, 14 );
              }
              break;
            case 27:
              if ( curChar == 34 ) {
                jjstateSet[ jjnewStateCnt++ ] = 26;
              }
              break;
            case 28:
              if ( ( 0xfffffffbffffffffL & l ) != 0L ) {
                jjCheckNAddStates( 12, 14 );
              }
              break;
            case 29:
              if ( curChar == 34 ) {
                jjCheckNAdd( 24 );
              }
              break;
            case 30:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 8 ) {
                kind = 8;
              }
              jjCheckNAddStates( 0, 5 );
              break;
            case 31:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 8 ) {
                kind = 8;
              }
              jjCheckNAdd( 31 );
              break;
            case 32:
              if ( ( 0x3ff000000000000L & l ) != 0L ) {
                jjCheckNAddStates( 15, 17 );
              }
              break;
            case 33:
              if ( curChar == 46 ) {
                jjCheckNAdd( 34 );
              }
              break;
            case 34:
              if ( ( 0x3ff000000000000L & l ) != 0L ) {
                jjCheckNAddTwoStates( 34, 18 );
              }
              break;
            case 35:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 43 ) {
                kind = 43;
              }
              jjCheckNAddTwoStates( 35, 36 );
              break;
            case 36:
              if ( curChar == 46 ) {
                jjCheckNAdd( 37 );
              }
              break;
            case 37:
              if ( ( 0x3ff000000000000L & l ) == 0L ) {
                break;
              }
              if ( kind > 43 ) {
                kind = 43;
              }
              jjCheckNAdd( 37 );
              break;
            default:
              break;
          }
        } while ( i != startsAt );
      } else if ( curChar < 128 ) {
        long l = 1L << ( curChar & 077 );
        MatchLoop:
        do {
          switch( jjstateSet[ --i ] ) {
            case 0:
              if ( ( 0x7fffffe87fffffeL & l ) != 0L ) {
                if ( kind > 40 ) {
                  kind = 40;
                }
                jjCheckNAddTwoStates( 8, 9 );
              } else if ( curChar == 91 ) {
                jjCheckNAddStates( 18, 20 );
              }
              break;
            case 2:
              jjAddStates( 9, 11 );
              break;
            case 7:
            case 8:
              if ( ( 0x7fffffe87fffffeL & l ) == 0L ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjCheckNAddTwoStates( 8, 9 );
              break;
            case 10:
              if ( ( 0x7fffffe87fffffeL & l ) == 0L ) {
                break;
              }
              if ( kind > 40 ) {
                kind = 40;
              }
              jjstateSet[ jjnewStateCnt++ ] = 10;
              break;
            case 14:
              jjAddStates( 6, 8 );
              break;
            case 18:
              if ( ( 0x2000000020L & l ) != 0L ) {
                jjAddStates( 21, 22 );
              }
              break;
            case 22:
              if ( curChar == 91 ) {
                jjCheckNAddStates( 18, 20 );
              }
              break;
            case 23:
              if ( ( 0xffffffffdfffffffL & l ) != 0L ) {
                jjCheckNAddTwoStates( 23, 24 );
              }
              break;
            case 24:
              if ( curChar == 93 && kind > 41 ) {
                kind = 41;
              }
              break;
            case 28:
              jjAddStates( 12, 14 );
              break;
            default:
              break;
          }
        } while ( i != startsAt );
      } else {
        int hiByte = (int) ( curChar >> 8 );
        int i1 = hiByte >> 6;
        long l1 = 1L << ( hiByte & 077 );
        int i2 = ( curChar & 0xff ) >> 6;
        long l2 = 1L << ( curChar & 077 );
        MatchLoop:
        do {
          switch( jjstateSet[ --i ] ) {
            case 2:
              if ( jjCanMove_0( hiByte, i1, i2, l1, l2 ) ) {
                jjAddStates( 9, 11 );
              }
              break;
            case 14:
              if ( jjCanMove_0( hiByte, i1, i2, l1, l2 ) ) {
                jjAddStates( 6, 8 );
              }
              break;
            case 23:
              if ( jjCanMove_0( hiByte, i1, i2, l1, l2 ) ) {
                jjAddStates( 23, 24 );
              }
              break;
            case 28:
              if ( jjCanMove_0( hiByte, i1, i2, l1, l2 ) ) {
                jjAddStates( 12, 14 );
              }
              break;
            default:
              break;
          }
        } while ( i != startsAt );
      }
      if ( kind != 0x7fffffff ) {
        jjmatchedKind = kind;
        jjmatchedPos = curPos;
        kind = 0x7fffffff;
      }
      ++curPos;
      if ( ( i = jjnewStateCnt ) == ( startsAt = 38 - ( jjnewStateCnt = startsAt ) ) ) {
        break;
      }
      try {
        curChar = input_stream.readChar();
      } catch ( java.io.IOException e ) {
        break;
      }
    }
    if ( jjmatchedPos > strPos ) {
      return curPos;
    }

    int toRet = Math.max( curPos, seenUpto );

    if ( curPos < toRet ) {
      for ( i = toRet - Math.min( curPos, seenUpto ); i-- > 0; ) {
        try {
          curChar = input_stream.readChar();
        } catch ( java.io.IOException e ) {
          throw new Error( "Internal Error : Please send a bug report." );
        }
      }
    }

    if ( jjmatchedPos < strPos ) {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
    } else if ( jjmatchedPos == strPos && jjmatchedKind > strKind ) {
      jjmatchedKind = strKind;
    }

    return toRet;
  }

  static final int[] jjnextStates = {
    31, 32, 33, 18, 35, 36, 13, 14, 15, 2, 3, 5, 27, 28, 29, 32,
    33, 18, 23, 24, 25, 19, 20, 23, 24,
  };

  private static final boolean jjCanMove_0( int hiByte, int i1, int i2, long l1, long l2 ) {
    switch( hiByte ) {
      case 0:
        return ( ( jjbitVec2[ i2 ] & l2 ) != 0L );
      default:
        if ( ( jjbitVec0[ i1 ] & l1 ) != 0L ) {
          return true;
        }
        return false;
    }
  }

  public static final String[] jjstrLiteralImages = {
    "", null, null, null, null, null, null, null, null, null, null, null, null,
    "\54", null, null, null, null, "\73", "\50", "\51", "\133", "\135", "\77", "\173",
    "\175", "\174", "\53", "\55", "\52", "\57", "\136", "\75", "\74\76", "\74\75",
    "\76\75", "\74", "\76", "\46", "\45", null, null, null, null, null, null, null, null,
    null, };
  public static final String[] lexStateNames = {
    "DEFAULT",
  };
  static final long[] jjtoToken = {
    0x10ffffffc2101L,
  };
  static final long[] jjtoSkip = {
    0x6L,
  };
  protected JavaCharStream input_stream;
  private final int[] jjrounds = new int[ 38 ];
  private final int[] jjstateSet = new int[ 76 ];
  protected char curChar;

  public GeneratedFormulaParserTokenManager( JavaCharStream stream ) {
    if ( JavaCharStream.staticFlag ) {
      throw new Error( "ERROR: Cannot use a static CharStream class with a non-static lexical analyzer." );
    }
    input_stream = stream;
  }

  public GeneratedFormulaParserTokenManager( JavaCharStream stream, int lexState ) {
    this( stream );
    SwitchTo( lexState );
  }

  public void ReInit( JavaCharStream stream ) {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private final void ReInitRounds() {
    int i;
    jjround = 0x80000001;
    for ( i = 38; i-- > 0; ) {
      jjrounds[ i ] = 0x80000000;
    }
  }

  public void ReInit( JavaCharStream stream, int lexState ) {
    ReInit( stream );
    SwitchTo( lexState );
  }

  public void SwitchTo( int lexState ) {
    if ( lexState >= 1 || lexState < 0 ) {
      throw new TokenMgrError( "Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
        TokenMgrError.INVALID_LEXICAL_STATE );
    } else {
      curLexState = lexState;
    }
  }

  protected Token jjFillToken() {
    Token t = Token.newToken( jjmatchedKind );
    t.kind = jjmatchedKind;
    String im = jjstrLiteralImages[ jjmatchedKind ];
    t.image = ( im == null ) ? input_stream.GetImage() : im;
    t.beginLine = input_stream.getBeginLine();
    t.beginColumn = input_stream.getBeginColumn();
    t.endLine = input_stream.getEndLine();
    t.endColumn = input_stream.getEndColumn();
    return t;
  }

  int curLexState = 0;
  int defaultLexState = 0;
  int jjnewStateCnt;
  int jjround;
  int jjmatchedPos;
  int jjmatchedKind;

  public Token getNextToken() {
    int kind;
    Token specialToken = null;
    Token matchedToken;
    int curPos = 0;

    EOFLoop:
    for (; ; ) {
      try {
        curChar = input_stream.BeginToken();
      } catch ( java.io.IOException e ) {
        jjmatchedKind = 0;
        matchedToken = jjFillToken();
        return matchedToken;
      }

      jjmatchedKind = 0x7fffffff;
      jjmatchedPos = 0;
      curPos = jjMoveStringLiteralDfa0_0();
      if ( jjmatchedKind != 0x7fffffff ) {
        if ( jjmatchedPos + 1 < curPos ) {
          input_stream.backup( curPos - jjmatchedPos - 1 );
        }
        if ( ( jjtoToken[ jjmatchedKind >> 6 ] & ( 1L << ( jjmatchedKind & 077 ) ) ) != 0L ) {
          matchedToken = jjFillToken();
          return matchedToken;
        } else {
          continue EOFLoop;
        }
      }
      int error_line = input_stream.getEndLine();
      int error_column = input_stream.getEndColumn();
      String error_after = null;
      boolean EOFSeen = false;
      try {
        input_stream.readChar();
        input_stream.backup( 1 );
      } catch ( java.io.IOException e1 ) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if ( curChar == '\n' || curChar == '\r' ) {
          error_line++;
          error_column = 0;
        } else {
          error_column++;
        }
      }
      if ( !EOFSeen ) {
        input_stream.backup( 1 );
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
      }
      throw new TokenMgrError( EOFSeen, curLexState, error_line, error_column, error_after, curChar,
        TokenMgrError.LEXICAL_ERROR );
    }
  }

}
