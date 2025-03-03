package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.Transaction;
import com.example.FamilyFinance.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/{transactionId}")
    public Optional<Transaction> getTransactionById(@PathVariable Long transactionId){
        return transactionService.getTransactionById(transactionId);
    }

    @GetMapping
    public List<Transaction> getAllTransaction(){
        return transactionService.getAllTransaction();
    }

    @PutMapping("/{transactionId}")
    public Transaction updateTransaction(@PathVariable Long transactionId,@RequestBody Transaction transaction){
        return transactionService.updateTransaction(transactionId,transaction);
    }

    @DeleteMapping("/{transactionId}")
    public void deleteTransaction(@PathVariable Long transactionId){
        transactionService.deleteTransaction(transactionId);
    }
}
