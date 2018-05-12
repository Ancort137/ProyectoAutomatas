// Generated from MileParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MileParserParser}.
 */
public interface MileParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MileParserParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(@NotNull MileParserParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(@NotNull MileParserParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull MileParserParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull MileParserParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MileParserParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MileParserParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull MileParserParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull MileParserParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull MileParserParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull MileParserParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link MileParserParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull MileParserParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MileParserParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull MileParserParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(@NotNull MileParserParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(@NotNull MileParserParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull MileParserParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull MileParserParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#math_function}.
	 * @param ctx the parse tree
	 */
	void enterMath_function(@NotNull MileParserParser.Math_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#math_function}.
	 * @param ctx the parse tree
	 */
	void exitMath_function(@NotNull MileParserParser.Math_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MileParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MileParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(@NotNull MileParserParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(@NotNull MileParserParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull MileParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull MileParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#start_block}.
	 * @param ctx the parse tree
	 */
	void enterStart_block(@NotNull MileParserParser.Start_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#start_block}.
	 * @param ctx the parse tree
	 */
	void exitStart_block(@NotNull MileParserParser.Start_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull MileParserParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull MileParserParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(@NotNull MileParserParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(@NotNull MileParserParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MileParserParser#write_block}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull MileParserParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MileParserParser#write_block}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull MileParserParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull MileParserParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull MileParserParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull MileParserParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull MileParserParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(@NotNull MileParserParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(@NotNull MileParserParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull MileParserParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull MileParserParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MileParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MileParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull MileParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull MileParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull MileParserParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MileParserParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull MileParserParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MileParserParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull MileParserParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MileParserParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull MileParserParser.AssignContext ctx);
}