package com.calculadora;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    String operation = "";
    String operationSymbol = "";

    @FXML
    private Label resultLabel;

    @FXML
    public void addOne() {
        operation = operation + "1";
        System.out.println(operation);
    }

    @FXML
    public void addTwo() {
        operation = operation + "2";
    }

    @FXML
    public void addThree() {
        operation = operation + "3";
    }

    @FXML
    public void addFour() {
        operation = operation + "4";
    }

    @FXML
    public void addFive() {
        operation = operation + "5";
    }

    @FXML
    public void addSix() {
        operation = operation + "6";
    }

    @FXML
    public void addSeven() {
        operation = operation + "7";
    }

    @FXML
    public void addEight() {
        operation = operation + "8";
    }

    @FXML
    public void addNine() {
        operation = operation + "9";
    }

    @FXML
    public void addZero() {
        operation = operation + "0";
    }

    @FXML
    public void addSubstract() {
        operation = operation + "-";
        operationSymbol = "-";
    }

    @FXML
    public void addPlus() {
        operation = operation + "+";
        operationSymbol = "+";
    }

    @FXML
    public void addDivider() {
        operation = operation + "/";
        operationSymbol = "/";
    }

    @FXML
    public void addMultiply() {
        operation = operation + "*";
        operationSymbol = "*";
    }

    @FXML
    public void executeOperation() {

        Integer num1 = 0;
        Integer num2 = 0;
        Integer result = 0;
        String[] parts;

        switch (operationSymbol) {
            case "-":
                parts = operation.split("\\-");
                num1 = Integer.parseInt(parts[0].trim());
                num2 = Integer.parseInt(parts[1].trim());
                result = num1 - num2;
                break;

            case "+":
                parts = operation.split("\\+");
                num1 = Integer.parseInt(parts[0].trim());
                num2 = Integer.parseInt(parts[1].trim());
                result = num1 + num2;
                break;

            case "/":
                parts = operation.split("\\/");
                num1 = Integer.parseInt(parts[0].trim());
                num2 = Integer.parseInt(parts[1].trim());
                result = num1 / num2;
                break;
            case "*":
                parts = operation.split("\\*");
                num1 = Integer.parseInt(parts[0].trim());
                num2 = Integer.parseInt(parts[1].trim());
                result = num1 * num2;
                break;
            default:
                break;
        }

        resultLabel.setText(String.valueOf(result));
    }
}
