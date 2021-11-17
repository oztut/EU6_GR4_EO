package com.openlyCrm.pages;

import com.openlyCrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }


}
