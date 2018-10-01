package Test.MKTMobil;

import org.junit.Test;
import static Keywords.Keywords.*;
import Core.MobileCore;
import Model.MKTMobil.MKTObjects;


public class KKTGiris extends MobileCore{
		
    @Test
    public void KKTGirisTest() throws Exception {
	
    	WaitElementToBeClickable(ElementType.XPATH, MKTObjects.DenemeKazaEkle);
    	Click(ElementType.XPATH, MKTObjects.KKTButton1);
    	Sleep5();
    	Click(ElementType.XPATH, MKTObjects.MesajPopup);
    }

}
