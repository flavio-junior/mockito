package br.com.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CalculateTest {

    @Test
    void testSum() {
        Calculate calculate = mock(Calculate.class);
        calculate.sum(7, 14);
        verify(calculate).sum(7, 14);
    }

}