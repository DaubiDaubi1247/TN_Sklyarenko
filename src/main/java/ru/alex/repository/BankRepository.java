package ru.alex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.alex.entity.Bank;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

    @Query("UPDATE Bank b " +
            "SET b.name = :newBankName ")
    List<Bank> updateAllBanks(String newBankName);
}
