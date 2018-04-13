package com.company;

import com.company.operations.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ExpressionFormatException{
	    RPNCalculator calc = new RPNCalculator();
        Parser parser = new Parser(calc.getOperators());
        Interactor interactor=new Interactor(calc,parser);

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

        interactor.run();

    }
}
