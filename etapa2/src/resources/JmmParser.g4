parser grammar JmmParser;

options { tokenVocab=JmmLexer; }
/***************************************************
 *             Syntatic Grammar                    *
 **************************************************/
compilationUnit :
    packageDeclaration?
	importDeclaration*
	typeDeclaration* EOF
	;
				 
packageDeclaration :
    PACKAGE qualifiedIdentifier SEMICOLON
    ;

importDeclaration :
    IMPORT qualifiedIdentifier  SEMICOLON
    ;

typeDeclaration :
    modifiers classDeclaration
    ;

qualifiedIdentifier :
    IDENTIFIER ('.' IDENTIFIER)*
    ;

modifiers :
    (PUBLIC
	| PROTECTED
	| PRIVATE
	| STATIC
	| ABSTRACT)*
	;

classDeclaration :
    CLASS IDENTIFIER classOptions? classBody
    ;

classOptions :
    EXTENDS qualifiedIdentifier
    ;

classBody :
    OPEN_BRACES classMembers CLOSE_BRACES
    ;

classMembers :
    classMember*
    ;

classMember :
    modifiers memberDeclaration
    ;

memberDeclaration :
    constructorDeclaration
    | methodDeclaration
    | fieldDeclaration
    ;

constructorDeclaration :
    IDENTIFIER formalParameters block
    ;

methodDeclaration :
    returnMethod IDENTIFIER formalParameters (block | SEMICOLON)
    ;

returnMethod :
    VOID | type
    ;

fieldDeclaration :
    type variableDeclarators SEMICOLON
    ;

block :
    OPEN_BRACES
	(blockStatement)*
	CLOSE_BRACES
	;

blockStatement :
    localVariableDeclarationStatement | statement
    ;

statement :
    block
    | IDENTIFIER TWOPOINTS statement
    | IF parExpression statement (ELSE statement)?
    | RETURN expression? SEMICOLON
    | SEMICOLON
    | statementExpression SEMICOLON
    ;

formalParameters :
    OPEN_PARENTHESIS (formalParameter (COLON formalParameter)* )? CLOSE_PARENTHESIS
    ;

formalParameter :
    type IDENTIFIER
    ;

parExpression :
    OPEN_PARENTHESIS expression CLOSE_PARENTHESIS
    ;

localVariableDeclarationStatement :
    type variableDeclarators SEMICOLON
    ;

variableDeclarators :
    variableDeclarator (COLON variableDeclarator)*
    ;

variableDeclarator :
    IDENTIFIER (ASSIGN variableInitializer)?
    ;

variableInitializer :
    arrayInitializer | expression
    ;

arrayInitializer :
    OPEN_BRACES (variableInitializer (COLON variableInitializer)*)? CLOSE_BRACES
    ;

arguments :
    OPEN_PARENTHESIS(expression(COLON expression))? CLOSE_PARENTHESIS
    ;

type :
    referenceType | basicType
    ;

basicType :
    BOOLEAN | CHAR | INT
    ;

referenceType :
    (basicType OPEN_BRACKETS CLOSE_BRACKETS (OPEN_BRACKETS CLOSE_BRACKETS)*)
    | (qualifiedIdentifier (OPEN_BRACKETS CLOSE_BRACKETS)*)
    ;

statementExpression :
    expression
    ;

expression :
    assigmentExpression
    ;

assigmentExpression :
    conditionalAndExpression ((ASSIGN | PLUS) assigmentExpression)?
    ;

conditionalAndExpression :
    equalityExpression (AND equalityExpression)*
    ;

equalityExpression :
    relationalExpression (EQUAL relationalExpression)*
    ;

relationalExpression
    : additiveExpression
	(
	((GREATER_THAN | LESS_EQUAL) additiveExpression)
	|(INSTANCEOF referenceType)
	)?
	;

additiveExpression :
    multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*
    ;

multiplicativeExpression :
    unaryExpression (MULT unaryExpression)*
    ;

unaryExpression :
    (INCREMENT unaryExpression)
	|(SUB unaryExpression)
	| simpleUnaryExpression
	;
				
simpleUnaryExpression :
    (NOT unaryExpression)
    | (OPEN_PARENTHESIS basicType CLOSE_PARENTHESIS unaryExpression)
	| (OPEN_PARENTHESIS referenceType CLOSE_PARENTHESIS simpleUnaryExpression)
	| postfixExpression
	;

postfixExpression :
    primary selector* DECREMENT*
    ;

selector :
    DOT qualifiedIdentifier arguments?
	| OPEN_BRACKETS expression CLOSE_BRACKETS
	;
		
primary :
    parExpression
	| THIS arguments?
	| SUPER (arguments | (DOT IDENTIFIER arguments?))?
	| literal
	| NEW creator
	| qualifiedIdentifier arguments?
	;

creator :
    (basicType | qualifiedIdentifier)
	(
	    arguments
	    | OPEN_BRACKETS CLOSE_BRACKETS (OPEN_BRACKETS CLOSE_BRACKETS)* arrayInitializer?
	    | newArrayDeclarator
	)
	;

newArrayDeclarator :
    OPEN_BRACKETS expression CLOSE_BRACKETS
	(OPEN_BRACKETS expression CLOSE_BRACKETS)*
	(OPEN_BRACKETS CLOSE_BRACKETS)*
	;
					
literal :
    INT_LITERAL | CHAR_LITERAL | STRING | TRUE | FALSE	| NULL;