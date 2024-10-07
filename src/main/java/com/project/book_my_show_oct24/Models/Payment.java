package com.project.book_my_show_oct24.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class Payment extends BaseModel{

    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private int transactionId;
    private Date timeStamp;

    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;
}
