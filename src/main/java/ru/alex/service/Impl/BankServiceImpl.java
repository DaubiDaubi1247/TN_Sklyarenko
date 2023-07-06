package ru.alex.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alex.entity.Bank;
import ru.alex.repository.BankRepository;
import ru.alex.service.BankService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    @Override
    @Transactional
    public List<Bank> updateAllBankNames(String newBankName) {
        bankRepository.updateAllBanks(newBankName);

        return bankRepository.findAll();
    }
}
