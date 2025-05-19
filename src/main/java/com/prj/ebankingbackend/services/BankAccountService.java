package com.prj.ebankingbackend.services;

import com.prj.ebankingbackend.entities.BankAccount;
import com.prj.ebankingbackend.entities.Customer;

import java.util.List;

public interface BankAccountService {
    public Customer saveCusmtomer(Customer customer);
    BankAccount saveBankAccount(double initialBalnace,String type,Long customerId );
    List<Customer> listCustomers();
    BankAccount gerBankAccount(String accountId);
    void debit(String accountID, double amount, String description);
    void transfer(String accountIdSource,String accountIdDestination, double amount);


}
