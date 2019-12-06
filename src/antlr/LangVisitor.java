// Generated from C:/cmpe/Lang/Lang/src/com/company\Lang.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(LangParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(LangParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mainClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClassName(LangParser.MainClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(LangParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LangParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangParser.PrintContext ctx);
}