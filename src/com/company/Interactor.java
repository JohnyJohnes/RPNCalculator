package com.company;

import com.company.operations.Addition;

import java.util.List;
import java.util.Scanner;

public class Interactor {
    private Calculator calc;
    private Parser pars;
    private Scanner scn = new Scanner(System.in);

    public Interactor(Calculator calc, Parser pars) {
        this.calc = calc;
        this.pars = pars;
    }

    public void displayOperations(){

    }

    public void run(){
        String input="none";
        Scanner scn = new Scanner(System.in);
        while (!input.equals("q")){
            scn.next();
        }
    }

    public Calculator getCalc() {
        return calc;
    }

    public Parser getPars() {
        return pars;
    }

    @Override
    public String toString() {
        List<String> operations = this.calc.getOperationsInfo();
        operations.forEach(op -> System.out.println(op));
        return " ";
    }
}
