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
public class SpecialityDTO {

    private String spe_id;
    private String specility;

    public SpecialityDTO() {
    }

    public SpecialityDTO(String spe_id, String specility) {
        this.spe_id = spe_id;
        this.specility = specility;
    }

    /**
     * @return the spe_id
     */
    public String getSpe_id() {
        return spe_id;
    }

    /**
     * @param spe_id the spe_id to set
     */
    public void setSpe_id(String spe_id) {
        this.spe_id = spe_id;
    }

    /**
     * @return the specility
     */
    public String getSpecility() {
        return specility;
    }

    /**
     * @param specility the specility to set
     */
    public void setSpecility(String specility) {
        this.specility = specility;
    }
    
}
