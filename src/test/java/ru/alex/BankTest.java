package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.alex.entity.Bank;
import ru.alex.service.BankService;
import ru.alex.service.Impl.BankServiceImpl;
import ru.alex.service.Impl.UserServiceImpl;

import java.util.List;

public class BankTest {

    private static final List<String> UPDATED_BANK_NAMES = List.of("NewBank1", "NewBank2", "NewBank3");
    private static BankService bankService;

    @BeforeAll
    public static void initService() {
        bankService = new BankServiceImpl();
    }

    @Test
    public void testUpdateAllBankNames_ReturnCorrectValues() {
        List<String> updatedBankNames = bankService.updateAllBankNames(UPDATED_BANK_NAMES)
                .stream().map(Bank::getName)
                .toList();

        Assertions.assertEquals(UPDATED_BANK_NAMES, updatedBankNames);
    }
}
