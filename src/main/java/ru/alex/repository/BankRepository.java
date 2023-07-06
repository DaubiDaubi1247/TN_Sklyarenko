package ru.alex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.alex.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

    @Modifying
    @Query("UPDATE Bank b " +
            "SET b.name = :newBankName ")
    void updateAllBanks(String newBankName);
}
