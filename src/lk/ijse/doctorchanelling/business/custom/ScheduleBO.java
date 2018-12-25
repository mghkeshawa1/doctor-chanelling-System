/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.ScheduleDTO;

/**
 *
 * @author infomatics
 */
public interface ScheduleBO extends SuperBO {

    public boolean addSchedule(ScheduleDTO dto) throws Exception;

    public boolean deleteSchedule(ScheduleDTO dto) throws Exception;

    public boolean updateSchedule(ScheduleDTO dto) throws Exception;

    public ScheduleDTO searchSchedule(ScheduleDTO dto) throws Exception;

    public ArrayList<ScheduleDTO> getAllSchedules() throws Exception;

}
