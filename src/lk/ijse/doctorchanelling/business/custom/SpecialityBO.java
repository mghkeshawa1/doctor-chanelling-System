/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.SpecialityDTO;

/**
 *
 * @author infomatics
 */
public interface SpecialityBO extends SuperBO{

    public boolean addSpeciality(SpecialityDTO dto) throws Exception;

    public boolean deleteSpeciality(SpecialityDTO dto) throws Exception;

    public boolean updateSpeciality(SpecialityDTO dto) throws Exception;

    public SpecialityDTO searchSpeciality(SpecialityDTO dto) throws Exception;

    public ArrayList<SpecialityDTO> getAllSpecialities() throws Exception;
}
