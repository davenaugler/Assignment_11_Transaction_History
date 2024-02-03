package com.codercampus.Assignment11.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class Transaction implements Serializable {
	private static final long serialVersionUID = 5489045104890844953L;
	
	private Long id;             // Check
	private String retailer;     // Check
	private String description;  // Specifics on the store
	private LocalDateTime date;  // Check
	private BigDecimal amount;   // Funds In (Debit)   Funds Out (Credit)
	private String type;         // 'C' or 'D'




}
