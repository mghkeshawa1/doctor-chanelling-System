/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.DoctorDTO;

/**
 *
 * @author infomatics
 */
public interface DoctorBO extends SuperBO {

    public boolean addDoctor(DoctorDTO dto) throws Exception;

    public boolean deleteDoctor(String id) throws Exception;

    public boolean updateDoctor(DoctorDTO dto) throws Exception;

    public DoctorDTO searchDoctor(String id) throws Exception;

    public ArrayList<DoctorDTO> getAllDoctors() throws Exception;
}
