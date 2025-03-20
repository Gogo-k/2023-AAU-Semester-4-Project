package Main.Services;

import Main.AntlrGenerated.bnfBaseVisitor;
import Main.AntlrGenerated.bnfParser;
import Main.Exceptions.ProcessingConflictException;
import Main.Exceptions.UnexpectedDeclarationException;
import org.antlr.v4.runtime.tree.ErrorNode;

public class TopVisitor extends bnfBaseVisitor {

    private CodeGenerator codeGenerator;
    private boolean startFunction = false;
    private boolean drawFunction = false;
    private boolean visualStatement = false;

    public TopVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    //s: extraLines line | extraLines globalStatement startFunction (drawFunction | empty)
    public Object visitS (bnfParser.SContext ctx){

        //If the code has an 'on start' function
        if(ctx.startFunction() != null){
            ctx.startFunction().accept(this);

            //As the 'on eachFrame' function isn't required, it doesn't have to run
            if(ctx.drawFunction() != null) {
                ctx.drawFunction().accept(this);
            }
            codeGenerator.createFile(false); //false indicates processing is used, and it should not create a standard file

        //If the code doesn't have an 'on start' function
        } else {
            ctx.line().accept(this);
            codeGenerator.createFile(true); //true indicates that a standard file should be created
        }

        //In case any visual features has been used, but the 'on start' function isn't implemented
        if((visualStatement && !startFunction) || (drawFunction && !startFunction)){
            throw new ProcessingConflictException(ctx);
        }
        return this;
    }

    public Object visitStartFunction(bnfParser.StartFunctionContext ctx) {
        startFunction = true;
        return this;
    }

    public Object visitDrawFunction(bnfParser.DrawFunctionContext ctx) {
        drawFunction = true;
        return this;
    }

    public Object visitVisualStatement(bnfParser.VisualStatementContext ctx) {
        visualStatement = true;
        return this;
    }

    public Object visitErrorNode(ErrorNode node){

        // 59 refers to the Errorsymbol terminal in the bnf
        // if the node is not an Errorsymbol
        if(node.getSymbol().getType() != 59){
            return this;
        }

        //Switch case for which error it is
        switch (node.getParent().getClass().getName()){
            case "Main.AntlrGenerated.bnfParser$DeclarationContext":
                throw new UnexpectedDeclarationException(node);
            case "Main.AntlrGenerated.bnfParser$ConditionContext":
                System.out.println("Needs to throw error, has not been implemented yet.");
                break;
            case "Main.AntlrGenerated.bnfParser$AssignmentContext":
                System.out.println("Needs to throw error, has not been implemented yet.");
                break;
        }

        return this;
    }


}
