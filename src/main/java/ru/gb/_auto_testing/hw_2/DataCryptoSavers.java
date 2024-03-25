package ru.gb._auto_testing.hw_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class DataCryptoSavers implements IMultiplication{
    public List<IMultiplication> multiplications = new ArrayList<>();

    public void AddCryptoSaver(IMultiplication value) {
        multiplications.add(value);
    }

    @Override
    public double GetMulti() {
        AtomicReference<Double> result = new AtomicReference<Double>((double) 0);

        multiplications.forEach(iElement -> {
            result.set(result.get() + iElement.GetMulti());
        });

        return result.get();
    }
}
