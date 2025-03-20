package Main.Services;

import Main.AntlrGenerated.*;
import Main.Exceptions.*;
import Main.Exceptions.TypeConflictException;
import Main.Run;

import org.antlr.v4.runtime.tree.RuleNode;


//This class runs through the different tokens in the TokenStream, to see which input has been giving.
//Then we are able to run functions based on what token it was, and modify/run code accordingly.
//s: extraLines line | extraLines globalStatement startFunction (drawFunction | empty);
public class SparkToJavaVisitor extends bnfBaseVisitor {

    public Run run;
    private SymbolTable symbolTable;
    private CodeGenerator codeGenerator;

    public SparkToJavaVisitor(CodeGenerator codeGenerator, Run run) {
        this.codeGenerator = codeGenerator;
        this.run = run;
        this.symbolTable = new SymbolTable();
    }
    //s: extraLines line | extraLines globalStatement startFunction (drawFunction | empty);
    public RuleNode visitS (bnfParser.SContext ctx) throws RuntimeException {
        symbolTable.CreateScope();

        //If the code uses visual features
        if (ctx.startFunction() != null){

            if(ctx.globalStatement().empty() == null) {
                ctx.globalStatement().accept(this);
            }

            ctx.startFunction().accept(this);

            if(ctx.drawFunction() != null) {
                ctx.drawFunction().accept(this);
            }

        //if the code doesn't use visual features
        } else {
            //Increases the indentation in the output file, to put the code inside the constructor
            codeGenerator.indentation++;

            ctx.line().accept(this);

            codeGenerator.indentation--;
            codeGenerator.appendStrToFile("}\n");
        }

        symbolTable.RemoveScope(); // closes the scope such that it is no longer accessible

        return ctx;
    }

    //startFunction: 'on' 'start' block forcedLineChange globalStatement
    public RuleNode visitStartFunction(bnfParser.StartFunctionContext ctx) throws RuntimeException {

        codeGenerator.appendStrToFile("public void setup() {\n");

        symbolTable.CreateScope(); // creates a new scope
        codeGenerator.indentation++;

        codeGenerator.appendStrToFile("frameRate(60); //Sets the framerate.\n");

        ctx.block().line().accept(this);

        codeGenerator.indentation--;
        codeGenerator.appendStrToFile("}\n\n");
        symbolTable.RemoveScope(); // closes the scope such that it is no longer accessible

        if(ctx.globalStatement().empty() == null) {
            ctx.globalStatement().accept(this);
        }

        return ctx;
    }

    public RuleNode visitDrawFunction(bnfParser.DrawFunctionContext ctx) throws RuntimeException {

        codeGenerator.appendStrToFile("public void draw() {\n");

        symbolTable.CreateScope(); // creates a new scope
        codeGenerator.indentation++;

        ctx.block().line().accept(this);

        codeGenerator.indentation--;
        codeGenerator.appendStrToFile("}\n");
        symbolTable.RemoveScope(); // closes the scope such that it is no longer accessible

        if(ctx.globalStatement().empty() == null) {
            ctx.globalStatement().accept(this);
        }
        return ctx;
    }

    //globalStatement: declaration forcedLineChange globalStatement | empty
    public RuleNode visitGlobalStatement(bnfParser.GlobalStatementContext ctx) throws RuntimeException {

        //As the scope has already been open in visitS,
        //and as that is the outmost scope, as in the global scope,
        //will we just use that scope instead of opening a new one.
        ctx.declaration().accept(this);

        //As there can be multiple global statements after each other,
        //it is then possible for globalStatement to call itself.
        //Though it first checks if the child is empty before, so we don't get at null error.
        if(ctx.globalStatement().empty() == null) {
            ctx.globalStatement().accept(this);
        }
        return ctx;
    }

    public RuleNode visitLine (bnfParser.LineContext ctx) throws RuntimeException {

        //line: statement lineChange line | variableStatement lineChange line | ;

        if(ctx.getChildCount() > 0) {
            for (int i = 0; i < ctx.getChildCount(); i++){
                ctx.getChild(i).accept(this);
            }
        }

        //Den skal vide hvem den skal acceptere, returnerer hvem der skal accepteres til bnfParser accept function
        return ctx;
    }

    public RuleNode visitVariableStatement(bnfParser.VariableStatementContext ctx) throws RuntimeException {

        for (int i = 0; i < ctx.getChildCount(); i++){
            ctx.getChild(i).accept(this);
        }

        return ctx;
    }

    public RuleNode visitVisualStatement(bnfParser.VisualStatementContext ctx) throws RuntimeException {

        //Since this can only have single child, does it not need any special code.
        ctx.getChild(0).accept(this);

        return ctx;
    }
    //figure: 'circle' parameter parameter parameter parameter | 'square' parameter parameter parameter parameter | 'triangle' parameter parameter parameter parameter parameter parameter;
    public RuleNode visitFigure(bnfParser.FigureContext ctx) throws RuntimeException {

        switch (ctx.getChild(0).getText()) {
            case "circle" -> codeGenerator.appendStrToFile("ellipse(");
            case "square" -> codeGenerator.appendStrToFile("rect(");
            case "triangle" -> codeGenerator.appendStrToFile("triangle(");
            default -> System.out.println("NULL" + ctx.getChild(0).getText());
        }

        //loops through all the parameters.
        for (int i = 1; i < ctx.getChildCount(); i++){
            ctx.getChild(i).accept(this);
            if(i != ctx.getChildCount() - 1) {
                codeGenerator.appendStrToFile(", ");
            }
        }

        codeGenerator.appendStrToFile(");\n");

        return ctx;
    }

    public RuleNode visitColorPick(bnfParser.ColorPickContext ctx) throws RuntimeException {

        switch (ctx.getChild(0).getText()) {
            case "color" -> codeGenerator.appendStrToFile("fill(");
            case "background" -> codeGenerator.appendStrToFile("background(");
            default -> System.out.println("NULL" + ctx.getChild(0).getText());
        }

        //If the user chose to just write a color name, instead of RGB values.
        if (ctx.colorText() != null){

            //Switch case to check which color is wished.
            switch (ctx.getChild(1).getText()) {
                case "darkRed" -> codeGenerator.appendStrToFile("120, 0, 0");
                case "red" -> codeGenerator.appendStrToFile("200, 0, 0");
                case "lightRed" -> codeGenerator.appendStrToFile("255, 0, 0");

                case "darkGreen" -> codeGenerator.appendStrToFile("0, 120, 0");
                case "green" -> codeGenerator.appendStrToFile("0, 200, 0");
                case "lightGreen" -> codeGenerator.appendStrToFile("0, 255, 0");

                case "darkBlue" -> codeGenerator.appendStrToFile("0, 0, 120");
                case "blue" -> codeGenerator.appendStrToFile("0, 0, 200");
                case "lightBlue" -> codeGenerator.appendStrToFile("0, 0, 255");

                case "black" -> codeGenerator.appendStrToFile("0, 0, 0");
                case "white" -> codeGenerator.appendStrToFile("255, 255, 255");

                case "darkGrey" -> codeGenerator.appendStrToFile("50, 50, 50");
                case "grey" -> codeGenerator.appendStrToFile("120, 120, 120");
                case "lightGrey" -> codeGenerator.appendStrToFile("200, 200, 200");
                default -> System.out.println("NULL" + ctx.getChild(0).getText());
            }

        //If the user chose RGB values.
        } else {

            //Loops through all the parameters.
            for (int i = 1; i < ctx.getChildCount(); i++) {
                ctx.getChild(i).accept(this);
                if (i != ctx.getChildCount() - 1) {
                    codeGenerator.appendStrToFile(", ");
                }
            }
        }

        codeGenerator.appendStrToFile(");\n");

        return ctx;
    }

    public RuleNode visitParameter(bnfParser.ParameterContext ctx) throws RuntimeException {

        //If the parameter is a classic number
        if(ctx.expression() != null){
            ctx.expression().accept(this);

        //If the parameter is an ID
        } else {
            //Checks if the ID exist
            if (!symbolTable.VariableIsInScope(ctx.ID().getText())){
                throw new VariableNotInScopeException((RuleNode) ctx);
            }
            //Checks if the ID is a number
            if(symbolTable.FindVariableValue(ctx.ID().getText()).getDeclarationNode().getChild(0).getText().equals("text")){
                throw new TypeConflictException(assignmentName,"number", "text");
            }

            codeGenerator.appendStrToFile(ctx.ID().getText());

        }

        return ctx;
    }

    public RuleNode visitDeclaration(bnfParser.DeclarationContext ctx) throws RuntimeException {


        // name, type and declarationNode gets added to the scope
        symbolTable.AddToScope(new VarRef(ctx.ID().getText(), ctx.getChild(0).getText(), ctx));

        //declaration: 'number' ID '=' equation | 'text' ID '=' stringValue;

        //If it is a number declaration
        if(ctx.getChild(0).getText().equals("number")){

            codeGenerator.appendStrToFile("float ");
            codeGenerator.appendStrToFile(ctx.getChild(1).getText());
            codeGenerator.appendStrToFile(" = ");
            ctx.equation().accept(this);
            codeGenerator.appendStrToFile(";\n");

        //If it is a text declaration
        } else if(ctx.getChild(0).getText().equals("text")){

            codeGenerator.appendStrToFile("String ");
            codeGenerator.appendStrToFile(ctx.getChild(1).getText());
            codeGenerator.appendStrToFile(" = ");
            ctx.stringValue().accept(this);
            codeGenerator.appendStrToFile(";\n");

        }

        return ctx;

    }

    private String assignmentType = "Number";
    private String assignmentName = "";

    //assignment: ID '=' equation | ID '=' stringValue;
    public RuleNode visitAssignment(bnfParser.AssignmentContext ctx) throws RuntimeException {


        if (!symbolTable.VariableIsInScope(ctx.ID().getText())){
            throw new VariableNotInScopeException((RuleNode) ctx);
        }

        //We keep track of the key value, to see if the assignment type is wrong in the value visitor.
        assignmentType = symbolTable.FindVariableValue(ctx.ID().getText()).getType();
        assignmentName = ctx.ID().getText();

        codeGenerator.appendStrToFile(ctx.ID().getText());
        codeGenerator.appendStrToFile(" = ");
        ctx.value().accept(this);
        codeGenerator.appendStrToFile(";\n");

        return ctx;

    }
    //value: ID extraValue | expression extraValue | stringCheckRule extraValue | '(' value ')' extraValue
    public RuleNode visitValue(bnfParser.ValueContext ctx) throws RuntimeException {

        //Checks if the ID is type 'number' and assigning a String to that type.
        if(assignmentType.equals("number") && ctx.getChild(0).getClass() == bnfParser.StringCheckRuleContext.class){
            throw new TypeConflictException(assignmentName,"number", "text");
        }

        //if the original ID is set to another ID, it checks if they align
        if(ctx.ID() != null){

            //Checks if the ID exist
            if (!symbolTable.VariableIsInScope(ctx.ID().getText())){
                throw new VariableNotInScopeException((RuleNode) ctx);
            }
            //Checks if the ID is a number
            if(symbolTable.FindVariableValue(ctx.ID().getText()).getDeclarationNode().getChild(0).getText() == "text" && assignmentType == "number"){
                throw new TypeConflictException(assignmentName,"number", "text");
            }

            codeGenerator.appendStrToFile(ctx.ID().getText());

        } else if(ctx.expression() != null) {

            ctx.expression().accept(this);

        } else if(ctx.stringCheckRule() != null){

            codeGenerator.appendStrToFile(ctx.getChild(0).getText());

        } else {

            codeGenerator.appendStrToFile("(");
            ctx.value().accept(this);
            codeGenerator.appendStrToFile(")");

        }

        if(ctx.extraValue().empty() == null) {
            ctx.extraValue().accept(this);
        }
        return ctx;
    }

    //extraValue: '+' value | operator value | empty
    public RuleNode visitExtraValue(bnfParser.ExtraValueContext ctx) throws RuntimeException {

        //Checks if the ID is type 'text' and using a wrong operator for that type.
        if(assignmentType.equals("text") && ctx.getChild(0).getClass() == bnfParser.OperatorContext.class){
            throw new TypeConflictException(assignmentName,"text", "number");
        }

        codeGenerator.appendStrToFile(" " + ctx.getChild(0).getText() + " ");

        ctx.value().accept(this);

        return ctx;
    }

    public RuleNode visitElseToken(bnfParser.ElseTokenContext ctx) throws RuntimeException {

        //elseToken: 'else if' condition blok linebreak elseToken | 'else' blok | ;

        if(ctx.getChildCount()<= 0){
            return ctx;
        }

        switch (ctx.getChild(0).getText()) {
            case "else if" -> {
                codeGenerator.appendStrToFile("else if (");
                ctx.condition().accept(this); // visits condition
                codeGenerator.appendStrToFile(") ");
                ctx.block().accept(this); // visits blok
                ctx.elseToken().accept(this); // visits else
            }
            case "else" -> {
                codeGenerator.appendStrToFile("else ");
                ctx.block().accept(this); // visits blok
            }
        }
        return ctx;

    }

    public RuleNode visitStatement(bnfParser.StatementContext ctx) throws RuntimeException {

        //statement: 'if' condition blok linebreak elseToken | 'while' condition loopBlok | 'print' stringValue | 'printLine' stringValue;

        switch (ctx.getChild(0).getText()) {
            case "if" -> {
                codeGenerator.appendStrToFile("if(");
                ctx.condition().accept(this); // visits condition
                codeGenerator.appendStrToFile(") ");
                ctx.block().accept(this); // visits blok
                ctx.elseToken().accept(this); // visits else
            }
            case "while" -> {
                codeGenerator.appendStrToFile("while(");
                ctx.condition().accept(this);
                codeGenerator.appendStrToFile(") ");
                ctx.loopBlock().accept(this);
            }
            case "print" -> {
                codeGenerator.appendStrToFile("System.out.print(");
                ctx.stringValue().accept(this);
                codeGenerator.appendStrToFile(");\n");
            }
            case "printLine" -> {
                codeGenerator.appendStrToFile("System.out.println(");
                ctx.stringValue().accept(this);
                codeGenerator.appendStrToFile(");\n");
            }
            case "break" -> {
                RuleNode parentCtx = ctx.parent;

                //loops through all parents until it reaches the end is finds a loopBlock node
                while (parentCtx != null && !(parentCtx.getClass() == bnfParser.LoopBlockContext.class)){
                    parentCtx = parentCtx.getRuleContext().parent;
                }

                //Checks if the found node is a loopBlock node else throws an error
                if (parentCtx.getClass() == bnfParser.LoopBlockContext.class){
                    codeGenerator.appendStrToFile("break;\n");
                } else {
                    throw new LoopCommandException(ctx);
                }
            }
            case "continue" -> {
                RuleNode parentCtx = ctx.parent;

                //loops through all parents until it reaches the end is finds a loopBlock node
                while (parentCtx != null && !(parentCtx.getClass() == bnfParser.LoopBlockContext.class)){
                    parentCtx = parentCtx.getRuleContext().parent;
                }

                //Checks if the found node is a loopBlock node else throws an error
                if (parentCtx.getClass() == bnfParser.LoopBlockContext.class){
                    codeGenerator.appendStrToFile("continue;\n");
                } else {
                    throw new LoopCommandException(ctx);
                }
            }
            default -> {
            }
        }
        return ctx;

    }

    public RuleNode visitCondition(bnfParser.ConditionContext ctx) throws RuntimeException {

        //condition: 'not' notCondition extraCondition | equation comparator equation extraCondition | String '=' String extraCondition;

        if(ctx.getChild(0).getText().equals("not")){ //not
            codeGenerator.appendStrToFile("!");
            ctx.notCondition().accept(this);
        } else if (ctx.singleCondition() != null){
            ctx.singleCondition().accept(this);
        } else {
            codeGenerator.appendStrToFile("(");
            ctx.condition().accept(this);
            codeGenerator.appendStrToFile(")");
        }
        if(ctx.extraCondition().empty() == null) {
            ctx.extraCondition().accept(this);
        }

        return ctx;

    }

    public RuleNode visitNotCondition(bnfParser.NotConditionContext ctx) throws RuntimeException {

        //notCondition: '(' condition ')' | singleCondition;

        codeGenerator.appendStrToFile("(");
        if(ctx.getChildCount() > 1){ // if it is a condition

            ctx.condition().accept(this);

        }
        else{ // if it is a singleCondition
            ctx.singleCondition().accept(this);

        }

        codeGenerator.appendStrToFile(")");
        return ctx;

    }

    public RuleNode visitExtraCondition(bnfParser.ExtraConditionContext ctx) throws RuntimeException {

        //extraCondition: 'and' condition | 'or' condition | ;

        if (ctx.getChild(0).getText().equals("and")) { // and
            codeGenerator.appendStrToFile(" && ");
            ctx.condition().accept(this);
        } else if (ctx.getChild(0).getText().equals("or")) { // or
            codeGenerator.appendStrToFile(" || ");
            ctx.condition().accept(this);
        }

        return ctx;

    }

    public RuleNode visitSingleCondition(bnfParser.SingleConditionContext ctx) throws RuntimeException {

        if(ctx.getChildCount() > 0) {
            if (ctx.getChild(0).getClass().equals(bnfParser.EquationContext.class)) { //equation
                ctx.equation(0).accept(this);
                ctx.comparator().accept(this);
                ctx.equation(1).accept(this);
            } else { //String, hvis du skal fixes dette.. undskyld

                codeGenerator.appendStrToFile(ctx.getChild(0).getText() + ".equals(" + ctx.getChild(2).getText() + ")");
            }
        }
        return ctx;

    }

    public RuleNode visitBlock(bnfParser.BlockContext ctx) throws RuntimeException {

        //blok: 'then' lineChange line 'end';

        symbolTable.CreateScope(); // creates a new scope

        codeGenerator.appendStrToFile("{\n");
        codeGenerator.indentation++;

        ctx.line().accept(this);

        codeGenerator.indentation--;
        codeGenerator.appendStrToFile("}\n");

        symbolTable.RemoveScope(); // closes the scope such that it is no longer accessible

        //Den skal vide hvem den skal acceptere, returnerer hvem der skal accepteres til bnfParser accept function
        return ctx;

    }

    public RuleNode visitLoopBlock(bnfParser.LoopBlockContext ctx) throws RuntimeException {

        symbolTable.CreateScope(); // creates a new scope

        //loopBlok: 'do' lineChange loopLine 'end';
        codeGenerator.appendStrToFile("{\n");
        codeGenerator.indentation++;

        ctx.line().accept(this);

        codeGenerator.indentation--;
        codeGenerator.appendStrToFile("}\n");

        symbolTable.RemoveScope(); // closes the scope such that it is no longer accessible


        //Den skal vide hvem den skal acceptere, returnerer hvem der skal accepteres til bnfParser accept function
        return ctx;

    }

    public RuleNode visitComparator(bnfParser.ComparatorContext ctx) throws RuntimeException {

        //comparator: '<' | '>' | '=' | '<=' | '>=';

        switch (ctx.getText()) {
            case "<" -> codeGenerator.appendStrToFile(" < ");
            case ">" -> codeGenerator.appendStrToFile(" > ");
            case "=" -> codeGenerator.appendStrToFile(" == ");
            case "<=" -> codeGenerator.appendStrToFile(" <= ");
            case ">=" -> codeGenerator.appendStrToFile(" >= ");
            default -> System.out.println("NULL" + ctx.getText());
        }

        return ctx;
    }

    public RuleNode visitOperator(bnfParser.OperatorContext ctx) throws RuntimeException {
        //operator: '+' | '-' | '%' | '/' | '*';

        switch (ctx.getText()) {
            case "+" -> codeGenerator.appendStrToFile(" + ");
            case "-" -> codeGenerator.appendStrToFile(" - ");
            case "%" -> codeGenerator.appendStrToFile(" % ");
            case "/" -> codeGenerator.appendStrToFile(" / ");
            case "*" -> codeGenerator.appendStrToFile(" * ");
            default -> System.out.println("NULL" + ctx.getText());
        }

        return ctx;
    }

    public RuleNode visitDecimal(bnfParser.DecimalContext ctx) throws RuntimeException {

        //decimal: '.' Digit | ;

        codeGenerator.appendStrToFile(".");
        codeGenerator.appendStrToFile(ctx.Digits().getText());
        codeGenerator.appendStrToFile("f");

        return ctx;

    }

    public RuleNode visitEquation(bnfParser.EquationContext ctx) throws RuntimeException {

        //equation: '(' equation ')' extraEquation | ID extraEquation | expression extraEquation;

        //if it is the second subruleset
        if (ctx.ID() != null) {

            //Checks if the ID exist
            if (!symbolTable.VariableIsInScope(ctx.ID().getText())){
                throw new VariableNotInScopeException((RuleNode) ctx);
            }
            //Checks if the ID is a number
            if(symbolTable.FindVariableValue(ctx.ID().getText()).getDeclarationNode().getChild(0).getText().equals("text")){
                throw new TypeConflictException(assignmentName,"number", "text");
            }

            codeGenerator.appendStrToFile(ctx.ID().getText());

            //if it is the third/last subruleset
        } else if (ctx.expression() != null) {
            ctx.expression().accept(this);

            //if it is the first subruleset
        } else if (ctx.getChild(0).getText().equals("(")){

            codeGenerator.appendStrToFile(")");
            ctx.equation().accept(this);
            codeGenerator.appendStrToFile(")");
        }

        if(ctx.extraEquation().empty() == null) {
            ctx.extraEquation().accept(this);
        }
        return ctx;

    }

    public RuleNode visitExtraEquation(bnfParser.ExtraEquationContext ctx) throws RuntimeException {

        //extraEquation: operator equation | ;

        if (ctx.getChildCount() == 2){
            ctx.operator().accept(this);
            ctx.equation().accept(this);
        }

        return ctx;
    }

    public RuleNode visitExpression(bnfParser.ExpressionContext ctx) throws RuntimeException {

        //expression: '-' num | num;

        //If it is the first subruleset
        if (ctx.getChildCount() == 2){

            codeGenerator.appendStrToFile("-");
            ctx.num().accept(this);

            //If it is the second/last subruleset
        } else if (ctx.getChildCount() == 1){

            ctx.num().accept(this);

        }

        return ctx;

    }

    public RuleNode visitNum(bnfParser.NumContext ctx) throws RuntimeException {

        //num: Digit decimal;
        codeGenerator.appendStrToFile(ctx.Digits().getText());

        if(ctx.decimal().empty() == null) {
            ctx.decimal().accept(this);
        }

        return ctx;

    }

    public RuleNode visitStringValue(bnfParser.StringValueContext ctx) throws RuntimeException {

        //stringValue: ID extraStringValue | String extraStringValue;

        //If it is the first subruleset
        if (ctx.ID() != null){

            if (!symbolTable.VariableIsInScope(ctx.ID().getText())){
                throw new VariableNotInScopeException((RuleNode) ctx);
            }

            codeGenerator.appendStrToFile(ctx.ID().getText());
            if(ctx.extraStringValue().empty() == null) {
                ctx.extraStringValue().accept(this);
            }

            //If it is the second/last subruleset
        } else {

            codeGenerator.appendStrToFile(ctx.getChild(0).getText());
            if(ctx.extraStringValue().empty() == null) {
                ctx.extraStringValue().accept(this);
            }
        }

        return ctx;

    }

    public RuleNode visitExtraStringValue(bnfParser.ExtraStringValueContext ctx) throws RuntimeException {

        //extraStringValue: '+' stringValue | ;
        if(ctx.getChildCount() > 0) {
            codeGenerator.appendStrToFile(" + ");
            ctx.stringValue().accept(this);
        }

        return ctx;

    }

}
