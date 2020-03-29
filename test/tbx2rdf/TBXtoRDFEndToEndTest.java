/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbx2rdf;

import org.junit.Test;

/**
 *
 * @author elahi
 */
public class TBXtoRDFEndToEndTest {
    
    private final String propertiesFileName="test/resources/tbx2rdf.properties";
    private Boolean lenientValue=true;

    @Test
    public void testAllResources() throws Exception {
        String propFile=propertiesFileName;
        String[] args={propFile};
        Main.main(args,true);
       
    }

}
