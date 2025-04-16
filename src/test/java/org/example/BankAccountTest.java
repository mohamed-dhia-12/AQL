package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void constructor_InitializesCorrectBalanceAndInterestRate() {
        BankAccount account = new BankAccount(100.0, 0.05);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void deposit_PositiveAmount_IncreasesBalance() {
        BankAccount account = new BankAccount(50.0, 0.05);
        account.deposit(30.0);
        assertEquals(80.0, account.getBalance());
    }

    @Test
    void deposit_NegativeAmount_ThrowsException() {
        BankAccount account = new BankAccount(50.0, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    @Test
    void withdraw_ValidAmount_DecreasesBalance() {
        BankAccount account = new BankAccount(100.0, 0.05);
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void withdraw_MoreThanBalance_ThrowsException() {
        BankAccount account = new BankAccount(50.0, 0.05);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100.0));
    }

    @Test
    void withdraw_NegativeAmount_ThrowsException() {
        BankAccount account = new BankAccount(50.0, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5.0));
    }

    @Test
    void transfer_ValidAmount_UpdatesBothAccounts() {
        BankAccount sender = new BankAccount(100.0, 0.05);
        BankAccount receiver = new BankAccount(50.0, 0.03);

        sender.transfer(40.0, receiver);

        assertEquals(60.0, sender.getBalance());
        assertEquals(90.0, receiver.getBalance());
    }

    @Test
    void transfer_ToNullAccount_ThrowsException() {
        BankAccount sender = new BankAccount(100.0, 0.05);
        assertThrows(NullPointerException.class, () -> sender.transfer(20.0, null));
    }

    @Test
    void transfer_TooMuchMoney_ThrowsExceptionAndNoMoneyTransferred() {
        BankAccount sender = new BankAccount(30.0, 0.05);
        BankAccount receiver = new BankAccount(50.0, 0.03);

        assertThrows(IllegalStateException.class, () -> sender.transfer(40.0, receiver));

        // Ensure balances didn't change
        assertEquals(30.0, sender.getBalance());
        assertEquals(50.0, receiver.getBalance());
    }

    @Test
    void addInterest_CorrectlyUpdatesBalance() {
        BankAccount account = new BankAccount(100.0, 0.10);
        account.addInterest();
        assertEquals(110.0, account.getBalance());
    }

    @Test
    void addInterest_WithZeroInterest_NoChange() {
        BankAccount account = new BankAccount(100.0, 0.0);
        account.addInterest();
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void getBalance_ReturnsCorrectValue() {
        BankAccount account = new BankAccount(123.45, 0.02);
        assertEquals(123.45, account.getBalance());
    }
}
