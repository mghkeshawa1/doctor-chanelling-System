/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.VatDTO;

/**
 *
 * @author infomatics
 */
public interface VatBO extends SuperBO{
    
    public boolean addVat(VatDTO dto) throws Exception;
    
    public boolean deleteVat(VatDTO dto) throws Exception;
    
    public boolean updateVat(VatDTO dto) throws Exception;
    
    public VatDTO searchVat(VatDTO dto) throws Exception;
    
    public ArrayList<VatDTO> getAllVats() throws Exception;
}
