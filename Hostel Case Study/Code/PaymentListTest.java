import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PaymentListTest {
    private PaymentList paymentList;
    private Payment payment1, payment2, payment3;
    private Object obj1, obj2, obj3, obj4, obj5;

    @BeforeEach
    void setUp() {
        paymentList = new PaymentList(3);
        payment1 = new Payment("April", 5000.00);
        payment2 = new Payment("May", 6000.00);
        payment3 = new Payment("June", 7000.00);
    }

    @AfterEach
    void tearDown() {
        paymentList = null;
    }

    /**
     * method to test for the total objects in the payment list
     */
    @Test
    void testTotalObjectsInList(){
        paymentList.add(obj1);
        paymentList.add(obj2);
        paymentList.add(obj3);
        paymentList.add(obj4);
        paymentList.add(obj5);
        assertTrue(paymentList.isFull());
        //assertTrue( paymentList.isFull());
        //System.out.println(paymentList.getTotal());
    }

    /**
     * This tests the getPayment method in the Payment list class
     */
    @Test
    void getPayment() {
        paymentList.add(payment1);
        paymentList.add(payment2);
        paymentList.add(payment3);
        assertEquals(payment2, paymentList.getPayment(2));
        //assertTrue(paymentList.isFull());
        //assertNotNull(paymentList.isFull());
        //System.out.println(payments.size());
    }

    /**
     * This is used to test the total amount paid in relation to the calculateTotalPay method in the payment list class
     */
    @Test
    void calculateTotalPaid() {
        paymentList.add(payment1);
        paymentList.add(payment2);
        paymentList.add(payment3);
        assertEquals(18000.00, paymentList.calculateTotalPaid());
    }
}