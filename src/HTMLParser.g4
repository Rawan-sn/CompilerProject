
parser grammar HTMLParser;


options { tokenVocab=HTMLLexer; }

htmlDocument
    : htmlMisc* scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;



htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;

content
    : BLOCK_OPEN1 BLOCK_OPEN2 expression BLOCK_CLOSE
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment|content) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME ( ATTVALUE_VALUE)?
    | cp  open_statment cpStatment close_statment
    | cp  open_statment cp_for_statment close_statment
    | cp_switch_Default
    | attributes
    ;
attributes
    : ( ID | TYPE | CLASS | CLICK | MOUSEOVER | DATAMODULE )
      open_statment expression close_statment
    ;

//كلاس بحط فيا سترينغات ويلي بتجي بعبيها  او بوليان يلي بتجي بحطا ترو او ايتم بحط اوبجكت دوت كذا
cp
    :( CP_IF | CP_APP | CP_HIDE | CP_MODEL | CP_SHOW | CP_SWITCH |  CP_SWITCH_CASE |CP_FOR)
    ;


cpStatment
    : NOT* expression*
    ;
open_statment
    : VARIABLE_EQUALS VARIABLE_QUOTE_OPEN
    | VALUE_EQUALS VALUE_QUOTE_OPEN
    ;
close_statment
    :  VARIABLE_QUOTE_CLOSE
    |  VALUE_QUOTE_CLOSE
    ;


cp_for_statment
    :
      ( expression IN expression (SEMECOLEN expression VARIABLE_EQUALS expression)*
       | expression COMMA expression IN expression)
    ;

cp_switch_Default
    : CP_SWITCH_DEFAULT
    ;

array
    : TAG_OPENARRAY arraycontent TAG_CLOSEARRAY
    ;
arraycontent
    : (ARRAYCONTENT).*? (COMMA)*
    |  TAG_OPENARRAY (ARRAYCONTENT).*? (COMMA)* TAG_CLOSEARRAY
    |  array
    ;

functionCall
    : ATT_VARIABLE TAG_OPENFUNCTION TAG_SPACE* functionParametr* TAG_CLOSEBB
    ;
functionParametr
     : (ATT_VARIABLE).*? (COMMA)*
     |  ATT_VARIABLE
     |  functionCall
     ;
htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

//call function , one line condition, variable name (even inside an object) , array element, boolean expression
expression
    : ATT_VARIABLE
    | array
    | functionCall
    | OBJ
    | INDEX
    | TAG_OPENBB* ATTVALUE_VALUE TAG_CLOSEBB*
    | ATT_NUMBER
    | expression OPERATION expression
    | expression (OR | IF_CONDITION | DOT) expression
    | expression ASSIGN* expression
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
//C:\Users\Pc\Desktop\Compiler-project\src\generated