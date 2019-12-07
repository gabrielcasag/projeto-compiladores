// Generated from /home/gbrl8/Área de Trabalho/CompiladorE2/src/resources/JmmParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JmmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JmmParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JmmParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JmmParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JmmParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JmmParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(JmmParser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JmmParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JmmParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#classOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOptions(JmmParser.ClassOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JmmParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#classMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMembers(JmmParser.ClassMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(JmmParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JmmParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JmmParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JmmParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#returnMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMethod(JmmParser.ReturnMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JmmParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JmmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JmmParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JmmParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JmmParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JmmParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JmmParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JmmParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JmmParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JmmParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JmmParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(JmmParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JmmParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JmmParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#assigmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentExpression(JmmParser.AssigmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JmmParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JmmParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JmmParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JmmParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JmmParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUnaryExpression(JmmParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JmmParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JmmParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JmmParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JmmParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayDeclarator(JmmParser.NewArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JmmParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JmmParser.LiteralContext ctx);
}