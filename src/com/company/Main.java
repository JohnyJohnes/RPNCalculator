package com.company;

import com.company.operations.*;

public class Main {

    public static void main(String[] args) throws ExpressionFormatException {
        RPNCalculator calc = new RPNCalculator();
        calc.addOperation(new Addition());
        calc.addOperation(new Subtraction());
        calc.addOperation(new Multiplication());
        calc.addOperation(new Devision());
        calc.addOperation(new Cos());
        calc.addOperation(new SquareRoot());
        calc.addOperation(new Tan());
        calc.addOperation(new Sin());
        calc.addOperation(new Log());
        calc.addOperation(new Mod());
        calc.addOperation(new Exp());

        Parser parser = new Parser(calc.getOperators());
        Interactor interactor = new Interactor(calc, parser);

        interactor.run();

    }
}
