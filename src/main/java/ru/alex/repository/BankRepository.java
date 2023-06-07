package ru.alex.repository;

import ru.alex.db.DataBaseConnector;
import ru.alex.entity.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {

    private static final String UPDATE_ALL_BANK_SQL = "UPDATE bank " +
            "SET name = name + 'a'";

    private static final String GET_ALL_BANK_SQL = "SELECT * " +
            "FROM bank";

    public static List<Bank> updateAllBanks() throws SQLException {

        try (Connection connection = DataBaseConnector.getConnection()) {
            connection.setAutoCommit(false);

            try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ALL_BANK_SQL)) {
                preparedStatement.executeQuery();
                connection.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            connection.setAutoCommit(true);
        }

        return getAllBanks();
    }

    public static List<Bank> getAllBanks() {

        List<Bank> bankList = new ArrayList<>();

        try (PreparedStatement preparedStatement = DataBaseConnector.getConnection().prepareStatement(GET_ALL_BANK_SQL)) {
            ResultSet resultSetAllBanks = preparedStatement.executeQuery();

            while (resultSetAllBanks.next()) {
                Bank bank = new Bank();
                bank.setId(resultSetAllBanks.getInt("id"));
                bank.setName(resultSetAllBanks.getString("name"));

                bankList.add(bank);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bankList;
    }
}
