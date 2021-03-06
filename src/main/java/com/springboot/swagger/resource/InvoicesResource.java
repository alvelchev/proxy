package com.springboot.swagger.resource;

import com.springboot.swagger.InvoiceRepository.InvoiceRepository;
import com.springboot.swagger.model.Invoice;
import com.springboot.swagger.service.InvoiceService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rest/invoice")
@Api(value = "Invoices Resource REST Endpoint", description = "Shows the invoices info")
public class InvoicesResource {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    InvoiceService invoiceService;

    public void setInvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

//JPA
    @GetMapping
    public List<Invoice> getInvoice() {
        List<Invoice> invoices = invoiceRepository.findAll();
        return invoices;
    }

    //Hardcoded values
//     @GetMapping
//    public List<Invoice> getInvoice() {
//
//        return Arrays.asList(
//                new Invoice("a", "c", "d", "r", "y", "q", "a"),
//                new Invoice("a", "c", "d", "r", "y", "q", "a")
//        );
//    }
    @GetMapping("/{invoice}")
    public Invoice getInvoice(@PathVariable("invoice") final String userName) {
        return new Invoice("a", "c", "d", "r", "y", "q", "a");
    }

    @PostMapping("/api/invoices")
    public void saveEmployee(Invoice invoices) {
        invoiceService.saveInvoice(invoices);
        System.out.println("Invoice Saved Successfully");
    }
    
    
    @PostMapping("/api/invoices1")
    public void saveEmployee1(@RequestBody Invoice invoices) {
        invoiceService.saveInvoice(invoices);
        System.out.println("Invoice Saved Successfully");
    }
    
        @DeleteMapping("/api/invoices/{id}")
    public void deleteInvoice(@PathVariable("id") Integer id) {
        if (id != null) {
            invoiceRepository.delete(id);
        }
    }

}
