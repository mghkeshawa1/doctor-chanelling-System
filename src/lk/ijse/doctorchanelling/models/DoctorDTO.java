/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.models;

/**
 *
 * @author infomatics
 */
public class DoctorDTO {

    private String doc_id;
    private String first_name;
    private String last_name;
    private String speciality;
    private String hospital;
    private String contact;
    private String nic;
    private String address;
    private String gender;
    private String patient_per_hour;
    private double fee_for_appointment;

    public DoctorDTO() {
    }

    public DoctorDTO(String doc_id, String first_name, String last_name, String speciality, String hospital, String contact, String nic, String address, String gender, String patient_per_hour, double fee_for_appointment) {
        this.doc_id = doc_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.speciality = speciality;
        this.hospital = hospital;
        this.contact = contact;
        this.nic = nic;
        this.address = address;
        this.gender = gender;
        this.patient_per_hour = patient_per_hour;
        this.fee_for_appointment = fee_for_appointment;
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
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the patient_per_hour
     */
    public String getPatient_per_hour() {
        return patient_per_hour;
    }

    /**
     * @param patient_per_hour the patient_per_hour to set
     */
    public void setPatient_per_hour(String patient_per_hour) {
        this.patient_per_hour = patient_per_hour;
    }

    /**
     * @return the fee_for_appointment
     */
    public double getFee_for_appointment() {
        return fee_for_appointment;
    }

    /**
     * @param fee_for_appointment the fee_for_appointment to set
     */
    public void setFee_for_appointment(double fee_for_appointment) {
        this.fee_for_appointment = fee_for_appointment;
    }

}
