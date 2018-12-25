/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.AppointmentDTO;

/**
 *
 * @author infomatics
 */
public interface AppointmentBO extends SuperBO{
    
    public boolean addAppointment(AppointmentDTO dto) throws Exception;

    public boolean deleteAppointment(String id) throws Exception;

    public boolean updateAppointment(AppointmentDTO dto) throws Exception;

    public AppointmentDTO searchAppointments(String id) throws Exception;

    public ArrayList<AppointmentDTO> getAllAppointments() throws Exception;
    
}
