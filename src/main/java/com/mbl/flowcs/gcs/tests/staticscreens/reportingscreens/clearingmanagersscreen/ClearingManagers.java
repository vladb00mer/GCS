package com.mbl.flowcs.gcs.tests.staticscreens.reportingscreens.clearingmanagersscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.ClearingManagersPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

public class ClearingManagers extends GcsGemsTest {

   private ClearingManagersPage clearingManagersPage;
   private String clManagersTittle;





    //** Page Opening **//

    public void setClearingManagersPage(String search){

        clearingManagersPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToReportingSubItem().goToClearingManagers();
    }

    public String checkClManagersTittle(){

        return clearingManagersPage.getClManagersTittle(clManagersTittle);
    }








    public boolean closeDriver() {

        return clearingManagersPage.closeWebDriver();
    }

    //** SETTERS **//

    public void setClManagersTittle(String clManagersTittle){
        this.clearingManagersPage = clearingManagersPage;
    }







}
