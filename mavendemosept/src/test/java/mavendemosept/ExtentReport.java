package mavendemosept;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	static ExtentReports reports;
	static ExtentTest logger;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName=new SimpleDateFormat("'SampleDemo_'yyyymmddHHmm'.html'").format(new Date());
		String path="C:\\Users\\abhij\\Desktop\\ExtentReport\\"+fileName;
		
		reports=new ExtentReports(path);
		logger=reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO, "We have entered valid email ID");
		logger.log(LogStatus.PASS, "Enter email ID");
		logger.log(LogStatus.INFO, "We have entered valid email ID");
		logger.log(LogStatus.PASS, "Enter password");
		logger.log(LogStatus.PASS, "Click on login");
		
		logger=reports.startTest("Remember me");
		logger.log(LogStatus.INFO, "We have entered valid email ID");
		logger.log(LogStatus.PASS, "Enter email ID");
		logger.log(LogStatus.INFO, "We have entered valid email ID");
		logger.log(LogStatus.PASS, "Enter password");
		logger.log(LogStatus.PASS, "Click on Remember me");
		logger.log(LogStatus.FAIL, "Click on login");
		
		reports.endTest(logger);
		reports.flush();

	}

}
