/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.custom.HospitalBO;
import lk.ijse.doctorchanelling.dao.DAOFactory;
import lk.ijse.doctorchanelling.dao.SuperDAO;
import lk.ijse.doctorchanelling.dao.custom.HospitalDAO;
import lk.ijse.doctorchanelling.entity.Hospital;
import lk.ijse.doctorchanelling.models.HospitalDTO;

/**
 *
 * @author infomatics
 */
public class HospitalBOImpl implements HospitalBO {

    private final HospitalDAO hospitalDAO;

    public HospitalBOImpl() throws Exception {
        hospitalDAO = (HospitalDAO) DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOTypes.HOSPITAL);
    }

    @Override
    public boolean addHospital(HospitalDTO dto) throws Exception {
        return hospitalDAO.add(new Hospital(dto.getHos_id(), dto.getHospital()));
    }

    @Override
    public boolean deleteHospital(String id) throws Exception {
        return hospitalDAO.delete(id);
    }

    @Override
    public ArrayList<HospitalDTO> getAllHospitals() throws Exception {
        ArrayList<Hospital> hospitalList = hospitalDAO.getAll();
        ArrayList<HospitalDTO> dto = new ArrayList<>();
        for (Hospital hospital : hospitalList) {
            dto.add(new HospitalDTO(hospital.getHos_id(), hospital.getHospital()));

        }
        return dto;
    }

}
