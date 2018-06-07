package com.mbl.flowcs.gcs.tests.common;

/**
 *
 * @author vmurashov
 */
public class GcsGemsTest {

    private String browser;
    private String resolution;
    private String user;

    
    private static final Long TIMEOUT = 10L;

    //getters section    
    public static Long getTIMEOUT() {
        return TIMEOUT;
    }
    
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }    
}
