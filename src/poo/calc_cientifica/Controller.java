package poo.calc_cientifica;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    private ScientificCalculator scCalculator;
    @FXML
    private Label lblResultado;
    @FXML
    private Label lblOperaciones;

    @FXML
    private void onClickBtn0() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_0);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn1() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_1);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn2() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_2);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn3() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_3);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn4() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_4);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn5() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_5);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn6() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_6);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn7() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_7);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn8() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_8);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtn9() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_9);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtnBorrar() throws Exception {
        scCalculator.removeLastItem();
        this.lblResultado.setText(this.scCalculator.cadComp);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtnPunto() throws Exception {
        this.scCalculator.onClickOperand(Calculator.KEY_POINT);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
    }

    @FXML
    private void onClickBtnResul() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_EQ);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnMulti() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_MUL);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);

    }

    @FXML
    private void onClickBtnRestar() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_SUB);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnSumar() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_ADD);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnDividir() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_DIV);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnParentAbier() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_POP);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnParentCerr() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_PCL);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnSen() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_SEN);
        this.scCalculator.onClickOperator(Calculator.KEY_POP);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnCos() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_COS);
        this.scCalculator.onClickOperator(Calculator.KEY_POP);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @FXML
    private void onClickBtnTan() throws Exception {
        this.scCalculator.onClickOperator(Calculator.KEY_TAN);
        this.scCalculator.onClickOperator(Calculator.KEY_POP);
        this.lblOperaciones.setText(this.scCalculator.cadTemp);
        this.lblResultado.setText(this.scCalculator.cadComp);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.lblResultado.setText("");
        this.lblOperaciones.setText("");
        this.scCalculator = new ScientificCalculator();
    }
}
