grammar Lang;

goal : mainClass ;
mainClass : 'class' mainClassName '{' 'public' 'main' '(' 'string' '[' ']' args ')' '{' program '}' '}';
mainClassName : ID ;
args : ID ;

program : statement+ ;
statement : let | print ;

let : ID '=' INT ';';
print : 'screen' '(' (INT | ID) ')' ';';

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
WS : [ \n\t\r]+ -> skip;