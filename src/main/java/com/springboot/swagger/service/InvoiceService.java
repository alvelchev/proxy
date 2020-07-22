/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.swagger.service;

import com.springboot.swagger.InvoiceRepository.InvoiceRepository;
import com.springboot.swagger.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alvel
 */
@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public void setInvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
    
        public void deleteInvoice(Integer invoice) {
        invoiceRepository.deleteById(invoice);
    }


}
