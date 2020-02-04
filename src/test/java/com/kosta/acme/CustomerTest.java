
package com.kosta.acme;

import com.kosta.acme.customer.Customer;
import com.kosta.acme.customer.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AcmeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CustomerTest {
    @Autowired
    CustomerRepository cr;

    @Test
    public void CustomerSaveTest() {
        //Given
        Customer customer = new Customer("성열", "윤", "잡", "산업", "xxx@gmail.com", "010123456789", false);
        //When
        cr.save(customer);
        Customer customer2= cr.findAll().iterator().next();
        //Then
        assertEquals(customer.getFisrtName(), customer2.getFisrtName());
        //
    }
}
