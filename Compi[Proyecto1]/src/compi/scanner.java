/* The following code was generated by JFlex 1.4.3 on 6/05/18 14:21 */

package compi;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/05/18 14:21 from the specification file
 * <tt>src/compi/lexico.jflex</tt>
 */
public class scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int LEER = 2;
  public static final int LEER7 = 14;
  public static final int YYINITIAL = 0;
  public static final int LEER6 = 12;
  public static final int LEER5 = 10;
  public static final int LEER4 = 8;
  public static final int LEER2 = 6;
  public static final int LEER1 = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1, 48,  0,  1,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1, 34, 38,  0,  0,  5, 35, 49, 24, 25, 37, 22, 28,  2,  4, 50, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 30, 29, 31, 32, 33,  0, 
     0, 14, 40,  6, 41, 12, 23, 16, 39, 10, 47, 15, 19, 17,  8,  7, 
    13, 47, 18, 20,  9, 11, 42, 21, 47, 44, 47,  0,  0,  0, 43, 46, 
     0, 14, 40,  6, 41, 12, 23, 16, 39, 10, 47, 15, 19, 17,  8,  7, 
    13, 47, 18, 20,  9, 11, 42, 21, 47, 44, 47, 26, 36, 27,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 45,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 45,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\1\1\1\2\1\3\1\4\1\5\1\6\14\7"+
    "\1\10\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\2\1\1\24\1\25"+
    "\3\7\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\0\12\7\1\47\12\7\1\50\3\7"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\2\7\1\57"+
    "\2\7\1\4\4\7\1\60\1\61\2\7\1\62\15\7"+
    "\1\63\10\7\1\64\1\7\1\65\1\66\1\67\1\7"+
    "\1\70\6\7\1\71\13\7\1\72\1\7\1\73\4\7"+
    "\1\74\6\7\1\75\1\76\1\77\1\7\1\100\3\7"+
    "\1\101\1\102\3\7\1\103\1\104\1\105\1\106\1\107"+
    "\1\7\1\110\2\7\1\111\1\7\1\112\1\113\1\114"+
    "\1\115\1\7\1\116";

  private static int [] zzUnpackAction() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u0198\0\u01cb\0\u01fe\0\u0198\0\u0198\0\u0231\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u0198\0\u0198\0\u0198\0\u0198"+
    "\0\u0198\0\u0198\0\u0198\0\u04fb\0\u052e\0\u0561\0\u0594\0\u05c7"+
    "\0\u05fa\0\u0198\0\u0198\0\u062d\0\u0660\0\u0693\0\u0198\0\u0198"+
    "\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198"+
    "\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u06c6"+
    "\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e"+
    "\0\u0891\0\u08c4\0\u0330\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3"+
    "\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0198\0\u0af5\0\u0b28"+
    "\0\u0b5b\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0b8e"+
    "\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u06c6\0\u0c8d\0\u0cc0\0\u0cf3"+
    "\0\u0d26\0\u0330\0\u0330\0\u0d59\0\u0d8c\0\u0330\0\u0dbf\0\u0df2"+
    "\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a"+
    "\0\u0fbd\0\u0ff0\0\u1023\0\u0330\0\u1056\0\u1089\0\u10bc\0\u10ef"+
    "\0\u1122\0\u1155\0\u1188\0\u11bb\0\u0330\0\u11ee\0\u0330\0\u0330"+
    "\0\u0330\0\u1221\0\u0330\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u1320"+
    "\0\u1353\0\u0330\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485"+
    "\0\u14b8\0\u14eb\0\u151e\0\u1551\0\u1584\0\u0330\0\u15b7\0\u0330"+
    "\0\u15ea\0\u161d\0\u1650\0\u1683\0\u0330\0\u16b6\0\u16e9\0\u171c"+
    "\0\u174f\0\u1782\0\u17b5\0\u0330\0\u0330\0\u0330\0\u17e8\0\u0330"+
    "\0\u181b\0\u184e\0\u1881\0\u0330\0\u0330\0\u18b4\0\u18e7\0\u191a"+
    "\0\u0330\0\u0330\0\u0330\0\u0330\0\u0330\0\u194d\0\u0330\0\u1980"+
    "\0\u19b3\0\u0330\0\u19e6\0\u0330\0\u0330\0\u0330\0\u0330\0\u1a19"+
    "\0\u0330";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\4\24\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\24\1\54\1\55\1\56"+
    "\1\57\2\24\1\11\1\24\1\12\1\60\1\61\46\62"+
    "\1\63\11\62\1\64\2\62\63\65\61\0\1\66\1\0"+
    "\45\67\1\70\14\67\1\71\60\72\1\73\47\72\1\74"+
    "\15\72\62\75\1\76\65\0\1\77\1\14\62\0\1\14"+
    "\1\100\61\0\1\24\2\0\1\24\1\101\6\24\1\102"+
    "\4\24\1\103\2\24\1\0\1\24\17\0\1\104\3\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\5\24"+
    "\1\105\12\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\6\24\1\106\11\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\14\24\1\107\3\24\1\0\1\24"+
    "\17\0\1\110\3\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\2\24\1\111\10\24\1\112\4\24\1\0"+
    "\1\113\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\20\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\15\24\1\114"+
    "\2\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\5\24\1\115\2\24\1\116"+
    "\3\24\1\117\3\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\6\24\1\120"+
    "\11\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\1\24\1\121\16\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\3\24\1\122\13\24\1\123\1\0\1\24"+
    "\17\0\4\24\1\0\1\124\1\0\2\24\6\0\1\24"+
    "\2\0\20\24\1\0\1\24\17\0\1\125\3\24\1\0"+
    "\1\24\1\0\2\24\31\0\1\126\37\0\1\24\2\0"+
    "\1\24\1\127\2\24\1\130\3\24\1\131\7\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\43\0"+
    "\1\132\62\0\1\133\62\0\1\134\62\0\1\135\65\0"+
    "\1\136\63\0\1\137\21\0\1\24\2\0\1\24\1\140"+
    "\12\24\1\141\3\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\1\24\1\142"+
    "\4\24\1\143\11\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\1\24\1\144"+
    "\16\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\145\62\0\1\24\2\0\2\24\1\146"+
    "\15\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\16\24\1\147\1\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\10\24\1\150\7\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\10\24\1\151\7\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\3\24\1\152"+
    "\14\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\17\24\1\153\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\5\24\1\154\12\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\4\24"+
    "\1\155\13\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\3\24\1\156\14\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\7\24\1\157\10\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\16\24\1\160\1\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\20\24"+
    "\1\0\1\24\17\0\1\24\1\161\2\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\1\162\17\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\1\24\1\163\2\24\1\164\13\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\3\24\1\165\14\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\2\24\1\166\15\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\10\24\1\167"+
    "\3\24\1\170\3\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\4\24\1\171"+
    "\13\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\16\24\1\172\1\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\4\24\1\173\13\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\14\24\1\174\3\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\2\24\1\175"+
    "\15\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\15\24\1\176\2\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\1\24\1\177\16\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\6\24\1\200\11\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\5\24\1\201"+
    "\12\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\20\24\1\0\1\202\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\4\24\1\203\13\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\3\24\1\204"+
    "\14\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\6\24\1\205\11\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\16\24\1\206\1\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\14\24\1\207\3\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\6\24\1\210"+
    "\11\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\16\24\1\211\1\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\1\24\1\212\16\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\6\24\1\213\11\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\15\24\1\214"+
    "\2\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\11\24\1\215\6\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\3\24\1\216\14\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\2\24\1\217\15\24\1\0\1\24\17\0\3\24\1\220"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\5\24"+
    "\1\221\12\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\12\24\1\222\5\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\3\24\1\223\14\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\4\24\1\224\13\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\3\24"+
    "\1\225\14\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\3\24\1\226\14\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\15\24\1\227\2\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\10\24\1\230\7\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\16\24"+
    "\1\231\1\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\15\24\1\232\2\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\10\24\1\233\7\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\20\24\1\0\1\24\17\0\1\24\1\234\2\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\10\24"+
    "\1\235\7\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\20\24\1\0\1\24"+
    "\17\0\2\24\1\236\1\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\4\24\1\237\13\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\16\24\1\240\1\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\14\24"+
    "\1\241\3\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\4\24\1\242\13\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\10\24\1\243\7\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\6\24\1\244\11\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\3\24"+
    "\1\245\14\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\10\24\1\246\7\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\14\24\1\247\3\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\4\24\1\250\13\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\2\24"+
    "\1\251\15\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\1\252\17\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\6\24\1\253\11\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\6\24\1\254\11\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\15\24\1\255"+
    "\2\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\6\24\1\256\11\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\6\24\1\257\11\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\11\24\1\260\6\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\15\24\1\261"+
    "\2\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\5\24\1\262\12\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\2\24\1\263\15\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\3\24\1\264\14\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\1\265\17\24"+
    "\1\0\1\24\17\0\4\24\1\0\1\24\1\0\2\24"+
    "\6\0\1\24\2\0\12\24\1\266\5\24\1\0\1\24"+
    "\17\0\4\24\1\0\1\24\1\0\2\24\6\0\1\24"+
    "\2\0\1\267\17\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\3\24\1\270"+
    "\14\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\2\24\1\271\15\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\1\272\17\24\1\0\1\24\17\0\4\24"+
    "\1\0\1\24\1\0\2\24\6\0\1\24\2\0\12\24"+
    "\1\273\5\24\1\0\1\24\17\0\4\24\1\0\1\24"+
    "\1\0\2\24\6\0\1\24\2\0\20\24\1\0\1\24"+
    "\17\0\1\274\3\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\13\24\1\275\4\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\10\24\1\276\7\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\6\24\1\277"+
    "\11\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\15\24\1\300\2\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\5\24\1\301\12\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\6\24\1\302\11\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\3\24\1\303"+
    "\14\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\6\24\1\304\11\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\2\24\1\305\15\24\1\0\1\24\17\0"+
    "\4\24\1\0\1\24\1\0\2\24\6\0\1\24\2\0"+
    "\3\24\1\306\14\24\1\0\1\24\17\0\4\24\1\0"+
    "\1\24\1\0\2\24\6\0\1\24\2\0\6\24\1\307"+
    "\11\24\1\0\1\24\17\0\4\24\1\0\1\24\1\0"+
    "\2\24\6\0\1\24\2\0\6\24\1\310\11\24\1\0"+
    "\1\24\17\0\4\24\1\0\1\24\1\0\2\24\6\0"+
    "\1\24\2\0\20\24\1\0\1\24\17\0\2\24\1\311"+
    "\1\24\1\0\1\24\1\0\2\24\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6732];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\10\0\2\11\2\1\2\11\16\1\7\11\6\1\2\11"+
    "\3\1\21\11\1\0\25\1\1\11\3\1\6\11\152\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    String tmp = "";
    String str_txt="";
    String comen="";
    String Comentario_txt= "";


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { return new Symbol(sym.MENOS,          yyline, yycolumn, yytext());
          }
        case 79: break;
        case 13: 
          { return new Symbol(sym.COMA,           yyline, yycolumn, yytext());
          }
        case 80: break;
        case 51: 
          { return new Symbol(sym.FORR,           yyline, yycolumn, yytext());
          }
        case 81: break;
        case 7: 
          { return new Symbol(sym.IDD,               yyline, yycolumn, yytext());
          }
        case 82: break;
        case 46: 
          { return new Symbol(sym.ORR,               yyline, yycolumn, yytext());
          }
        case 83: break;
        case 10: 
          { return new Symbol(sym.PAR_B,          yyline, yycolumn, yytext());
          }
        case 84: break;
        case 44: 
          { return new Symbol(sym.DIFERENTE,        yyline, yycolumn, yytext());
          }
        case 85: break;
        case 48: 
          { return new Symbol(sym.READL,             yyline, yycolumn, yytext());
          }
        case 86: break;
        case 37: 
          { yybegin(YYINITIAL);  comen="";
          }
        case 87: break;
        case 16: 
          { return new Symbol(sym.MENORR,           yyline, yycolumn, yytext());
          }
        case 88: break;
        case 69: 
          { return new Symbol(sym.STRINGG,        yyline, yycolumn, yytext());
          }
        case 89: break;
        case 45: 
          { return new Symbol(sym.ANDD,              yyline, yycolumn, yytext());
          }
        case 90: break;
        case 14: 
          { return new Symbol(sym.PUNTOCOMA,      yyline, yycolumn, yytext());
          }
        case 91: break;
        case 8: 
          { return new Symbol(sym.MAS,            yyline, yycolumn, yytext());
          }
        case 92: break;
        case 35: 
          { yybegin(LEER7);
          }
        case 93: break;
        case 78: 
          { return new Symbol(sym.PROTEC,         yyline, yycolumn, yytext());
          }
        case 94: break;
        case 52: 
          { return new Symbol(sym.CAS,            yyline, yycolumn, yytext());
          }
        case 95: break;
        case 64: 
          { return new Symbol(sym.BRE,            yyline, yycolumn, yytext());
          }
        case 96: break;
        case 43: 
          { return new Symbol(sym.MAYORRIGUAL,      yyline, yycolumn, yytext());
          }
        case 97: break;
        case 74: 
          { return new Symbol(sym.PRIV,           yyline, yycolumn, yytext());
          }
        case 98: break;
        case 63: 
          { return new Symbol(sym.FAL,          yyline, yycolumn, yytext());
          }
        case 99: break;
        case 76: 
          { return new Symbol(sym.DEF,            yyline, yycolumn, yytext());
          }
        case 100: break;
        case 53: 
          { return new Symbol(sym.CHARR,          yyline, yycolumn, yytext());
          }
        case 101: break;
        case 12: 
          { return new Symbol(sym.CORRCH_B ,      yyline, yycolumn, yytext());
          }
        case 102: break;
        case 30: 
          { return new Symbol(sym.DIVIDIR, yyline, yychar, "/");
          }
        case 103: break;
        case 54: 
          { return new Symbol(sym.TRU,          yyline, yycolumn, yytext());
          }
        case 104: break;
        case 42: 
          { return new Symbol(sym.IGUALIGUAL,     yyline, yycolumn, yytext());
          }
        case 105: break;
        case 1: 
          { Errorjv.texto +="ErrORR léxico : '" + yytext() + "' en la línea: " + 
        (yyline + 1) + " y columna: " + (yycolumn + 1)+"\n";
    String errLex = "ErrORR léxico : '" + yytext() + "' en la línea: " + 
        (yyline + 1) + " y columna: " + (yycolumn + 1);
    System.out.println(errLex);
          }
        case 106: break;
        case 50: 
          { return new Symbol(sym.INT,            yyline, yycolumn, yytext());
          }
        case 107: break;
        case 29: 
          { String tmp = str_txt + "\""; 
        str_txt = ""; 
        yybegin(YYINITIAL);  
        return new Symbol(sym.TEXTO1, yyline, yychar, tmp);
          }
        case 108: break;
        case 62: 
          { return new Symbol(sym.FINA,           yyline, yycolumn, yytext());
          }
        case 109: break;
        case 15: 
          { return new Symbol(sym.DOSPUNTOS,          yyline, yycolumn, yytext());
          }
        case 110: break;
        case 38: 
          { return new Symbol(sym.MENOSMENOS,     yyline, yycolumn, yytext());
          }
        case 111: break;
        case 59: 
          { return new Symbol(sym.CLAS,           yyline, yycolumn, yytext());
          }
        case 112: break;
        case 26: 
          { String tmp = str_txt + "\""; 
        str_txt = ""; 
        yybegin(YYINITIAL);  
        return new Symbol(sym.TEXTO, yyline, yychar, tmp);
          }
        case 113: break;
        case 56: 
          { return new Symbol(sym.ELS,            yyline, yycolumn, yytext());
          }
        case 114: break;
        case 68: 
          { return new Symbol(sym.STAT,           yyline, yycolumn, yytext());
          }
        case 115: break;
        case 9: 
          { return new Symbol(sym.PAR_A,          yyline, yycolumn, yytext());
          }
        case 116: break;
        case 71: 
          { return new Symbol(sym.CONS,              yyline, yycolumn, yytext());
          }
        case 117: break;
        case 73: 
          { return new Symbol(sym.PACK,          yyline, yycolumn, yytext());
          }
        case 118: break;
        case 20: 
          { return new Symbol(sym.POR,            yyline, yycolumn, yytext());
          }
        case 119: break;
        case 36: 
          { comen += yytext();
        yybegin(LEER6);
          }
        case 120: break;
        case 77: 
          { return new Symbol(sym.CONT,          yyline, yycolumn, yytext());
          }
        case 121: break;
        case 66: 
          { return new Symbol(sym.PUB,            yyline, yycolumn, yytext());
          }
        case 122: break;
        case 11: 
          { return new Symbol(sym.CORRCH_A ,      yyline, yycolumn, yytext());
          }
        case 123: break;
        case 57: 
          { return new Symbol(sym.LONGG,          yyline, yycolumn, yytext());
          }
        case 124: break;
        case 60: 
          { return new Symbol(sym.WRITEL,            yyline, yycolumn, yytext());
          }
        case 125: break;
        case 41: 
          { return new Symbol(sym.MENORRIGUAL,      yyline, yycolumn, yytext());
          }
        case 126: break;
        case 72: 
          { return new Symbol(sym.DOUB,           yyline, yycolumn, yytext());
          }
        case 127: break;
        case 61: 
          { return new Symbol(sym.WHIL,           yyline, yycolumn, yytext());
          }
        case 128: break;
        case 4: 
          { return new Symbol(sym.NUMERO,             yyline, yycolumn, yytext());
          }
        case 129: break;
        case 31: 
          { str_txt = ""; 
        
        yybegin(LEER6);
          }
        case 130: break;
        case 33: 
          { comen += yytext();
          }
        case 131: break;
        case 2: 
          { ;
          }
        case 132: break;
        case 75: 
          { return new Symbol(sym.BOOL,           yyline, yycolumn, yytext());
          }
        case 133: break;
        case 18: 
          { return new Symbol(sym.MAYORR,           yyline, yycolumn, yytext());
          }
        case 134: break;
        case 49: 
          { return new Symbol(sym.NEWW,           yyline, yycolumn, yytext());
          }
        case 135: break;
        case 32: 
          { str_txt = ""; 
        yybegin(LEER5);
          }
        case 136: break;
        case 47: 
          { return new Symbol(sym.DOO,            yyline, yycolumn, yytext());
          }
        case 137: break;
        case 24: 
          { yybegin(LEER4); str_txt += "/";
          }
        case 138: break;
        case 67: 
          { return new Symbol(sym.RET,            yyline, yycolumn, yytext());
          }
        case 139: break;
        case 40: 
          { return new Symbol(sym.MASMAS,         yyline, yycolumn, yytext());
          }
        case 140: break;
        case 17: 
          { return new Symbol(sym.IGUAL,          yyline, yycolumn, yytext());
          }
        case 141: break;
        case 34: 
          { //System.out.printl(comen);
         comen="";
        yybegin(YYINITIAL);
          }
        case 142: break;
        case 28: 
          { yybegin(LEER2); str_txt += yytext();
          }
        case 143: break;
        case 23: 
          { yybegin(LEER1); str_txt += "'";
          }
        case 144: break;
        case 5: 
          { return new Symbol(sym.PUNTO,          yyline, yycolumn, yytext());
          }
        case 145: break;
        case 22: 
          { return new Symbol(sym.POT,          yyline, yycolumn, yytext());
          }
        case 146: break;
        case 19: 
          { return new Symbol(sym.NOTT,              yyline, yycolumn, yytext());
          }
        case 147: break;
        case 21: 
          { yybegin(LEER); str_txt += "\"";
          }
        case 148: break;
        case 70: 
          { return new Symbol(sym.SWIT,          yyline, yycolumn, yytext());
          }
        case 149: break;
        case 55: 
          { return new Symbol(sym.THE,          yyline, yycolumn, yytext());
          }
        case 150: break;
        case 39: 
          { return new Symbol(sym.IFF,            yyline, yycolumn, yytext());
          }
        case 151: break;
        case 27: 
          { String tmp = str_txt; 
        str_txt = "";  
        System.out.print("Se esperaba cierre de cadena (\")."); 
        yybegin(YYINITIAL);
          }
        case 152: break;
        case 65: 
          { return new Symbol(sym.IMP,            yyline, yycolumn, yytext());
          }
        case 153: break;
        case 58: 
          { return new Symbol(sym.VOIDD,          yyline, yycolumn, yytext());
          }
        case 154: break;
        case 25: 
          { str_txt += yytext();
          }
        case 155: break;
        case 6: 
          { return new Symbol(sym.MODULO,      yyline, yycolumn, yytext());
          }
        case 156: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
