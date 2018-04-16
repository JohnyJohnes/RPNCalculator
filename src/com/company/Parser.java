package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    private List<String> supportedOPS;

    public Parser(List<String> operators) {
        this.supportedOPS = operators;
    }

    private boolean isNumber(String token){
        try{
            double dummy = Double.valueOf(token);
        }catch(NumberFormatException ex){
            return false;
        }
        return true;

    }

    public List<String> parse(String command) throws ExpressionFormatException {

        String[] comp = command.split("\\s+");


        if (!(Arrays.stream(comp).allMatch(c-> isNumber(c) || supportedOPS.stream().anyMatch(op-> op.equals(c)))  )) {
            throw new ExpressionFormatException("ODYMAYSYA, TYT OSHIBKA BLET!");
        }

//        for(String s : comp){
//            if (!isNumber(s)){
//                if (!supportedOPS.contains(s)){
//                    throw
//                }
//            }
//        }

        return Arrays.stream(comp).map(String::trim).collect(Collectors.toList());


       // return new ArrayList<>(Arrays.asList(comp));
    }
}
