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
public class Refund {
    private String re_id;
    private double amount;
    private String refund_date;
    private String invoice_code;
    private String description;

    public Refund() {
    }

    public Refund(String re_id, double amount, String refund_date, String invoice_code, String description) {
        this.re_id = re_id;
        this.amount = amount;
        this.refund_date = refund_date;
        this.invoice_code = invoice_code;
        this.description = description;
    }

    /**
     * @return the re_id
     */
    public String getRe_id() {
        return re_id;
    }

    /**
     * @param re_id the re_id to set
     */
    public void setRe_id(String re_id) {
        this.re_id = re_id;
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
     * @return the refund_date
     */
    public String getRefund_date() {
        return refund_date;
    }

    /**
     * @param refund_date the refund_date to set
     */
    public void setRefund_date(String refund_date) {
        this.refund_date = refund_date;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
