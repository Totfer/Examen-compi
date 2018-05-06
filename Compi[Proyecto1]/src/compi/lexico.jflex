package compi;

import java_cup.runtime.Symbol;

%%

%{
    String tmp = "";
    String str_txt="";
    String comen="";
    String Comentario_txt= "";
%}

%cup
%class scanner
%public
%line
%char
%column
%full
%state LEER
%state LEER1
%state LEER2
%state LEER4
%state LEER5
%state LEER6
%state LEER7
%ignorecase  


ESPACIO            =[\ ]
NUMERO             = [\-]?[0-9]+("." [0-9]+)?


MODULO      = "%"
CONT        = "continue"
PACK        = "package"
IMP         = "import"
CLAS        = "class"
NEWW        = "new"
MASMAS      = "++"
MENOSMENOS  = "--"
TRU         = "true"
FAL         = "false"
PAR_A       = "("
PAR_B       = ")"
CORRCH_A    = "{"
CORRCH_B        = "}"
COMA            = ","
PUNTOCOMA       = ";"
PUNTO           = "."
DOSPUNTOS       = ":"
MENORR             = "<"
MENORRIGUAL        = "<="
MAYORR             = ">"
MAYORRIGUAL        = ">="
DIFERENTE          = "!="
IGUALIGUAL         = "=="
ANDD                  = "&&"
ORR                   = "||"
NOTT                  = "!"
MAS                   = "+"
MENOS                 = "-"
POR                   = "*"
COMILLA           =" \" "
INT       = "int"
CHARR     = "char"
BOOL      = "boolean"
DOUB      = "double"
LONGG     = "long"
STRINGG   = "String"
PUB       = "public"
PROTEC    = "protected"
PRIV      = "private"
STAT      = "static"
FINA      = "final"
POT      = "^"
RET       = "return"
BRE       = "break"
IFF           = "If"
ELS           = "else"
DEF           = "default"
CAS           = "case"
FORR    = "for"
WHIL    = "While"
SWIT    = "switch"
DOO     = "do"
CONS    = "System"
READL   = "out"
WRITEL  = "print"
IGUAL   = "="
VOIDD   = "void"
THE     = "this"


 //EXPRESIONES REGULARES

IDD                = [A-Za-zñÑ][_0-9A-Za-z]*
EXPSPACE           = [\ \r\t\f\t]
EXPLINE            = [\ \n]

%%


                                                                                  
<YYINITIAL> {MODULO}            { return new Symbol(sym.MODULO,      yyline, yycolumn, yytext());}
<YYINITIAL> {POT}            { return new Symbol(sym.POT,          yyline, yycolumn, yytext());}
                                                                                     
<YYINITIAL> {CONT}            { return new Symbol(sym.CONT,          yyline, yycolumn, yytext());}
                                                                     
<YYINITIAL> {VOIDD}            { return new Symbol(sym.VOIDD,          yyline, yycolumn, yytext());}
<YYINITIAL> {TRU}            { return new Symbol(sym.TRU,          yyline, yycolumn, yytext());}
<YYINITIAL> {FAL}            { return new Symbol(sym.FAL,          yyline, yycolumn, yytext());}
<YYINITIAL> {DOSPUNTOS}            { return new Symbol(sym.DOSPUNTOS,          yyline, yycolumn, yytext());}
<YYINITIAL> {THE}            { return new Symbol(sym.THE,          yyline, yycolumn, yytext());}

<YYINITIAL> {SWIT}            { return new Symbol(sym.SWIT,          yyline, yycolumn, yytext());}
<YYINITIAL> {IGUAL}            { return new Symbol(sym.IGUAL,          yyline, yycolumn, yytext());}
<YYINITIAL> {PACK}            { return new Symbol(sym.PACK,          yyline, yycolumn, yytext());}
<YYINITIAL> {PAR_A}           { return new Symbol(sym.PAR_A,          yyline, yycolumn, yytext());}
<YYINITIAL> {PAR_B}           { return new Symbol(sym.PAR_B,          yyline, yycolumn, yytext());}
<YYINITIAL> {CORRCH_A }       { return new Symbol(sym.CORRCH_A ,      yyline, yycolumn, yytext());}
<YYINITIAL> {CORRCH_B }       { return new Symbol(sym.CORRCH_B ,      yyline, yycolumn, yytext());}
<YYINITIAL> {COMA}            { return new Symbol(sym.COMA,           yyline, yycolumn, yytext());}
<YYINITIAL> {PUNTOCOMA}       { return new Symbol(sym.PUNTOCOMA,      yyline, yycolumn, yytext());}
<YYINITIAL> {IGUALIGUAL}      { return new Symbol(sym.IGUALIGUAL,     yyline, yycolumn, yytext());}
<YYINITIAL> {PUNTO}           { return new Symbol(sym.PUNTO,          yyline, yycolumn, yytext());}

<YYINITIAL> {INT}             { return new Symbol(sym.INT,            yyline, yycolumn, yytext());}
<YYINITIAL> {BOOL}            { return new Symbol(sym.BOOL,           yyline, yycolumn, yytext());}
<YYINITIAL> {CHARR}           { return new Symbol(sym.CHARR,          yyline, yycolumn, yytext());}
<YYINITIAL> {DOUB}            { return new Symbol(sym.DOUB,           yyline, yycolumn, yytext());}
<YYINITIAL> {LONGG}           { return new Symbol(sym.LONGG,          yyline, yycolumn, yytext());}
<YYINITIAL> {STRINGG}         { return new Symbol(sym.STRINGG,        yyline, yycolumn, yytext());}
<YYINITIAL> {FINA}            { return new Symbol(sym.FINA,           yyline, yycolumn, yytext());}


<YYINITIAL> {IMP}             { return new Symbol(sym.IMP,            yyline, yycolumn, yytext());}
<YYINITIAL> {CLAS}            { return new Symbol(sym.CLAS,           yyline, yycolumn, yytext());}
<YYINITIAL> {NEWW}            { return new Symbol(sym.NEWW,           yyline, yycolumn, yytext());}
<YYINITIAL> {MASMAS}          { return new Symbol(sym.MASMAS,         yyline, yycolumn, yytext());}
<YYINITIAL> {MENOSMENOS}      { return new Symbol(sym.MENOSMENOS,     yyline, yycolumn, yytext());}

<YYINITIAL> {PUB}             { return new Symbol(sym.PUB,            yyline, yycolumn, yytext());}
<YYINITIAL> {PRIV}            { return new Symbol(sym.PRIV,           yyline, yycolumn, yytext());}
<YYINITIAL> {PROTEC}          { return new Symbol(sym.PROTEC,         yyline, yycolumn, yytext());}
<YYINITIAL> {STAT}            { return new Symbol(sym.STAT,           yyline, yycolumn, yytext());}
<YYINITIAL> {BRE}             { return new Symbol(sym.BRE,            yyline, yycolumn, yytext());}

<YYINITIAL> {RET}             { return new Symbol(sym.RET,            yyline, yycolumn, yytext());}

<YYINITIAL> {IFF}             { return new Symbol(sym.IFF,            yyline, yycolumn, yytext());}
<YYINITIAL> {ELS}             { return new Symbol(sym.ELS,            yyline, yycolumn, yytext());}
<YYINITIAL> {CAS}             { return new Symbol(sym.CAS,            yyline, yycolumn, yytext());}

<YYINITIAL> {WHIL}            { return new Symbol(sym.WHIL,           yyline, yycolumn, yytext());}
<YYINITIAL> {FORR}            { return new Symbol(sym.FORR,           yyline, yycolumn, yytext());}
<YYINITIAL> {DOO}             { return new Symbol(sym.DOO,            yyline, yycolumn, yytext());}

<YYINITIAL> {MAS}             { return new Symbol(sym.MAS,            yyline, yycolumn, yytext());}
<YYINITIAL> {MENOS}           { return new Symbol(sym.MENOS,          yyline, yycolumn, yytext());}
<YYINITIAL> {POR}             { return new Symbol(sym.POR,            yyline, yycolumn, yytext());}
<YYINITIAL> {DEF}             { return new Symbol(sym.DEF,            yyline, yycolumn, yytext());}


<YYINITIAL> {MENORR}          { return new Symbol(sym.MENORR,           yyline, yycolumn, yytext());}
<YYINITIAL> {MENORRIGUAL}     { return new Symbol(sym.MENORRIGUAL,      yyline, yycolumn, yytext());}
<YYINITIAL> {MAYORR}          { return new Symbol(sym.MAYORR,           yyline, yycolumn, yytext());}
<YYINITIAL> {MAYORRIGUAL}     { return new Symbol(sym.MAYORRIGUAL,      yyline, yycolumn, yytext());}
<YYINITIAL> {DIFERENTE}       { return new Symbol(sym.DIFERENTE,        yyline, yycolumn, yytext());}

<YYINITIAL> {ANDD}            { return new Symbol(sym.ANDD,              yyline, yycolumn, yytext());}
<YYINITIAL> {ORR}             { return new Symbol(sym.ORR,               yyline, yycolumn, yytext());}
<YYINITIAL> {NOTT}            { return new Symbol(sym.NOTT,              yyline, yycolumn, yytext());}

<YYINITIAL> {CONS}            { return new Symbol(sym.CONS,              yyline, yycolumn, yytext());}
<YYINITIAL> {READL}           { return new Symbol(sym.READL,             yyline, yycolumn, yytext());}
<YYINITIAL> {WRITEL}          { return new Symbol(sym.WRITEL,            yyline, yycolumn, yytext());}

<YYINITIAL> {NUMERO}           { return new Symbol(sym.NUMERO,             yyline, yycolumn, yytext());}
<YYINITIAL> {IDD}              { return new Symbol(sym.IDD,               yyline, yycolumn, yytext());}

<YYINITIAL> {EXPSPACE}        { ; }
<YYINITIAL> {EXPLINE}         { ; }

<YYINITIAL> [\"] {yybegin(LEER); str_txt += "\""; }
<YYINITIAL> ['] { yybegin(LEER1); str_txt += "'"; }
<YYINITIAL> [/] { yybegin(LEER4); str_txt += "/"; }


<LEER4> {
    [/] { 
      
        str_txt = ""; 
        yybegin(LEER5);
    }
    [\*] { 
        str_txt = ""; 
        
        yybegin(LEER6);
    }
    [^] {
        return new Symbol(sym.DIVIDIR, yyline, yychar, "/");

}
}

<LEER5> {

    ["\n"] {
        //System.out.printl(comen);
         comen="";
        yybegin(YYINITIAL);
    }

    [^] { 
        comen += yytext();
    }
}

<LEER6> {

    [\*] {
        yybegin(LEER7);
         
    }

    [^] { 
        comen += yytext();
    }
}

<LEER7> {
    [/] {
            yybegin(YYINITIAL);  comen="";
    }
    [^] { 
        comen += yytext();
        yybegin(LEER6);
    }
}

<YYINITIAL> . {
Errorjv.texto +="ErrORR léxico : '" + yytext() + "' en la línea: " + 
        (yyline + 1) + " y columna: " + (yycolumn + 1)+"\n";
    String errLex = "ErrORR léxico : '" + yytext() + "' en la línea: " + 
        (yyline + 1) + " y columna: " + (yycolumn + 1);
    System.out.println(errLex);
}

<LEER> {
    [\"] { 
        String tmp = str_txt + "\""; 
        str_txt = ""; 
        yybegin(YYINITIAL);  
        return new Symbol(sym.TEXTO, yyline, yychar, tmp); 
    }
    [\n] {
        String tmp = str_txt; 
        str_txt = "";  
        System.out.print("Se esperaba cierre de cadena (\")."); 
        yybegin(YYINITIAL);
    }
    [^\"] { str_txt += yytext();}
}



<LEER1> {
    [^] { yybegin(LEER2); str_txt += yytext();}
}

<LEER2>{
    ['] { 
        String tmp = str_txt + "\""; 
        str_txt = ""; 
        yybegin(YYINITIAL);  
        return new Symbol(sym.TEXTO1, yyline, yychar, tmp); 
    }
}



