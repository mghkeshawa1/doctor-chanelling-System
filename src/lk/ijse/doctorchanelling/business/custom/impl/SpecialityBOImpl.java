/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.custom.SpecialityBO;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.DAOFactory;
import lk.ijse.doctorchanelling.dao.SuperDAO;
import lk.ijse.doctorchanelling.dao.custom.SpecialityDAO;
import lk.ijse.doctorchanelling.entity.Speciality;
import lk.ijse.doctorchanelling.models.SpecialityDTO;

/**
 *
 * @author infomatics
 */
public class SpecialityBOImpl implements SpecialityBO {

    SpecialityDAO specialityDAO;

    public SpecialityBOImpl() throws Exception {
        specialityDAO = (SpecialityDAO) DAOFactory.getDAOFactory().getSuperDAO(DAOFactory.DAOTypes.SPECIALITY);
    }

    @Override
    public boolean addSpeciality(SpecialityDTO dto) throws Exception {
        return specialityDAO.add(new Speciality(dto.getSpe_id(), dto.getSpecility()));

    }

    @Override
    public boolean deleteSpeciality(SpecialityDTO dto) throws Exception {
      return specialityDAO.delete("spe_id");
    }

    @Override
    public boolean updateSpeciality(SpecialityDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SpecialityDTO searchSpeciality(SpecialityDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SpecialityDTO> getAllSpecialities() throws Exception {
          ArrayList<Speciality> specialities = specialityDAO.getAll();
        ArrayList<SpecialityDTO> dto = new ArrayList<>();
        for (Speciality sp : specialities) {
//            System.out.println(doc);
            dto.add(new SpecialityDTO(sp.getSpe_id(),sp.getSpecility()));
            
        }
        return dto;
    }
}
