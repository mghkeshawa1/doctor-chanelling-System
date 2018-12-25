/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.RefundDTO;

/**
 *
 * @author infomatics
 */
public interface RefundBO extends SuperBO{
    
    public boolean addRefund(RefundDTO dto) throws Exception;

    public boolean deleteRefund(RefundDTO dto) throws Exception;

    public boolean updateRefund(RefundDTO dto) throws Exception;

    public RefundDTO searchRefund(RefundDTO dto) throws Exception;

    public ArrayList<RefundDTO> getAllRefunds() throws Exception;
}
