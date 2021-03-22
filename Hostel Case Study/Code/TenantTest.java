import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenantTest {

    private Tenant tenant1, tenant2, tenant3;
    private PaymentList payments;
    private Payment pay1, pay2, pay3;

    @BeforeEach
    void setUp() {
        /**
         * create tenants
         */
        tenant1 = new Tenant("Mike Smith", 1);
        tenant2 = new Tenant("John Thomas", 2);
        tenant3 = new Tenant("Jamie Benz", 3);
        /**
         * create payments
         */
        pay1 = new Payment("April", 1000);
        pay2 = new Payment("April", 2000);
        pay3 = new Payment("April", 3000);
        /**
         *add payments to payment list
         */
        payments = new PaymentList(3);
        payments.add(pay1);
        payments.add(pay2);
        payments.add(pay3);
        /**
         *make payment for each tenant
         */
        tenant1.makePayment(pay1);
        tenant2.makePayment(pay2);
        tenant3.makePayment(pay3);
    }

    @AfterEach
    void tearDown() {
        payments = null;
    }

    /**
     * This tests the getName method in the Tenant class
     */
    @Test
    void getName() {
        assertNotEquals("Mike Tom", tenant1.getName());
        assertEquals("Mike Smith", tenant1.getName());
        //System.out.println(payments.getTotal());
    }

    /**
     * This tests the getRoom method in the Tenant class
     */
    @Test
    void getRoom() {
        assertNotNull(tenant1);
    }

    /**
     * This tests the getPayments method in the Tenant class
     */
    @Test
    void getPayments() {
       assertNotNull((tenant1.getPayments()));
    }
}