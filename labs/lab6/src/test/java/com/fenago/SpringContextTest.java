package com.fenago;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fenago.ecommerce.EcommerceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EcommerceApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
