package com.project.onlinebanking.service;

import java.security.Principal;

import com.project.onlinebanking.entity.PrimaryAccount;
import com.project.onlinebanking.entity.SavingsAccount;


public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}