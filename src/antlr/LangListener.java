// Generated from C:/cmpe/Lang/Lang/src/com/company\Lang.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.io.IOException;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(LangParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(LangParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(LangParser.MainClassContext ctx) throws IOException;
	/**
	 * Exit a parse tree produced by {@link LangParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(LangParser.MainClassContext ctx) throws IOException;
	/**
	 * Enter a parse tree produced by {@link LangParser#mainClassName}.
	 * @param ctx the parse tree
	 */
	void enterMainClassName(LangParser.MainClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mainClassName}.
	 * @param ctx the parse tree
	 */
	void exitMainClassName(LangParser.MainClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LangParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LangParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LangParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangParser.PrintContext ctx) throws IOException;
}