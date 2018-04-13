package com.company;

import com.company.operations.Addition;

import java.util.List;
import java.util.Scanner;

public class Interactor {
    private Calculator calc;
    private Parser pars;

    public Interactor(Calculator calc, Parser pars) {
        this.calc = calc;
        this.pars = pars;
    }

    public void displayOperations(){
    }

    public void run(){
        Scanner scn = new Scanner(System.in);
        List<String> tokens;
        String str="";
        System.out.println("Welcome!\n");
        help();
        while (!(str.equals("q"))){

            str = scn.nextLine();
            if(str.equals("h")){
                help();
            }
            else
                if(!(str.equals("q"))) {
                    tokens = pars.parse(str);
                    System.out.println(">>\t"+calc.execute(tokens));
                }
                else {
                    System.out.printf("Calculator is quitting. Good bye");
                    break;
                }
        }
    }

    public Calculator getCalc() {
        return calc;
    }

    public Parser getPars() {
        return pars;
    }

    public void help() {
        List<String> operations = this.calc.getOperationsInfo();
        System.out.println("RPNCalculator help\nThe folowing operations are supported:");
        operations.forEach(op -> System.out.println("\t"+op));
        System.out.println("\nEnter \'h\' to get help.\nEnter \'q\' to exit the program.");
    }
}
