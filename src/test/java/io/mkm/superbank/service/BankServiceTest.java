package io.mkm.superbank.service;

import io.mkm.superbank.repository.BalanceRepository;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankServiceTest {

    private BalanceRepository balanceRepository = new BalanceRepository();
    private BankService bankService = new BankService(balanceRepository);

    @Test
    void getBalance() {
        final BigDecimal balance = bankService.getBalance(1L);
        assertEquals(balance, BigDecimal.TEN);

    }

    @Test
    void addgMoney() {
        final BigDecimal balance = bankService.addMoney(1L, BigDecimal.ONE);
        assertEquals(balance, BigDecimal.valueOf(11));

    }
}