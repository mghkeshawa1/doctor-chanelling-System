/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.custom.SpecialityDAO;
import lk.ijse.doctorchanelling.entity.Speciality;

/**
 *
 * @author infomatics
 */
public class SpecialityDAOImpl implements SpecialityDAO{

    @Override
    public boolean add(Speciality entity) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO Speciality VALUES (?,?)", entity.getSpe_id(), entity.getSpecility());
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM Speciality  WHERE spe_id =?", id);
    }

    @Override
    public boolean update(Speciality entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Speciality Search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Speciality> getAll() throws Exception {
         ArrayList<Speciality> specialities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM speciality ");
        while (rst.next()) {
            Speciality speciality = new Speciality(rst.getString(1), rst.getString(2));
            specialities.add(speciality);
        }
        return specialities;
    }
    
}
