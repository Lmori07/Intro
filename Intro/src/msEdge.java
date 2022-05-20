import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class msEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
	         "C:\\Users\\Lmori\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	      //instance of EdgeDriver
	      WebDriver driver = new EdgeDriver();

	}

}
