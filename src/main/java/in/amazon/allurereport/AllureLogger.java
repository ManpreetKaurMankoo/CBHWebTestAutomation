package in.amazon.allurereport;

import java.util.Arrays;

import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;

public final class AllureLogger {

	private AllureLogger() {}

	public static void addAllureLog(String msg) {
		Allure.step(msg);
	}

	public static void addAllureLog(String msg, Status status) {
		Allure.step(msg, status);
	}

	public static void addAllureLog(String testCaseName, String msg) {
		Allure.step("'" + testCaseName + "'" + msg);
	}

	public static void addAllureLog(String testCaseName, String msg, Status status) {
		Allure.step("'" + testCaseName + "'" + msg, status);
	}

	public static void allStackTraceLogOnTestFailure(ITestResult result, Status status) {
		Allure.step(result.getThrowable().toString(), status);
		Allure.step(Arrays.toString(result.getThrowable().getStackTrace()), status);
	}

}
