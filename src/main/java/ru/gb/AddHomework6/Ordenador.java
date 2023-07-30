package ru.gb.AddHomework6;

public class Ordenador{
    private Integer quantityOfCores;
    private Integer spaceSSD;
    private Integer sizeRAM;
    private Double displaySize;
    public Ordenador(double displaySize, int quantityOfCores, int sizeRAM, int spaceSSD){
        this.displaySize = displaySize;
        this.quantityOfCores = quantityOfCores;
        this.sizeRAM = sizeRAM;
        this.spaceSSD = spaceSSD;
    }

    public int getQuantityOfCores() {
        return quantityOfCores;
    }

    public void setQuantityOfCores(int quantityOfCores) {
        this.quantityOfCores = quantityOfCores;
    }

    public int getSpaceSSD() {
        return spaceSSD;
    }

    public void setSpaceSSD(int spaceSSD) {
        this.spaceSSD = spaceSSD;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Ordenador: " +
                "размер дисплея " + displaySize +
                ", количество ядер " + quantityOfCores +
                ", диск гб " + spaceSSD +
                ", оперативная память гб " + sizeRAM;
    }
}
