// Generated from C:/Users/saeed/Desktop/DesignCompiler/Phase2/SimpleLOOP-Compiler/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_BREAK=1, CLASS=2, PUBLIC=3, PRIVATE=4, INITIALIZE=5, NEW=6, SELF=7, 
		RETURN=8, VOID=9, DELETE=10, INCLUDE=11, ADD=12, MERGE=13, PRINT=14, IF=15, 
		ELSE=16, ELSIF=17, PLUS=18, MINUS=19, MULT=20, DIVIDE=21, INC=22, DEC=23, 
		EQUAL=24, GREATER_THAN=25, LESS_THAN=26, ARROW=27, BAR=28, AND=29, OR=30, 
		NOT=31, TIF=32, TELSE=33, TRUE=34, FALSE=35, NULL=36, BEGIN=37, END=38, 
		INT=39, BOOL=40, FPTR=41, SET=42, EACH=43, DO=44, ASSIGN=45, SHARP=46, 
		LPAR=47, RPAR=48, LBRACK=49, RBRACK=50, LBRACE=51, RBRACE=52, COMMA=53, 
		DOT=54, SEMICOLON=55, NEWLINE=56, INT_VALUE=57, IDENTIFIER=58, CLASS_IDENTIFIER=59, 
		COMMENT=60, MLCOMMENT=61, WS=62;
	public static final int
		RULE_simpleLOOP = 0, RULE_program = 1, RULE_constructor = 2, RULE_classDeclaration = 3, 
		RULE_field_decleration = 4, RULE_method = 5, RULE_methodBody = 6, RULE_methodArgsDec = 7, 
		RULE_argDec = 8, RULE_methodArgs = 9, RULE_body = 10, RULE_blockStatement = 11, 
		RULE_singleStatement = 12, RULE_addStatement = 13, RULE_mergeStatement = 14, 
		RULE_deleteStatement = 15, RULE_varDecStatement = 16, RULE_ifStatement = 17, 
		RULE_elsifStatement = 18, RULE_condition = 19, RULE_elseStatement = 20, 
		RULE_printStatement = 21, RULE_methodCallStmt = 22, RULE_returnStatement = 23, 
		RULE_assignmentStatement = 24, RULE_loopStatement = 25, RULE_expression = 26, 
		RULE_ternaryExpression = 27, RULE_orExpression = 28, RULE_andExpression = 29, 
		RULE_equalityExpression = 30, RULE_relationalExpression = 31, RULE_additiveExpression = 32, 
		RULE_multiplicativeExpression = 33, RULE_preUnaryExpression = 34, RULE_postUnaryExpression = 35, 
		RULE_accessExpression = 36, RULE_otherExpression = 37, RULE_setNew = 38, 
		RULE_value = 39, RULE_boolValue = 40, RULE_class_identifier = 41, RULE_identifier = 42, 
		RULE_type = 43, RULE_array_type = 44, RULE_fptr_type = 45, RULE_typesWithComma = 46, 
		RULE_set_type = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "constructor", "classDeclaration", "field_decleration", 
			"method", "methodBody", "methodArgsDec", "argDec", "methodArgs", "body", 
			"blockStatement", "singleStatement", "addStatement", "mergeStatement", 
			"deleteStatement", "varDecStatement", "ifStatement", "elsifStatement", 
			"condition", "elseStatement", "printStatement", "methodCallStmt", "returnStatement", 
			"assignmentStatement", "loopStatement", "expression", "ternaryExpression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"postUnaryExpression", "accessExpression", "otherExpression", "setNew", 
			"value", "boolValue", "class_identifier", "identifier", "type", "array_type", 
			"fptr_type", "typesWithComma", "set_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'public'", "'private'", "'initialize'", "'new'", 
			"'self'", "'return'", "'void'", "'delete'", "'include'", "'add'", "'merge'", 
			"'print'", "'if'", "'else'", "'elsif'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'=='", "'>'", "'<'", "'->'", "'|'", "'&&'", "'||'", "'!'", "'?'", 
			"':'", "'true'", "'false'", "'null'", "'=begin'", "'=end'", "'int'", 
			"'bool'", "'fptr'", "'Set'", "'each'", "'do'", "'='", "'#'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_BREAK", "CLASS", "PUBLIC", "PRIVATE", "INITIALIZE", "NEW", 
			"SELF", "RETURN", "VOID", "DELETE", "INCLUDE", "ADD", "MERGE", "PRINT", 
			"IF", "ELSE", "ELSIF", "PLUS", "MINUS", "MULT", "DIVIDE", "INC", "DEC", 
			"EQUAL", "GREATER_THAN", "LESS_THAN", "ARROW", "BAR", "AND", "OR", "NOT", 
			"TIF", "TELSE", "TRUE", "FALSE", "NULL", "BEGIN", "END", "INT", "BOOL", 
			"FPTR", "SET", "EACH", "DO", "ASSIGN", "SHARP", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", "NEWLINE", 
			"INT_VALUE", "IDENTIFIER", "CLASS_IDENTIFIER", "COMMENT", "MLCOMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLOOPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SimpleLOOPContext extends ParserRuleContext {
		public Program simpleLOOPProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public SimpleLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimpleLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimpleLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimpleLOOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLOOPContext simpleLOOP() throws RecognitionException {
		SimpleLOOPContext _localctx = new SimpleLOOPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLOOP);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(NEWLINE);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(102);
			((SimpleLOOPContext)_localctx).p = program();
			((SimpleLOOPContext)_localctx).simpleLOOPProgram =  ((SimpleLOOPContext)_localctx).p.programRet;
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public VarDecStatementContext v;
		public ClassDeclarationContext c;
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(113);
				((ProgramContext)_localctx).v = varDecStatement();
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        for (VariableDeclaration varDec: ((ProgramContext)_localctx).v.varDecStmtRet)
				            _localctx.programRet.addGlobalVariable(varDec);
				    
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(126);
				((ProgramContext)_localctx).c = classDeclaration();
				setState(128); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(127);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(130); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classDeclarationRet);
				}
				}
				setState(138);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructorDeclarationRet;
		public Token init;
		public MethodArgsDecContext mArgs;
		public MethodBodyContext m;
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode INITIALIZE() { return getToken(SimpleLOOPParser.INITIALIZE, 0); }
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PUBLIC);
			setState(140);
			((ConstructorContext)_localctx).init = match(INITIALIZE);
			setState(141);
			((ConstructorContext)_localctx).mArgs = methodArgsDec();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(142);
				match(NEWLINE);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			((ConstructorContext)_localctx).m = methodBody();

			        ((ConstructorContext)_localctx).constructorDeclarationRet =  new ConstructorDeclaration();
			        _localctx.constructorDeclarationRet.setLine(((ConstructorContext)_localctx).init.getLine());
			        _localctx.constructorDeclarationRet.setBody(((ConstructorContext)_localctx).m.methodBodyRet);
			        _localctx.constructorDeclarationRet.setLocalVars(((ConstructorContext)_localctx).m.localVars);
			        _localctx.constructorDeclarationRet.setArgs(((ConstructorContext)_localctx).mArgs.args);
			      
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
		public ClassDeclaration classDeclarationRet;
		public Token line;
		public Class_identifierContext c;
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<Class_identifierContext> class_identifier() {
			return getRuleContexts(Class_identifierContext.class);
		}
		public Class_identifierContext class_identifier(int i) {
			return getRuleContext(Class_identifierContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<Field_declerationContext> field_decleration() {
			return getRuleContexts(Field_declerationContext.class);
		}
		public Field_declerationContext field_decleration(int i) {
			return getRuleContext(Field_declerationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((ClassDeclarationContext)_localctx).line = match(CLASS);
			setState(152);
			((ClassDeclarationContext)_localctx).c = class_identifier();
			((ClassDeclarationContext)_localctx).classDeclarationRet =  new ClassDeclaration(((ClassDeclarationContext)_localctx).c.class_id);
			                       _localctx.classDeclarationRet.setLine(((ClassDeclarationContext)_localctx).line.getLine());
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(154);
				match(LESS_THAN);
				setState(155);
				class_identifier();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(158);
				match(NEWLINE);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(164);
				match(LBRACE);
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					match(NEWLINE);
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					field_decleration(_localctx.classDeclarationRet);
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(171);
						match(NEWLINE);
						}
						}
						setState(174); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUBLIC || _la==PRIVATE );
				setState(180);
				match(RBRACE);
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				{
				setState(182);
				field_decleration(_localctx.classDeclarationRet);
				}
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

	public static class Field_declerationContext extends ParserRuleContext {
		public ClassDeclaration classDecl;
		public Token accessType;
		public VarDecStatementContext v;
		public MethodContext m;
		public ConstructorContext c;
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SimpleLOOPParser.PRIVATE, 0); }
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Field_declerationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Field_declerationContext(ParserRuleContext parent, int invokingState, ClassDeclaration classDecl) {
			super(parent, invokingState);
			this.classDecl = classDecl;
		}
		@Override public int getRuleIndex() { return RULE_field_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterField_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitField_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitField_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declerationContext field_decleration(ClassDeclaration classDecl) throws RecognitionException {
		Field_declerationContext _localctx = new Field_declerationContext(_ctx, getState(), classDecl);
		enterRule(_localctx, 8, RULE_field_decleration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(185);
				((Field_declerationContext)_localctx).accessType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					((Field_declerationContext)_localctx).accessType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(186);
					((Field_declerationContext)_localctx).v = varDecStatement();

					            FieldDeclaration fd = new FieldDeclaration(((Field_declerationContext)_localctx).v.singleVarDeclRet, (((Field_declerationContext)_localctx).accessType!=null?((Field_declerationContext)_localctx).accessType.getText():null) == "private" ? true : false);
					            fd.setLine(((Field_declerationContext)_localctx).accessType.getLine());
					            _localctx.classDecl.addField(fd);
					        
					}
					break;
				case 2:
					{
					setState(189);
					((Field_declerationContext)_localctx).m = method();

					            MethodDeclaration newMethod = new MethodDeclaration(((Field_declerationContext)_localctx).m.id,((Field_declerationContext)_localctx).m.returnType, (((Field_declerationContext)_localctx).accessType!=null?((Field_declerationContext)_localctx).accessType.getText():null) == "private" ? true : false);
					            newMethod.setArgs(((Field_declerationContext)_localctx).m.args);
					            newMethod.setBody(((Field_declerationContext)_localctx).m.mBody);
					            newMethod.setLocalVars(((Field_declerationContext)_localctx).m.localVars);
					            newMethod.setLine(((Field_declerationContext)_localctx).accessType.getLine());
					            _localctx.classDecl.addMethod(newMethod);
					        
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(194);
				((Field_declerationContext)_localctx).c = constructor();

				         _localctx.classDecl.setConstructor(((Field_declerationContext)_localctx).c.constructorDeclarationRet);
				     
				}
				break;
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodRet;
		public Identifier id;
		public Type returnType;
		public ArrayList<VariableDeclaration> args;
		public ArrayList<Statement> mBody;
		public ArrayList<VariableDeclaration> localVars;
		public TypeContext t;
		public IdentifierContext id_;
		public MethodArgsDecContext mArgs;
		public MethodBodyContext mBody_;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(199);
				((MethodContext)_localctx).t = type();
				}
				setState(200);
				((MethodContext)_localctx).id_ = identifier();
				setState(201);
				((MethodContext)_localctx).mArgs = methodArgsDec();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(202);
					match(NEWLINE);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				((MethodContext)_localctx).mBody_ = methodBody();

				        ((MethodContext)_localctx).id =  ((MethodContext)_localctx).id_.id;
				        ((MethodContext)_localctx).args =  ((MethodContext)_localctx).mArgs.args;
				        ((MethodContext)_localctx).mBody =  ((MethodContext)_localctx).mBody_.methodBodyRet;
				        ((MethodContext)_localctx).returnType =  ((MethodContext)_localctx).t.typeRet;
				        ((MethodContext)_localctx).localVars =  ((MethodContext)_localctx).mBody_.localVars;
				     
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(211);
				match(VOID);
				}
				setState(212);
				((MethodContext)_localctx).id_ = identifier();
				setState(213);
				((MethodContext)_localctx).mArgs = methodArgsDec();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(214);
					match(NEWLINE);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				((MethodContext)_localctx).mBody_ = methodBody();

				              ((MethodContext)_localctx).id =  ((MethodContext)_localctx).id_.id;
				              ((MethodContext)_localctx).args =  ((MethodContext)_localctx).mArgs.args;
				              ((MethodContext)_localctx).mBody =  ((MethodContext)_localctx).mBody_.methodBodyRet;
				              ((MethodContext)_localctx).returnType =  new VoidType();
				              ((MethodContext)_localctx).localVars =  ((MethodContext)_localctx).mBody_.localVars;
				           
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

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<Statement> methodBodyRet;
		public ArrayList<VariableDeclaration> localVars;
		public VarDecStatementContext v;
		public SingleStatementContext s;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				((MethodBodyContext)_localctx).methodBodyRet =  new ArrayList<Statement>();
				    ((MethodBodyContext)_localctx).localVars =  new ArrayList<VariableDeclaration>();
				{
				setState(226);
				match(LBRACE);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					match(NEWLINE);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						((MethodBodyContext)_localctx).v = varDecStatement();
						_localctx.localVars.addAll(((MethodBodyContext)_localctx).v.varDecStmtRet);
						setState(235); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(234);
							match(NEWLINE);
							}
							}
							setState(237); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(244);
					((MethodBodyContext)_localctx).s = singleStatement();
					_localctx.methodBodyRet.add(((MethodBodyContext)_localctx).s.singleStmntRet);
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(246);
						match(NEWLINE);
						}
						}
						setState(249); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(RBRACE);
				}
				}
				break;
			case SELF:
			case RETURN:
			case PRINT:
			case IF:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					{
					setState(257);
					((MethodBodyContext)_localctx).v = varDecStatement();
					((MethodBodyContext)_localctx).localVars =  ((MethodBodyContext)_localctx).v.varDecStmtRet;
					}
					}
					break;
				case 2:
					{
					{
					setState(260);
					((MethodBodyContext)_localctx).s = singleStatement();
					_localctx.methodBodyRet.add(((MethodBodyContext)_localctx).s.singleStmntRet);
					}
					}
					break;
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

	public static class MethodArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> args;
		public ArgDecContext arg;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<ArgDecContext> argDec() {
			return getRuleContexts(ArgDecContext.class);
		}
		public ArgDecContext argDec(int i) {
			return getRuleContext(ArgDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLOOPParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLOOPParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public MethodArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsDecContext methodArgsDec() throws RecognitionException {
		MethodArgsDecContext _localctx = new MethodArgsDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArgsDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgsDecContext)_localctx).args =  new ArrayList<VariableDeclaration>();
			setState(268);
			match(LPAR);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(269);
				((MethodArgsDecContext)_localctx).arg = argDec();
				_localctx.args.add(((MethodArgsDecContext)_localctx).arg.arg);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(271);
					match(ASSIGN);
					setState(272);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(273);
							match(COMMA);
							setState(274);
							((MethodArgsDecContext)_localctx).arg = argDec();
							_localctx.args.add(((MethodArgsDecContext)_localctx).arg.arg);
							}
							} 
						}
						setState(281);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					((MethodArgsDecContext)_localctx).arg = argDec();
					_localctx.args.add(((MethodArgsDecContext)_localctx).arg.arg);
					setState(287);
					match(ASSIGN);
					setState(288);
					orExpression();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(297);
			match(RPAR);
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

	public static class ArgDecContext extends ParserRuleContext {
		public VariableDeclaration arg;
		public TypeContext t;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((ArgDecContext)_localctx).t = type();
			setState(300);
			((ArgDecContext)_localctx).id = identifier();
			((ArgDecContext)_localctx).arg =  new VariableDeclaration(((ArgDecContext)_localctx).id.id,((ArgDecContext)_localctx).t.typeRet);
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

	public static class MethodArgsContext extends ParserRuleContext {
		public ArrayList<Expression> methodArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgsContext)_localctx).methodArgsRet =  new ArrayList<Expression>();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(304);
				((MethodArgsContext)_localctx).e1 = expression();
				_localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e1.expressionRet);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(306);
					match(COMMA);
					setState(307);
					((MethodArgsContext)_localctx).e2 = expression();
					_localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e2.expressionRet);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public Statement bodyRet;
		public BlockStatementContext b;
		public SingleStatementContext s;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(317);
				((BodyContext)_localctx).b = blockStatement();

				        ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockStatementRet;
				     
				}
				break;
			case NEWLINE:
				{
				{
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(320);
					match(NEWLINE);
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(325);
				((BodyContext)_localctx).s = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).s.singleStmntRet;
				}
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStatementRet;
		public ArrayList<Statement> stmts;
		public Token l;
		public SingleStatementContext s;
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockStatementContext)_localctx).stmts =  new ArrayList<Statement>();
			setState(331);
			((BlockStatementContext)_localctx).l = match(LBRACE);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(NEWLINE);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(337);
				((BlockStatementContext)_localctx).s = singleStatement();
				_localctx.stmts.add(((BlockStatementContext)_localctx).s.singleStmntRet);
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(339);
					match(NEWLINE);
					}
					}
					setState(342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(RBRACE);

			        ((BlockStatementContext)_localctx).blockStatementRet =  new BlockStmt(_localctx.stmts);
			        _localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).l.getLine());
			    
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStmntRet;
		public IfStatementContext i;
		public PrintStatementContext pr;
		public MethodCallStmtContext mCall;
		public ReturnStatementContext r;
		public AssignmentStatementContext as;
		public LoopStatementContext l;
		public AddStatementContext addS;
		public MergeStatementContext m;
		public DeleteStatementContext d;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AddStatementContext addStatement() {
			return getRuleContext(AddStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleStatement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				((SingleStatementContext)_localctx).i = ifStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).i.ifStatementRet;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((SingleStatementContext)_localctx).pr = printStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).pr.printStatementRet;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				((SingleStatementContext)_localctx).mCall = methodCallStmt();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).mCall.methodCallStmtRet;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				((SingleStatementContext)_localctx).r = returnStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).r.returnStatementRet;
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				((SingleStatementContext)_localctx).as = assignmentStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).as.assignmentStatementRet;
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				((SingleStatementContext)_localctx).l = loopStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).l.loopStatementRet;
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				((SingleStatementContext)_localctx).addS = addStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).addS.addStatementRet;
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				((SingleStatementContext)_localctx).m = mergeStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).m.mergeStatementRet;
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(376);
				((SingleStatementContext)_localctx).d = deleteStatement();

				        ((SingleStatementContext)_localctx).singleStmntRet =  ((SingleStatementContext)_localctx).d.deleteStatementRet;
				    
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

	public static class AddStatementContext extends ParserRuleContext {
		public Statement addStatementRet;
		public ExpressionContext lv;
		public Token add;
		public OrExpressionContext rv;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimpleLOOPParser.ADD, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AddStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAddStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAddStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAddStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStatementContext addStatement() throws RecognitionException {
		AddStatementContext _localctx = new AddStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((AddStatementContext)_localctx).lv = expression();
			setState(382);
			match(DOT);
			setState(383);
			((AddStatementContext)_localctx).add = match(ADD);
			setState(384);
			match(LPAR);
			setState(385);
			((AddStatementContext)_localctx).rv = orExpression();
			setState(386);
			match(RPAR);

			        ((AddStatementContext)_localctx).addStatementRet =  new SetAdd(((AddStatementContext)_localctx).lv.expressionRet,((AddStatementContext)_localctx).rv.orExpressionRet);
			        _localctx.addStatementRet.setLine(((AddStatementContext)_localctx).add.getLine());
			    
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

	public static class MergeStatementContext extends ParserRuleContext {
		public Statement mergeStatementRet;
		public ExpressionContext lv;
		public Token merge;
		public OrExpressionContext rv;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(SimpleLOOPParser.MERGE, 0); }
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mergeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((MergeStatementContext)_localctx).lv = expression();
			setState(390);
			match(DOT);
			setState(391);
			((MergeStatementContext)_localctx).merge = match(MERGE);
			setState(392);
			match(LPAR);
			setState(393);
			((MergeStatementContext)_localctx).rv = orExpression();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394);
				match(COMMA);
				setState(395);
				orExpression();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(RPAR);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public Statement deleteStatementRet;
		public ExpressionContext lv;
		public Token delete;
		public OrExpressionContext rv;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SimpleLOOPParser.DELETE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((DeleteStatementContext)_localctx).lv = expression();
			setState(404);
			match(DOT);
			setState(405);
			((DeleteStatementContext)_localctx).delete = match(DELETE);
			setState(406);
			match(LPAR);
			setState(407);
			((DeleteStatementContext)_localctx).rv = orExpression();
			setState(408);
			match(RPAR);

			        ((DeleteStatementContext)_localctx).deleteStatementRet =  new SetDelete(((DeleteStatementContext)_localctx).lv.expressionRet,((DeleteStatementContext)_localctx).rv.orExpressionRet);
			        _localctx.deleteStatementRet.setLine(((DeleteStatementContext)_localctx).delete.getLine());
			    
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> varDecStmtRet;
		public VariableDeclaration singleVarDeclRet;
		public TypeContext t;
		public IdentifierContext id;
		public IdentifierContext id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VarDecStatementContext)_localctx).varDecStmtRet =   new ArrayList<VariableDeclaration>();
			setState(412);
			((VarDecStatementContext)_localctx).t = type();
			setState(413);
			((VarDecStatementContext)_localctx).id = identifier();

			          VariableDeclaration newVar = new VariableDeclaration(((VarDecStatementContext)_localctx).id.id,((VarDecStatementContext)_localctx).t.typeRet);
			          newVar.setLine(((VarDecStatementContext)_localctx).id.line);
			          _localctx.varDecStmtRet.add(newVar);

			          ((VarDecStatementContext)_localctx).singleVarDeclRet =  newVar;
			     
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(415);
				match(COMMA);
				setState(416);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        VariableDeclaration newVar2 = new VariableDeclaration(((VarDecStatementContext)_localctx).id2.id,((VarDecStatementContext)_localctx).t.typeRet);
				        newVar2.setLine(((VarDecStatementContext)_localctx).id2.line);
				        _localctx.varDecStmtRet.add(newVar2);
				     
				}
				}
				setState(423);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStatementRet;
		public ArrayList<ElsifStmt> elifStmts;
		public Token ifKeyword;
		public ConditionContext cond;
		public BodyContext bRet;
		public ElsifStatementContext elif;
		public ElseStatementContext els;
		public TerminalNode IF() { return getToken(SimpleLOOPParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElsifStatementContext> elsifStatement() {
			return getRuleContexts(ElsifStatementContext.class);
		}
		public ElsifStatementContext elsifStatement(int i) {
			return getRuleContext(ElsifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			((IfStatementContext)_localctx).ifKeyword = match(IF);
			setState(425);
			((IfStatementContext)_localctx).cond = condition();
			setState(426);
			((IfStatementContext)_localctx).bRet = body();

			        ((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).cond.conditionRet,((IfStatementContext)_localctx).bRet.bodyRet);
			        _localctx.ifStatementRet.setLine((((IfStatementContext)_localctx).ifKeyword!=null?((IfStatementContext)_localctx).ifKeyword.getLine():0));
			    
			((IfStatementContext)_localctx).elifStmts =  new ArrayList<ElsifStmt>();
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					((IfStatementContext)_localctx).elif = elsifStatement();
					_localctx.elifStmts.add(((IfStatementContext)_localctx).elif.elsifStatementRet);
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(437);
				((IfStatementContext)_localctx).els = elseStatement();

				        _localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).els.bodyRet);
				    
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

	public static class ElsifStatementContext extends ParserRuleContext {
		public ElsifStmt elsifStatementRet;
		public Token elif;
		public ConditionContext cond;
		public BodyContext b;
		public TerminalNode ELSIF() { return getToken(SimpleLOOPParser.ELSIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElsifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElsifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElsifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElsifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifStatementContext elsifStatement() throws RecognitionException {
		ElsifStatementContext _localctx = new ElsifStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(442);
				match(NEWLINE);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			((ElsifStatementContext)_localctx).elif = match(ELSIF);
			setState(449);
			((ElsifStatementContext)_localctx).cond = condition();
			setState(450);
			((ElsifStatementContext)_localctx).b = body();

			        ((ElsifStatementContext)_localctx).elsifStatementRet =  new ElsifStmt(((ElsifStatementContext)_localctx).cond.conditionRet,((ElsifStatementContext)_localctx).b.bodyRet);
			        _localctx.elsifStatementRet.setLine((((ElsifStatementContext)_localctx).elif!=null?((ElsifStatementContext)_localctx).elif.getLine():0));
			     
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

	public static class ConditionContext extends ParserRuleContext {
		public Expression conditionRet;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(453);
				match(LPAR);
				setState(454);
				((ConditionContext)_localctx).e = expression();
				((ConditionContext)_localctx).conditionRet =  ((ConditionContext)_localctx).e.expressionRet;
				setState(456);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(458);
				((ConditionContext)_localctx).e = expression();
				((ConditionContext)_localctx).conditionRet =  ((ConditionContext)_localctx).e.expressionRet;
				}
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement bodyRet;
		public int line;
		public Token el;
		public BodyContext b;
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(463);
				match(NEWLINE);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			((ElseStatementContext)_localctx).el = match(ELSE);
			setState(470);
			((ElseStatementContext)_localctx).b = body();

			        ((ElseStatementContext)_localctx).line =  ((ElseStatementContext)_localctx).el.getLine();
			        ((ElseStatementContext)_localctx).bodyRet =  ((ElseStatementContext)_localctx).b.bodyRet;
			    
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printStatementRet;
		public Token print;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode PRINT() { return getToken(SimpleLOOPParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((PrintStatementContext)_localctx).print = match(PRINT);
			setState(474);
			match(LPAR);
			setState(475);
			((PrintStatementContext)_localctx).e = expression();
			setState(476);
			match(RPAR);

			        ((PrintStatementContext)_localctx).printStatementRet =  new PrintStmt(((PrintStatementContext)_localctx).e.expressionRet);
			        _localctx.printStatementRet.setLine((((PrintStatementContext)_localctx).print!=null?((PrintStatementContext)_localctx).print.getLine():0));
			    
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallStmt methodCallStmtRet;
		public AccessExpressionContext ae;
		public Token lpar;
		public MethodArgsContext mArgs;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((MethodCallStmtContext)_localctx).ae = accessExpression();
			{
			setState(480);
			((MethodCallStmtContext)_localctx).lpar = match(LPAR);
			setState(481);
			((MethodCallStmtContext)_localctx).mArgs = methodArgs();
			setState(482);
			match(RPAR);
			}

			        MethodCall methodCall = new MethodCall(((MethodCallStmtContext)_localctx).ae.accessExpressionRet, ((MethodCallStmtContext)_localctx).mArgs.methodArgsRet);
			        methodCall.setLine(((MethodCallStmtContext)_localctx).lpar.getLine());
			        ((MethodCallStmtContext)_localctx).methodCallStmtRet =  new MethodCallStmt(methodCall);
			    
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStatementRet;
		public Token r;
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(SimpleLOOPParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			setState(487);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			_localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(489);
				((ReturnStatementContext)_localctx).exp = expression();
				_localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).exp.expressionRet);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStatementRet;
		public OrExpressionContext oe;
		public Token a;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			((AssignmentStatementContext)_localctx).oe = orExpression();
			setState(495);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(496);
			((AssignmentStatementContext)_localctx).e = expression();

			        ((AssignmentStatementContext)_localctx).assignmentStatementRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).oe.orExpressionRet,((AssignmentStatementContext)_localctx).e.expressionRet);
			        _localctx.assignmentStatementRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
			    
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

	public static class LoopStatementContext extends ParserRuleContext {
		public EachStmt loopStatementRet;
		public AccessExpressionContext ae;
		public Token each;
		public IdentifierContext var;
		public BodyContext b;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> BAR() { return getTokens(SimpleLOOPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SimpleLOOPParser.BAR, i);
		}
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			((LoopStatementContext)_localctx).ae = accessExpression();
			setState(500);
			match(DOT);
			setState(501);
			((LoopStatementContext)_localctx).each = match(EACH);
			setState(502);
			match(DO);
			setState(503);
			match(BAR);
			setState(504);
			((LoopStatementContext)_localctx).var = identifier();
			setState(505);
			match(BAR);
			setState(506);
			((LoopStatementContext)_localctx).b = body();

			        ((LoopStatementContext)_localctx).loopStatementRet =  new EachStmt(((LoopStatementContext)_localctx).var.id,((LoopStatementContext)_localctx).ae.accessExpressionRet);
			        _localctx.loopStatementRet.setLine(((LoopStatementContext)_localctx).each.getLine());
			        _localctx.loopStatementRet.setBody(((LoopStatementContext)_localctx).b.bodyRet);
			    
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
		public Expression expressionRet;
		public TernaryExpressionContext oe1;
		public Token a;
		public ExpressionContext e;
		public Token inc;
		public OrExpressionContext oe2;
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCLUDE() { return getToken(SimpleLOOPParser.INCLUDE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			((ExpressionContext)_localctx).oe1 = ternaryExpression();
			 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).oe1.ternaryExpressionRet; 
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(511);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(512);
				((ExpressionContext)_localctx).e = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).oe1.ternaryExpressionRet, ((ExpressionContext)_localctx).e.expressionRet, op);
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).a.getLine());
				    
				}
			}

			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(517);
				match(DOT);
				setState(518);
				((ExpressionContext)_localctx).inc = match(INCLUDE);
				setState(519);
				match(LPAR);
				setState(520);
				((ExpressionContext)_localctx).oe2 = orExpression();
				setState(521);
				match(RPAR);

				        ((ExpressionContext)_localctx).expressionRet =  new SetInclude(_localctx.expressionRet, ((ExpressionContext)_localctx).oe2.orExpressionRet);
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).inc.getLine());
				    
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public Expression ternaryExpressionRet;
		public OrExpressionContext oe;
		public Token t1;
		public TernaryExpressionContext trueExp;
		public Token t2;
		public TernaryExpressionContext falseExp;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode TIF() { return getToken(SimpleLOOPParser.TIF, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
		public TerminalNode TELSE() { return getToken(SimpleLOOPParser.TELSE, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			((TernaryExpressionContext)_localctx).oe = orExpression();
			 ((TernaryExpressionContext)_localctx).ternaryExpressionRet =  ((TernaryExpressionContext)_localctx).oe.orExpressionRet;
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(528);
				((TernaryExpressionContext)_localctx).t1 = match(TIF);
				setState(529);
				((TernaryExpressionContext)_localctx).trueExp = ternaryExpression();
				setState(530);
				((TernaryExpressionContext)_localctx).t2 = match(TELSE);
				setState(531);
				((TernaryExpressionContext)_localctx).falseExp = ternaryExpression();

				        TernaryOperator op = TernaryOperator.ternary;
				        ((TernaryExpressionContext)_localctx).ternaryExpressionRet =  new TernaryExpression(((TernaryExpressionContext)_localctx).oe.orExpressionRet, ((TernaryExpressionContext)_localctx).trueExp.ternaryExpressionRet, ((TernaryExpressionContext)_localctx).falseExp.ternaryExpressionRet);
				        _localctx.ternaryExpressionRet.setLine(((TernaryExpressionContext)_localctx).t1.getLine());
				    
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpressionRet;
		public AndExpressionContext ael;
		public Token o;
		public AndExpressionContext aer;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleLOOPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleLOOPParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).ael.andExpressionRet; 
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(538);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(539);
				((OrExpressionContext)_localctx).aer = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(_localctx.orExpressionRet, ((OrExpressionContext)_localctx).aer.andExpressionRet, op);
				        _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(546);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpressionRet;
		public EqualityExpressionContext eel;
		public Token a;
		public EqualityExpressionContext ee2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleLOOPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleLOOPParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			((AndExpressionContext)_localctx).eel = equalityExpression();
			 ((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).eel.equalityExpressionRet; 
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(549);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(550);
				((AndExpressionContext)_localctx).ee2 = equalityExpression();

				            BinaryOperator op = BinaryOperator.and;
				            ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(_localctx.andExpressionRet, ((AndExpressionContext)_localctx).ee2.equalityExpressionRet, op);
				            _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).a.getLine());
				        
				}
				}
				setState(557);
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
		public Expression equalityExpressionRet;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext rel;
		public Token eq;
		public RelationalExpressionContext rer;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SimpleLOOPParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SimpleLOOPParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			 ((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).rel.relationalExpressionRet; 
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(560);
				((EqualityExpressionContext)_localctx).eq = match(EQUAL);

				        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).eq.getLine();
				    
				setState(562);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				        ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(_localctx.equalityExpressionRet, ((EqualityExpressionContext)_localctx).rer.relationalExpressionRet, _localctx.op);
				        _localctx.equalityExpressionRet.setLine(_localctx.line);
				    
				}
				}
				setState(569);
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
		public Expression relationalExpressionRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext ael;
		public Token gt;
		public Token lt;
		public AdditiveExpressionContext aer;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SimpleLOOPParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SimpleLOOPParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SimpleLOOPParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SimpleLOOPParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).ael.additiveExpressionRet; 
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(572);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).gt.getLine();
					    
					}
					break;
				case LESS_THAN:
					{
					setState(574);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).lt.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(578);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(_localctx.relationalExpressionRet, ((RelationalExpressionContext)_localctx).aer.additiveExpressionRet, _localctx.op);
				        _localctx.relationalExpressionRet.setLine(_localctx.line);
				    
				}
				}
				setState(585);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext mel;
		public Token add;
		public Token sub;
		public MultiplicativeExpressionContext mer;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleLOOPParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleLOOPParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleLOOPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLOOPParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			((AdditiveExpressionContext)_localctx).mel = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).mel.multiplicativeExpressionRet; 
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(588);
					((AdditiveExpressionContext)_localctx).add = match(PLUS);

					                       ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					                       ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).add.getLine();
					                   
					}
					break;
				case MINUS:
					{
					setState(590);
					((AdditiveExpressionContext)_localctx).sub = match(MINUS);

					                       ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					                       ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).sub.getLine();
					                   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(594);
				((AdditiveExpressionContext)_localctx).mer = multiplicativeExpression();

				                       ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(_localctx.additiveExpressionRet, ((AdditiveExpressionContext)_localctx).mer.multiplicativeExpressionRet, _localctx.op);
				                       _localctx.additiveExpressionRet.setLine(_localctx.line);
				                   
				}
				}
				setState(601);
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
		public Expression multiplicativeExpressionRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext pel;
		public Token mult;
		public Token div;
		public PreUnaryExpressionContext per;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleLOOPParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleLOOPParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleLOOPParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleLOOPParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			((MultiplicativeExpressionContext)_localctx).pel = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).pel.preUnaryExpressionRet; 
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(604);
					((MultiplicativeExpressionContext)_localctx).mult = match(MULT);

					                ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					                ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mult.getLine();
					            
					}
					break;
				case DIVIDE:
					{
					setState(606);
					((MultiplicativeExpressionContext)_localctx).div = match(DIVIDE);

					                ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					                ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).div.getLine();
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(610);
				((MultiplicativeExpressionContext)_localctx).per = preUnaryExpression();

				                ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).per.preUnaryExpressionRet, _localctx.op);
				                _localctx.multiplicativeExpressionRet.setLine(_localctx.line);
				            
				}
				}
				setState(617);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpressionRet;
		public UnaryOperator op;
		public int line;
		public Token not;
		public Token minus;
		public PreUnaryExpressionContext pre;
		public PostUnaryExpressionContext pue;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_preUnaryExpression);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(618);
					((PreUnaryExpressionContext)_localctx).not = match(NOT);

					                       ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					                       ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).not.getLine();
					                   
					}
					break;
				case MINUS:
					{
					setState(620);
					((PreUnaryExpressionContext)_localctx).minus = match(MINUS);

					                       ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					                       ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).minus.getLine();
					                   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(624);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				                       ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUnaryExpressionRet, _localctx.op);
				                       _localctx.preUnaryExpressionRet.setLine(_localctx.line);
				                   
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				((PreUnaryExpressionContext)_localctx).pue = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).pue.postUnaryExpressionRet; 
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUnaryExpressionRet;
		public UnaryOperator op;
		public int line;
		public AccessExpressionContext ae;
		public Token inc;
		public Token dec;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_postUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();

			        ((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  ((PostUnaryExpressionContext)_localctx).ae.accessExpressionRet;
			    
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(634);
					((PostUnaryExpressionContext)_localctx).inc = match(INC);

					        ((PostUnaryExpressionContext)_localctx).op =  UnaryOperator.postinc;
					        ((PostUnaryExpressionContext)_localctx).line =  ((PostUnaryExpressionContext)_localctx).inc.getLine();
					    
					}
					break;
				case DEC:
					{
					setState(636);
					((PostUnaryExpressionContext)_localctx).dec = match(DEC);

					        ((PostUnaryExpressionContext)_localctx).op =  UnaryOperator.postdec;
					        ((PostUnaryExpressionContext)_localctx).line =  ((PostUnaryExpressionContext)_localctx).dec.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

				        ((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).ae.accessExpressionRet, _localctx.op);
				        _localctx.postUnaryExpressionRet.setLine(_localctx.line);
				    
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpressionRet;
		public OtherExpressionContext oe;
		public Token l1;
		public MethodArgsContext m;
		public Token dot;
		public IdentifierContext id;
		public Token n;
		public Token init;
		public Token lbrack;
		public ExpressionContext exp;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<MethodArgsContext> methodArgs() {
			return getRuleContexts(MethodArgsContext.class);
		}
		public MethodArgsContext methodArgs(int i) {
			return getRuleContext(MethodArgsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NEW() { return getTokens(SimpleLOOPParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(SimpleLOOPParser.NEW, i);
		}
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_accessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(661);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(645);
						((AccessExpressionContext)_localctx).l1 = match(LPAR);
						setState(646);
						((AccessExpressionContext)_localctx).m = methodArgs();
						setState(647);
						match(RPAR);
						}

						            ((AccessExpressionContext)_localctx).accessExpressionRet =  new MethodCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).m.methodArgsRet);
						            _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).l1.getLine());
						        
						}
						break;
					case DOT:
						{
						{
						setState(651);
						((AccessExpressionContext)_localctx).dot = match(DOT);
						setState(659);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(652);
							((AccessExpressionContext)_localctx).id = identifier();

							                ((AccessExpressionContext)_localctx).accessExpressionRet =  new ObjectMemberAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).id.id);
							                _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).dot.getLine());
							            
							}
							break;
						case NEW:
							{
							setState(655);
							((AccessExpressionContext)_localctx).n = match(NEW);

							                ((AccessExpressionContext)_localctx).accessExpressionRet =  new NewClassInstance(((AccessExpressionContext)_localctx).oe.ct);
							                _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).n.getLine());
							            
							}
							break;
						case INITIALIZE:
							{
							setState(657);
							((AccessExpressionContext)_localctx).init = match(INITIALIZE);

							                Identifier id = new Identifier((((AccessExpressionContext)_localctx).init!=null?((AccessExpressionContext)_localctx).init.getText():null));
							                id.setLine(((AccessExpressionContext)_localctx).init.getLine());
							                ((AccessExpressionContext)_localctx).accessExpressionRet =  new ObjectMemberAccess(_localctx.accessExpressionRet, id);
							                _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).init.getLine());
							            
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(675);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(666);
						((AccessExpressionContext)_localctx).dot = match(DOT);
						{
						setState(667);
						((AccessExpressionContext)_localctx).id = identifier();

						                 ((AccessExpressionContext)_localctx).accessExpressionRet =  new ObjectMemberAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).id.id);
						                _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).dot.getLine());
						            
						}
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(670);
						((AccessExpressionContext)_localctx).lbrack = match(LBRACK);
						setState(671);
						((AccessExpressionContext)_localctx).exp = expression();

						                 ((AccessExpressionContext)_localctx).accessExpressionRet =  new ArrayAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).exp.expressionRet);
						                _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lbrack.getLine());
						            
						setState(673);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public ClassType ct;
		public Class_identifierContext c;
		public ValueContext v;
		public IdentifierContext id;
		public SetNewContext s;
		public Token lpar;
		public ExpressionContext exp;
		public Token self;
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetNewContext setNew() {
			return getRuleContext(SetNewContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SimpleLOOPParser.SELF, 0); }
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_otherExpression);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				((OtherExpressionContext)_localctx).c = class_identifier();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).c.class_id;
				        ((OtherExpressionContext)_localctx).ct =  new ClassType(((OtherExpressionContext)_localctx).c.class_id);
				    
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				((OtherExpressionContext)_localctx).v = value();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.id; 
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				((OtherExpressionContext)_localctx).s = setNew();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).s.setNewRet;
				    
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(692);
				((OtherExpressionContext)_localctx).lpar = match(LPAR);
				setState(693);
				((OtherExpressionContext)_localctx).exp = expression();
				setState(694);
				match(RPAR);

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).exp.expressionRet;
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).lpar.getLine());
				    
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 6);
				{
				setState(697);
				((OtherExpressionContext)_localctx).self = match(SELF);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new SelfClass();
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).self.getLine());
				    
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

	public static class SetNewContext extends ParserRuleContext {
		public SetNew setNewRet;
		public ArrayList<Expression> arguments;
		public Token set;
		public OrExpressionContext exp;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(SimpleLOOPParser.NEW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public SetNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNewContext setNew() throws RecognitionException {
		SetNewContext _localctx = new SetNewContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			((SetNewContext)_localctx).set = match(SET);
			setState(702);
			match(DOT);
			setState(703);
			match(NEW);
			setState(704);
			match(LPAR);
			((SetNewContext)_localctx).arguments =  new ArrayList<Expression>();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(706);
				match(LPAR);
				setState(707);
				((SetNewContext)_localctx).exp = orExpression();
				_localctx.arguments.add(((SetNewContext)_localctx).exp.orExpressionRet);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(709);
					match(COMMA);
					setState(710);
					((SetNewContext)_localctx).exp = orExpression();
					_localctx.arguments.add(((SetNewContext)_localctx).exp.orExpressionRet);
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				match(RPAR);
				}
			}

			setState(722);
			match(RPAR);

			        ((SetNewContext)_localctx).setNewRet =  new SetNew(_localctx.arguments);
			        _localctx.setNewRet.setLine((((SetNewContext)_localctx).set!=null?((SetNewContext)_localctx).set.getLine():0));
			    
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext bool;
		public Token i;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(SimpleLOOPParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				((ValueContext)_localctx).bool = boolValue();

				            ((ValueContext)_localctx).valueRet =  new BoolValue(((ValueContext)_localctx).bool.boolValueRet);
				            _localctx.valueRet.setLine(((ValueContext)_localctx).bool.line);
				        
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				((ValueContext)_localctx).i = match(INT_VALUE);

				            ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0));
				            _localctx.valueRet.setLine(((ValueContext)_localctx).i.getLine());
				        
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

	public static class BoolValueContext extends ParserRuleContext {
		public boolean boolValueRet;
		public int line;
		public Token tr;
		public Token fa;
		public TerminalNode TRUE() { return getToken(SimpleLOOPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleLOOPParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolValue);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				((BoolValueContext)_localctx).tr = match(TRUE);

				    ((BoolValueContext)_localctx).boolValueRet =  true;
				    ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).tr.getLine();

				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				((BoolValueContext)_localctx).fa = match(FALSE);

				  ((BoolValueContext)_localctx).boolValueRet =  false;
				  ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).fa.getLine();

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

	public static class Class_identifierContext extends ParserRuleContext {
		public Identifier class_id;
		public int line;
		public Token c;
		public TerminalNode CLASS_IDENTIFIER() { return getToken(SimpleLOOPParser.CLASS_IDENTIFIER, 0); }
		public Class_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_identifierContext class_identifier() throws RecognitionException {
		Class_identifierContext _localctx = new Class_identifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			((Class_identifierContext)_localctx).c = match(CLASS_IDENTIFIER);

			            ((Class_identifierContext)_localctx).class_id =  new Identifier((((Class_identifierContext)_localctx).c!=null?((Class_identifierContext)_localctx).c.getText():null));
			            _localctx.class_id.setLine(((Class_identifierContext)_localctx).c.getLine());
			         
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public int line;
		public Token identifierLine;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLOOPParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			((IdentifierContext)_localctx).identifierLine = match(IDENTIFIER);

			           ((IdentifierContext)_localctx).id =  new Identifier((((IdentifierContext)_localctx).identifierLine!=null?((IdentifierContext)_localctx).identifierLine.getText():null));
			           _localctx.id.setLine(((IdentifierContext)_localctx).identifierLine.getLine());

			           ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).identifierLine.getLine();
			       
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
		public Type typeRet;
		public Array_typeContext a;
		public Fptr_typeContext f;
		public Set_typeContext s;
		public Class_identifierContext c;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				((TypeContext)_localctx).a = array_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).a.arrayTypeRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				((TypeContext)_localctx).f = fptr_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(754);
				((TypeContext)_localctx).s = set_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).s.setTypeRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				((TypeContext)_localctx).c = class_identifier();

				            ((TypeContext)_localctx).typeRet =  new ClassType(((TypeContext)_localctx).c.class_id);
				      
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

	public static class Array_typeContext extends ParserRuleContext {
		public ArrayType arrayTypeRet;
		public Type elemType;
		public ArrayList<Expression> dim;
		public Class_identifierContext c;
		public ExpressionContext exp;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(762);
				match(INT);
				 ((Array_typeContext)_localctx).elemType =  new IntType(); 
				}
				break;
			case BOOL:
				{
				setState(764);
				match(BOOL);
				 ((Array_typeContext)_localctx).elemType =  new BoolType(); 
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(766);
				((Array_typeContext)_localctx).c = class_identifier();
				 ((Array_typeContext)_localctx).elemType =  new ClassType(((Array_typeContext)_localctx).c.class_id); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			((Array_typeContext)_localctx).dim =  new ArrayList<Expression>();
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(772);
				match(LBRACK);
				setState(773);
				((Array_typeContext)_localctx).exp = expression();
				_localctx.dim.add(((Array_typeContext)_localctx).exp.expressionRet);
				setState(775);
				match(RBRACK);
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			 ((Array_typeContext)_localctx).arrayTypeRet =  new ArrayType(_localctx.elemType, _localctx.dim); 
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public ArrayList<Type> argsTypes;
		public Type returnType;
		public TypesWithCommaContext types;
		public TypeContext t;
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fptr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(FPTR);
			setState(784);
			match(LESS_THAN);
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(785);
				match(VOID);
				 ((Fptr_typeContext)_localctx).argsTypes =  new ArrayList<Type>(); 
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(787);
				((Fptr_typeContext)_localctx).types = typesWithComma();
				 ((Fptr_typeContext)_localctx).argsTypes =  ((Fptr_typeContext)_localctx).types.typesWithCommaRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(792);
			match(ARROW);
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(793);
				match(VOID);
				 ((Fptr_typeContext)_localctx).returnType =  new VoidType(); 
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(795);
				((Fptr_typeContext)_localctx).t = type();
				 ((Fptr_typeContext)_localctx).returnType =  ((Fptr_typeContext)_localctx).t.typeRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(800);
			match(GREATER_THAN);
			 ((Fptr_typeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.argsTypes, _localctx.returnType); 
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext t1;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<>(); 
			setState(804);
			((TypesWithCommaContext)_localctx).t1 = type();
			 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t1.typeRet); 
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(806);
				match(COMMA);
				setState(807);
				((TypesWithCommaContext)_localctx).t2 = type();
				 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t2.typeRet); 
				}
				}
				setState(814);
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

	public static class Set_typeContext extends ParserRuleContext {
		public SetType setTypeRet;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(SET);
			setState(816);
			match(LESS_THAN);
			{
			setState(817);
			match(INT);
			}
			setState(818);
			match(GREATER_THAN);
			 ((Set_typeContext)_localctx).setTypeRet =  new SetType(); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0338\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\6\3v\n\3\r\3"+
		"\16\3w\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\6\3\u0083\n\3\r\3\16"+
		"\3\u0084\3\3\3\3\7\3\u0089\n\3\f\3\16\3\u008c\13\3\3\4\3\4\3\4\3\4\7\4"+
		"\u0092\n\4\f\4\16\4\u0095\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u009f"+
		"\n\5\3\5\7\5\u00a2\n\5\f\5\16\5\u00a5\13\5\3\5\3\5\6\5\u00a9\n\5\r\5\16"+
		"\5\u00aa\3\5\3\5\6\5\u00af\n\5\r\5\16\5\u00b0\6\5\u00b3\n\5\r\5\16\5\u00b4"+
		"\3\5\3\5\3\5\5\5\u00ba\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c3\n\6\3"+
		"\6\3\6\3\6\5\6\u00c8\n\6\3\7\3\7\3\7\3\7\7\7\u00ce\n\7\f\7\16\7\u00d1"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00da\n\7\f\7\16\7\u00dd\13\7\3"+
		"\7\3\7\3\7\5\7\u00e2\n\7\3\b\3\b\3\b\6\b\u00e7\n\b\r\b\16\b\u00e8\3\b"+
		"\3\b\3\b\6\b\u00ee\n\b\r\b\16\b\u00ef\7\b\u00f2\n\b\f\b\16\b\u00f5\13"+
		"\b\3\b\3\b\3\b\6\b\u00fa\n\b\r\b\16\b\u00fb\7\b\u00fe\n\b\f\b\16\b\u0101"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010a\n\b\5\b\u010c\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0118\n\t\f\t\16\t\u011b\13\t\5\t"+
		"\u011d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0125\n\t\f\t\16\t\u0128\13\t\5"+
		"\t\u012a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0139\n\13\f\13\16\13\u013c\13\13\5\13\u013e\n\13\3\f\3\f\3\f\3"+
		"\f\6\f\u0144\n\f\r\f\16\f\u0145\3\f\3\f\3\f\5\f\u014b\n\f\3\r\3\r\3\r"+
		"\6\r\u0150\n\r\r\r\16\r\u0151\3\r\3\r\3\r\6\r\u0157\n\r\r\r\16\r\u0158"+
		"\7\r\u015b\n\r\f\r\16\r\u015e\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u017e\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u018f"+
		"\n\20\f\20\16\20\u0192\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01a6\n\22\f\22"+
		"\16\22\u01a9\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b3"+
		"\n\23\f\23\16\23\u01b6\13\23\3\23\3\23\3\23\5\23\u01bb\n\23\3\24\7\24"+
		"\u01be\n\24\f\24\16\24\u01c1\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d0\n\25\3\26\7\26\u01d3\n\26\f"+
		"\26\16\26\u01d6\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01ef\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0206\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u020f\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0219\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0221\n"+
		"\36\f\36\16\36\u0224\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u022c\n"+
		"\37\f\37\16\37\u022f\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u0238\n \f \16 \u023b"+
		"\13 \3!\3!\3!\3!\3!\3!\5!\u0243\n!\3!\3!\3!\7!\u0248\n!\f!\16!\u024b\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0253\n\"\3\"\3\"\3\"\7\"\u0258\n\"\f\""+
		"\16\"\u025b\13\"\3#\3#\3#\3#\3#\3#\5#\u0263\n#\3#\3#\3#\7#\u0268\n#\f"+
		"#\16#\u026b\13#\3$\3$\3$\3$\5$\u0271\n$\3$\3$\3$\3$\3$\3$\5$\u0279\n$"+
		"\3%\3%\3%\3%\3%\3%\5%\u0281\n%\3%\5%\u0284\n%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0296\n&\7&\u0298\n&\f&\16&\u029b\13&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\7&\u02a6\n&\f&\16&\u02a9\13&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02be\n"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u02cc\n(\f(\16(\u02cf\13(\3"+
		"(\3(\5(\u02d3\n(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u02dd\n)\3*\3*\3*\3*\5*\u02e3"+
		"\n*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u02fb\n-\3.\3.\3.\3.\3.\3.\3.\5.\u0304\n.\3.\3.\3.\3.\3.\3.\6.\u030c"+
		"\n.\r.\16.\u030d\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u0319\n/\3/\3/\3/\3/\3"+
		"/\3/\5/\u0321\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u032d"+
		"\n\60\f\60\16\60\u0330\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\2\2\62"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`\2\3\3\2\5\6\2\u0365\2e\3\2\2\2\4r\3\2\2\2\6\u008d\3\2\2"+
		"\2\b\u0099\3\2\2\2\n\u00c7\3\2\2\2\f\u00e1\3\2\2\2\16\u010b\3\2\2\2\20"+
		"\u010d\3\2\2\2\22\u012d\3\2\2\2\24\u0131\3\2\2\2\26\u014a\3\2\2\2\30\u014c"+
		"\3\2\2\2\32\u017d\3\2\2\2\34\u017f\3\2\2\2\36\u0187\3\2\2\2 \u0195\3\2"+
		"\2\2\"\u019d\3\2\2\2$\u01aa\3\2\2\2&\u01bf\3\2\2\2(\u01cf\3\2\2\2*\u01d4"+
		"\3\2\2\2,\u01db\3\2\2\2.\u01e1\3\2\2\2\60\u01e8\3\2\2\2\62\u01f0\3\2\2"+
		"\2\64\u01f5\3\2\2\2\66\u01ff\3\2\2\28\u0210\3\2\2\2:\u021a\3\2\2\2<\u0225"+
		"\3\2\2\2>\u0230\3\2\2\2@\u023c\3\2\2\2B\u024c\3\2\2\2D\u025c\3\2\2\2F"+
		"\u0278\3\2\2\2H\u027a\3\2\2\2J\u0285\3\2\2\2L\u02bd\3\2\2\2N\u02bf\3\2"+
		"\2\2P\u02dc\3\2\2\2R\u02e2\3\2\2\2T\u02e4\3\2\2\2V\u02e7\3\2\2\2X\u02fa"+
		"\3\2\2\2Z\u0303\3\2\2\2\\\u0311\3\2\2\2^\u0325\3\2\2\2`\u0331\3\2\2\2"+
		"bd\7:\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2"+
		"hi\5\4\3\2im\b\2\1\2jl\7:\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2r}\b\3\1\2su\5\"\22\2tv\7:\2"+
		"\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\3\1\2z|\3\2\2"+
		"\2{s\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008a\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0082\5\b\5\2\u0081\u0083\7:\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\b\3\1\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\5\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u008f\7\7\2\2\u008f\u0093"+
		"\5\20\t\2\u0090\u0092\7:\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\5\16\b\2\u0097\u0098\b\4\1\2\u0098\7\3\2\2\2\u0099\u009a"+
		"\7\4\2\2\u009a\u009b\5T+\2\u009b\u009e\b\5\1\2\u009c\u009d\7\34\2\2\u009d"+
		"\u009f\5T+\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2"+
		"\2\u00a0\u00a2\7:\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b9\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\7\65\2\2\u00a7\u00a9\7:\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac"+
		"\u00ae\5\n\6\2\u00ad\u00af\7:\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\66\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00ba\5\n\6\2\u00b9\u00a6\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\t\3\2\2\2"+
		"\u00bb\u00c2\t\2\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\b\6\1\2\u00be\u00c3"+
		"\3\2\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\b\6\1\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5\5\6"+
		"\4\2\u00c5\u00c6\b\6\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\13\3\2\2\2\u00c9\u00ca\5X-\2\u00ca\u00cb\5V,\2\u00cb"+
		"\u00cf\5\20\t\2\u00cc\u00ce\7:\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\b\7\1\2\u00d4\u00e2\3"+
		"\2\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5V,\2\u00d7\u00db\5\20\t\2\u00d8"+
		"\u00da\7:\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\5\16\b\2\u00df\u00e0\b\7\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00c9\3"+
		"\2\2\2\u00e1\u00d5\3\2\2\2\u00e2\r\3\2\2\2\u00e3\u00e4\b\b\1\2\u00e4\u00e6"+
		"\7\65\2\2\u00e5\u00e7\7:\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f3\3\2\2\2\u00ea\u00eb\5\""+
		"\22\2\u00eb\u00ed\b\b\1\2\u00ec\u00ee\7:\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ea\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00ff\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\32"+
		"\16\2\u00f7\u00f9\b\b\1\2\u00f8\u00fa\7:\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f6\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u010c\7\66"+
		"\2\2\u0103\u0104\5\"\22\2\u0104\u0105\b\b\1\2\u0105\u010a\3\2\2\2\u0106"+
		"\u0107\5\32\16\2\u0107\u0108\b\b\1\2\u0108\u010a\3\2\2\2\u0109\u0103\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00e3\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\17\3\2\2\2\u010d\u010e\b\t\1\2\u010e\u0129\7\61\2"+
		"\2\u010f\u0110\5\22\n\2\u0110\u011c\b\t\1\2\u0111\u0112\7/\2\2\u0112\u011d"+
		"\5:\36\2\u0113\u0114\7\67\2\2\u0114\u0115\5\22\n\2\u0115\u0116\b\t\1\2"+
		"\u0116\u0118\3\2\2\2\u0117\u0113\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0111\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u011f\7\67"+
		"\2\2\u011f\u0120\5\22\n\2\u0120\u0121\b\t\1\2\u0121\u0122\7/\2\2\u0122"+
		"\u0123\5:\36\2\u0123\u0125\3\2\2\2\u0124\u011e\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u010f\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\7\62\2\2\u012c\21\3\2\2\2\u012d\u012e\5X-\2\u012e\u012f"+
		"\5V,\2\u012f\u0130\b\n\1\2\u0130\23\3\2\2\2\u0131\u013d\b\13\1\2\u0132"+
		"\u0133\5\66\34\2\u0133\u013a\b\13\1\2\u0134\u0135\7\67\2\2\u0135\u0136"+
		"\5\66\34\2\u0136\u0137\b\13\1\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2"+
		"\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\25\3\2\2\2\u013f\u0140\5\30\r\2\u0140\u0141\b\f\1\2\u0141\u014b\3\2\2"+
		"\2\u0142\u0144\7:\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\32\16\2"+
		"\u0148\u0149\b\f\1\2\u0149\u014b\3\2\2\2\u014a\u013f\3\2\2\2\u014a\u0143"+
		"\3\2\2\2\u014b\27\3\2\2\2\u014c\u014d\b\r\1\2\u014d\u014f\7\65\2\2\u014e"+
		"\u0150\7:\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u015c\3\2\2\2\u0153\u0154\5\32\16\2\u0154"+
		"\u0156\b\r\1\2\u0155\u0157\7:\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0153\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\66\2\2\u0160"+
		"\u0161\b\r\1\2\u0161\31\3\2\2\2\u0162\u0163\5$\23\2\u0163\u0164\b\16\1"+
		"\2\u0164\u017e\3\2\2\2\u0165\u0166\5,\27\2\u0166\u0167\b\16\1\2\u0167"+
		"\u017e\3\2\2\2\u0168\u0169\5.\30\2\u0169\u016a\b\16\1\2\u016a\u017e\3"+
		"\2\2\2\u016b\u016c\5\60\31\2\u016c\u016d\b\16\1\2\u016d\u017e\3\2\2\2"+
		"\u016e\u016f\5\62\32\2\u016f\u0170\b\16\1\2\u0170\u017e\3\2\2\2\u0171"+
		"\u0172\5\64\33\2\u0172\u0173\b\16\1\2\u0173\u017e\3\2\2\2\u0174\u0175"+
		"\5\34\17\2\u0175\u0176\b\16\1\2\u0176\u017e\3\2\2\2\u0177\u0178\5\36\20"+
		"\2\u0178\u0179\b\16\1\2\u0179\u017e\3\2\2\2\u017a\u017b\5 \21\2\u017b"+
		"\u017c\b\16\1\2\u017c\u017e\3\2\2\2\u017d\u0162\3\2\2\2\u017d\u0165\3"+
		"\2\2\2\u017d\u0168\3\2\2\2\u017d\u016b\3\2\2\2\u017d\u016e\3\2\2\2\u017d"+
		"\u0171\3\2\2\2\u017d\u0174\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u017a\3\2"+
		"\2\2\u017e\33\3\2\2\2\u017f\u0180\5\66\34\2\u0180\u0181\78\2\2\u0181\u0182"+
		"\7\16\2\2\u0182\u0183\7\61\2\2\u0183\u0184\5:\36\2\u0184\u0185\7\62\2"+
		"\2\u0185\u0186\b\17\1\2\u0186\35\3\2\2\2\u0187\u0188\5\66\34\2\u0188\u0189"+
		"\78\2\2\u0189\u018a\7\17\2\2\u018a\u018b\7\61\2\2\u018b\u0190\5:\36\2"+
		"\u018c\u018d\7\67\2\2\u018d\u018f\5:\36\2\u018e\u018c\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7\62\2\2\u0194\37\3\2\2\2\u0195\u0196\5\66"+
		"\34\2\u0196\u0197\78\2\2\u0197\u0198\7\f\2\2\u0198\u0199\7\61\2\2\u0199"+
		"\u019a\5:\36\2\u019a\u019b\7\62\2\2\u019b\u019c\b\21\1\2\u019c!\3\2\2"+
		"\2\u019d\u019e\b\22\1\2\u019e\u019f\5X-\2\u019f\u01a0\5V,\2\u01a0\u01a7"+
		"\b\22\1\2\u01a1\u01a2\7\67\2\2\u01a2\u01a3\5V,\2\u01a3\u01a4\b\22\1\2"+
		"\u01a4\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8#\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ab\7\21\2\2\u01ab\u01ac\5(\25\2\u01ac\u01ad\5\26\f\2\u01ad\u01ae\b"+
		"\23\1\2\u01ae\u01b4\b\23\1\2\u01af\u01b0\5&\24\2\u01b0\u01b1\b\23\1\2"+
		"\u01b1\u01b3\3\2\2\2\u01b2\u01af\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ba\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\5*\26\2\u01b8\u01b9\b\23\1\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bb%\3\2\2\2\u01bc\u01be\7:\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\23\2\2\u01c3\u01c4\5"+
		"(\25\2\u01c4\u01c5\5\26\f\2\u01c5\u01c6\b\24\1\2\u01c6\'\3\2\2\2\u01c7"+
		"\u01c8\7\61\2\2\u01c8\u01c9\5\66\34\2\u01c9\u01ca\b\25\1\2\u01ca\u01cb"+
		"\7\62\2\2\u01cb\u01d0\3\2\2\2\u01cc\u01cd\5\66\34\2\u01cd\u01ce\b\25\1"+
		"\2\u01ce\u01d0\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0)"+
		"\3\2\2\2\u01d1\u01d3\7:\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d8\7\22\2\2\u01d8\u01d9\5\26\f\2\u01d9\u01da\b\26\1\2\u01da"+
		"+\3\2\2\2\u01db\u01dc\7\20\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01de\5\66\34"+
		"\2\u01de\u01df\7\62\2\2\u01df\u01e0\b\27\1\2\u01e0-\3\2\2\2\u01e1\u01e2"+
		"\5J&\2\u01e2\u01e3\7\61\2\2\u01e3\u01e4\5\24\13\2\u01e4\u01e5\7\62\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b\30\1\2\u01e7/\3\2\2\2\u01e8\u01e9\b"+
		"\31\1\2\u01e9\u01ea\7\n\2\2\u01ea\u01ee\b\31\1\2\u01eb\u01ec\5\66\34\2"+
		"\u01ec\u01ed\b\31\1\2\u01ed\u01ef\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\61\3\2\2\2\u01f0\u01f1\5:\36\2\u01f1\u01f2\7/\2\2\u01f2"+
		"\u01f3\5\66\34\2\u01f3\u01f4\b\32\1\2\u01f4\63\3\2\2\2\u01f5\u01f6\5J"+
		"&\2\u01f6\u01f7\78\2\2\u01f7\u01f8\7-\2\2\u01f8\u01f9\7.\2\2\u01f9\u01fa"+
		"\7\36\2\2\u01fa\u01fb\5V,\2\u01fb\u01fc\7\36\2\2\u01fc\u01fd\5\26\f\2"+
		"\u01fd\u01fe\b\33\1\2\u01fe\65\3\2\2\2\u01ff\u0200\58\35\2\u0200\u0205"+
		"\b\34\1\2\u0201\u0202\7/\2\2\u0202\u0203\5\66\34\2\u0203\u0204\b\34\1"+
		"\2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u020e"+
		"\3\2\2\2\u0207\u0208\78\2\2\u0208\u0209\7\r\2\2\u0209\u020a\7\61\2\2\u020a"+
		"\u020b\5:\36\2\u020b\u020c\7\62\2\2\u020c\u020d\b\34\1\2\u020d\u020f\3"+
		"\2\2\2\u020e\u0207\3\2\2\2\u020e\u020f\3\2\2\2\u020f\67\3\2\2\2\u0210"+
		"\u0211\5:\36\2\u0211\u0218\b\35\1\2\u0212\u0213\7\"\2\2\u0213\u0214\5"+
		"8\35\2\u0214\u0215\7#\2\2\u0215\u0216\58\35\2\u0216\u0217\b\35\1\2\u0217"+
		"\u0219\3\2\2\2\u0218\u0212\3\2\2\2\u0218\u0219\3\2\2\2\u02199\3\2\2\2"+
		"\u021a\u021b\5<\37\2\u021b\u0222\b\36\1\2\u021c\u021d\7 \2\2\u021d\u021e"+
		"\5<\37\2\u021e\u021f\b\36\1\2\u021f\u0221\3\2\2\2\u0220\u021c\3\2\2\2"+
		"\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223;\3"+
		"\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\5> \2\u0226\u022d\b\37\1\2\u0227"+
		"\u0228\7\37\2\2\u0228\u0229\5> \2\u0229\u022a\b\37\1\2\u022a\u022c\3\2"+
		"\2\2\u022b\u0227\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e=\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5@!\2\u0231"+
		"\u0239\b \1\2\u0232\u0233\7\32\2\2\u0233\u0234\b \1\2\u0234\u0235\5@!"+
		"\2\u0235\u0236\b \1\2\u0236\u0238\3\2\2\2\u0237\u0232\3\2\2\2\u0238\u023b"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a?\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023d\5B\"\2\u023d\u0249\b!\1\2\u023e\u023f\7\33"+
		"\2\2\u023f\u0243\b!\1\2\u0240\u0241\7\34\2\2\u0241\u0243\b!\1\2\u0242"+
		"\u023e\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\5B"+
		"\"\2\u0245\u0246\b!\1\2\u0246\u0248\3\2\2\2\u0247\u0242\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aA\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u024d\5D#\2\u024d\u0259\b\"\1\2\u024e\u024f"+
		"\7\24\2\2\u024f\u0253\b\"\1\2\u0250\u0251\7\25\2\2\u0251\u0253\b\"\1\2"+
		"\u0252\u024e\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255"+
		"\5D#\2\u0255\u0256\b\"\1\2\u0256\u0258\3\2\2\2\u0257\u0252\3\2\2\2\u0258"+
		"\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025aC\3\2\2\2"+
		"\u025b\u0259\3\2\2\2\u025c\u025d\5F$\2\u025d\u0269\b#\1\2\u025e\u025f"+
		"\7\26\2\2\u025f\u0263\b#\1\2\u0260\u0261\7\27\2\2\u0261\u0263\b#\1\2\u0262"+
		"\u025e\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5F"+
		"$\2\u0265\u0266\b#\1\2\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0268\u026b"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026aE\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026d\7!\2\2\u026d\u0271\b$\1\2\u026e\u026f\7\25"+
		"\2\2\u026f\u0271\b$\1\2\u0270\u026c\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\5F$\2\u0273\u0274\b$\1\2\u0274\u0279\3\2\2"+
		"\2\u0275\u0276\5H%\2\u0276\u0277\b$\1\2\u0277\u0279\3\2\2\2\u0278\u0270"+
		"\3\2\2\2\u0278\u0275\3\2\2\2\u0279G\3\2\2\2\u027a\u027b\5J&\2\u027b\u0283"+
		"\b%\1\2\u027c\u027d\7\30\2\2\u027d\u0281\b%\1\2\u027e\u027f\7\31\2\2\u027f"+
		"\u0281\b%\1\2\u0280\u027c\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0284\b%\1\2\u0283\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"I\3\2\2\2\u0285\u0286\5L\'\2\u0286\u0299\b&\1\2\u0287\u0288\7\61\2\2\u0288"+
		"\u0289\5\24\13\2\u0289\u028a\7\62\2\2\u028a\u028b\3\2\2\2\u028b\u028c"+
		"\b&\1\2\u028c\u0298\3\2\2\2\u028d\u0295\78\2\2\u028e\u028f\5V,\2\u028f"+
		"\u0290\b&\1\2\u0290\u0296\3\2\2\2\u0291\u0292\7\b\2\2\u0292\u0296\b&\1"+
		"\2\u0293\u0294\7\7\2\2\u0294\u0296\b&\1\2\u0295\u028e\3\2\2\2\u0295\u0291"+
		"\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0287\3\2\2\2\u0297"+
		"\u028d\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u02a7\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\78\2\2\u029d"+
		"\u029e\5V,\2\u029e\u029f\b&\1\2\u029f\u02a6\3\2\2\2\u02a0\u02a1\7\63\2"+
		"\2\u02a1\u02a2\5\66\34\2\u02a2\u02a3\b&\1\2\u02a3\u02a4\7\64\2\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u029c\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a6\u02a9\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8K\3\2\2\2\u02a9\u02a7"+
		"\3\2\2\2\u02aa\u02ab\5T+\2\u02ab\u02ac\b\'\1\2\u02ac\u02be\3\2\2\2\u02ad"+
		"\u02ae\5P)\2\u02ae\u02af\b\'\1\2\u02af\u02be\3\2\2\2\u02b0\u02b1\5V,\2"+
		"\u02b1\u02b2\b\'\1\2\u02b2\u02be\3\2\2\2\u02b3\u02b4\5N(\2\u02b4\u02b5"+
		"\b\'\1\2\u02b5\u02be\3\2\2\2\u02b6\u02b7\7\61\2\2\u02b7\u02b8\5\66\34"+
		"\2\u02b8\u02b9\7\62\2\2\u02b9\u02ba\b\'\1\2\u02ba\u02be\3\2\2\2\u02bb"+
		"\u02bc\7\t\2\2\u02bc\u02be\b\'\1\2\u02bd\u02aa\3\2\2\2\u02bd\u02ad\3\2"+
		"\2\2\u02bd\u02b0\3\2\2\2\u02bd\u02b3\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02beM\3\2\2\2\u02bf\u02c0\7,\2\2\u02c0\u02c1\78\2\2\u02c1"+
		"\u02c2\7\b\2\2\u02c2\u02c3\7\61\2\2\u02c3\u02d2\b(\1\2\u02c4\u02c5\7\61"+
		"\2\2\u02c5\u02c6\5:\36\2\u02c6\u02cd\b(\1\2\u02c7\u02c8\7\67\2\2\u02c8"+
		"\u02c9\5:\36\2\u02c9\u02ca\b(\1\2\u02ca\u02cc\3\2\2\2\u02cb\u02c7\3\2"+
		"\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7\62\2\2\u02d1\u02d3\3"+
		"\2\2\2\u02d2\u02c4\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\7\62\2\2\u02d5\u02d6\b(\1\2\u02d6O\3\2\2\2\u02d7\u02d8\5R*\2\u02d8"+
		"\u02d9\b)\1\2\u02d9\u02dd\3\2\2\2\u02da\u02db\7;\2\2\u02db\u02dd\b)\1"+
		"\2\u02dc\u02d7\3\2\2\2\u02dc\u02da\3\2\2\2\u02ddQ\3\2\2\2\u02de\u02df"+
		"\7$\2\2\u02df\u02e3\b*\1\2\u02e0\u02e1\7%\2\2\u02e1\u02e3\b*\1\2\u02e2"+
		"\u02de\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3S\3\2\2\2\u02e4\u02e5\7=\2\2\u02e5"+
		"\u02e6\b+\1\2\u02e6U\3\2\2\2\u02e7\u02e8\7<\2\2\u02e8\u02e9\b,\1\2\u02e9"+
		"W\3\2\2\2\u02ea\u02eb\7)\2\2\u02eb\u02fb\b-\1\2\u02ec\u02ed\7*\2\2\u02ed"+
		"\u02fb\b-\1\2\u02ee\u02ef\5Z.\2\u02ef\u02f0\b-\1\2\u02f0\u02fb\3\2\2\2"+
		"\u02f1\u02f2\5\\/\2\u02f2\u02f3\b-\1\2\u02f3\u02fb\3\2\2\2\u02f4\u02f5"+
		"\5`\61\2\u02f5\u02f6\b-\1\2\u02f6\u02fb\3\2\2\2\u02f7\u02f8\5T+\2\u02f8"+
		"\u02f9\b-\1\2\u02f9\u02fb\3\2\2\2\u02fa\u02ea\3\2\2\2\u02fa\u02ec\3\2"+
		"\2\2\u02fa\u02ee\3\2\2\2\u02fa\u02f1\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fa"+
		"\u02f7\3\2\2\2\u02fbY\3\2\2\2\u02fc\u02fd\7)\2\2\u02fd\u0304\b.\1\2\u02fe"+
		"\u02ff\7*\2\2\u02ff\u0304\b.\1\2\u0300\u0301\5T+\2\u0301\u0302\b.\1\2"+
		"\u0302\u0304\3\2\2\2\u0303\u02fc\3\2\2\2\u0303\u02fe\3\2\2\2\u0303\u0300"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030b\b.\1\2\u0306\u0307\7\63\2\2\u0307"+
		"\u0308\5\66\34\2\u0308\u0309\b.\1\2\u0309\u030a\7\64\2\2\u030a\u030c\3"+
		"\2\2\2\u030b\u0306\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\b.\1\2\u0310[\3\2\2\2\u0311"+
		"\u0312\7+\2\2\u0312\u0318\7\34\2\2\u0313\u0314\7\13\2\2\u0314\u0319\b"+
		"/\1\2\u0315\u0316\5^\60\2\u0316\u0317\b/\1\2\u0317\u0319\3\2\2\2\u0318"+
		"\u0313\3\2\2\2\u0318\u0315\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0320\7\35"+
		"\2\2\u031b\u031c\7\13\2\2\u031c\u0321\b/\1\2\u031d\u031e\5X-\2\u031e\u031f"+
		"\b/\1\2\u031f\u0321\3\2\2\2\u0320\u031b\3\2\2\2\u0320\u031d\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\7\33\2\2\u0323\u0324\b/\1\2\u0324]\3\2\2\2"+
		"\u0325\u0326\b\60\1\2\u0326\u0327\5X-\2\u0327\u032e\b\60\1\2\u0328\u0329"+
		"\7\67\2\2\u0329\u032a\5X-\2\u032a\u032b\b\60\1\2\u032b\u032d\3\2\2\2\u032c"+
		"\u0328\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f_\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7,\2\2\u0332\u0333"+
		"\7\34\2\2\u0333\u0334\7)\2\2\u0334\u0335\7\33\2\2\u0335\u0336\b\61\1\2"+
		"\u0336a\3\2\2\2Oemw}\u0084\u008a\u0093\u009e\u00a3\u00aa\u00b0\u00b4\u00b9"+
		"\u00c2\u00c7\u00cf\u00db\u00e1\u00e8\u00ef\u00f3\u00fb\u00ff\u0109\u010b"+
		"\u0119\u011c\u0126\u0129\u013a\u013d\u0145\u014a\u0151\u0158\u015c\u017d"+
		"\u0190\u01a7\u01b4\u01ba\u01bf\u01cf\u01d4\u01ee\u0205\u020e\u0218\u0222"+
		"\u022d\u0239\u0242\u0249\u0252\u0259\u0262\u0269\u0270\u0278\u0280\u0283"+
		"\u0295\u0297\u0299\u02a5\u02a7\u02bd\u02cd\u02d2\u02dc\u02e2\u02fa\u0303"+
		"\u030d\u0318\u0320\u032e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}