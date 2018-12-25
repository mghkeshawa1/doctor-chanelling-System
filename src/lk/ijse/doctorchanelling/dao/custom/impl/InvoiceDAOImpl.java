/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.custom.InvoiceDAO;
import lk.ijse.doctorchanelling.entity.Invoice;

/**
 *
 * @author infomatics
 */
public class InvoiceDAOImpl implements InvoiceDAO {

    @Override
    public boolean add(Invoice entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Invoice VALUES (?,?,?,?,?,?,?,?)", entity.getInvoice_code(), entity.getAppo_id(), entity.getAmount(), entity.getPayment(), entity.getBalance(), entity.getInvoice_date(), entity.getStatus(), entity.getVat_id());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Invoice  WHERE invoice_code=?", id);
    }

    @Override
    public boolean update(Invoice entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Invoice SET appo_id=?,amount=?,payment =?,balance=?, invoice_date=?,status =?, vat_id=? WHERE invoice_code", entity.getAppo_id(), entity.getAmount(), entity.getAmount(), entity.getPayment(), entity.getBalance(), entity.getInvoice_date(), entity.getStatus(), entity.getVat_id(), entity.getInvoice_code());
    }

    @Override
    public Invoice Search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Invoice WHERE invoice_code=?", id);
        if (rst.next()) {
            return new Invoice(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6), rst.getString(7), rst.getString(8));
        }
        return null;
    }

    @Override
    public ArrayList<Invoice> getAll() throws Exception {
        ArrayList<Invoice> invoices = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Invoice ");
        while (rst.next()) {
            Invoice invoice = new Invoice(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6), rst.getString(7), rst.getString(8));
            invoices.add(invoice);
        }
        return invoices;
    }

}
