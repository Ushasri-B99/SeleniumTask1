package testReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG {
	static public ExtentReports extentReport;
    public static ExtentReports getReportObject() {
        String path = "D:\\Selenium Examples\\Webstore\\ExtentReports\\report.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setEncoding("utf-8");
        extentSparkReporter.config().setDocumentTitle("Automation Report For Shop App (Task-1");
        extentSparkReporter.config().setReportName("Automation Test Results");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentReport = new ExtentReports();
        extentReport.attachReporter(extentSparkReporter);
        extentReport.setSystemInfo("Automation Tester", "Ushasri");
        return extentReport;
    }
}
