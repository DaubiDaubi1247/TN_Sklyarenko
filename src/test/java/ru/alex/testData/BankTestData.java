package ru.alex.testData;

import ru.alex.entity.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankTestData {

    public static final String UPDATED_BANK_NAME = "NewBank1";

    private static final int SIZE_LIST_BANKS_AFTER_UPDATE = 4;

    public static List<Bank> getBanksAfterUpdate() {

        List<Bank> bankList = new ArrayList<>();

        for (int i = 0; i < SIZE_LIST_BANKS_AFTER_UPDATE; i++) {
            bankList.add(Bank.builder().name(UPDATED_BANK_NAME).build());
        }


        return bankList;
    }
}
