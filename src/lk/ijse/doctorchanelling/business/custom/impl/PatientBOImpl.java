/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.custom.PatientBO;
import lk.ijse.doctorchanelling.dao.DAOFactory;
import lk.ijse.doctorchanelling.dao.custom.PatientDAO;
import lk.ijse.doctorchanelling.entity.Patient;
import lk.ijse.doctorchanelling.models.PatientDTO;

/**
 *
 * @author infomatics
 */
public class PatientBOImpl implements PatientBO {

    private PatientDAO patientDAO;

    public PatientBOImpl() throws Exception {

        patientDAO = (PatientDAO) DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOTypes.PATIENT);

    }

    @Override
    public boolean addPatient(PatientDTO dto) throws Exception {
        Patient patient= new Patient(dto.getPid(), dto.getFirst_name(), dto.getLast_name(), dto.getNic(), dto.getGender(), dto.getContact(), dto.getDisease());
        return patientDAO.add(patient);
    }

    @Override
    public boolean deletePatient(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePatient(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientDTO searchPatient(PatientDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PatientDTO> getAllPatients() throws Exception {
        ArrayList<Patient> patientList = patientDAO.getAll();
        ArrayList<PatientDTO> dto = new ArrayList<>();
        for (Patient patient : patientList) {
           
            dto.add(new PatientDTO(patient.getPid(), patient.getFirst_name(),patient.getLast_name(),patient.getNic(), patient.getGender(), patient.getContact(), patient.getDisease()));
            
        }
        return dto;
    }



}
