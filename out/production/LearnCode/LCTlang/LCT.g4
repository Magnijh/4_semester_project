grammar LCT;

program
    : statement*
    ;

statement
    : assignStatement
    | reassignment
    | output
    | returnStatement
    | ifStatement
    | forStatement
    | functionDeclaration
    | functionCall
    ;

assignStatement
    : Var Identifier '=' expr
    | Var Identifier
    ;

reassignment
    : Identifier '=' expr
    ;

output
    : Print LeftParen expr RightParen
    ;

expr
    : variable                                               # VariableExpr
    | expr '++'                                              # PostIncrementExpr
    | expr '--'                                              # PostDecrementExpr
    | '++' expr                                              # PreIncrementExpr
    | '--' expr                                              # PreDecrementExpr
    | '!' expr                                               # NotExpr
    | expr op=Power expr                                     # PowerExpr
    | expr op=(LessEqual|MoreEqual|LessThan|MoreThan) expr   # RelationalExpr
    | expr op=(Multiply|Divide|Modulo) expr                  # MultiplicativeExpr
    | expr op=(Plus|Minus) expr                              # AdditiveExpr
    | expr op=(Equal|NotEqual) expr                          # EqualExpr
    | expr AND expr                                          # AndExpr
    | expr OR expr                                           # OrExpr
    ;

variable
    : (Int | Float)                      # NumberVariable
    | Identifier                         # IdentifierVariable
    | String                             # StringVariable
    | (True | False)                     # BooleanVariable
    ;

functionDeclaration
    : Function identifier '(' arguments? ')' statementBlock
    ;

functionCall
    : identifier '(' arguments? ')'
    ;

identifier
    : Identifier
    | functionName
    ;

arguments
    : expr (',' expr)*
    ;

//TODO Implement reserved functions
functionName
    : 'test'
    ;

returnStatement
    : Return expr Semicolon
    ;

statementBlock
    : statement+ End
    ;

forStatement
    : For forCondition statementBlock
    ;

forCondition
    : iterator=expr  'from' startExpr=Int range='to' endExpr=Int
    ;

ifStatement
    : If conditionBlock (Else If conditionBlock)* (Else Then statementBlock)?
    ;

conditionBlock
    : '('expr')' Then statementBlock
    ;

// Tokens
fragment Newline: ('\r' '\n'? | '\n');

Multi_comment: '#-' .*? '-#' -> skip;           //Doesn't work without skip
Single_comment: '#' ~[\r|\n]* -> skip;          //

//Reserved keywords
Function: 'function';
Break: 'break';
For: 'loop';
If: 'if';
Else: 'else';
Square_root: 'sqrt';
OR: 'OR';                   // Instead of ||
AND: 'AND';                 // Instead of &&
True: 'true';
False: 'false';
Return: 'return';
Var: 'var';
Print: 'output';
End: 'end';
Then: 'then';

LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';

Colon: ':';
Semicolon: ';';
Comma: ',';

//Operators
Plus: '+';
Minus: '-';
Multiply: '*';
Divide: '/';
Power: '^';
Modulo: '%';
LessThan: '<';
MoreThan: '>';
Assign: '=';
LessEqual: '<=';
MoreEqual: '>=';
NotEqual: '!=';
Not: '!';
Equal: '==';

String: '"' (~('\n' | '"'))* '"';
Int: '0' | '-'?[1-9][0-9]*;
Float: [0.9]*[.]?[0.9]+;
Identifier: [a-zA-Z_] [a-zA-Z0-9_]*;

Whitespace: [ \n\t\r]+ -> skip;

//TODO Maybe split the files, into lexer grammar and parser grammar.
//TODO Solve the issue of using the same identifier names.