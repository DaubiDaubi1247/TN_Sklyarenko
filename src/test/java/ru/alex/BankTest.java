package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import ru.alex.entity.Bank;
import ru.alex.service.BankService;
import ru.alex.service.Impl.BankServiceImpl;

import java.util.List;

@SpringBootTest
public class BankTest {

    private static final String UPDATED_BANK_NAME = "NewBank1";
    private static BankService bankService;

    @BeforeAll
    public static void initService() {
        bankService = new BankServiceImpl();
    }

    @Test
    @Sql(value = "classpath:rollback.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void testUpdateAllBankNames_ReturnCorrectValues() {
        List<String> updatedBankNames = bankService.updateAllBankNames(UPDATED_BANK_NAME)
                .stream().map(Bank::getName)
                .toList();

        Assertions.assertTrue(updatedBankNames.stream()
                .allMatch(UPDATED_BANK_NAME::equals));
    }
}
