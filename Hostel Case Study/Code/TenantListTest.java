import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class TenantListTest {
    private TenantList tenantList;
    private Tenant tenant1, tenant2, tenant3, tenant4, tenant5;


    @BeforeEach
    void setUp() {
        /**
         * set size of tenants in the list to 5 i.e 0-5
         */
         tenantList = new TenantList(5);
         tenant1 = new Tenant("Morgan John", 1);
         tenant2 = new Tenant("Mitchel Milan", 2);
         tenant3 = new Tenant("Gray Aims", 3);
         tenant4 = new Tenant("White Smiles", 4);
         tenant5 = new Tenant("Michael Smith", 5);
        /**
         * add tenants to the list
         */
        tenantList.add(tenant1);
        tenantList.add(tenant2);
        tenantList.add(tenant3);
        tenantList.add(tenant4);
        tenantList.add(tenant5);
    }

    /**
     * set tenantlist to null after test has been carried out
     */
    @AfterEach
    void tearDown() {
        tenantList = null;
    }

    @Test
    void search() {
        assertNotNull(tenantList.search(1));
        //assertEquals(tenant3, tenantList.search(tenant3.getRoom()));
        //assertEquals(tenant1, tenantList.search(1));
       // assertEquals(1, tenantList.search(1));
    }

    /**
     * This tests for the remove method in the Tenant list class
     */
    @Test
    void removeTenant() {
        assertEquals(true, tenantList.removeTenant(4));
        /**
         * integer value will not work for the expected value because the method is a boolean
         */
        //assertEquals(tenant1.getRoom(), tenantList.removeTenant(1));
        //assertTrue(tenantList.removeTenant(8));
    }
}