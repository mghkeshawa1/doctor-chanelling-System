/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.RoomDTO;

/**
 *
 * @author infomatics
 */
public interface RoomBO extends SuperBO {

    public boolean addRoom(RoomDTO dto) throws Exception;

    public boolean deleteRoom(RoomDTO dto) throws Exception;

    public boolean updateRoom(RoomDTO dto) throws Exception;

    public RoomDTO searchRoom(RoomDTO dto) throws Exception;

    public ArrayList<RoomDTO> getAllRooms() throws Exception;
}
