package Test.Sigortam360;

import static Keywords.Keywords.*;
import org.junit.Test;
import Core.MobileCore;
import Model.Sigortam360.Sigortam360Objects;


public class LoginTest extends MobileCore{
	
	
    @Test
    public void Sigortam360Login() throws Exception {
	
    	WaitElementToBeClickable(ElementType.XPATH, Sigortam360Objects.SigortamLogoXpath);
    	SendKeys(ElementType.ID, Sigortam360Objects.Email, Sigortam360Objects.LoginMailData);
    	SendKeys(ElementType.ID, Sigortam360Objects.Password, Sigortam360Objects.LoginPasswordData);
    	Click(ElementType.XPATH, Sigortam360Objects.GirisXpath);
    	
    }


	

}