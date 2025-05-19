package com.prj.ebankingbackend.services;

import com.prj.ebankingbackend.entities.BankAccount;
import com.prj.ebankingbackend.entities.Customer;
import com.prj.ebankingbackend.repositories.AccountOperationRepository;
import com.prj.ebankingbackend.repositories.BankAccountRepository;
import com.prj.ebankingbackend.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class BankAccountServiceImpl implements BankAccountService {
    private CustomerRepository customerRepository;
    private BankAccountRepository bankAccountRepository;
    private AccountOperationRepository accountOperationRepository;

    @Override
    public Customer saveCusmtomer(Customer customer) {
        return null;
    }

    @Override
    public BankAccount saveBankAccount(double initialBalnace, String type, Long customerId) {
        return null;
    }

    @Override
    public List<Customer> listCustomers() {
        return null;
    }

    @Override
    public BankAccount gerBankAccount(String accountId) {
        return null;
    }

    @Override
    public void debit(String accountID, double amount, String description) {

    }

    @Override
    public void transfer(String accountIdSource, String accountIdDestination, double amount) {

    }
}