package com.springboot.swagger.InvoiceRepository;

import com.springboot.swagger.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/*
@Modifying-to mark delete or update query
@Query(value = "DELETE FROM Invoice e WHERE e.id = :id") - it will delete all the record with specific passed param
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
// new version CrudRepository ( >= 7,but we have to think about taking a list of Invoices with Iterator !
    @Modifying
    @Query(value = "DELETE FROM Invoice e WHERE e.id = :id")
    int deleteById(@Param("id") Integer id);
}
