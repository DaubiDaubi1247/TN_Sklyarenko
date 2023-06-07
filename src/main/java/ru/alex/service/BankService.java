package ru.alex.service;

import ru.alex.entity.Bank;

import java.sql.SQLException;
import java.util.List;

public interface BankService {

    List<Bank> updateAllBankNames(List<String> newBankNamesList);
}
