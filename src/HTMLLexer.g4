
lexer grammar  HTMLLexer;

BLOCK_OPEN1
    : ' '* '{' ' '* ->pushMode (GENERAL1)
    ;
HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : '<script' .*? '>' ->pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

HTML_TEXT
    : ~('<' | '{')+
    ;



mode TAG;

ID   :               'id'           ->pushMode (GENERAL2);
TYPE :              'type'          ->pushMode (GENERAL2);
CLASS:              'class'         ->pushMode (GENERAL2);
CLICK:             '@click'         ->pushMode (GENERAL1);
MOUSEOVER:        '@mouseover'      ->pushMode (GENERAL1);
DATAMODULE:       'data-module'     ->pushMode (GENERAL2);

CP_IF:             'cp-if'          ->pushMode (GENERAL1);
CP_APP:            'cp-app'         ->pushMode (GENERAL2);
CP_FOR:            'cp-for'         ->pushMode (GENERAL1);
CP_SHOW:           'cp-show'        ->pushMode (GENERAL1);
CP_HIDE:           'cp-hide'        ->pushMode (GENERAL1);
CP_MODEL:          'cp-model'       ->pushMode (GENERAL2);
CP_SWITCH:         'cp-switch'      ->pushMode (GENERAL1);
CP_SWITCH_CASE:    'cp-switch-case' ->pushMode (GENERAL1);
CP_SWITCH_DEFAULT: 'cp-switchDefault';



TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

fragment HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;


mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


mode ATTVALUE;

ATTVALUE_VALUE
    : ' '* ATTRIBUTE ' '* -> popMode
    ;
TAG_OPENBB
    : ' '* '(' ' '*
    ;

ATTRIBUTE
    : ATTCHARS
    | HEXCHARS
    | DECCHARS
    | SINGLE_QUOTE_STRING
    | DOUBLE_QUOTE_STRING
    ;
VALUE_QUOTE_OPEN
    : VALUE_QUOTE_OPEN_VALUE
    ;
fragment ATTCHARS
    : ' '* ATTCHAR+ ' '*
    ;
fragment ATTCHAR
    : '-'
    | '_'
    | '/'
    | '+'
    | ','
    | '#'
    | [0-9a-zA-Z]
    ;
fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;
fragment DECCHARS
    : [0-9]+ '%'?
    ;
fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;
fragment VALUE_QUOTE_OPEN_VALUE
    : ' '* '"' ' '*
    ;

mode ATTVARIABLE;

UNDERSCORE
    : UNDERSCORE_VALUE
    ;

NOT
    : ' '*  (NOT_VALUE)
    ;
INDEX
    : ' '*(INDEX_VALUE)->popMode
    ;
OBJ
    : ' '* (OBJ_VALUE)->popMode
    ;
ATT_TYPE
    : ' '*    TYPES  -> popMode
    ;
ATT_VARIABLE
    : ' '*  VARIABLE -> popMode
    ;
ATT_NUMBER
    : ' '*   NUMBER  -> popMode
    ;
ARRAYCONTENT
    : '\''  (OBJECT) '\'' -> popMode
    ;
TAG_SPACE
    : SPACE_VALUE* -> popMode
    ;

TAG_OPENARRAY
    : '['
    ;


VARIABLE_QUOTE_OPEN
    : VARIABLE_QUOTE_OPEN_VALUE
    ;
VARIABLE
    : VARIABLE_VALUE
    ;
NUMBER
    : NUMBER_VALUE
    ;
OBJECT
    : NULL
    | BOOLEAN
    | NUMBER
    | VARIABLE
    ;
TYPES
    : TYPE_VALUE
    ;
PARAMETR
    : VARIABLE
    ;

fragment NOT_VALUE
    : ' '* '!' ' '*
    ;
fragment UNDERSCORE_VALUE
    : ' '* '_' ' '*
    ;
fragment VARIABLE_VALUE
    : [a-zA-Z_]+[a-zA-Z_0-9]*' '?
    ;
fragment NUMBER_VALUE
    : ' '* [0-9]+ ' '*
    ;
fragment INDEX_VALUE
    : 'index'' '?
    ;
fragment OBJ_VALUE
    : 'obj'    ' '?
    | 'object' ' '?
    ;
fragment VARIABLE_QUOTE_OPEN_VALUE
    : ' '* '"' ' '*
    ;
fragment TYPE_VALUE
    : 'text'
    | 'button'
    | 'password'
    ;
fragment NULL
    : 'null'
    ;
fragment BOOLEAN
    : ('true'|'false')
    ;
fragment SPACE_VALUE
    : ' '
    ;

mode GENERAL1;

VARIABLE_QUOTE_CLOSE
    : VARIABLE_QUOTE_CLOSE_VALUE -> popMode
    ;
BLOCK_CLOSE
    : ' '* '}}' ' '*  -> popMode
    ;
VARIABLE_EQUALS
    : '='  -> pushMode(ATTVARIABLE)
    ;
SEMECOLEN
    : SEMECOLEN_VALUE        -> pushMode (ATTVARIABLE)
    ;
OPERATION
    : ' '* OPERATION_VALUE  -> pushMode(ATTVARIABLE)
    ;
IN
    : ' '* (IN_VALUE)        -> pushMode (ATTVARIABLE)
    ;
DOT
    : DOT_VALUE              -> pushMode (ATTVALUE)
    ;
OR
    : OR_VALUE               -> pushMode (ATTVALUE)
    ;
IF_CONDITION
    : IF_CONDITION_VALUE     -> pushMode (ATTVALUE)
    ;
ASSIGN
    : ' '* ASSIGN_VALUE      -> pushMode(ATTVALUE)
    ;
COMMA
    : COMA_VALUE             -> pushMode(ATTVARIABLE)
    ;
TAG_OPENFUNCTION
    : ' '* '(' ' '*          -> pushMode(ATTVARIABLE)
    ;
BLOCK_OPEN2
    : ' '* '{' ' '*          -> pushMode (ATTVARIABLE)
    ;
TAG_CLOSEBB
    : ' '* ')' ' '*
    ;

TAG_CLOSEARRAY
    :  ']'
    ;

OPERATION_VALUE
    : EQUALL
    | NOTEQUALL
    | SMALL_THAN
    | GREATER_THAN
    | SMALL_THANPREQ
    | GREATER_THANOREQ
    ;

fragment VARIABLE_QUOTE_CLOSE_VALUE
    : ' '* '"' ' '*
    ;
fragment SEMECOLEN_VALUE
    : ' '* ';'
    ;
fragment EQUALL
    : '=='
    ;
fragment NOTEQUALL
    : '!='
    ;

fragment SMALL_THAN
    : '<'
    ;
fragment GREATER_THAN
    : '>'
    ;
fragment SMALL_THANPREQ
    : '=<'
    ;
fragment GREATER_THANOREQ
    : '>='
    ;
fragment IF_CONDITION_VALUE
    : '?'
    ;
fragment OR_VALUE
    :  '|'
    ;
fragment ASSIGN_VALUE
    : ' '* ':' ' '*
    ;
fragment IN_VALUE
    : 'in' ' '?
    ;
fragment DOT_VALUE
    : ' '* '.' ' '*
    ;
fragment COMA_VALUE
    : ','' '?
    ;

mode GENERAL2;

VALUE_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;
VALUE_QUOTE_CLOSE
    : VALUE_QUOTE_CLOSE_VALUE -> popMode
    ;

fragment VALUE_QUOTE_CLOSE_VALUE
    : ' '* '"' ' '*
    ;
