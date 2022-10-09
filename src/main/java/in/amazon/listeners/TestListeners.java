package in.amazon.listeners;

import static in.amazon.allurereport.AllureLogger.addAllureLog;
import static in.amazon.allurereport.AllureLogger.allStackTraceLogOnTestFailure;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.model.Status;

public class TestListeners implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		/*
		 * No implementation required as of now
		 */
	}

	@Override
	public void onFinish(ISuite suite) {
		/*
		 * No implementation required as of now
		 */
	}

	@Override
	public void onTestStart(ITestResult result) {
		addAllureLog(result.getMethod().getMethodName(), " test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		addAllureLog(result.getMethod().getMethodName(), " test is passed", Status.PASSED);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		addAllureLog(result.getMethod().getMethodName(), " test is failed", Status.FAILED);
		allStackTraceLogOnTestFailure(result, Status.FAILED);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		addAllureLog(result.getMethod().getMethodName(), " test is skipped", Status.SKIPPED);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		/*
		 * No implementation required as of now
		 */
	}

	@Override
	public void onStart(ITestContext context) {
		/*
		 * No implementation required as of now
		 */
	}

	@Override
	public void onFinish(ITestContext context) {
		/*
		 * No implementation required as of now
		 */
	}

}
