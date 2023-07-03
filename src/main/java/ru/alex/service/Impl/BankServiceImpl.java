package ru.alex.service.Impl;

import ru.alex.entity.Bank;
import ru.alex.repository.BankRepository;
import ru.alex.service.BankService;

import java.util.List;

public class BankServiceImpl implements BankService {

    @Override
    public List<Bank> updateAllBankNames(String newBankName) {
        return BankRepository.updateAllBanksNamesOnNewBankName(newBankName);
    }
}
