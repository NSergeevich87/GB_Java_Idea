package ru.gb.oop.homework7.logger;

import ru.gb.oop.homework7.interfaces.Operations;
import ru.gb.oop.homework7.interfaces.WriterLog;

public class CalcLog implements Operations {
    private Operations readResult;
    private WriterLog log;
    public CalcLog(Operations readResult, WriterLog log){
        this.readResult = readResult;
        this.log = log;
    }
    @Override
    public Operations sum(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Number %f. Start sum with number %f", firstNum, num));
        Operations result = readResult.sum(num);
        log.log(String.format("Start sum"));
        return result;
    }

    @Override
    public Operations div(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Number %f. Start div with number %f", firstNum, num));
        Operations result = readResult.div(num);
        log.log(String.format("Start div"));
        return result;
    }

    @Override
    public Operations mult(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Number %f. Start mult with number %f", firstNum, num));
        Operations result = readResult.mult(num);
        log.log(String.format("Start mult"));
        return result;
    }

    @Override
    public Operations menos(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Number %f. Start menos with number %f", firstNum, num));
        Operations result = readResult.menos(num);
        log.log(String.format("Start menos"));
        return result;
    }

    @Override
    public double getResult() {
        double result = readResult.getResult();
        log.log(String.format("Result %f", result));
        return result;
    }
}
