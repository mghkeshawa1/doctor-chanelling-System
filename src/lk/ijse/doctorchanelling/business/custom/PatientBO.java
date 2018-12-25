/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.PatientDTO;

/**
 *
 * @author infomatics
 */
public interface PatientBO extends SuperBO{
    
    public boolean addPatient(PatientDTO dto) throws Exception;
    
    public boolean deletePatient(PatientDTO dto) throws Exception;
    
    public boolean updatePatient(PatientDTO dto) throws Exception;
    
    public PatientDTO searchPatient(PatientDTO dto) throws Exception;
    
    public ArrayList<PatientDTO> getAllPatients() throws Exception;
}
