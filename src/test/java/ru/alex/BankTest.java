package ru.alex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.alex.entity.Bank;
import ru.alex.service.BankService;
import ru.alex.service.Impl.BankServiceImpl;
import ru.alex.utils.HibernateSessionFactory;
import ru.alex.utils.file.FileHandler;

public class BankTest {

    private static final String UPDATED_BANK_NAME = "NewBank1";

    private static final String PATH_TO_ROLLBACK_FILE = "src/test/resources/rollback.sql";
    private static BankService bankService;

    @BeforeAll
    public static void initService() {
        bankService = new BankServiceImpl();
    }

    @AfterEach
    public void rollbackDataBase() {
        try (var session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();

            var sqlQueryFromFile = FileHandler.getSqlQueryFromFile(PATH_TO_ROLLBACK_FILE);
            session.createNativeQuery(sqlQueryFromFile).executeUpdate();

            session.getTransaction().commit();
        }
    }

    @Test
    public void testUpdateAllBankNames_ReturnCorrectValues() {

        var updatedBankNameList = bankService.updateAllBankNames(UPDATED_BANK_NAME)
                .stream().map(Bank::getName)
                .toList();

        Assertions.assertTrue(updatedBankNameList.stream()
                .allMatch(UPDATED_BANK_NAME::equals));
    }
}
