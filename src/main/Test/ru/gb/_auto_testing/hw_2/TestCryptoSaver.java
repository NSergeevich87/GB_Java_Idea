package ru.gb._auto_testing.hw_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCryptoSaver {

    CryptoSaver cryptoSaver_1 = new CryptoSaver();
    CryptoSaver cryptoSaver_2 = new CryptoSaver();
    DataCryptoSavers data = new DataCryptoSavers();

    @Test
    public void TestGetMultiCryptoSaver() {
        cryptoSaver_1.SetCrypto(10.5);
        cryptoSaver_2.SetCrypto(20.5);

        double result_1 = cryptoSaver_1.GetMulti();
        double result_2 = cryptoSaver_2.GetMulti();

        Assertions.assertEquals(21, result_1);
        Assertions.assertEquals(41, result_2);
    }

    @Test
    public void TestDataCryptoSavers() {
        cryptoSaver_1.SetCrypto(100.5);
        cryptoSaver_2.SetCrypto(200.5);

        data.AddCryptoSaver(cryptoSaver_1);
        data.AddCryptoSaver(cryptoSaver_2);

        double result = data.GetMulti();

        Assertions.assertEquals(602, result);
    }

    @Test
    public void TestGetterCryptoSaver() {
        CryptoSaver cryptoSaver = new CryptoSaver(1234.1234);

        double result = cryptoSaver.GetCrypto();

        Assertions.assertEquals(1234.1234, result);
    }
}
