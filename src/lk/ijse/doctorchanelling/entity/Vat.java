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
public class Vat {

    private String vat_id;
    private String vat_amount;
    private String vat_category;

    public Vat() {
    }

    public Vat(String vat_id, String vat_amount, String vat_category) {
        this.vat_id = vat_id;
        this.vat_amount = vat_amount;
        this.vat_category = vat_category;
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

    /**
     * @return the vat_amount
     */
    public String getVat_amount() {
        return vat_amount;
    }

    /**
     * @param vat_amount the vat_amount to set
     */
    public void setVat_amount(String vat_amount) {
        this.vat_amount = vat_amount;
    }

    /**
     * @return the vat_category
     */
    public String getVat_category() {
        return vat_category;
    }

    /**
     * @param vat_category the vat_category to set
     */
    public void setVat_category(String vat_category) {
        this.vat_category = vat_category;
    }

    
}
