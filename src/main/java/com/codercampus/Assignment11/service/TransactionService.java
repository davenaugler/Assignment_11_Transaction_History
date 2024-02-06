package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    // @RequiredArgsConstructor generates a constructor with required (final) fields.

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction findById(Long transactionId) {
        List<Transaction> transactions = findAll();
        return transactions.stream()
                .filter(transaction -> transactionId.equals(transaction.getId()))
                .findFirst()
                .orElse(null);
    }
}
