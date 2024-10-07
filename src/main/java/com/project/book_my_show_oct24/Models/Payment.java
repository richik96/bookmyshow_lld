package com.project.book_my_show_oct24.Models;

import java.util.Date;

import lombok.Data;

@Data
public class Payment extends BaseModel{

    private int amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private int transactionId;
    private Date timeStamp;
    private PaymentProvider paymentProvider;
}
