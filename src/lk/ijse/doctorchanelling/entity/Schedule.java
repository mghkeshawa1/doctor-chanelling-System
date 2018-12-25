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
public class Schedule {

    private String schedule_id;
    private String doc_id;
    private String schedule_day;
    private String start_time;
    private String end_time;
    private String schedule_created_date;

    public Schedule() {
    }

    public Schedule(String schedule_id, String doc_id, String schedule_day, String start_time, String end_time, String schedule_created_date) {
        this.schedule_id = schedule_id;
        this.doc_id = doc_id;
        this.schedule_day = schedule_day;
        this.start_time = start_time;
        this.end_time = end_time;
        this.schedule_created_date = schedule_created_date;
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
     * @return the schedule_day
     */
    public String getSchedule_day() {
        return schedule_day;
    }

    /**
     * @param schedule_day the schedule_day to set
     */
    public void setSchedule_day(String schedule_day) {
        this.schedule_day = schedule_day;
    }

    /**
     * @return the start_time
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * @param start_time the start_time to set
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    /**
     * @return the end_time
     */
    public String getEnd_time() {
        return end_time;
    }

    /**
     * @param end_time the end_time to set
     */
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    /**
     * @return the schedule_created_date
     */
    public String getSchedule_created_date() {
        return schedule_created_date;
    }

    /**
     * @param schedule_created_date the schedule_created_date to set
     */
    public void setSchedule_created_date(String schedule_created_date) {
        this.schedule_created_date = schedule_created_date;
    }

    
    
}
