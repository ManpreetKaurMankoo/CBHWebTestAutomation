package in.amazon.allurereport;

import java.util.LinkedHashMap;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;

public final class AllureManager {

	private AllureManager() {}

	static AllureLifecycle lifecycle = Allure.getLifecycle();

	private static ThreadLocal<LinkedHashMap<Object, String>> threadSafe = ThreadLocal.withInitial(LinkedHashMap::new);

	public static String getTestCase(Object key) {
		return threadSafe.get().get(key);
	}

	public static String setTestCase(String key, Object testCase) {
		return threadSafe.get().put(key, (String) testCase);
	}

	public void unload() {
		threadSafe.remove();
	}

}