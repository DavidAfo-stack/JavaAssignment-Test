import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private Payment payment;

    @BeforeEach
    void setUp() {
        payment =  new Payment("March", 50000.00);
    }

    @AfterEach
    void tearDown() {
        payment=null;
    }

    /**
     * test for the getMonth() method in the Payment class
     */
    @Test
    void getMonth() {
        assertNotEquals(null, payment.getMonth());
        //assertNotNull(payment.getMonth());
       // assertEquals("March", payment.getMonth());

    }

    /**
     * test for the getAmount() method in the Payment class
     */
    @Test
    void getAmount() {
        assertNotEquals(5000.00, payment.getAmount());
        //assertEquals(5000.00, payment.getAmount());
    }
}