/**
 * Auto generated file comment
 */
package org.openmrs.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.BaseTest;
import org.openmrs.api.context.Context;

/**
 *
 */
public class SynchronizationCreateChildTest extends BaseTest {

    private Log log = LogFactory.getLog(this.getClass());
    
    protected void onSetUpBeforeTransaction() throws Exception {
        super.onSetUpBeforeTransaction();
        authenticate();
    }
    
    public void testCreateDatabaseForChild() throws Exception {
        assertTrue(Context.isAuthenticated());
        SynchronizationService syncService = Context.getSynchronizationService();
        syncService.createDatabaseForChild(null, System.out);
    }
    
}
