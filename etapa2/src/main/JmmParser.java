// Generated from /home/gbrl8/Área de Trabalho/CompiladorE2/src/resources/JmmParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_LINE=1, WS=2, COMMENTS=3, PUBLIC=4, PRIVATE=5, PROTECTED=6, STATIC=7, 
		ABSTRACT=8, INT=9, CHAR=10, BOOLEAN=11, VOID=12, TRUE=13, FALSE=14, EXTENDS=15, 
		CLASS=16, IMPORT=17, PACKAGE=18, SUPER=19, THIS=20, NEW=21, RETURN=22, 
		NULL=23, IF=24, ELSE=25, WHILE=26, INSTANCEOF=27, GREATER_THAN=28, LESS_EQUAL=29, 
		EQUAL=30, AND=31, ASSIGN=32, NOT=33, ADD=34, SUB=35, MULT=36, INCREMENT=37, 
		DECREMENT=38, PLUS=39, OPEN_PARENTHESIS=40, CLOSE_PARENTHESIS=41, OPEN_BRACES=42, 
		CLOSE_BRACES=43, OPEN_BRACKETS=44, CLOSE_BRACKETS=45, SEMICOLON=46, COLON=47, 
		DOT=48, TWOPOINTS=49, ERROR=50, IDENTIFIER=51, ESC=52, INT_LITERAL=53, 
		CHAR_LITERAL=54, STRING=55;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_qualifiedIdentifier = 4, RULE_modifiers = 5, 
		RULE_classDeclaration = 6, RULE_classOptions = 7, RULE_classBody = 8, 
		RULE_classMembers = 9, RULE_classMember = 10, RULE_memberDeclaration = 11, 
		RULE_constructorDeclaration = 12, RULE_methodDeclaration = 13, RULE_returnMethod = 14, 
		RULE_fieldDeclaration = 15, RULE_block = 16, RULE_blockStatement = 17, 
		RULE_statement = 18, RULE_formalParameters = 19, RULE_formalParameter = 20, 
		RULE_parExpression = 21, RULE_localVariableDeclarationStatement = 22, 
		RULE_variableDeclarators = 23, RULE_variableDeclarator = 24, RULE_variableInitializer = 25, 
		RULE_arrayInitializer = 26, RULE_arguments = 27, RULE_type = 28, RULE_basicType = 29, 
		RULE_referenceType = 30, RULE_statementExpression = 31, RULE_expression = 32, 
		RULE_assigmentExpression = 33, RULE_conditionalAndExpression = 34, RULE_equalityExpression = 35, 
		RULE_relationalExpression = 36, RULE_additiveExpression = 37, RULE_multiplicativeExpression = 38, 
		RULE_unaryExpression = 39, RULE_simpleUnaryExpression = 40, RULE_postfixExpression = 41, 
		RULE_selector = 42, RULE_primary = 43, RULE_creator = 44, RULE_newArrayDeclarator = 45, 
		RULE_literal = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"qualifiedIdentifier", "modifiers", "classDeclaration", "classOptions", 
			"classBody", "classMembers", "classMember", "memberDeclaration", "constructorDeclaration", 
			"methodDeclaration", "returnMethod", "fieldDeclaration", "block", "blockStatement", 
			"statement", "formalParameters", "formalParameter", "parExpression", 
			"localVariableDeclarationStatement", "variableDeclarators", "variableDeclarator", 
			"variableInitializer", "arrayInitializer", "arguments", "type", "basicType", 
			"referenceType", "statementExpression", "expression", "assigmentExpression", 
			"conditionalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"simpleUnaryExpression", "postfixExpression", "selector", "primary", 
			"creator", "newArrayDeclarator", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'public'", "'private'", "'protected'", "'static'", 
			"'abstract'", "'int'", "'char'", "'boolean'", "'void'", "'true'", "'false'", 
			"'extends'", "'class'", "'import'", "'package'", "'super'", "'this'", 
			"'new'", "'return'", "'null'", "'if'", "'else'", "'while'", "'instanceof'", 
			"'>'", "'<='", "'=='", "'&&'", "'='", "'!'", "'+'", "'-'", "'*'", "'++'", 
			"'--'", "'+='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW_LINE", "WS", "COMMENTS", "PUBLIC", "PRIVATE", "PROTECTED", 
			"STATIC", "ABSTRACT", "INT", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", 
			"EXTENDS", "CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", 
			"NULL", "IF", "ELSE", "WHILE", "INSTANCEOF", "GREATER_THAN", "LESS_EQUAL", 
			"EQUAL", "AND", "ASSIGN", "NOT", "ADD", "SUB", "MULT", "INCREMENT", "DECREMENT", 
			"PLUS", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACES", "CLOSE_BRACES", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "SEMICOLON", "COLON", "DOT", "TWOPOINTS", 
			"ERROR", "IDENTIFIER", "ESC", "INT_LITERAL", "CHAR_LITERAL", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JmmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JmmParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(94);
				packageDeclaration();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(97);
				importDeclaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << ABSTRACT) | (1L << CLASS))) != 0)) {
				{
				{
				setState(103);
				typeDeclaration();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JmmParser.PACKAGE, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PACKAGE);
			setState(112);
			qualifiedIdentifier();
			setState(113);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JmmParser.IMPORT, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IMPORT);
			setState(116);
			qualifiedIdentifier();
			setState(117);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			modifiers();
			setState(120);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JmmParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JmmParser.DOT, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(DOT);
					setState(124);
					match(IDENTIFIER);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<TerminalNode> PUBLIC() { return getTokens(JmmParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(JmmParser.PUBLIC, i);
		}
		public List<TerminalNode> PROTECTED() { return getTokens(JmmParser.PROTECTED); }
		public TerminalNode PROTECTED(int i) {
			return getToken(JmmParser.PROTECTED, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(JmmParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(JmmParser.PRIVATE, i);
		}
		public List<TerminalNode> STATIC() { return getTokens(JmmParser.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(JmmParser.STATIC, i);
		}
		public List<TerminalNode> ABSTRACT() { return getTokens(JmmParser.ABSTRACT); }
		public TerminalNode ABSTRACT(int i) {
			return getToken(JmmParser.ABSTRACT, i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << ABSTRACT))) != 0)) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << ABSTRACT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JmmParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassOptionsContext classOptions() {
			return getRuleContext(ClassOptionsContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(CLASS);
			setState(137);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(138);
				classOptions();
				}
			}

			setState(141);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOptionsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JmmParser.EXTENDS, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ClassOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOptionsContext classOptions() throws RecognitionException {
		ClassOptionsContext _localctx = new ClassOptionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(EXTENDS);
			setState(144);
			qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(JmmParser.OPEN_BRACES, 0); }
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(JmmParser.CLOSE_BRACES, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(OPEN_BRACES);
			setState(147);
			classMembers();
			setState(148);
			match(CLOSE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMembersContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMembersContext classMembers() throws RecognitionException {
		ClassMembersContext _localctx = new ClassMembersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << ABSTRACT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(150);
				classMember();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			modifiers();
			setState(157);
			memberDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberDeclaration);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				fieldDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFIER);
			setState(165);
			formalParameters();
			setState(166);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ReturnMethodContext returnMethod() {
			return getRuleContext(ReturnMethodContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			returnMethod();
			setState(169);
			match(IDENTIFIER);
			setState(170);
			formalParameters();
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACES:
				{
				setState(171);
				block();
				}
				break;
			case SEMICOLON:
				{
				setState(172);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnMethodContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(JmmParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterReturnMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitReturnMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitReturnMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnMethodContext returnMethod() throws RecognitionException {
		ReturnMethodContext _localctx = new ReturnMethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnMethod);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(VOID);
				}
				break;
			case INT:
			case CHAR:
			case BOOLEAN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			type();
			setState(180);
			variableDeclarators();
			setState(181);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(JmmParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(JmmParser.CLOSE_BRACES, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OPEN_BRACES);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << SUPER) | (1L << THIS) | (1L << NEW) | (1L << RETURN) | (1L << NULL) | (1L << IF) | (1L << NOT) | (1L << SUB) | (1L << INCREMENT) | (1L << OPEN_PARENTHESIS) | (1L << OPEN_BRACES) | (1L << SEMICOLON) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(184);
				blockStatement();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(CLOSE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockStatement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public TerminalNode TWOPOINTS() { return getToken(JmmParser.TWOPOINTS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(JmmParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JmmParser.ELSE, 0); }
		public TerminalNode RETURN() { return getToken(JmmParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(IDENTIFIER);
				setState(198);
				match(TWOPOINTS);
				setState(199);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(IF);
				setState(201);
				parExpression();
				setState(202);
				statement();
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(203);
					match(ELSE);
					setState(204);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(RETURN);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUPER) | (1L << THIS) | (1L << NEW) | (1L << NULL) | (1L << NOT) | (1L << SUB) | (1L << INCREMENT) | (1L << OPEN_PARENTHESIS) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING))) != 0)) {
					{
					setState(208);
					expression();
					}
				}

				setState(211);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				statementExpression();
				setState(214);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(JmmParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(JmmParser.CLOSE_PARENTHESIS, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JmmParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JmmParser.COLON, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(OPEN_PARENTHESIS);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(219);
				formalParameter();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(220);
					match(COLON);
					setState(221);
					formalParameter();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(229);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			type();
			setState(232);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(JmmParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(JmmParser.CLOSE_PARENTHESIS, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(OPEN_PARENTHESIS);
			setState(235);
			expression();
			setState(236);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JmmParser.SEMICOLON, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			type();
			setState(239);
			variableDeclarators();
			setState(240);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JmmParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JmmParser.COLON, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			variableDeclarator();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(243);
				match(COLON);
				setState(244);
				variableDeclarator();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JmmParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IDENTIFIER);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(251);
				match(ASSIGN);
				setState(252);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableInitializer);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				arrayInitializer();
				}
				break;
			case TRUE:
			case FALSE:
			case SUPER:
			case THIS:
			case NEW:
			case NULL:
			case NOT:
			case SUB:
			case INCREMENT:
			case OPEN_PARENTHESIS:
			case IDENTIFIER:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(JmmParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(JmmParser.CLOSE_BRACES, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JmmParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JmmParser.COLON, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPEN_BRACES);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUPER) | (1L << THIS) | (1L << NEW) | (1L << NULL) | (1L << NOT) | (1L << SUB) | (1L << INCREMENT) | (1L << OPEN_PARENTHESIS) | (1L << OPEN_BRACES) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING))) != 0)) {
				{
				setState(260);
				variableInitializer();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(261);
					match(COLON);
					setState(262);
					variableInitializer();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(270);
			match(CLOSE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(JmmParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(JmmParser.CLOSE_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JmmParser.COLON, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OPEN_PARENTHESIS);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUPER) | (1L << THIS) | (1L << NEW) | (1L << NULL) | (1L << NOT) | (1L << SUB) | (1L << INCREMENT) | (1L << OPEN_PARENTHESIS) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING))) != 0)) {
				{
				setState(273);
				expression();
				{
				setState(274);
				match(COLON);
				setState(275);
				expression();
				}
				}
			}

			setState(279);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				basicType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JmmParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JmmParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(JmmParser.INT, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(JmmParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(JmmParser.OPEN_BRACKETS, i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(JmmParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(JmmParser.CLOSE_BRACKETS, i);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_referenceType);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(287);
				basicType();
				setState(288);
				match(OPEN_BRACKETS);
				setState(289);
				match(CLOSE_BRACKETS);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKETS) {
					{
					{
					setState(290);
					match(OPEN_BRACKETS);
					setState(291);
					match(CLOSE_BRACKETS);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(297);
				qualifiedIdentifier();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKETS) {
					{
					{
					setState(298);
					match(OPEN_BRACKETS);
					setState(299);
					match(CLOSE_BRACKETS);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssigmentExpressionContext assigmentExpression() {
			return getRuleContext(AssigmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			assigmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public AssigmentExpressionContext assigmentExpression() {
			return getRuleContext(AssigmentExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JmmParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(JmmParser.PLUS, 0); }
		public AssigmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterAssigmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitAssigmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitAssigmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentExpressionContext assigmentExpression() throws RecognitionException {
		AssigmentExpressionContext _localctx = new AssigmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assigmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			conditionalAndExpression();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==PLUS) {
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				assigmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JmmParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			equalityExpression();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(317);
				match(AND);
				setState(318);
				equalityExpression();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(JmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			relationalExpression();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(325);
				match(EQUAL);
				setState(326);
				relationalExpression();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode INSTANCEOF() { return getToken(JmmParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(JmmParser.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JmmParser.LESS_EQUAL, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			additiveExpression();
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER_THAN:
			case LESS_EQUAL:
				{
				{
				setState(333);
				_la = _input.LA(1);
				if ( !(_la==GREATER_THAN || _la==LESS_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(334);
				additiveExpression();
				}
				}
				break;
			case INSTANCEOF:
				{
				{
				setState(335);
				match(INSTANCEOF);
				setState(336);
				referenceType();
				}
				}
				break;
			case EQUAL:
			case AND:
			case ASSIGN:
			case PLUS:
			case CLOSE_PARENTHESIS:
			case CLOSE_BRACES:
			case CLOSE_BRACKETS:
			case SEMICOLON:
			case COLON:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JmmParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JmmParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JmmParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JmmParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			multiplicativeExpression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				multiplicativeExpression();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(JmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(JmmParser.MULT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			unaryExpression();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(348);
				match(MULT);
				setState(349);
				unaryExpression();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(JmmParser.INCREMENT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(JmmParser.SUB, 0); }
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_unaryExpression);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(355);
				match(INCREMENT);
				setState(356);
				unaryExpression();
				}
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(357);
				match(SUB);
				setState(358);
				unaryExpression();
				}
				}
				break;
			case TRUE:
			case FALSE:
			case SUPER:
			case THIS:
			case NEW:
			case NULL:
			case NOT:
			case OPEN_PARENTHESIS:
			case IDENTIFIER:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				simpleUnaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(JmmParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(JmmParser.OPEN_PARENTHESIS, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(JmmParser.CLOSE_PARENTHESIS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterSimpleUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitSimpleUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitSimpleUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUnaryExpressionContext simpleUnaryExpression() throws RecognitionException {
		SimpleUnaryExpressionContext _localctx = new SimpleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleUnaryExpression);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(362);
				match(NOT);
				setState(363);
				unaryExpression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(364);
				match(OPEN_PARENTHESIS);
				setState(365);
				basicType();
				setState(366);
				match(CLOSE_PARENTHESIS);
				setState(367);
				unaryExpression();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(369);
				match(OPEN_PARENTHESIS);
				setState(370);
				referenceType();
				setState(371);
				match(CLOSE_PARENTHESIS);
				setState(372);
				simpleUnaryExpression();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				postfixExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> DECREMENT() { return getTokens(JmmParser.DECREMENT); }
		public TerminalNode DECREMENT(int i) {
			return getToken(JmmParser.DECREMENT, i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			primary();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKETS || _la==DOT) {
				{
				{
				setState(378);
				selector();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECREMENT) {
				{
				{
				setState(384);
				match(DECREMENT);
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JmmParser.DOT, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(JmmParser.OPEN_BRACKETS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKETS() { return getToken(JmmParser.CLOSE_BRACKETS, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selector);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(DOT);
				setState(391);
				qualifiedIdentifier();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESIS) {
					{
					setState(392);
					arguments();
					}
				}

				}
				break;
			case OPEN_BRACKETS:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(OPEN_BRACKETS);
				setState(396);
				expression();
				setState(397);
				match(CLOSE_BRACKETS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JmmParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JmmParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(JmmParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JmmParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JmmParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primary);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(THIS);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESIS) {
					{
					setState(403);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(SUPER);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(407);
					arguments();
					}
					break;
				case 2:
					{
					{
					setState(408);
					match(DOT);
					setState(409);
					match(IDENTIFIER);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESIS) {
						{
						setState(410);
						arguments();
						}
					}

					}
					}
					break;
				}
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				match(NEW);
				setState(417);
				creator();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				qualifiedIdentifier();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESIS) {
					{
					setState(419);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(JmmParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(JmmParser.OPEN_BRACKETS, i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(JmmParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(JmmParser.CLOSE_BRACKETS, i);
		}
		public NewArrayDeclaratorContext newArrayDeclarator() {
			return getRuleContext(NewArrayDeclaratorContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_creator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case BOOLEAN:
				{
				setState(424);
				basicType();
				}
				break;
			case IDENTIFIER:
				{
				setState(425);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(428);
				arguments();
				}
				break;
			case 2:
				{
				setState(429);
				match(OPEN_BRACKETS);
				setState(430);
				match(CLOSE_BRACKETS);
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						match(OPEN_BRACKETS);
						setState(432);
						match(CLOSE_BRACKETS);
						}
						} 
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACES) {
					{
					setState(438);
					arrayInitializer();
					}
				}

				}
				break;
			case 3:
				{
				setState(441);
				newArrayDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewArrayDeclaratorContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_BRACKETS() { return getTokens(JmmParser.OPEN_BRACKETS); }
		public TerminalNode OPEN_BRACKETS(int i) {
			return getToken(JmmParser.OPEN_BRACKETS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKETS() { return getTokens(JmmParser.CLOSE_BRACKETS); }
		public TerminalNode CLOSE_BRACKETS(int i) {
			return getToken(JmmParser.CLOSE_BRACKETS, i);
		}
		public NewArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArrayDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterNewArrayDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitNewArrayDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitNewArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayDeclaratorContext newArrayDeclarator() throws RecognitionException {
		NewArrayDeclaratorContext _localctx = new NewArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_newArrayDeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OPEN_BRACKETS);
			setState(445);
			expression();
			setState(446);
			match(CLOSE_BRACKETS);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					match(OPEN_BRACKETS);
					setState(448);
					expression();
					setState(449);
					match(CLOSE_BRACKETS);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					match(OPEN_BRACKETS);
					setState(457);
					match(CLOSE_BRACKETS);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(JmmParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JmmParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(JmmParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(JmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JmmParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JmmParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JmmParserListener ) ((JmmParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JmmParserVisitor ) return ((JmmParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2b\n\2\3\2\7\2e\n\2\f\2\16\2h\13"+
		"\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\7\7\7\u0086"+
		"\n\7\f\7\16\7\u0089\13\7\3\b\3\b\3\b\5\b\u008e\n\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\7\13\u009a\n\13\f\13\16\13\u009d\13\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00b0\n\17\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\3\22\3\22\3\23\3\23\5\23"+
		"\u00c5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d0\n"+
		"\24\3\24\3\24\5\24\u00d4\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u00db\n\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13\25\5\25\u00e6"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\7\31\u00f8\n\31\f\31\16\31\u00fb\13\31\3\32\3\32\3\32"+
		"\5\32\u0100\n\32\3\33\3\33\5\33\u0104\n\33\3\34\3\34\3\34\3\34\7\34\u010a"+
		"\n\34\f\34\16\34\u010d\13\34\5\34\u010f\n\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0118\n\35\3\35\3\35\3\36\3\36\5\36\u011e\n\36\3\37\3"+
		"\37\3 \3 \3 \3 \3 \7 \u0127\n \f \16 \u012a\13 \3 \3 \3 \7 \u012f\n \f"+
		" \16 \u0132\13 \5 \u0134\n \3!\3!\3\"\3\"\3#\3#\3#\5#\u013d\n#\3$\3$\3"+
		"$\7$\u0142\n$\f$\16$\u0145\13$\3%\3%\3%\7%\u014a\n%\f%\16%\u014d\13%\3"+
		"&\3&\3&\3&\3&\5&\u0154\n&\3\'\3\'\3\'\7\'\u0159\n\'\f\'\16\'\u015c\13"+
		"\'\3(\3(\3(\7(\u0161\n(\f(\16(\u0164\13(\3)\3)\3)\3)\3)\5)\u016b\n)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u017a\n*\3+\3+\7+\u017e\n+\f"+
		"+\16+\u0181\13+\3+\7+\u0184\n+\f+\16+\u0187\13+\3,\3,\3,\5,\u018c\n,\3"+
		",\3,\3,\3,\5,\u0192\n,\3-\3-\3-\5-\u0197\n-\3-\3-\3-\3-\3-\5-\u019e\n"+
		"-\5-\u01a0\n-\3-\3-\3-\3-\3-\5-\u01a7\n-\5-\u01a9\n-\3.\3.\5.\u01ad\n"+
		".\3.\3.\3.\3.\3.\7.\u01b4\n.\f.\16.\u01b7\13.\3.\5.\u01ba\n.\3.\5.\u01bd"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\7/\u01c6\n/\f/\16/\u01c9\13/\3/\3/\7/\u01cd\n"+
		"/\f/\16/\u01d0\13/\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\b\3\2\6\n\3\2\13"+
		"\r\4\2\"\"))\3\2\36\37\3\2$%\5\2\17\20\31\31\679\2\u01e5\2a\3\2\2\2\4"+
		"q\3\2\2\2\6u\3\2\2\2\by\3\2\2\2\n|\3\2\2\2\f\u0087\3\2\2\2\16\u008a\3"+
		"\2\2\2\20\u0091\3\2\2\2\22\u0094\3\2\2\2\24\u009b\3\2\2\2\26\u009e\3\2"+
		"\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00aa\3\2\2\2\36\u00b3\3\2\2"+
		"\2 \u00b5\3\2\2\2\"\u00b9\3\2\2\2$\u00c4\3\2\2\2&\u00da\3\2\2\2(\u00dc"+
		"\3\2\2\2*\u00e9\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f4\3\2\2\2"+
		"\62\u00fc\3\2\2\2\64\u0103\3\2\2\2\66\u0105\3\2\2\28\u0112\3\2\2\2:\u011d"+
		"\3\2\2\2<\u011f\3\2\2\2>\u0133\3\2\2\2@\u0135\3\2\2\2B\u0137\3\2\2\2D"+
		"\u0139\3\2\2\2F\u013e\3\2\2\2H\u0146\3\2\2\2J\u014e\3\2\2\2L\u0155\3\2"+
		"\2\2N\u015d\3\2\2\2P\u016a\3\2\2\2R\u0179\3\2\2\2T\u017b\3\2\2\2V\u0191"+
		"\3\2\2\2X\u01a8\3\2\2\2Z\u01ac\3\2\2\2\\\u01be\3\2\2\2^\u01d1\3\2\2\2"+
		"`b\5\4\3\2a`\3\2\2\2ab\3\2\2\2bf\3\2\2\2ce\5\6\4\2dc\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3\2\2\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\2\2\3p\3\3\2\2\2qr\7\24\2"+
		"\2rs\5\n\6\2st\7\60\2\2t\5\3\2\2\2uv\7\23\2\2vw\5\n\6\2wx\7\60\2\2x\7"+
		"\3\2\2\2yz\5\f\7\2z{\5\16\b\2{\t\3\2\2\2|\u0081\7\65\2\2}~\7\62\2\2~\u0080"+
		"\7\65\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\13\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\r\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008d"+
		"\7\65\2\2\u008c\u008e\5\20\t\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\5\22\n\2\u0090\17\3\2\2\2\u0091\u0092"+
		"\7\21\2\2\u0092\u0093\5\n\6\2\u0093\21\3\2\2\2\u0094\u0095\7,\2\2\u0095"+
		"\u0096\5\24\13\2\u0096\u0097\7-\2\2\u0097\23\3\2\2\2\u0098\u009a\5\26"+
		"\f\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\f\7"+
		"\2\u009f\u00a0\5\30\r\2\u00a0\27\3\2\2\2\u00a1\u00a5\5\32\16\2\u00a2\u00a5"+
		"\5\34\17\2\u00a3\u00a5\5 \21\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\65\2\2\u00a7\u00a8"+
		"\5(\25\2\u00a8\u00a9\5\"\22\2\u00a9\33\3\2\2\2\u00aa\u00ab\5\36\20\2\u00ab"+
		"\u00ac\7\65\2\2\u00ac\u00af\5(\25\2\u00ad\u00b0\5\"\22\2\u00ae\u00b0\7"+
		"\60\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\35\3\2\2\2\u00b1"+
		"\u00b4\7\16\2\2\u00b2\u00b4\5:\36\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\5:\36\2\u00b6\u00b7\5\60\31\2\u00b7"+
		"\u00b8\7\60\2\2\u00b8!\3\2\2\2\u00b9\u00bd\7,\2\2\u00ba\u00bc\5$\23\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1"+
		"#\3\2\2\2\u00c2\u00c5\5.\30\2\u00c3\u00c5\5&\24\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00db\5\"\22\2\u00c7\u00c8\7"+
		"\65\2\2\u00c8\u00c9\7\63\2\2\u00c9\u00db\5&\24\2\u00ca\u00cb\7\32\2\2"+
		"\u00cb\u00cc\5,\27\2\u00cc\u00cf\5&\24\2\u00cd\u00ce\7\33\2\2\u00ce\u00d0"+
		"\5&\24\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00db\3\2\2\2\u00d1"+
		"\u00d3\7\30\2\2\u00d2\u00d4\5B\"\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00db\7\60\2\2\u00d6\u00db\7\60\2\2\u00d7"+
		"\u00d8\5@!\2\u00d8\u00d9\7\60\2\2\u00d9\u00db\3\2\2\2\u00da\u00c6\3\2"+
		"\2\2\u00da\u00c7\3\2\2\2\u00da\u00ca\3\2\2\2\u00da\u00d1\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00e5\7*\2\2"+
		"\u00dd\u00e2\5*\26\2\u00de\u00df\7\61\2\2\u00df\u00e1\5*\26\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8)\3\2\2\2\u00e9\u00ea"+
		"\5:\36\2\u00ea\u00eb\7\65\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed"+
		"\u00ee\5B\"\2\u00ee\u00ef\7+\2\2\u00ef-\3\2\2\2\u00f0\u00f1\5:\36\2\u00f1"+
		"\u00f2\5\60\31\2\u00f2\u00f3\7\60\2\2\u00f3/\3\2\2\2\u00f4\u00f9\5\62"+
		"\32\2\u00f5\u00f6\7\61\2\2\u00f6\u00f8\5\62\32\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\61\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\7\65\2\2\u00fd\u00fe\7\"\2\2\u00fe"+
		"\u0100\5\64\33\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\63\3\2"+
		"\2\2\u0101\u0104\5\66\34\2\u0102\u0104\5B\"\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\65\3\2\2\2\u0105\u010e\7,\2\2\u0106\u010b\5\64\33"+
		"\2\u0107\u0108\7\61\2\2\u0108\u010a\5\64\33\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\7-\2\2\u0111\67\3\2\2\2\u0112\u0117\7*\2\2"+
		"\u0113\u0114\5B\"\2\u0114\u0115\7\61\2\2\u0115\u0116\5B\"\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7+\2\2\u011a9\3\2\2\2\u011b\u011e\5> \2\u011c\u011e\5<\37\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e;\3\2\2\2\u011f\u0120\t\3\2\2"+
		"\u0120=\3\2\2\2\u0121\u0122\5<\37\2\u0122\u0123\7.\2\2\u0123\u0128\7/"+
		"\2\2\u0124\u0125\7.\2\2\u0125\u0127\7/\2\2\u0126\u0124\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0134\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0130\5\n\6\2\u012c\u012d\7.\2\2\u012d\u012f\7/\2"+
		"\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0121\3\2\2\2\u0133"+
		"\u012b\3\2\2\2\u0134?\3\2\2\2\u0135\u0136\5B\"\2\u0136A\3\2\2\2\u0137"+
		"\u0138\5D#\2\u0138C\3\2\2\2\u0139\u013c\5F$\2\u013a\u013b\t\4\2\2\u013b"+
		"\u013d\5D#\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dE\3\2\2\2\u013e"+
		"\u0143\5H%\2\u013f\u0140\7!\2\2\u0140\u0142\5H%\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144G\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0146\u014b\5J&\2\u0147\u0148\7 \2\2\u0148"+
		"\u014a\5J&\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2"+
		"\2\u014b\u014c\3\2\2\2\u014cI\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0153"+
		"\5L\'\2\u014f\u0150\t\5\2\2\u0150\u0154\5L\'\2\u0151\u0152\7\35\2\2\u0152"+
		"\u0154\5> \2\u0153\u014f\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154K\3\2\2\2\u0155\u015a\5N(\2\u0156\u0157\t\6\2\2\u0157\u0159\5"+
		"N(\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015bM\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0162\5P)\2\u015e"+
		"\u015f\7&\2\2\u015f\u0161\5P)\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163O\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7\'\2\2\u0166\u016b\5P)\2\u0167\u0168\7%\2\2\u0168"+
		"\u016b\5P)\2\u0169\u016b\5R*\2\u016a\u0165\3\2\2\2\u016a\u0167\3\2\2\2"+
		"\u016a\u0169\3\2\2\2\u016bQ\3\2\2\2\u016c\u016d\7#\2\2\u016d\u017a\5P"+
		")\2\u016e\u016f\7*\2\2\u016f\u0170\5<\37\2\u0170\u0171\7+\2\2\u0171\u0172"+
		"\5P)\2\u0172\u017a\3\2\2\2\u0173\u0174\7*\2\2\u0174\u0175\5> \2\u0175"+
		"\u0176\7+\2\2\u0176\u0177\5R*\2\u0177\u017a\3\2\2\2\u0178\u017a\5T+\2"+
		"\u0179\u016c\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017aS\3\2\2\2\u017b\u017f\5X-\2\u017c\u017e\5V,\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0185\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\7(\2\2\u0183\u0182\3\2"+
		"\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"U\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\62\2\2\u0189\u018b\5\n\6\2"+
		"\u018a\u018c\58\35\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0192"+
		"\3\2\2\2\u018d\u018e\7.\2\2\u018e\u018f\5B\"\2\u018f\u0190\7/\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0188\3\2\2\2\u0191\u018d\3\2\2\2\u0192W\3\2\2\2"+
		"\u0193\u01a9\5,\27\2\u0194\u0196\7\26\2\2\u0195\u0197\58\35\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01a9\3\2\2\2\u0198\u019f\7\25\2\2"+
		"\u0199\u01a0\58\35\2\u019a\u019b\7\62\2\2\u019b\u019d\7\65\2\2\u019c\u019e"+
		"\58\35\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u0199\3\2\2\2\u019f\u019a\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a9\3\2"+
		"\2\2\u01a1\u01a9\5^\60\2\u01a2\u01a3\7\27\2\2\u01a3\u01a9\5Z.\2\u01a4"+
		"\u01a6\5\n\6\2\u01a5\u01a7\58\35\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u0193\3\2\2\2\u01a8\u0194\3\2\2\2\u01a8"+
		"\u0198\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a4\3\2"+
		"\2\2\u01a9Y\3\2\2\2\u01aa\u01ad\5<\37\2\u01ab\u01ad\5\n\6\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01bc\3\2\2\2\u01ae\u01bd\58\35\2\u01af"+
		"\u01b0\7.\2\2\u01b0\u01b5\7/\2\2\u01b1\u01b2\7.\2\2\u01b2\u01b4\7/\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\5\66\34\2"+
		"\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bd"+
		"\5\\/\2\u01bc\u01ae\3\2\2\2\u01bc\u01af\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"[\3\2\2\2\u01be\u01bf\7.\2\2\u01bf\u01c0\5B\"\2\u01c0\u01c7\7/\2\2\u01c1"+
		"\u01c2\7.\2\2\u01c2\u01c3\5B\"\2\u01c3\u01c4\7/\2\2\u01c4\u01c6\3\2\2"+
		"\2\u01c5\u01c1\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01ce\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7.\2\2\u01cb"+
		"\u01cd\7/\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf]\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2"+
		"\t\7\2\2\u01d2_\3\2\2\2\64afl\u0081\u0087\u008d\u009b\u00a4\u00af\u00b3"+
		"\u00bd\u00c4\u00cf\u00d3\u00da\u00e2\u00e5\u00f9\u00ff\u0103\u010b\u010e"+
		"\u0117\u011d\u0128\u0130\u0133\u013c\u0143\u014b\u0153\u015a\u0162\u016a"+
		"\u0179\u017f\u0185\u018b\u0191\u0196\u019d\u019f\u01a6\u01a8\u01ac\u01b5"+
		"\u01b9\u01bc\u01c7\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}