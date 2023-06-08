package ru.alex.service;

import ru.alex.entity.Bank;

import java.util.List;

public interface BankService {

    List<Bank> updateAllBankNames(String newBankName);
}
