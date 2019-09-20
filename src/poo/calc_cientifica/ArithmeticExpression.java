package poo.calc_cientifica;

import java.util.ArrayList;
import java.util.Stack;

public class ArithmeticExpression {
    //Pilas necesarias
    private Stack<String> operandsStack;
    private Stack<Character> operatorsStack;
    private ArrayList<String> expr;
    private ArrayList<String> exprPostFix;


    public ArithmeticExpression() {
        this.operandsStack = new Stack<>();
        this.operatorsStack = new Stack<>();
        this.expr = new ArrayList<>();
        this.exprPostFix = new ArrayList<>();
    }

    public void addItem(String item) {
        this.expr.add(item);
    }

    public Stack<String> getOperandsStack() {
        return operandsStack;
    }

    public void setOperandsStack(Stack<String> operandsStack) {
        this.operandsStack = operandsStack;
    }

    public Stack<Character> getOperatorsStack() {
        return operatorsStack;
    }

    public void setOperatorsStack(Stack<Character> operatorsStack) {
        this.operatorsStack = operatorsStack;
    }

    public ArrayList<String> getExpr() {
        return expr;
    }

    public void setExpr(ArrayList<String> expr) {
        this.expr = expr;
    }

    public static boolean isOperator(Character key) {
        return (Calculator.KEY_SUB == key ||
                Calculator.KEY_ADD == key ||
                Calculator.KEY_MUL == key ||
                Calculator.KEY_DIV == key ||
                Calculator.KEY_SEN == key ||
                Calculator.KEY_COS == key ||
                Calculator.KEY_TAN == key ||
                Calculator.KEY_LN == key ||
                Calculator.KEY_LOG == key ||
                Calculator.KEY_SQRT == key ||
                Calculator.KEY_POW == key ||
                Calculator.KEY_POP == key ||
                Calculator.KEY_PCL == key ||
                Calculator.KEY_FACT == key
        );
    }

    private void pushToStackOperator(Character item) {
        if (!this.operatorsStack.isEmpty())
            if (Calculator.getPriority(item)
                    > Calculator.getPriority(this.operatorsStack.lastElement()))
                this.operatorsStack.push(item);
            else {
                if (this.operatorsStack.size() > 0) {
                    Character cimaPila = this.operatorsStack.pop();
                    this.exprPostFix.add(cimaPila.toString());
                    pushToStackOperator(item);
                }
            }
    }

    //4
    private void getNotParentesis() {
        if (!this.operatorsStack.isEmpty()) {
            this.expr.add(this.operatorsStack.pop().toString());
            if (!this.operatorsStack.empty()) {
                if (this.operatorsStack.lastElement() == Calculator.KEY_POP)
                    this.operatorsStack.pop();
                else
                    getNotParentesis();
            }
        }
    }

    public void emptyExpression() {
//        this.expr.empty();
        this.expr.clear();
//        this.operatorsStack.empty();
//        this.operandsStack.empty();
    }

    public void toPostFix() {
        for (String item : this.expr) {
            if (!item.isEmpty()) {
//                System.out.println(item);
                if (ArithmeticExpression.isOperator(item.charAt(0))) {
//                    System.out.println("Es un operador");
                    if (item.charAt(0) == Calculator.KEY_PCL) {
                        getNotParentesis();
                    } else {
                        if (this.getOperatorsStack().isEmpty())
                            this.getOperatorsStack().push(item.charAt(0));
                        else {
                            pushToStackOperator(item.charAt(0));
                        }
                    }
                    this.pushToStackOperator(item.charAt(0));
                } else {
                    this.exprPostFix.add(item);
//                    System.out.println("Es un operando");
                }
//                this.pushToStackOperator(item);
            }
        }
        while (this.getOperatorsStack().size() > 0)
            this.exprPostFix.add(this.getOperatorsStack().pop().toString());
        System.out.println(this.exprPostFix.toString());
//        System.out.println(this.getOperatorsStack().toString());
        this.exprPostFix = new ArrayList<>();
        this.setOperatorsStack(new Stack<Character>());
    }

    public void removeLastItem() {
        if (this.expr.size() > 0)
            this.expr.remove(this.expr.size() - 1);
    }
}
