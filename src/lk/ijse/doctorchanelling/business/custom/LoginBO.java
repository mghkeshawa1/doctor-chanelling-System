/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.LoginDTO;

/**
 *
 * @author infomatics
 */
public interface LoginBO extends SuperBO{
    
    public boolean addLogin(LoginDTO dto) throws Exception;

    public boolean deleteLogin(String id) throws Exception;

    public boolean updateLogin(LoginDTO dto) throws Exception;

    public LoginDTO searchAppointments(String id) throws Exception;

    public ArrayList<LoginDTO> getAllLogins() throws Exception;
}
