grammar bnf;

s: extraLines line | extraLines globalStatement startFunction drawFunction;

startFunction: 'on' 'start' block forcedLineChange globalStatement;

drawFunction: 'on' 'eachFrame' block forcedLineChange globalStatement;

line: statement forcedLineChange line | variableStatement forcedLineChange line | visualStatement forcedLineChange line | empty;

forcedLineChange: ('\n')+;

statement: 'if' condition block extraLines elseToken | 'while' condition loopBlock | 'print' stringValue | 'printLine' stringValue | 'break' | 'continue';

globalStatement: declaration forcedLineChange globalStatement | empty;

visualStatement: figure | colorPick;

colorPick: 'color' parameter parameter parameter | 'background' parameter parameter parameter;

figure: 'circle' parameter parameter parameter parameter | 'square' parameter parameter parameter parameter | 'triangle' parameter parameter parameter parameter parameter parameter;

parameter: expression | ID;

elseToken: 'else if' condition block extraLines elseToken | 'else' block | empty;

extraLines: ('\n')*;

condition: 'not' notCondition extraCondition | singleCondition extraCondition;

extraCondition: 'and' condition | 'or' condition | empty;

notCondition: '(' condition ')' | singleCondition;

singleCondition: equation comparator equation | String '=' String;

block: 'then' forcedLineChange line 'end';

loopBlock: 'do' forcedLineChange line 'end';

variableStatement: declaration | assignment;

declaration: 'number' ID '=' equation | 'text' ID '=' stringValue;

assignment: ID '=' equation | ID '=' stringValue;

stringValue: ID extraStringValue | String extraStringValue | num extraStringValue;

extraStringValue: '+' stringValue | empty;

equation: '(' equation ')' extraEquation | ID extraEquation | expression extraEquation;

extraEquation: operator equation | empty;

expression: '-' num | num;

num: Digits decimal;

decimal: '.' Digits | empty;

empty: ;

operator: ('+' | '-' | '%' | '/' | '*');

comparator: ('<' | '>' | '=' | '<=' | '>=');

String: '"'  (~'"')*  '"';

ID: ([a-z]|[A-Z]) ([a-z]+|[A-Z]+|[0-9]+)*;

Digits: [0-9]+;

WS: (' '|'\t' | '\r')+ -> skip;

COMMENT: '/*' (~'*')* '*/' -> skip;

LINE_COMMENT:   '//' (~[\r\n])* -> skip;

ErrorSymbol: (~('"' | [a-z]| [A-Z] | [0-9]|' '|'\n'|'\r'))*;
