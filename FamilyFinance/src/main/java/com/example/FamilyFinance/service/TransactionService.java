package com.example.FamilyFinance.service;

import com.example.FamilyFinance.entity.Transaction;
import com.example.FamilyFinance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Optional<Transaction> getTransactionById(Long transactionId) {
        return transactionRepository.findById(transactionId);
    }

    public List<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }

    public Transaction updateTransaction(Long transactionId, Transaction transaction) {
        if(transactionRepository.existsById(transactionId)){
            transaction.setTransactionId(transactionId);
            return transactionRepository.save(transaction);
        }
        return null;
    }

    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }
}
