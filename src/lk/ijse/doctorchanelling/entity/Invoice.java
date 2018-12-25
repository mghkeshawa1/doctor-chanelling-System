/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.entity;

/**
 *
 * @author infomatics
 */
public class Invoice {
    private String invoice_code;
    private String appo_id;
    private double amount;
    private double payment;
    private double balance;
    private String invoice_date;
    private String status;
    private String vat_id;

    public Invoice() {
    }

    public Invoice(String invoice_code, String appo_id, double amount, double payment, double balance, String invoice_date, String status, String vat_id) {
        this.invoice_code = invoice_code;
        this.appo_id = appo_id;
        this.amount = amount;
        this.payment = payment;
        this.balance = balance;
        this.invoice_date = invoice_date;
        this.status = status;
        this.vat_id = vat_id;
    }

    /**
     * @return the invoice_code
     */
    public String getInvoice_code() {
        return invoice_code;
    }

    /**
     * @param invoice_code the invoice_code to set
     */
    public void setInvoice_code(String invoice_code) {
        this.invoice_code = invoice_code;
    }

    /**
     * @return the appo_id
     */
    public String getAppo_id() {
        return appo_id;
    }

    /**
     * @param appo_id the appo_id to set
     */
    public void setAppo_id(String appo_id) {
        this.appo_id = appo_id;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the invoice_date
     */
    public String getInvoice_date() {
        return invoice_date;
    }

    /**
     * @param invoice_date the invoice_date to set
     */
    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the vat_id
     */
    public String getVat_id() {
        return vat_id;
    }

    /**
     * @param vat_id the vat_id to set
     */
    public void setVat_id(String vat_id) {
        this.vat_id = vat_id;
    }
     
     
}