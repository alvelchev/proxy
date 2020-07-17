package com.springboot.swagger.resource;

import com.springboot.swagger.ImployeeRepository.InvoiceRepository;
import com.springboot.swagger.model.Invoice;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/rest/invoice")
@Api(value = "Invoices Resource REST Endpoint", description = "Shows the invoices info")
public class InvoicesResource {

  
    @Autowired
    InvoiceRepository invoiceRepository;
    
    public void setEmployeeService(InvoiceRepository invoiceRepository) {
  this.invoiceRepository = invoiceRepository;
 }
//JPA
//    @GetMapping
//    public List<Invoice> getInvoice() {
//        List<Invoice> invoices = invoiceRepository.findAll();
//  return invoices;
//        
//
//    }
    
     @GetMapping
    public List<Invoice> getInvoice() {

        return Arrays.asList(
                new Invoice("a", "c", "d", "r", "y", "q", "a"),
                new Invoice("a", "c", "d", "r", "y", "q", "a")
        );
    }

    @GetMapping("/{invoice}")
    public Invoice getInvoice(@PathVariable("invoice") final String userName)
    {
        return  new Invoice("a", "c", "d", "r", "y", "q", "a");
    }


//    private class Invoice {
//
//        @ApiModelProperty(notes = "name of the User")
//        private String invoice;
//
//        @ApiModelProperty(notes = "salary of the user")
//        private Long salary;
//
//        public Invoice(String userName, Long salary) {
//            this.invoice = userName;
//            this.salary = salary;
//        }
//
//        public String getUserName() {
//            return invoice;
//        }
//
//        public void setUserName(String invoice) {
//            this.invoice = invoice;
//        }
//
//        public Long getSalary() {
//            return salary;
//        }
//
//        public void setSalary(Long salary) {
//            this.salary = salary;
//        }
//    }
}
