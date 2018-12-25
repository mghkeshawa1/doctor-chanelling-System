/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.HospitalDTO;

/**
 *
 * @author infomatics
 */
public interface HospitalBO extends SuperBO {

    public boolean addHospital(HospitalDTO dto) throws Exception;

    public boolean deleteHospital(String id) throws Exception;

    public ArrayList<HospitalDTO> getAllHospitals() throws Exception;

}
