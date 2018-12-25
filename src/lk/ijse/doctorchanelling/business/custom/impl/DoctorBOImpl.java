/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.custom.DoctorBO;
import lk.ijse.doctorchanelling.dao.DAOFactory;
import lk.ijse.doctorchanelling.dao.custom.DoctorDAO;
import lk.ijse.doctorchanelling.entity.Doctor;
import lk.ijse.doctorchanelling.models.DoctorDTO;

/**
 * x
 *
 *
 * @author infomatics
 */
public class DoctorBOImpl implements DoctorBO {

    private final DoctorDAO doctorDAO;

    public DoctorBOImpl() throws Exception {
        doctorDAO = (DoctorDAO) DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOTypes.DOCTOR);
    }

    @Override
    public boolean addDoctor(DoctorDTO dto) throws Exception {
        return doctorDAO.add(new Doctor(dto.getDoc_id(), dto.getFirst_name(), dto.getLast_name(), dto.getSpeciality(), dto.getHospital(), dto.getContact(), dto.getNic(), dto.getAddress(), dto.getGender(), dto.getPatient_per_hour(), dto.getFee_for_appointment()));

    }

    @Override
    public boolean deleteDoctor(String id) throws Exception {
        return doctorDAO.delete(id);
    }

    @Override
    public boolean updateDoctor(DoctorDTO dto) throws Exception {
        return doctorDAO.update(new Doctor(dto.getDoc_id(), dto.getFirst_name(), dto.getLast_name(), dto.getSpeciality(), dto.getHospital(), dto.getContact(), dto.getNic(), dto.getAddress(), dto.getGender(), dto.getPatient_per_hour(), dto.getFee_for_appointment()));
    }

    @Override
    public DoctorDTO searchDoctor(String id) throws Exception {
        Doctor doctor = doctorDAO.Search(id);
        return new DoctorDTO(doctor.getDoc_id_PK(), doctor.getFirst_name(), doctor.getLast_name(), doctor.getSpeciality(), doctor.getHospital(), doctor.getContact(), doctor.getNic(), doctor.getAddress(), doctor.getGender(), doctor.getPatient_per_hour(), doctor.getFee_for_appointment());
    }

    @Override
    public ArrayList<DoctorDTO> getAllDoctors() throws Exception {

        ArrayList<Doctor> doctorList = doctorDAO.getAll();
        ArrayList<DoctorDTO> dto = new ArrayList<>();
        for (Doctor doc : doctorList) {
//            System.out.println(doc);
            dto.add(new DoctorDTO(doc.getDoc_id_PK(), doc.getFirst_name(), doc.getLast_name(), doc.getSpeciality(), doc.getHospital(),doc.getContact(), doc.getNic(), doc.getAddress(), doc.getGender(),doc.getPatient_per_hour(),doc.getFee_for_appointment()));
            
        }
        return dto;

    }


}
