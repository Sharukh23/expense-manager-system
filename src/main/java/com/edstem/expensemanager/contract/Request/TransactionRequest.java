package com.edstem.expensemanager.contract.Request;

import com.edstem.expensemanager.constant.Type;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TransactionRequest {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    private Type type;
    private Double amount;
    private LocalDate date;
}
