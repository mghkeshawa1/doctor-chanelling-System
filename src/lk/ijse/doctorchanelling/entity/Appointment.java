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
public class Appointment {
    private String appo_id;
    private String doc_id;
    private String pid;
    private String invoice_code;
    private String schedule_id;
    private String appo_date;
    private String appo_time;
    private String appointed_date;

    public Appointment() {
    }

    public Appointment(String appo_id, String doc_id, String pid, String invoice_code, String schedule_id, String appo_date, String appo_time, String appointed_date) {
        this.appo_id = appo_id;
        this.doc_id = doc_id;
        this.pid = pid;
        this.invoice_code = invoice_code;
        this.schedule_id = schedule_id;
        this.appo_date = appo_date;
        this.appo_time = appo_time;
        this.appointed_date = appointed_date;
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
     * @return the doc_id
     */
    public String getDoc_id() {
        return doc_id;
    }

    /**
     * @param doc_id the doc_id to set
     */
    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
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
     * @return the schedule_id
     */
    public String getSchedule_id() {
        return schedule_id;
    }

    /**
     * @param schedule_id the schedule_id to set
     */
    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
    }

    /**
     * @return the appo_date
     */
    public String getAppo_date() {
        return appo_date;
    }

    /**
     * @param appo_date the appo_date to set
     */
    public void setAppo_date(String appo_date) {
        this.appo_date = appo_date;
    }

    /**
     * @return the appo_time
     */
    public String getAppo_time() {
        return appo_time;
    }

    /**
     * @param appo_time the appo_time to set
     */
    public void setAppo_time(String appo_time) {
        this.appo_time = appo_time;
    }

    /**
     * @return the appointed_date
     */
    public String getAppointed_date() {
        return appointed_date;
    }

    /**
     * @param appointed_date the appointed_date to set
     */
    public void setAppointed_date(String appointed_date) {
        this.appointed_date = appointed_date;
    }

   

    
}
