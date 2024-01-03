package com.example.demo.controller;

import com.example.demo.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/bank-accounts")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/transfer-money")
    public ResponseEntity<String> transferMoney(@RequestParam Long fromAccountId,
                                                @RequestParam Long toAccountId,
                                                @RequestParam BigDecimal amount) {
        try {
            bankAccountService.transferMoney(fromAccountId, toAccountId, amount);
            return ResponseEntity.ok("Money transferred successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
