package ru.gb._auto_testing.hw_2;

public class Main {
    public static void main(String[] args) {
        CryptoSaver cryptoSaver_1 = new CryptoSaver(10.5);
        CryptoSaver cryptoSaver_2 = new CryptoSaver(20.5);

        DataCryptoSavers data = new DataCryptoSavers();
        data.AddCryptoSaver(cryptoSaver_1);
        data.AddCryptoSaver(cryptoSaver_2);

        System.out.println(cryptoSaver_1.GetMulti());
        System.out.println(cryptoSaver_2.GetMulti());
        System.out.println(data.GetMulti());

        cryptoSaver_1.SetCrypto(50.5);
        cryptoSaver_2.SetCrypto(100.5);

        System.out.println(cryptoSaver_1.GetMulti());
        System.out.println(cryptoSaver_2.GetMulti());
        System.out.println(data.GetMulti());
    }
}
