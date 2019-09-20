package poo.calc_cientifica;

public class ScientificCalculator extends Calculator {
    private ArithmeticExpression expression;
    private int countPar;

    public ScientificCalculator() {
        this.expression = new ArithmeticExpression();
        this.cadComp = "";
        this.cadTemp = "";
        this.isPoint = false;
        this.countPar = 0;
    }

    public ArithmeticExpression getExpression() {
        return expression;
    }

    public void setExpression(ArithmeticExpression expression) {
        this.expression = expression;
    }

    @Override
    public Character onClickOperand(Character key) throws Exception {
        System.out.println("key pressed " + key);
        if (this.cadTemp.length() >= Calculator.MAX_LENGTH)
            throw new Exception("Max length: " + Calculator.MAX_LENGTH);

        switch (key) {
            case Calculator.KEY_POINT:
                if (!this.isPoint && this.cadTemp.length() > 0) {
                    this.cadTemp += Calculator.KEY_POINT;
                    this.isPoint = true;
                }
                break;
            case Calculator.KEY_0:
                this.cadTemp += (this.cadTemp.length() > 0)
                        ? Calculator.KEY_0 : "";
                break;
            default:
                this.cadTemp += key;
        }

        return key;
    }

    @Override
    public Character onClickOperator(Character key) throws Exception {
        System.out.println("Key pressed " + key);
        if (!this.cadTemp.isEmpty()) {
            addKeyToExpression(key);
        } else {
            if (Calculator.KEY_EQ == key) {
                this.expression.toPostFix();
//                System.out.println(this.expression.getExpr().toString());
//                System.out.println(this.expression.getOperatorsStack().toString());
                this.expression.emptyExpression();
                this.cadTemp = "";
                this.cadComp = "";
            } else {
                if (key == Calculator.KEY_POP) {
                    this.countPar++;
                    this.cadComp += this.cadTemp + key;
                    this.expression.addItem(key.toString());
                } else if (key == Calculator.KEY_PCL) {
                    if (this.countPar > 0) {
                        this.countPar--;
                        this.cadComp += this.cadTemp + key;
                        this.expression.addItem(key.toString());
                    } else
                        System.err.println("Can't add )");
                } else {
                    if (!this.expression.getExpr().isEmpty()) {
//                        System.out.println();
                        System.out.println(
                                this.expression.getExpr().get(this.expression.getExpr().size() - 1).charAt(0));
                        if (this.expression.getExpr().get(this.expression.getExpr().size() - 1).charAt(0)
                                == Calculator.KEY_PCL)
                            this.addKeyToExpression(key);
                        else {

                            this.addKeyToExpression(key);
                        }
                    } else
                        System.err.println("Operator invalid");
                }
            }
        }
        return key;
    }

    private void addKeyToExpression(Character key) {
        if (key == Calculator.KEY_POP)
            System.err.println("Can't add (");
        else {
            if (this.cadTemp.length() > 0)
                if (this.cadTemp.charAt(this.cadTemp.length() - 1) == Calculator.KEY_POINT) {
                    System.err.println("Number invalid (No end with POINT)");
                }
            //ADD KEY OPERATOR
            this.expression.addItem(this.cadTemp);
            if (Calculator.KEY_EQ == key) {
                this.expression.toPostFix();
//                    this.cadComp += this.cadTemp;
//                System.out.println(this.expression.getExpr().toString());
//                System.out.println(this.expression.getOperatorsStack().toString());
                this.expression.emptyExpression();
                this.cadTemp = "";
                this.cadComp = "";
            } else {
                this.cadComp += this.cadTemp + key;
                this.expression.addItem(key.toString());
            }
            this.cadTemp = "";
            this.isPoint = false;
        }
    }

    public void removeLastItem() {
        if (this.cadTemp.length() > 0) {
            this.cadTemp = "";
            this.isPoint = false;
        } else {
            this.cadTemp = "";
            this.isPoint = false;
            this.expression.removeLastItem();
            this.cadComp = "";
            for (String item : expression.getExpr()) {
                this.cadComp.concat(item);
            }
        }
    }
}
