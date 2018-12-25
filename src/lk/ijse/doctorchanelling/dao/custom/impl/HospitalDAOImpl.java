/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.custom.HospitalDAO;
import lk.ijse.doctorchanelling.entity.Hospital;

/**
 *
 * @author infomatics
 */
public class HospitalDAOImpl implements HospitalDAO {

    @Override
    public boolean add(Hospital entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Hospital VALUES (?,?)", entity.getHos_id(), entity.getHospital());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Hospital  WHERE hos_id=?", id);
    }

    @Override
    public ArrayList<Hospital> getAll() throws Exception {
        ArrayList<Hospital> hospitals = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Hospital ");
        while (rst.next()) {
            Hospital hospital = new Hospital(rst.getString(1), rst.getString(2));
            hospitals.add(hospital);
        }
        return hospitals;
    }

    @Override
    public boolean update(Hospital entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospital Search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
