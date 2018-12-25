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
public class Hospital {

    private String hos_id;
    private String hospital;

    public Hospital() {
    }

    public Hospital(String hos_id, String hospital) {
        this.hos_id = hos_id;
        this.hospital = hospital;
    }

    /**
     * @return the hos_id
     */
    public String getHos_id() {
        return hos_id;
    }

    /**
     * @param hos_id the hos_id to set
     */
    public void setHos_id(String hos_id) {
        this.hos_id = hos_id;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

}
