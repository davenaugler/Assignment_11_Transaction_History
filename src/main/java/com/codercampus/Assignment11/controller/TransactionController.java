package com.codercampus.Assignment11.controller;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    // @RequiredArgsConstructor generates a constructor with required (final) fields.

    @GetMapping("/transactions")
    public String getTransactions(ModelMap model){
        List<Transaction> transactions = transactionService.findAll();
        Transaction transaction = new Transaction();
        model.put("transaction", transaction);
        model.put("transactions", transactions);
        return "transactions";
    }

    @GetMapping("/transactions/{transactionId}")
    public String getTransaction(@PathVariable Long transactionId, ModelMap model) {
        Transaction transaction = transactionService.findById(transactionId);
        model.put("transaction", transaction);
        return "transaction";
    }
}
