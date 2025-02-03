package org.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

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

    @Test
    public void hashMapContainsSerialID() {
        BankUser testUser1 = new BankUser("Test", "User1");
        BankUser testUser2 = new BankUser("Test", "User2");

        HashMap<Integer, BankUser> bankAccounts = new HashMap<Integer, BankUser>();
        bankAccounts.put(testUser1.getId(), testUser1);
        bankAccounts.put(testUser2.getId(), testUser2);

        Assertions.assertFalse(bankAccounts.containsKey(3));
    }
}

