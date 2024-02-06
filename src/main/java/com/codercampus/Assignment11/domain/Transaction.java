package com.codercampus.Assignment11.domain;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class Transaction implements Serializable {
	private static final long serialVersionUID = 5489045104890844953L;
	
	private Long id;
	private String retailer;
	private String description;
	private LocalDateTime date;
	private BigDecimal amount;
	private String type;
}
