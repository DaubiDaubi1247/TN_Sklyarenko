package ru.alex.repository;

import ru.alex.entity.Bank;
import ru.alex.utils.HibernateSessionFactory;

import java.util.List;

public class BankRepository {

    private static final String GET_ALL_BANK_SQL = "SELECT * " +
            "FROM bank";

    public static List<Bank> updateAllBanks(String newBankName) {

        try (var session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();

            var bankList = getAllBanks();

            for (Bank bank : bankList) {
                bank.setName(newBankName);
                session.merge(bank);
            }

            session.getTransaction().commit();

        }

        return getAllBanks();
    }

    public static List<Bank> getAllBanks() {

        List<Bank> bankList;

        try (var session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();

            bankList = session.createNativeQuery(GET_ALL_BANK_SQL, Bank.class).getResultList();

            session.getTransaction().commit();
        }

        return bankList;
    }
}
