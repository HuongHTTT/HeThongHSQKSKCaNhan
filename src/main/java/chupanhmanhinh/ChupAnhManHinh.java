package chupanhmanhinh;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ChupAnhManHinh {
	public static void chupAnhManHinh(WebDriver driver, String fileWithPath) throws IOException {
		//chuyen doi doi tuong webdriver toi takeScreenshot
		TakesScreenshot scrShort = (TakesScreenshot) driver;
		//goi method getScreenshotAs de tao 1 file anh
		File scrFile = scrShort.getScreenshotAs(OutputType.FILE);
		//di chuyen anh den mot noi moi
		File destFile = new File(fileWithPath);
		FileUtils.copyFile(scrFile, destFile);

	}
	
}
