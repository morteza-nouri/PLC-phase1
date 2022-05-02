// Generated from C:/Users/Morteza Nouri/IdeaProjects/Compiler/phase2/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
		RULE_decleration = 4, RULE_method = 5, RULE_methodBody = 6, RULE_methodArgsDec = 7, 
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
		RULE_type = 43, RULE_array_type = 44, RULE_fptr_type = 45, RULE_set_type = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "constructor", "classDeclaration", "decleration", 
			"method", "methodBody", "methodArgsDec", "argDec", "methodArgs", "body", 
			"blockStatement", "singleStatement", "addStatement", "mergeStatement", 
			"deleteStatement", "varDecStatement", "ifStatement", "elsifStatement", 
			"condition", "elseStatement", "printStatement", "methodCallStmt", "returnStatement", 
			"assignmentStatement", "loopStatement", "expression", "ternaryExpression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"postUnaryExpression", "accessExpression", "otherExpression", "setNew", 
			"value", "boolValue", "class_identifier", "identifier", "type", "array_type", 
			"fptr_type", "set_type"
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
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(NEWLINE);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(100);
			((SimpleLOOPContext)_localctx).p = program();
			((SimpleLOOPContext)_localctx).simpleLOOPProgram =  ((SimpleLOOPContext)_localctx).p.programRet;
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			    
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).v = varDecStatement();
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				            for (VariableDeclaration varDec: ((ProgramContext)_localctx).v.varDecStmtRet)
				                _localctx.programRet.addGlobalVariable(varDec);
				        
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(124);
				((ProgramContext)_localctx).c = classDeclaration();
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classDeclarationRet);
				}
				}
				setState(136);
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
		public ConstructorDeclaration constructorDecRet;
		public Token init;
		public MethodArgsDecContext args;
		public MethodBodyContext b;
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
			setState(137);
			match(PUBLIC);
			setState(138);
			((ConstructorContext)_localctx).init = match(INITIALIZE);

			        ((ConstructorContext)_localctx).constructorDecRet =  new ConstructorDeclaration();
			        _localctx.constructorDecRet.setMethodName(new Identifier((((ConstructorContext)_localctx).init!=null?((ConstructorContext)_localctx).init.getText():null)));
			        _localctx.constructorDecRet.setPrivate(false);
			        _localctx.constructorDecRet.setLine(((ConstructorContext)_localctx).init.getLine());
			    
			setState(140);
			((ConstructorContext)_localctx).args = methodArgsDec();
			 _localctx.constructorDecRet.setArgs(((ConstructorContext)_localctx).args.methodArgsDecRet); 
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
			((ConstructorContext)_localctx).b = methodBody();

			        _localctx.constructorDecRet.setLocalVars(((ConstructorContext)_localctx).b.localVars);
			        _localctx.constructorDecRet.setBody(((ConstructorContext)_localctx).b.statements);
			    
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
		public Token c;
		public Class_identifierContext cid1;
		public Class_identifierContext cid2;
		public DeclerationContext d1;
		public DeclerationContext d2;
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
		public List<DeclerationContext> decleration() {
			return getRuleContexts(DeclerationContext.class);
		}
		public DeclerationContext decleration(int i) {
			return getRuleContext(DeclerationContext.class,i);
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
			((ClassDeclarationContext)_localctx).c = match(CLASS);
			setState(152);
			((ClassDeclarationContext)_localctx).cid1 = class_identifier();

			        ((ClassDeclarationContext)_localctx).classDeclarationRet =  new ClassDeclaration(((ClassDeclarationContext)_localctx).cid1.classIdentifierRet.getClassName());
			        _localctx.classDeclarationRet.setLine(((ClassDeclarationContext)_localctx).c.getLine());
			    
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(154);
				match(LESS_THAN);
				setState(155);
				((ClassDeclarationContext)_localctx).cid2 = class_identifier();
				 _localctx.classDeclarationRet.setParentClassName(((ClassDeclarationContext)_localctx).cid2.classIdentifierRet.getClassName()); 
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(160);
				match(NEWLINE);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(166);
				match(LBRACE);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(NEWLINE);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					((ClassDeclarationContext)_localctx).d1 = decleration();

					        for (Declaration dec : ((ClassDeclarationContext)_localctx).d1.declarationRet) {
					            if (dec instanceof ConstructorDeclaration)
					                _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
					            if (dec instanceof  FieldDeclaration)
					                _localctx.classDeclarationRet.addField((FieldDeclaration)dec);
					            if (dec instanceof MethodDeclaration)
					                _localctx.classDeclarationRet.addMethod((MethodDeclaration)dec);
					        }
					    
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(174);
						match(NEWLINE);
						}
						}
						setState(177); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUBLIC || _la==PRIVATE );
				setState(183);
				match(RBRACE);
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				{
				setState(185);
				((ClassDeclarationContext)_localctx).d2 = decleration();
				}

				        for (Declaration dec : ((ClassDeclarationContext)_localctx).d2.declarationRet) {
				            if (dec instanceof ConstructorDeclaration)
				                _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
				            if (dec instanceof  FieldDeclaration)
				                _localctx.classDeclarationRet.addField((FieldDeclaration)dec);
				            if (dec instanceof MethodDeclaration)
				                _localctx.classDeclarationRet.addMethod((MethodDeclaration)dec);
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

	public static class DeclerationContext extends ParserRuleContext {
		public ArrayList<Declaration> declarationRet;
		public boolean isPrivate;
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
		public DeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclerationContext decleration() throws RecognitionException {
		DeclerationContext _localctx = new DeclerationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclerationContext)_localctx).declarationRet =  new ArrayList<>();
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(191);
					match(PUBLIC);
					((DeclerationContext)_localctx).isPrivate =  false;
					}
					break;
				case PRIVATE:
					{
					setState(193);
					match(PRIVATE);
					((DeclerationContext)_localctx).isPrivate =  true;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(197);
					((DeclerationContext)_localctx).v = varDecStatement();

					        for (VariableDeclaration varDec: ((DeclerationContext)_localctx).v.varDecStmtRet)
					            _localctx.declarationRet.add( new FieldDeclaration(varDec, _localctx.isPrivate) );
					    
					}
					break;
				case 2:
					{
					setState(200);
					((DeclerationContext)_localctx).m = method();

					        ((DeclerationContext)_localctx).m.methodRet.setPrivate(_localctx.isPrivate);
					        _localctx.declarationRet.add(((DeclerationContext)_localctx).m.methodRet);
					    
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(205);
				((DeclerationContext)_localctx).c = constructor();
				 _localctx.declarationRet.add(((DeclerationContext)_localctx).c.constructorDecRet); 
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
		public Type returnType;
		public TypeContext t;
		public IdentifierContext id;
		public MethodArgsDecContext args;
		public MethodBodyContext b;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(210);
				((MethodContext)_localctx).t = type();
				((MethodContext)_localctx).returnType =  ((MethodContext)_localctx).t.typeRet;
				}
				break;
			case VOID:
				{
				setState(213);
				match(VOID);
				((MethodContext)_localctx).returnType =  new NullType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
			((MethodContext)_localctx).id = identifier();

			        ((MethodContext)_localctx).methodRet =  new MethodDeclaration();
			        _localctx.methodRet.setMethodName(((MethodContext)_localctx).id.identifierRet);
			        _localctx.methodRet.setReturnType(_localctx.returnType);
			        _localctx.methodRet.setLine(((MethodContext)_localctx).id.identifierRet.getLine());
			    
			setState(219);
			((MethodContext)_localctx).args = methodArgsDec();
			_localctx.methodRet.setArgs(((MethodContext)_localctx).args.methodArgsDecRet);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(221);
				match(NEWLINE);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			((MethodContext)_localctx).b = methodBody();

			        _localctx.methodRet.setLocalVars(((MethodContext)_localctx).b.localVars);
			        _localctx.methodRet.setBody(((MethodContext)_localctx).b.statements);
			     
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
		public ArrayList<VariableDeclaration> localVars;
		public ArrayList<Statement> statements;
		public VarDecStatementContext v1;
		public SingleStatementContext s1;
		public VarDecStatementContext v2;
		public SingleStatementContext s2;
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{

				        ((MethodBodyContext)_localctx).localVars =  new ArrayList<>();
				        ((MethodBodyContext)_localctx).statements =  new ArrayList<>();
				    
				{
				setState(231);
				match(LBRACE);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						((MethodBodyContext)_localctx).v1 = varDecStatement();

						        for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).v1.varDecStmtRet)
						            _localctx.localVars.add(varDec);
						    
						setState(240); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(239);
							match(NEWLINE);
							}
							}
							setState(242); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(249);
					((MethodBodyContext)_localctx).s1 = singleStatement();
					 _localctx.statements.add(((MethodBodyContext)_localctx).s1.singleStmtRet); 
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(251);
						match(NEWLINE);
						}
						}
						setState(254); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
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
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					{
					setState(262);
					((MethodBodyContext)_localctx).v2 = varDecStatement();
					}

					        for (VariableDeclaration varDec: ((MethodBodyContext)_localctx).v2.varDecStmtRet)
					            _localctx.localVars.add(varDec);
					    
					}
					break;
				case 2:
					{
					{
					setState(265);
					((MethodBodyContext)_localctx).s2 = singleStatement();
					}
					 _localctx.statements.add(((MethodBodyContext)_localctx).s2.singleStmtRet); 
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
		public ArrayList<VariableDeclaration> methodArgsDecRet;
		public ArgDecContext arg1;
		public ArgDecContext arg2;
		public ArgDecContext arg3;
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
			 ((MethodArgsDecContext)_localctx).methodArgsDecRet =  new ArrayList<>(); 
			setState(273);
			match(LPAR);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(274);
				((MethodArgsDecContext)_localctx).arg1 = argDec();
				 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg1.argDecRet); 
				setState(287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(276);
					match(ASSIGN);
					setState(277);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(278);
							match(COMMA);
							setState(279);
							((MethodArgsDecContext)_localctx).arg2 = argDec();
							 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg2.argDecRet); 
							}
							} 
						}
						setState(286);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(289);
					match(COMMA);
					setState(290);
					((MethodArgsDecContext)_localctx).arg3 = argDec();
					 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg3.argDecRet); 
					setState(292);
					match(ASSIGN);
					setState(293);
					orExpression();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(302);
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
		public VariableDeclaration argDecRet;
		public TypeContext t;
		public IdentifierContext i;
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
			setState(304);
			((ArgDecContext)_localctx).t = type();
			setState(305);
			((ArgDecContext)_localctx).i = identifier();

			        ((ArgDecContext)_localctx).argDecRet =  new VariableDeclaration(((ArgDecContext)_localctx).i.identifierRet, ((ArgDecContext)_localctx).t.typeRet);
			        _localctx.argDecRet.setLine(((ArgDecContext)_localctx).i.identifierRet.getLine());
			    
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
			 ((MethodArgsContext)_localctx).methodArgsRet =  new ArrayList<>(); 
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(309);
				((MethodArgsContext)_localctx).e1 = expression();
				 _localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e1.expressionRet); 
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					((MethodArgsContext)_localctx).e2 = expression();
					 _localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e2.expressionRet); 
					}
					}
					setState(319);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(322);
				((BodyContext)_localctx).b = blockStatement();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockStmtRet; 
				}
				break;
			case NEWLINE:
				{
				{
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(325);
					match(NEWLINE);
					}
					}
					setState(328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(330);
				((BodyContext)_localctx).s = singleStatement();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).s.singleStmtRet; 
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
		public BlockStmt blockStmtRet;
		public Token lb;
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
			 ((BlockStatementContext)_localctx).blockStmtRet =  new BlockStmt(); 
			setState(336);
			((BlockStatementContext)_localctx).lb = match(LBRACE);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(337);
				match(NEWLINE);
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(342);
				((BlockStatementContext)_localctx).s = singleStatement();

				        _localctx.blockStmtRet.setLine(((BlockStatementContext)_localctx).lb.getLine());
				        _localctx.blockStmtRet.addStatement(((BlockStatementContext)_localctx).s.singleStmtRet);
				    
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(NEWLINE);
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(RBRACE);
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
		public Statement singleStmtRet;
		public IfStatementContext if_;
		public PrintStatementContext print;
		public MethodCallStmtContext mcs;
		public ReturnStatementContext ret;
		public AssignmentStatementContext assign;
		public LoopStatementContext loop;
		public AddStatementContext add;
		public MergeStatementContext merge;
		public DeleteStatementContext delete;
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((SingleStatementContext)_localctx).if_ = ifStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).if_.ifStmtRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((SingleStatementContext)_localctx).print = printStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).print.printStmtRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				((SingleStatementContext)_localctx).mcs = methodCallStmt();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).mcs.methodCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				((SingleStatementContext)_localctx).ret = returnStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).ret.returnStmtRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				((SingleStatementContext)_localctx).assign = assignmentStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).assign.assignmentStmtRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				((SingleStatementContext)_localctx).loop = loopStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).loop.loopStmtRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(374);
				((SingleStatementContext)_localctx).add = addStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).add.addStmtRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				((SingleStatementContext)_localctx).merge = mergeStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).merge.mergeStmtRet;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				((SingleStatementContext)_localctx).delete = deleteStatement();
				((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).delete.deleteStmtRet;
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
		public SetAdd addStmtRet;
		public ExpressionContext setarg;
		public Token a;
		public OrExpressionContext elmarg;
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
			setState(385);
			((AddStatementContext)_localctx).setarg = expression();
			setState(386);
			match(DOT);
			setState(387);
			((AddStatementContext)_localctx).a = match(ADD);
			setState(388);
			match(LPAR);
			setState(389);
			((AddStatementContext)_localctx).elmarg = orExpression();
			setState(390);
			match(RPAR);

			        ((AddStatementContext)_localctx).addStmtRet =  new SetAdd(((AddStatementContext)_localctx).setarg.expressionRet, ((AddStatementContext)_localctx).elmarg.orExprRet);
			        _localctx.addStmtRet.setLine(((AddStatementContext)_localctx).a.getLine());
			    
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
		public SetMerge mergeStmtRet;
		public ExpressionContext setarg;
		public Token m;
		public OrExpressionContext e1;
		public OrExpressionContext e2;
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
			ArrayList<Expression> elemArgs = new ArrayList<>();
			setState(394);
			((MergeStatementContext)_localctx).setarg = expression();
			setState(395);
			match(DOT);
			setState(396);
			((MergeStatementContext)_localctx).m = match(MERGE);
			setState(397);
			match(LPAR);
			setState(398);
			((MergeStatementContext)_localctx).e1 = orExpression();
			elemArgs.add(((MergeStatementContext)_localctx).e1.orExprRet);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				((MergeStatementContext)_localctx).e2 = orExpression();
				elemArgs.add(((MergeStatementContext)_localctx).e2.orExprRet);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			match(RPAR);

			        ((MergeStatementContext)_localctx).mergeStmtRet =  new SetMerge(((MergeStatementContext)_localctx).setarg.expressionRet, elemArgs);
			        _localctx.mergeStmtRet.setLine(((MergeStatementContext)_localctx).m.getLine());
			    
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
		public SetDelete deleteStmtRet;
		public ExpressionContext setarg;
		public Token d;
		public OrExpressionContext elem;
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
			setState(412);
			((DeleteStatementContext)_localctx).setarg = expression();
			setState(413);
			match(DOT);
			setState(414);
			((DeleteStatementContext)_localctx).d = match(DELETE);
			setState(415);
			match(LPAR);
			setState(416);
			((DeleteStatementContext)_localctx).elem = orExpression();
			setState(417);
			match(RPAR);

			        ((DeleteStatementContext)_localctx).deleteStmtRet =  new SetDelete(((DeleteStatementContext)_localctx).setarg.expressionRet, ((DeleteStatementContext)_localctx).elem.orExprRet);
			        _localctx.deleteStmtRet.setLine(((DeleteStatementContext)_localctx).d.getLine());
			    
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
		public TypeContext t;
		public IdentifierContext id1;
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
			 ((VarDecStatementContext)_localctx).varDecStmtRet =  new ArrayList<>(); 
			setState(421);
			((VarDecStatementContext)_localctx).t = type();
			setState(422);
			((VarDecStatementContext)_localctx).id1 = identifier();

			        VariableDeclaration newVar1 = new VariableDeclaration(((VarDecStatementContext)_localctx).id1.identifierRet, ((VarDecStatementContext)_localctx).t.typeRet);
			        newVar1.setLine(((VarDecStatementContext)_localctx).id1.identifierRet.getLine());
			        _localctx.varDecStmtRet.add(newVar1);
			    
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        VariableDeclaration newVar2 = new VariableDeclaration(((VarDecStatementContext)_localctx).id2.identifierRet, ((VarDecStatementContext)_localctx).t.typeRet);
				        newVar2.setLine(((VarDecStatementContext)_localctx).id2.identifierRet.getLine());
				        _localctx.varDecStmtRet.add(newVar2);
				    
				}
				}
				setState(432);
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
		public ConditionalStmt ifStmtRet;
		public Token i;
		public ConditionContext c;
		public BodyContext b;
		public ElsifStatementContext elif;
		public ElseStatementContext else_;
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
			setState(433);
			((IfStatementContext)_localctx).i = match(IF);
			setState(434);
			((IfStatementContext)_localctx).c = condition();
			setState(435);
			((IfStatementContext)_localctx).b = body();

			        ((IfStatementContext)_localctx).ifStmtRet =  new ConditionalStmt(((IfStatementContext)_localctx).c.conditionRet, ((IfStatementContext)_localctx).b.bodyRet);
			        _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).i.getLine());
			    
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					((IfStatementContext)_localctx).elif = elsifStatement();
					 _localctx.ifStmtRet.addElsif(((IfStatementContext)_localctx).elif.elsifStmtRet); 
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(445);
				((IfStatementContext)_localctx).else_ = elseStatement();
				 _localctx.ifStmtRet.setElseBody(((IfStatementContext)_localctx).else_.elseStmtRet); 
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
		public ElsifStmt elsifStmtRet;
		public Token ei;
		public ConditionContext c;
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
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(450);
				match(NEWLINE);
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			((ElsifStatementContext)_localctx).ei = match(ELSIF);
			setState(457);
			((ElsifStatementContext)_localctx).c = condition();
			setState(458);
			((ElsifStatementContext)_localctx).b = body();

			        ((ElsifStatementContext)_localctx).elsifStmtRet =  new ElsifStmt(((ElsifStatementContext)_localctx).c.conditionRet, ((ElsifStatementContext)_localctx).b.bodyRet);
			        _localctx.elsifStmtRet.setLine(((ElsifStatementContext)_localctx).ei.getLine());
			     
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
		public ExpressionContext e1;
		public ExpressionContext e2;
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(461);
				match(LPAR);
				setState(462);
				((ConditionContext)_localctx).e1 = expression();
				 ((ConditionContext)_localctx).conditionRet =   ((ConditionContext)_localctx).e1.expressionRet; 
				setState(464);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(466);
				((ConditionContext)_localctx).e2 = expression();
				 ((ConditionContext)_localctx).conditionRet =  ((ConditionContext)_localctx).e2.expressionRet; 
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
		public Statement elseStmtRet;
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
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(471);
				match(NEWLINE);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(ELSE);
			setState(478);
			((ElseStatementContext)_localctx).b = body();
			 ((ElseStatementContext)_localctx).elseStmtRet =  ((ElseStatementContext)_localctx).b.bodyRet; 
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
		public PrintStmt printStmtRet;
		public Token p;
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
			setState(481);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(482);
			match(LPAR);
			setState(483);
			((PrintStatementContext)_localctx).e = expression();

			        ((PrintStatementContext)_localctx).printStmtRet =  new PrintStmt(((PrintStatementContext)_localctx).e.expressionRet);
			        _localctx.printStmtRet.setLine(((PrintStatementContext)_localctx).p.getLine());
			    
			setState(485);
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallStmt methodCallStmtRet;
		public Expression inst;
		public MethodCall mc;
		public AccessExpressionContext a;
		public Token init;
		public IdentifierContext i;
		public Token lp;
		public MethodArgsContext args;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			((MethodCallStmtContext)_localctx).a = accessExpression();
			((MethodCallStmtContext)_localctx).inst =  ((MethodCallStmtContext)_localctx).a.accessExprRet;
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(489);
				match(DOT);
				setState(495);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INITIALIZE:
					{
					setState(490);
					((MethodCallStmtContext)_localctx).init = match(INITIALIZE);
					((MethodCallStmtContext)_localctx).inst =  new Identifier((((MethodCallStmtContext)_localctx).init!=null?((MethodCallStmtContext)_localctx).init.getText():null));
					}
					break;
				case IDENTIFIER:
					{
					setState(492);
					((MethodCallStmtContext)_localctx).i = identifier();
					((MethodCallStmtContext)_localctx).inst =  ((MethodCallStmtContext)_localctx).i.identifierRet;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(502);
				((MethodCallStmtContext)_localctx).lp = match(LPAR);
				setState(503);
				((MethodCallStmtContext)_localctx).args = methodArgs();
				setState(504);
				match(RPAR);
				}

				        ((MethodCallStmtContext)_localctx).mc =  new MethodCall(_localctx.inst, ((MethodCallStmtContext)_localctx).args.methodArgsRet);
				        _localctx.mc.setLine(((MethodCallStmtContext)_localctx).lp.getLine());
				    
				}
				break;
			case INC:
			case DEC:
				{
				{
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        ((MethodCallStmtContext)_localctx).methodCallStmtRet =  new MethodCallStmt(_localctx.mc);
			        _localctx.methodCallStmtRet.setLine(_localctx.mc.getLine());
			    
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
		public ReturnStmt returnStmtRet;
		public Token r;
		public ExpressionContext e;
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
			 ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(); 
			setState(514);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			 _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).r.getLine()); 
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(516);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.expressionRet); 
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
		public AssignmentStmt assignmentStmtRet;
		public OrExpressionContext e1;
		public Token a;
		public ExpressionContext e2;
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
			setState(521);
			((AssignmentStatementContext)_localctx).e1 = orExpression();
			setState(522);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(523);
			((AssignmentStatementContext)_localctx).e2 = expression();

			        ((AssignmentStatementContext)_localctx).assignmentStmtRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).e1.orExprRet, ((AssignmentStatementContext)_localctx).e2.expressionRet);
			        _localctx.assignmentStmtRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
			    
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
		public EachStmt loopStmtRet;
		public Expression list;
		public AccessExpressionContext a;
		public Token lp;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token each;
		public IdentifierContext i;
		public BodyContext b;
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> BAR() { return getTokens(SimpleLOOPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SimpleLOOPParser.BAR, i);
		}
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				{
				setState(526);
				((LoopStatementContext)_localctx).a = accessExpression();
				((LoopStatementContext)_localctx).list =  ((LoopStatementContext)_localctx).a.accessExprRet;
				}
				}
				break;
			case 2:
				{
				{
				setState(529);
				((LoopStatementContext)_localctx).lp = match(LPAR);
				setState(530);
				((LoopStatementContext)_localctx).e1 = expression();
				setState(531);
				match(DOT);
				setState(532);
				match(DOT);
				setState(533);
				((LoopStatementContext)_localctx).e2 = expression();
				setState(534);
				match(RPAR);

				        ((LoopStatementContext)_localctx).list =  new RangeExpression(((LoopStatementContext)_localctx).e1.expressionRet, ((LoopStatementContext)_localctx).e2.expressionRet);
				        _localctx.list.setLine(((LoopStatementContext)_localctx).lp.getLine());
				    
				}
				}
				break;
			}
			setState(539);
			match(DOT);
			setState(540);
			((LoopStatementContext)_localctx).each = match(EACH);
			setState(541);
			match(DO);
			setState(542);
			match(BAR);
			setState(543);
			((LoopStatementContext)_localctx).i = identifier();
			setState(544);
			match(BAR);

			        ((LoopStatementContext)_localctx).loopStmtRet =  new EachStmt(((LoopStatementContext)_localctx).i.identifierRet, _localctx.list);
			        _localctx.loopStmtRet.setLine(((LoopStatementContext)_localctx).each.getLine());
			    
			setState(546);
			((LoopStatementContext)_localctx).b = body();
			 _localctx.loopStmtRet.setBody(((LoopStatementContext)_localctx).b.bodyRet); 
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
		public TernaryExpressionContext te;
		public Token a;
		public ExpressionContext e;
		public Token inc;
		public OrExpressionContext oe;
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
			setState(549);
			((ExpressionContext)_localctx).te = ternaryExpression();
			 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).te.ternaryExprRet; 
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(551);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(552);
				((ExpressionContext)_localctx).e = expression();

				        ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(_localctx.expressionRet, ((ExpressionContext)_localctx).e.expressionRet, BinaryOperator.assign);
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).a.getLine());
				    
				}
			}

			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(557);
				match(DOT);
				setState(558);
				((ExpressionContext)_localctx).inc = match(INCLUDE);
				setState(559);
				match(LPAR);
				setState(560);
				((ExpressionContext)_localctx).oe = orExpression();
				setState(561);
				match(RPAR);

				        ((ExpressionContext)_localctx).expressionRet =  new SetInclude(_localctx.expressionRet, ((ExpressionContext)_localctx).oe.orExprRet);
				    
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
		public Expression ternaryExprRet;
		public OrExpressionContext e1;
		public Token q;
		public TernaryExpressionContext te;
		public TernaryExpressionContext fe;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode TELSE() { return getToken(SimpleLOOPParser.TELSE, 0); }
		public TerminalNode TIF() { return getToken(SimpleLOOPParser.TIF, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
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
			setState(566);
			((TernaryExpressionContext)_localctx).e1 = orExpression();
			 ((TernaryExpressionContext)_localctx).ternaryExprRet =  ((TernaryExpressionContext)_localctx).e1.orExprRet; 
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(568);
				((TernaryExpressionContext)_localctx).q = match(TIF);
				setState(569);
				((TernaryExpressionContext)_localctx).te = ternaryExpression();
				setState(570);
				match(TELSE);
				setState(571);
				((TernaryExpressionContext)_localctx).fe = ternaryExpression();

				        ((TernaryExpressionContext)_localctx).ternaryExprRet =  new TernaryExpression(_localctx.ternaryExprRet ,((TernaryExpressionContext)_localctx).te.ternaryExprRet, ((TernaryExpressionContext)_localctx).fe.ternaryExprRet);
				        _localctx.ternaryExprRet.setLine(((TernaryExpressionContext)_localctx).q.getLine());
				    
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
		public Expression orExprRet;
		public AndExpressionContext e1;
		public Token o;
		public AndExpressionContext e2;
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
			setState(576);
			((OrExpressionContext)_localctx).e1 = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).e1.andExprRet; 
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(578);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(579);
				((OrExpressionContext)_localctx).e2 = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).e2.andExprRet, op);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(586);
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
		public Expression andExprRet;
		public EqualityExpressionContext e1;
		public Token o;
		public EqualityExpressionContext e2;
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
			setState(587);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			 ((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).e1.equalityExprRet; 
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(589);
				((AndExpressionContext)_localctx).o = match(AND);
				setState(590);
				((AndExpressionContext)_localctx).e2 = equalityExpression();

				        BinaryOperator op = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).e2.equalityExprRet, op);
				        _localctx.andExprRet.setLine(((AndExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(597);
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
		public Expression equalityExprRet;
		public RelationalExpressionContext e1;
		public Token o;
		public RelationalExpressionContext e2;
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
			setState(598);
			((EqualityExpressionContext)_localctx).e1 = relationalExpression();
			 ((EqualityExpressionContext)_localctx).equalityExprRet =  ((EqualityExpressionContext)_localctx).e1.relationalExprRet; 
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(600);
				((EqualityExpressionContext)_localctx).o = match(EQUAL);
				setState(601);
				((EqualityExpressionContext)_localctx).e2 = relationalExpression();

				        BinaryOperator op = BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).equalityExprRet =  new BinaryExpression(_localctx.equalityExprRet, ((EqualityExpressionContext)_localctx).e2.relationalExprRet, op);
				        _localctx.equalityExprRet.setLine(((EqualityExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(608);
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
		public Expression relationalExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext e1;
		public Token o1;
		public Token o2;
		public AdditiveExpressionContext e2;
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
			setState(609);
			((RelationalExpressionContext)_localctx).e1 = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relationalExprRet =  ((RelationalExpressionContext)_localctx).e1.additiveExprRet; 
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(611);
					((RelationalExpressionContext)_localctx).o1 = match(GREATER_THAN);
					 ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).o1.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(613);
					((RelationalExpressionContext)_localctx).o2 = match(LESS_THAN);
					 ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).o2.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(617);
				((RelationalExpressionContext)_localctx).e2 = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relationalExprRet =  new BinaryExpression(_localctx.relationalExprRet, ((RelationalExpressionContext)_localctx).e2.additiveExprRet, _localctx.op);
				        _localctx.relationalExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(624);
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
		public Expression additiveExprRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext e1;
		public Token o1;
		public Token o2;
		public MultiplicativeExpressionContext e2;
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
			setState(625);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).additiveExprRet =  ((AdditiveExpressionContext)_localctx).e1.multExprRet; 
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(631);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(627);
					((AdditiveExpressionContext)_localctx).o1 = match(PLUS);
					 ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).o1.getLine(); 
					}
					break;
				case MINUS:
					{
					setState(629);
					((AdditiveExpressionContext)_localctx).o2 = match(MINUS);
					 ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).o2.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(633);
				((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).additiveExprRet =  new BinaryExpression(_localctx.additiveExprRet, ((AdditiveExpressionContext)_localctx).e2.multExprRet, _localctx.op);
				        _localctx.additiveExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(640);
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
		public Expression multExprRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext e1;
		public Token o1;
		public Token o2;
		public PreUnaryExpressionContext e2;
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
			setState(641);
			((MultiplicativeExpressionContext)_localctx).e1 = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multExprRet =  ((MultiplicativeExpressionContext)_localctx).e1.preUnaryExprRet; 
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(643);
					((MultiplicativeExpressionContext)_localctx).o1 = match(MULT);
					((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).o1.getLine(); 
					}
					break;
				case DIVIDE:
					{
					setState(645);
					((MultiplicativeExpressionContext)_localctx).o2 = match(DIVIDE);
					 ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).o2.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(649);
				((MultiplicativeExpressionContext)_localctx).e2 = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multExprRet =  new BinaryExpression(_localctx.multExprRet, ((MultiplicativeExpressionContext)_localctx).e2.preUnaryExprRet, _localctx.op);
				        _localctx.multExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(656);
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
		public Expression preUnaryExprRet;
		public UnaryOperator op;
		public int line;
		public Token o1;
		public Token o2;
		public PreUnaryExpressionContext e1;
		public PostUnaryExpressionContext e2;
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
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(661);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(657);
					((PreUnaryExpressionContext)_localctx).o1 = match(NOT);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).o1.getLine(); 
					}
					break;
				case MINUS:
					{
					setState(659);
					((PreUnaryExpressionContext)_localctx).o2 = match(MINUS);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).o2.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663);
				((PreUnaryExpressionContext)_localctx).e1 = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).e1.preUnaryExprRet, _localctx.op);
				        _localctx.preUnaryExprRet.setLine(_localctx.line);
				    
				}
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
				setState(666);
				((PreUnaryExpressionContext)_localctx).e2 = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).e2.postUnaryExprRet; 
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
		public Expression postUnaryExprRet;
		public AccessExpressionContext e1;
		public Token o1;
		public Token o2;
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
			setState(671);
			((PostUnaryExpressionContext)_localctx).e1 = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  ((PostUnaryExpressionContext)_localctx).e1.accessExprRet; 
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(677);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(673);
					((PostUnaryExpressionContext)_localctx).o1 = match(INC);

					        UnaryOperator op1 = UnaryOperator.postinc;
					        ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op1);
					        _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).o1.getLine());
					    
					}
					break;
				case DEC:
					{
					setState(675);
					((PostUnaryExpressionContext)_localctx).o2 = match(DEC);

					        UnaryOperator op2 = UnaryOperator.postdec;
					        ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op2);
					        _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).o2.getLine());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExprRet;
		public OtherExpressionContext e1;
		public Token lp;
		public MethodArgsContext m;
		public IdentifierContext id2;
		public Token lb;
		public ExpressionContext idx;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
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
			setState(681);
			((AccessExpressionContext)_localctx).e1 = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExprRet =  ((AccessExpressionContext)_localctx).e1.otherExprRet; 
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(694);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(683);
						((AccessExpressionContext)_localctx).lp = match(LPAR);
						setState(684);
						((AccessExpressionContext)_localctx).m = methodArgs();

						        ((AccessExpressionContext)_localctx).accessExprRet =  new MethodCall(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).m.methodArgsRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).lp.getLine());
						    
						setState(686);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(688);
						match(DOT);
						setState(692);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(689);
							identifier();
							}
							break;
						case NEW:
							{
							setState(690);
							match(NEW);
							}
							break;
						case INITIALIZE:
							{
							setState(691);
							match(INITIALIZE);
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
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(707);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(699);
						match(DOT);
						{
						setState(700);
						((AccessExpressionContext)_localctx).id2 = identifier();
						}
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(701);
						((AccessExpressionContext)_localctx).lb = match(LBRACK);
						setState(702);
						((AccessExpressionContext)_localctx).idx = expression();
						setState(703);
						match(RBRACK);
						}

						        ((AccessExpressionContext)_localctx).accessExprRet =  new ArrayAccessByIndex(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).idx.expressionRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).lb.getLine());
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		public Token s;
		public Class_identifierContext c;
		public ValueContext v;
		public IdentifierContext id;
		public SetNewContext sn;
		public ExpressionContext ex;
		public TerminalNode SELF() { return getToken(SimpleLOOPParser.SELF, 0); }
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
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				((OtherExpressionContext)_localctx).s = match(SELF);
				((OtherExpressionContext)_localctx).otherExprRet =  new SelfClass(); _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).s.getLine());
				}
				break;
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				((OtherExpressionContext)_localctx).c = class_identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).c.classIdentifierRet.getClassName(); 
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				((OtherExpressionContext)_localctx).v = value();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.identifierRet; 
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(723);
				((OtherExpressionContext)_localctx).sn = setNew();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).sn.setNewRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(726);
				match(LPAR);
				setState(727);
				((OtherExpressionContext)_localctx).ex = expression();
				setState(728);
				match(RPAR);
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).ex.expressionRet; 
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
		public OrExpressionContext o1;
		public OrExpressionContext o2;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
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
			 ArrayList<Expression> args = new ArrayList<>();
			setState(734);
			match(SET);
			setState(735);
			match(DOT);
			setState(736);
			match(NEW);
			setState(737);
			match(LPAR);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(738);
				match(LPAR);
				setState(739);
				((SetNewContext)_localctx).o1 = orExpression();
				 args.add(((SetNewContext)_localctx).o1.orExprRet); 
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(741);
					match(COMMA);
					setState(742);
					((SetNewContext)_localctx).o2 = orExpression();
					 args.add(((SetNewContext)_localctx).o2.orExprRet); 
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				match(RPAR);
				}
			}

			setState(754);
			match(RPAR);
			 ((SetNewContext)_localctx).setNewRet =  new SetNew(args); 
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
		public BoolValueContext v1;
		public Token v2;
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
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				((ValueContext)_localctx).v1 = boolValue();
				 ((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).v1.boolValueRet; 
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				((ValueContext)_localctx).v2 = match(INT_VALUE);

				        ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).v2!=null?Integer.valueOf(((ValueContext)_localctx).v2.getText()):0));
				        _localctx.valueRet.setLine(((ValueContext)_localctx).v2.getLine());
				    
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
		public BoolValue boolValueRet;
		public Token t;
		public Token f;
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
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).t.getLine());
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).f.getLine());
				    
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
		public ClassType classIdentifierRet;
		public Token id;
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
			setState(770);
			((Class_identifierContext)_localctx).id = match(CLASS_IDENTIFIER);
			 ((Class_identifierContext)_localctx).classIdentifierRet =  new ClassType(new Identifier((((Class_identifierContext)_localctx).id!=null?((Class_identifierContext)_localctx).id.getText():null))); 
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
		public Identifier identifierRet;
		public int line;
		public Token id;
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
			setState(773);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			        _localctx.identifierRet.setLine(((IdentifierContext)_localctx).id.getLine());
			        ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).id.getLine();
			    
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
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				((TypeContext)_localctx).a = array_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).a.arrayTypeRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				((TypeContext)_localctx).f = fptr_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(786);
				((TypeContext)_localctx).s = set_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).s.setTypeRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(789);
				((TypeContext)_localctx).c = class_identifier();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).c.classIdentifierRet; 
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
		public Type arrType;
		public Class_identifierContext c;
		public ExpressionContext e;
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
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(794);
				match(INT);
				 ((Array_typeContext)_localctx).arrType =  new IntType(); 
				}
				break;
			case BOOL:
				{
				setState(796);
				match(BOOL);
				 ((Array_typeContext)_localctx).arrType =  new BoolType(); 
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(798);
				((Array_typeContext)_localctx).c = class_identifier();
				 ((Array_typeContext)_localctx).arrType =  ((Array_typeContext)_localctx).c.classIdentifierRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ArrayList<Expression> dim = new ArrayList<>(); 
			setState(809); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(804);
				match(LBRACK);
				setState(805);
				((Array_typeContext)_localctx).e = expression();
				setState(806);
				match(RBRACK);
				 dim.add(((Array_typeContext)_localctx).e.expressionRet); 
				}
				}
				setState(811); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			 ((Array_typeContext)_localctx).arrayTypeRet =  new ArrayType(_localctx.arrType, dim); 
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
		public TypeContext t1;
		public TypeContext t2;
		public TypeContext t3;
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((Fptr_typeContext)_localctx).fptrTypeRet =  new FptrType();
			        _localctx.fptrTypeRet.setArgumentsTypes(new ArrayList<Type>());
			    
			setState(816);
			match(FPTR);
			setState(817);
			match(LESS_THAN);
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(818);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				{
				setState(819);
				((Fptr_typeContext)_localctx).t1 = type();
				 _localctx.fptrTypeRet.addArgumentType(((Fptr_typeContext)_localctx).t1.typeRet); 
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					((Fptr_typeContext)_localctx).t2 = type();
					 _localctx.fptrTypeRet.addArgumentType(((Fptr_typeContext)_localctx).t2.typeRet); 
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(832);
			match(ARROW);
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(833);
				((Fptr_typeContext)_localctx).t3 = type();
				 _localctx.fptrTypeRet.setReturnType(((Fptr_typeContext)_localctx).t3.typeRet); 
				}
				break;
			case VOID:
				{
				setState(836);
				match(VOID);
				 _localctx.fptrTypeRet.setReturnType(new NullType()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(840);
			match(GREATER_THAN);
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
		enterRule(_localctx, 92, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(SET);
			setState(843);
			match(LESS_THAN);
			{
			setState(844);
			match(INT);
			}
			setState(845);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0353\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3"+
		"\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\3"+
		"\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0092"+
		"\n\4\f\4\16\4\u0095\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1"+
		"\n\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\5\3\5\6\5\u00ab\n\5\r\5\16"+
		"\5\u00ac\3\5\3\5\3\5\6\5\u00b2\n\5\r\5\16\5\u00b3\6\5\u00b6\n\5\r\5\16"+
		"\5\u00b7\3\5\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00c6"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ce\n\6\3\6\3\6\3\6\5\6\u00d3\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e1\n\7\f\7"+
		"\16\7\u00e4\13\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b\u00ec\n\b\r\b\16\b\u00ed"+
		"\3\b\3\b\3\b\6\b\u00f3\n\b\r\b\16\b\u00f4\7\b\u00f7\n\b\f\b\16\b\u00fa"+
		"\13\b\3\b\3\b\3\b\6\b\u00ff\n\b\r\b\16\b\u0100\7\b\u0103\n\b\f\b\16\b"+
		"\u0106\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010f\n\b\5\b\u0111\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u011d\n\t\f\t\16\t\u0120\13"+
		"\t\5\t\u0122\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u012a\n\t\f\t\16\t\u012d"+
		"\13\t\5\t\u012f\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u013e\n\13\f\13\16\13\u0141\13\13\5\13\u0143\n\13\3\f\3"+
		"\f\3\f\3\f\6\f\u0149\n\f\r\f\16\f\u014a\3\f\3\f\3\f\5\f\u0150\n\f\3\r"+
		"\3\r\3\r\6\r\u0155\n\r\r\r\16\r\u0156\3\r\3\r\3\r\6\r\u015c\n\r\r\r\16"+
		"\r\u015d\7\r\u0160\n\r\f\r\16\r\u0163\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0182\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0197\n\20\f\20\16\20\u019a\13\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u01af\n\22\f\22\16\22\u01b2\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u01bb\n\23\f\23\16\23\u01be\13\23\3\23\3\23\3\23"+
		"\5\23\u01c3\n\23\3\24\7\24\u01c6\n\24\f\24\16\24\u01c9\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d8\n\25"+
		"\3\26\7\26\u01db\n\26\f\26\16\26\u01de\13\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u01f2\n\30\7\30\u01f4\n\30\f\30\16\30\u01f7\13\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0200\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u020a\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u021c\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u022e\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0237\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0241\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0249"+
		"\n\36\f\36\16\36\u024c\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0254"+
		"\n\37\f\37\16\37\u0257\13\37\3 \3 \3 \3 \3 \3 \7 \u025f\n \f \16 \u0262"+
		"\13 \3!\3!\3!\3!\3!\3!\5!\u026a\n!\3!\3!\3!\7!\u026f\n!\f!\16!\u0272\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u027a\n\"\3\"\3\"\3\"\7\"\u027f\n\"\f\""+
		"\16\"\u0282\13\"\3#\3#\3#\3#\3#\3#\5#\u028a\n#\3#\3#\3#\7#\u028f\n#\f"+
		"#\16#\u0292\13#\3$\3$\3$\3$\5$\u0298\n$\3$\3$\3$\3$\3$\3$\5$\u02a0\n$"+
		"\3%\3%\3%\3%\3%\3%\5%\u02a8\n%\5%\u02aa\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\5&\u02b7\n&\7&\u02b9\n&\f&\16&\u02bc\13&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\7&\u02c6\n&\f&\16&\u02c9\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02de\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\7(\u02ec\n(\f(\16(\u02ef\13(\3(\3(\5(\u02f3\n(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\5)\u02fd\n)\3*\3*\3*\3*\5*\u0303\n*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u031b\n-\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u0324\n.\3.\3.\3.\3.\3.\3.\6.\u032c\n.\r.\16.\u032d"+
		"\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u033c\n/\f/\16/\u033f\13/\5/\u0341"+
		"\n/\3/\3/\3/\3/\3/\3/\5/\u0349\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\3\3\2\30\31\2\u0385\2c\3\2\2\2\4p\3\2\2\2\6"+
		"\u008b\3\2\2\2\b\u0099\3\2\2\2\n\u00c0\3\2\2\2\f\u00d9\3\2\2\2\16\u0110"+
		"\3\2\2\2\20\u0112\3\2\2\2\22\u0132\3\2\2\2\24\u0136\3\2\2\2\26\u014f\3"+
		"\2\2\2\30\u0151\3\2\2\2\32\u0181\3\2\2\2\34\u0183\3\2\2\2\36\u018b\3\2"+
		"\2\2 \u019e\3\2\2\2\"\u01a6\3\2\2\2$\u01b3\3\2\2\2&\u01c7\3\2\2\2(\u01d7"+
		"\3\2\2\2*\u01dc\3\2\2\2,\u01e3\3\2\2\2.\u01e9\3\2\2\2\60\u0203\3\2\2\2"+
		"\62\u020b\3\2\2\2\64\u021b\3\2\2\2\66\u0227\3\2\2\28\u0238\3\2\2\2:\u0242"+
		"\3\2\2\2<\u024d\3\2\2\2>\u0258\3\2\2\2@\u0263\3\2\2\2B\u0273\3\2\2\2D"+
		"\u0283\3\2\2\2F\u029f\3\2\2\2H\u02a1\3\2\2\2J\u02ab\3\2\2\2L\u02dd\3\2"+
		"\2\2N\u02df\3\2\2\2P\u02fc\3\2\2\2R\u0302\3\2\2\2T\u0304\3\2\2\2V\u0307"+
		"\3\2\2\2X\u031a\3\2\2\2Z\u0323\3\2\2\2\\\u0331\3\2\2\2^\u034c\3\2\2\2"+
		"`b\7:\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\5\4\3\2gk\b\2\1\2hj\7:\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3\2\2\2p{\b\3\1\2qs\5\"\22\2rt\7:\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\3\1\2xz\3\2\2"+
		"\2yq\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0088\3\2\2\2}{\3\2\2\2~\u0080"+
		"\5\b\5\2\177\u0081\7:\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\3"+
		"\1\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\u008d\7\7\2\2\u008d\u008e\b\4\1\2\u008e\u008f\5\20"+
		"\t\2\u008f\u0093\b\4\1\2\u0090\u0092\7:\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\16\b\2\u0097\u0098\b\4\1\2\u0098"+
		"\7\3\2\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5T+\2\u009b\u00a0\b\5\1\2\u009c"+
		"\u009d\7\34\2\2\u009d\u009e\5T+\2\u009e\u009f\b\5\1\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a4\7:\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00be\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00aa\7\65\2\2\u00a9\u00ab\7:\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b5\3\2\2\2\u00ae"+
		"\u00af\5\n\6\2\u00af\u00b1\b\5\1\2\u00b0\u00b2\7:\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\66\2\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\u00bd\b\5\1\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00a8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\t\3\2\2\2\u00c0\u00d2"+
		"\b\6\1\2\u00c1\u00c2\7\5\2\2\u00c2\u00c6\b\6\1\2\u00c3\u00c4\7\6\2\2\u00c4"+
		"\u00c6\b\6\1\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cd\3\2"+
		"\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\b\6\1\2\u00c9\u00ce\3\2\2\2\u00ca"+
		"\u00cb\5\f\7\2\u00cb\u00cc\b\6\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7\3\2"+
		"\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00d0\5\6\4\2\u00d0"+
		"\u00d1\b\6\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00cf\3\2"+
		"\2\2\u00d3\13\3\2\2\2\u00d4\u00d5\5X-\2\u00d5\u00d6\b\7\1\2\u00d6\u00da"+
		"\3\2\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00da\b\7\1\2\u00d9\u00d4\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5V,\2\u00dc\u00dd"+
		"\b\7\1\2\u00dd\u00de\5\20\t\2\u00de\u00e2\b\7\1\2\u00df\u00e1\7:\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\16\b\2\u00e6"+
		"\u00e7\b\7\1\2\u00e7\r\3\2\2\2\u00e8\u00e9\b\b\1\2\u00e9\u00eb\7\65\2"+
		"\2\u00ea\u00ec\7:\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f0\5\"\22\2"+
		"\u00f0\u00f2\b\b\1\2\u00f1\u00f3\7:\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u0104\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5\32\16\2\u00fc"+
		"\u00fe\b\b\1\2\u00fd\u00ff\7:\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0111\7\66\2\2\u0108"+
		"\u0109\5\"\22\2\u0109\u010a\b\b\1\2\u010a\u010f\3\2\2\2\u010b\u010c\5"+
		"\32\16\2\u010c\u010d\b\b\1\2\u010d\u010f\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u00e8\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0111\17\3\2\2\2\u0112\u0113\b\t\1\2\u0113\u012e\7\61\2\2\u0114\u0115"+
		"\5\22\n\2\u0115\u0121\b\t\1\2\u0116\u0117\7/\2\2\u0117\u0122\5:\36\2\u0118"+
		"\u0119\7\67\2\2\u0119\u011a\5\22\n\2\u011a\u011b\b\t\1\2\u011b\u011d\3"+
		"\2\2\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0116\3\2"+
		"\2\2\u0121\u011e\3\2\2\2\u0122\u012b\3\2\2\2\u0123\u0124\7\67\2\2\u0124"+
		"\u0125\5\22\n\2\u0125\u0126\b\t\1\2\u0126\u0127\7/\2\2\u0127\u0128\5:"+
		"\36\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u0114\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\7\62\2\2\u0131\21\3\2\2\2\u0132\u0133\5X-\2\u0133\u0134\5V,\2\u0134"+
		"\u0135\b\n\1\2\u0135\23\3\2\2\2\u0136\u0142\b\13\1\2\u0137\u0138\5\66"+
		"\34\2\u0138\u013f\b\13\1\2\u0139\u013a\7\67\2\2\u013a\u013b\5\66\34\2"+
		"\u013b\u013c\b\13\1\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0137\3\2\2\2\u0142\u0143\3\2\2\2\u0143\25\3\2\2"+
		"\2\u0144\u0145\5\30\r\2\u0145\u0146\b\f\1\2\u0146\u0150\3\2\2\2\u0147"+
		"\u0149\7:\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\5\32\16\2\u014d"+
		"\u014e\b\f\1\2\u014e\u0150\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0148\3\2"+
		"\2\2\u0150\27\3\2\2\2\u0151\u0152\b\r\1\2\u0152\u0154\7\65\2\2\u0153\u0155"+
		"\7:\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0161\3\2\2\2\u0158\u0159\5\32\16\2\u0159\u015b\b"+
		"\r\1\2\u015a\u015c\7:\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0158\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\66\2\2\u0165\31\3\2\2"+
		"\2\u0166\u0167\5$\23\2\u0167\u0168\b\16\1\2\u0168\u0182\3\2\2\2\u0169"+
		"\u016a\5,\27\2\u016a\u016b\b\16\1\2\u016b\u0182\3\2\2\2\u016c\u016d\5"+
		".\30\2\u016d\u016e\b\16\1\2\u016e\u0182\3\2\2\2\u016f\u0170\5\60\31\2"+
		"\u0170\u0171\b\16\1\2\u0171\u0182\3\2\2\2\u0172\u0173\5\62\32\2\u0173"+
		"\u0174\b\16\1\2\u0174\u0182\3\2\2\2\u0175\u0176\5\64\33\2\u0176\u0177"+
		"\b\16\1\2\u0177\u0182\3\2\2\2\u0178\u0179\5\34\17\2\u0179\u017a\b\16\1"+
		"\2\u017a\u0182\3\2\2\2\u017b\u017c\5\36\20\2\u017c\u017d\b\16\1\2\u017d"+
		"\u0182\3\2\2\2\u017e\u017f\5 \21\2\u017f\u0180\b\16\1\2\u0180\u0182\3"+
		"\2\2\2\u0181\u0166\3\2\2\2\u0181\u0169\3\2\2\2\u0181\u016c\3\2\2\2\u0181"+
		"\u016f\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0175\3\2\2\2\u0181\u0178\3\2"+
		"\2\2\u0181\u017b\3\2\2\2\u0181\u017e\3\2\2\2\u0182\33\3\2\2\2\u0183\u0184"+
		"\5\66\34\2\u0184\u0185\78\2\2\u0185\u0186\7\16\2\2\u0186\u0187\7\61\2"+
		"\2\u0187\u0188\5:\36\2\u0188\u0189\7\62\2\2\u0189\u018a\b\17\1\2\u018a"+
		"\35\3\2\2\2\u018b\u018c\b\20\1\2\u018c\u018d\5\66\34\2\u018d\u018e\78"+
		"\2\2\u018e\u018f\7\17\2\2\u018f\u0190\7\61\2\2\u0190\u0191\5:\36\2\u0191"+
		"\u0198\b\20\1\2\u0192\u0193\7\67\2\2\u0193\u0194\5:\36\2\u0194\u0195\b"+
		"\20\1\2\u0195\u0197\3\2\2\2\u0196\u0192\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u019c\7\62\2\2\u019c\u019d\b\20\1\2\u019d\37\3\2\2\2\u019e"+
		"\u019f\5\66\34\2\u019f\u01a0\78\2\2\u01a0\u01a1\7\f\2\2\u01a1\u01a2\7"+
		"\61\2\2\u01a2\u01a3\5:\36\2\u01a3\u01a4\7\62\2\2\u01a4\u01a5\b\21\1\2"+
		"\u01a5!\3\2\2\2\u01a6\u01a7\b\22\1\2\u01a7\u01a8\5X-\2\u01a8\u01a9\5V"+
		",\2\u01a9\u01b0\b\22\1\2\u01aa\u01ab\7\67\2\2\u01ab\u01ac\5V,\2\u01ac"+
		"\u01ad\b\22\1\2\u01ad\u01af\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1#\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b4\7\21\2\2\u01b4\u01b5\5(\25\2\u01b5\u01b6\5\26\f\2"+
		"\u01b6\u01bc\b\23\1\2\u01b7\u01b8\5&\24\2\u01b8\u01b9\b\23\1\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5*"+
		"\26\2\u01c0\u01c1\b\23\1\2\u01c1\u01c3\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3%\3\2\2\2\u01c4\u01c6\7:\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\23\2\2\u01cb\u01cc\5(\25\2\u01cc"+
		"\u01cd\5\26\f\2\u01cd\u01ce\b\24\1\2\u01ce\'\3\2\2\2\u01cf\u01d0\7\61"+
		"\2\2\u01d0\u01d1\5\66\34\2\u01d1\u01d2\b\25\1\2\u01d2\u01d3\7\62\2\2\u01d3"+
		"\u01d8\3\2\2\2\u01d4\u01d5\5\66\34\2\u01d5\u01d6\b\25\1\2\u01d6\u01d8"+
		"\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d8)\3\2\2\2\u01d9"+
		"\u01db\7:\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\7\22\2\2\u01e0\u01e1\5\26\f\2\u01e1\u01e2\b\26\1\2\u01e2+\3\2\2"+
		"\2\u01e3\u01e4\7\20\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\5\66\34\2\u01e6"+
		"\u01e7\b\27\1\2\u01e7\u01e8\7\62\2\2\u01e8-\3\2\2\2\u01e9\u01ea\5J&\2"+
		"\u01ea\u01f5\b\30\1\2\u01eb\u01f1\78\2\2\u01ec\u01ed\7\7\2\2\u01ed\u01f2"+
		"\b\30\1\2\u01ee\u01ef\5V,\2\u01ef\u01f0\b\30\1\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ec\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01eb\3\2"+
		"\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01ff\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\61\2\2\u01f9\u01fa\5"+
		"\24\13\2\u01fa\u01fb\7\62\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\b\30\1\2"+
		"\u01fd\u0200\3\2\2\2\u01fe\u0200\t\2\2\2\u01ff\u01f8\3\2\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\b\30\1\2\u0202/\3\2\2\2\u0203"+
		"\u0204\b\31\1\2\u0204\u0205\7\n\2\2\u0205\u0209\b\31\1\2\u0206\u0207\5"+
		"\66\34\2\u0207\u0208\b\31\1\2\u0208\u020a\3\2\2\2\u0209\u0206\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\61\3\2\2\2\u020b\u020c\5:\36\2\u020c\u020d"+
		"\7/\2\2\u020d\u020e\5\66\34\2\u020e\u020f\b\32\1\2\u020f\63\3\2\2\2\u0210"+
		"\u0211\5J&\2\u0211\u0212\b\33\1\2\u0212\u021c\3\2\2\2\u0213\u0214\7\61"+
		"\2\2\u0214\u0215\5\66\34\2\u0215\u0216\78\2\2\u0216\u0217\78\2\2\u0217"+
		"\u0218\5\66\34\2\u0218\u0219\7\62\2\2\u0219\u021a\b\33\1\2\u021a\u021c"+
		"\3\2\2\2\u021b\u0210\3\2\2\2\u021b\u0213\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\78\2\2\u021e\u021f\7-\2\2\u021f\u0220\7.\2\2\u0220\u0221\7\36\2"+
		"\2\u0221\u0222\5V,\2\u0222\u0223\7\36\2\2\u0223\u0224\b\33\1\2\u0224\u0225"+
		"\5\26\f\2\u0225\u0226\b\33\1\2\u0226\65\3\2\2\2\u0227\u0228\58\35\2\u0228"+
		"\u022d\b\34\1\2\u0229\u022a\7/\2\2\u022a\u022b\5\66\34\2\u022b\u022c\b"+
		"\34\1\2\u022c\u022e\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0236\3\2\2\2\u022f\u0230\78\2\2\u0230\u0231\7\r\2\2\u0231\u0232\7\61"+
		"\2\2\u0232\u0233\5:\36\2\u0233\u0234\7\62\2\2\u0234\u0235\b\34\1\2\u0235"+
		"\u0237\3\2\2\2\u0236\u022f\3\2\2\2\u0236\u0237\3\2\2\2\u0237\67\3\2\2"+
		"\2\u0238\u0239\5:\36\2\u0239\u0240\b\35\1\2\u023a\u023b\7\"\2\2\u023b"+
		"\u023c\58\35\2\u023c\u023d\7#\2\2\u023d\u023e\58\35\2\u023e\u023f\b\35"+
		"\1\2\u023f\u0241\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"9\3\2\2\2\u0242\u0243\5<\37\2\u0243\u024a\b\36\1\2\u0244\u0245\7 \2\2"+
		"\u0245\u0246\5<\37\2\u0246\u0247\b\36\1\2\u0247\u0249\3\2\2\2\u0248\u0244"+
		"\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		";\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\5> \2\u024e\u0255\b\37\1\2\u024f"+
		"\u0250\7\37\2\2\u0250\u0251\5> \2\u0251\u0252\b\37\1\2\u0252\u0254\3\2"+
		"\2\2\u0253\u024f\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256=\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\5@!\2\u0259"+
		"\u0260\b \1\2\u025a\u025b\7\32\2\2\u025b\u025c\5@!\2\u025c\u025d\b \1"+
		"\2\u025d\u025f\3\2\2\2\u025e\u025a\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261?\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0264\5B\"\2\u0264\u0270\b!\1\2\u0265\u0266\7\33\2\2\u0266\u026a\b!\1"+
		"\2\u0267\u0268\7\34\2\2\u0268\u026a\b!\1\2\u0269\u0265\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\5B\"\2\u026c\u026d\b!\1\2\u026d"+
		"\u026f\3\2\2\2\u026e\u0269\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271A\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274"+
		"\5D#\2\u0274\u0280\b\"\1\2\u0275\u0276\7\24\2\2\u0276\u027a\b\"\1\2\u0277"+
		"\u0278\7\25\2\2\u0278\u027a\b\"\1\2\u0279\u0275\3\2\2\2\u0279\u0277\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\5D#\2\u027c\u027d\b\"\1\2\u027d"+
		"\u027f\3\2\2\2\u027e\u0279\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281C\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284"+
		"\5F$\2\u0284\u0290\b#\1\2\u0285\u0286\7\26\2\2\u0286\u028a\b#\1\2\u0287"+
		"\u0288\7\27\2\2\u0288\u028a\b#\1\2\u0289\u0285\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028b\u028c\5F$\2\u028c\u028d\b#\1\2\u028d\u028f"+
		"\3\2\2\2\u028e\u0289\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291E\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7!\2\2\u0294"+
		"\u0298\b$\1\2\u0295\u0296\7\25\2\2\u0296\u0298\b$\1\2\u0297\u0293\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\5F$\2\u029a\u029b"+
		"\b$\1\2\u029b\u02a0\3\2\2\2\u029c\u029d\5H%\2\u029d\u029e\b$\1\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u029c\3\2\2\2\u02a0G\3\2\2\2"+
		"\u02a1\u02a2\5J&\2\u02a2\u02a9\b%\1\2\u02a3\u02a4\7\30\2\2\u02a4\u02a8"+
		"\b%\1\2\u02a5\u02a6\7\31\2\2\u02a6\u02a8\b%\1\2\u02a7\u02a3\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aaI\3\2\2\2\u02ab\u02ac\5L\'\2\u02ac\u02ba\b&\1\2\u02ad\u02ae"+
		"\7\61\2\2\u02ae\u02af\5\24\13\2\u02af\u02b0\b&\1\2\u02b0\u02b1\7\62\2"+
		"\2\u02b1\u02b9\3\2\2\2\u02b2\u02b6\78\2\2\u02b3\u02b7\5V,\2\u02b4\u02b7"+
		"\7\b\2\2\u02b5\u02b7\7\7\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6"+
		"\u02b5\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02ad\3\2\2\2\u02b8\u02b2\3\2"+
		"\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02c7\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\78\2\2\u02be\u02c6\5V,"+
		"\2\u02bf\u02c0\7\63\2\2\u02c0\u02c1\5\66\34\2\u02c1\u02c2\7\64\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\b&\1\2\u02c4\u02c6\3\2\2\2\u02c5\u02bd\3\2"+
		"\2\2\u02c5\u02bf\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8K\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7\t\2\2"+
		"\u02cb\u02de\b\'\1\2\u02cc\u02cd\5T+\2\u02cd\u02ce\b\'\1\2\u02ce\u02de"+
		"\3\2\2\2\u02cf\u02d0\5P)\2\u02d0\u02d1\b\'\1\2\u02d1\u02de\3\2\2\2\u02d2"+
		"\u02d3\5V,\2\u02d3\u02d4\b\'\1\2\u02d4\u02de\3\2\2\2\u02d5\u02d6\5N(\2"+
		"\u02d6\u02d7\b\'\1\2\u02d7\u02de\3\2\2\2\u02d8\u02d9\7\61\2\2\u02d9\u02da"+
		"\5\66\34\2\u02da\u02db\7\62\2\2\u02db\u02dc\b\'\1\2\u02dc\u02de\3\2\2"+
		"\2\u02dd\u02ca\3\2\2\2\u02dd\u02cc\3\2\2\2\u02dd\u02cf\3\2\2\2\u02dd\u02d2"+
		"\3\2\2\2\u02dd\u02d5\3\2\2\2\u02dd\u02d8\3\2\2\2\u02deM\3\2\2\2\u02df"+
		"\u02e0\b(\1\2\u02e0\u02e1\7,\2\2\u02e1\u02e2\78\2\2\u02e2\u02e3\7\b\2"+
		"\2\u02e3\u02f2\7\61\2\2\u02e4\u02e5\7\61\2\2\u02e5\u02e6\5:\36\2\u02e6"+
		"\u02ed\b(\1\2\u02e7\u02e8\7\67\2\2\u02e8\u02e9\5:\36\2\u02e9\u02ea\b("+
		"\1\2\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ed\3\2"+
		"\2\2\u02f0\u02f1\7\62\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02e4\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\7\62\2\2\u02f5\u02f6\b"+
		"(\1\2\u02f6O\3\2\2\2\u02f7\u02f8\5R*\2\u02f8\u02f9\b)\1\2\u02f9\u02fd"+
		"\3\2\2\2\u02fa\u02fb\7;\2\2\u02fb\u02fd\b)\1\2\u02fc\u02f7\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fdQ\3\2\2\2\u02fe\u02ff\7$\2\2\u02ff\u0303\b*\1\2\u0300"+
		"\u0301\7%\2\2\u0301\u0303\b*\1\2\u0302\u02fe\3\2\2\2\u0302\u0300\3\2\2"+
		"\2\u0303S\3\2\2\2\u0304\u0305\7=\2\2\u0305\u0306\b+\1\2\u0306U\3\2\2\2"+
		"\u0307\u0308\7<\2\2\u0308\u0309\b,\1\2\u0309W\3\2\2\2\u030a\u030b\7)\2"+
		"\2\u030b\u031b\b-\1\2\u030c\u030d\7*\2\2\u030d\u031b\b-\1\2\u030e\u030f"+
		"\5Z.\2\u030f\u0310\b-\1\2\u0310\u031b\3\2\2\2\u0311\u0312\5\\/\2\u0312"+
		"\u0313\b-\1\2\u0313\u031b\3\2\2\2\u0314\u0315\5^\60\2\u0315\u0316\b-\1"+
		"\2\u0316\u031b\3\2\2\2\u0317\u0318\5T+\2\u0318\u0319\b-\1\2\u0319\u031b"+
		"\3\2\2\2\u031a\u030a\3\2\2\2\u031a\u030c\3\2\2\2\u031a\u030e\3\2\2\2\u031a"+
		"\u0311\3\2\2\2\u031a\u0314\3\2\2\2\u031a\u0317\3\2\2\2\u031bY\3\2\2\2"+
		"\u031c\u031d\7)\2\2\u031d\u0324\b.\1\2\u031e\u031f\7*\2\2\u031f\u0324"+
		"\b.\1\2\u0320\u0321\5T+\2\u0321\u0322\b.\1\2\u0322\u0324\3\2\2\2\u0323"+
		"\u031c\3\2\2\2\u0323\u031e\3\2\2\2\u0323\u0320\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u032b\b.\1\2\u0326\u0327\7\63\2\2\u0327\u0328\5\66\34\2\u0328"+
		"\u0329\7\64\2\2\u0329\u032a\b.\1\2\u032a\u032c\3\2\2\2\u032b\u0326\3\2"+
		"\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0330\b.\1\2\u0330[\3\2\2\2\u0331\u0332\b/\1\2\u0332"+
		"\u0333\7+\2\2\u0333\u0340\7\34\2\2\u0334\u0341\7\13\2\2\u0335\u0336\5"+
		"X-\2\u0336\u033d\b/\1\2\u0337\u0338\7\67\2\2\u0338\u0339\5X-\2\u0339\u033a"+
		"\b/\1\2\u033a\u033c\3\2\2\2\u033b\u0337\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0334\3\2\2\2\u0340\u0335\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0348\7\35\2\2\u0343\u0344\5X-\2\u0344\u0345\b/\1\2\u0345\u0349\3\2\2"+
		"\2\u0346\u0347\7\13\2\2\u0347\u0349\b/\1\2\u0348\u0343\3\2\2\2\u0348\u0346"+
		"\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\7\33\2\2\u034b]\3\2\2\2\u034c"+
		"\u034d\7,\2\2\u034d\u034e\7\34\2\2\u034e\u034f\7)\2\2\u034f\u0350\7\33"+
		"\2\2\u0350\u0351\b\60\1\2\u0351_\3\2\2\2Scku{\u0082\u0088\u0093\u00a0"+
		"\u00a5\u00ac\u00b3\u00b7\u00be\u00c5\u00cd\u00d2\u00d9\u00e2\u00ed\u00f4"+
		"\u00f8\u0100\u0104\u010e\u0110\u011e\u0121\u012b\u012e\u013f\u0142\u014a"+
		"\u014f\u0156\u015d\u0161\u0181\u0198\u01b0\u01bc\u01c2\u01c7\u01d7\u01dc"+
		"\u01f1\u01f5\u01ff\u0209\u021b\u022d\u0236\u0240\u024a\u0255\u0260\u0269"+
		"\u0270\u0279\u0280\u0289\u0290\u0297\u029f\u02a7\u02a9\u02b6\u02b8\u02ba"+
		"\u02c5\u02c7\u02dd\u02ed\u02f2\u02fc\u0302\u031a\u0323\u032d\u033d\u0340"+
		"\u0348";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}