package com.grupoe.recarga.recarga.domain;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;

@Entity
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NumberFormat
    private long value;
    @NotNull
    private String card;
    private String payment;
    private String classification;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Recharge() {

    }

    public long getValue() {
        return value;
    }

    public void setValue(long value){
        this.value = value;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
