package ru.alex.repository;

import ru.alex.db.DataBaseConnector;
import ru.alex.entity.Bank;
import ru.alex.exception.DataAccessException;
import ru.alex.exception.SqlException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {

    private BankRepository() {
    }

    private static final String UPDATE_ALL_BANK_SQL = "UPDATE bank " +
            "SET name = ?";

    private static final String GET_ALL_BANK_SQL = "SELECT * " +
            "FROM bank";

    public static List<Bank> updateAllBanksNamesOnNewBankName(String newBankName) {

        try (Connection connection = DataBaseConnector.getConnection()) {
            connection.setAutoCommit(false);

            return updateBankNames(newBankName, connection);
        } catch (SQLException e) {
            throw new DataAccessException("exception in try to get connection", e);
        }

    }

    private static List<Bank> updateBankNames(String newBankName, Connection connection) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ALL_BANK_SQL)) {
            preparedStatement.setString(1, newBankName);
            preparedStatement.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            throw new SqlException("sql exception in when update all banks", e);
        }

        connection.setAutoCommit(true);

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
            throw new SqlException("sql exception when getting all banks ", e);
        }

        return bankList;
    }
}
