package ru.alex.service.Impl;

import ru.alex.entity.Bank;
import ru.alex.repository.BankRepository;
import ru.alex.service.BankService;

import java.sql.SQLException;
import java.util.List;

public class BankServiceImpl implements BankService {

    @Override
    public List<Bank> updateAllBankNames(List<String> newBankNamesList) {
        return BankRepository.updateAllBanks(newBankNamesList);
    }
}
