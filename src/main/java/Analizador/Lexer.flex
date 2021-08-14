package Analizador;
import java_cup.runtime.Symbol;
%%
%class Lexer
%type java_cup.runtime.Symbol
%cup
%unicode
%line
%column
%char
%public
ID = [aA-zZ]([aA-zZ]|[0-9]|"_")*
D= [0-9]+
espacio=[\t|\r|\n]+
esp = [" "]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn, yytext());
    }
%}
%%
<YYINITIAL> {
    "programa"                       { return symbol(sym.PROG);}
    "begin"                       { return symbol(sym.BEGIN);}
    "end"                       { return symbol(sym.END);}
    "procedimiento"                       { return symbol(sym.PROC);}
    "integer"                       { return symbol(sym.INT);}
    "("                       { return symbol(sym.PA);}
    ")"                       { return symbol(sym.PC);}
    ";"                       { return symbol(sym.PYC);}
    ":"                       { return symbol(sym.DOSP);}
    ":="                       { return symbol(sym.ASIG);}
    {D}                       { return symbol(sym.NUMERO);}
    {ID}                        { return symbol(sym.ID); }
}
{esp} {/*ignore*/}
{espacio}           {/*Ignore*/}
[^]                           { return symbol(sym.ERRORLEX); }
