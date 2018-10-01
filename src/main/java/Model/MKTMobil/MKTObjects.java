package Model.MKTMobil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MKTObjects {
	
	//Element Type 1
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    public WebElement DenemeKazaEkle2;
    
    
    
	public static String DenemeKazaEkle = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView";
	public static String MesajPopup = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout";

	public static String KKTButton1 = "(//android.widget.Button[@content-desc=\"Mobil Kaza Tutanaðý\"])[1]";
	public static String KKTButton2 = "(//android.widget.Button[@content-desc=\"Mobil Kaza Tutanaðý\"])[2]";
	public static String KKTButton5 = "(//android.widget.Button[@content-desc=\"Mobil Kaza Tutanaðý\"])[5]";
	public static String GeriButton = "(//android.widget.Button[@content-desc=\"Mobil Kaza Tutanaðý\"])[3]";
	
	public static String KazaYogunlukListBox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Spinner/android.widget.TextView";
	
	public static String YardimText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[5]/android.widget.TextView"; 
	
	
}
