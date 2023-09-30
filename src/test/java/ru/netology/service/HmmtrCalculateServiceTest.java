package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HmmtrCalculateServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/Hmmtrcalc.csv")
    public void shouldCalculate(int expected, int income, int expenses, int threshold) {

        HmmtrCalculateService service = new HmmtrCalculateService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
