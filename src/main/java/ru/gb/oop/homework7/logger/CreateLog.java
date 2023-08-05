package ru.gb.oop.homework7.logger;

import ru.gb.oop.homework7.calculator.Calculator;
import ru.gb.oop.homework7.interfaces.CreateCalc;
import ru.gb.oop.homework7.interfaces.Operations;
import ru.gb.oop.homework7.interfaces.WriterLog;

public class CreateLog implements CreateCalc {
    private WriterLog writerLog;
    public CreateLog(WriterLog writerLog){
        this.writerLog = writerLog;
    }
    @Override
    public Operations create(double num) {
        return new CalcLog(new Calculator(num), writerLog);
    }
}
