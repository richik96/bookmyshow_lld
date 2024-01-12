package com.example.bookmyshow23.bookmyshow_lld.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;
    private int referenceNum;
    private Date timeStamp;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;

    //ORM - Object Relation Mapping
    //converts the models into tables when the application start
    // ORM will take care of writing complex SQL queries behind the scenes
    // we will call the ORM functions and ORM will create the query in backend


}
