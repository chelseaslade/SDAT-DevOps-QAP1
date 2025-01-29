package org.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests {
    @Test
    public void addDepositToBalance() {
        BankUser testUser = new BankUser("Test", "User");
        testUser.depositFunds(100);
        Assertions.assertEquals(100, testUser.getBalance());
    }

    @Test
    public void subtractWithdrawFromBalance() {
        BankUser testUser = new BankUser("Test", "User");
        testUser.depositFunds(100);
        testUser.withdrawFunds(100);
        Assertions.assertEquals(0, testUser.getBalance());
    }
}

