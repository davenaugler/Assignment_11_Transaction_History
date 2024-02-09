package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    // @RequiredArgsConstructor generates a constructor with required (final) fields.

    public List<Transaction> findAll() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getDate))
                .collect(Collectors.toList());
    }

    public Transaction findById(Long transactionId) {
        List<Transaction> transactions = findAll();
        return transactions.stream()
                .filter(transaction -> transactionId.equals(transaction.getId()))
                .findFirst()
                .orElse(null);
    }
}
