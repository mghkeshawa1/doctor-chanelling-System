/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business.custom;

import java.util.ArrayList;
import lk.ijse.doctorchanelling.business.SuperBO;
import lk.ijse.doctorchanelling.models.InvoiceDTO;

/**
 *
 * @author infomatics
 */
public interface InvoiceBO extends SuperBO{
    
    public boolean addInvoice(InvoiceDTO dto) throws Exception;

    public boolean deleteInvoice(String id) throws Exception;

    public boolean updateInvoice(InvoiceDTO dto) throws Exception;

    public InvoiceDTO Invoice(String id) throws Exception;

    public ArrayList<InvoiceDTO> getAllInvoices() throws Exception;
}
