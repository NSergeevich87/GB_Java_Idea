package ru.gb._auto_testing.hw_2;

public class CryptoSaver implements IMultiplication{
    private double Crypto;

    public CryptoSaver() { Crypto = 0; }
    public CryptoSaver(double value) {
        Crypto = value;
    }

    public void SetCrypto(double value) { Crypto = value; }
    public double GetCrypto() { return Crypto; }
    @Override
    public double GetMulti() {
        return Crypto * 2;
    }
}
