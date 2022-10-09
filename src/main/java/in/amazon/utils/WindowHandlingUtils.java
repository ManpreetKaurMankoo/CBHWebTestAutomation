package in.amazon.utils;

import java.util.LinkedHashMap;

public final class WindowHandlingUtils {

	private WindowHandlingUtils() {}

	private static ThreadLocal<LinkedHashMap<String, String>> windowThreadSafe = ThreadLocal.withInitial(LinkedHashMap::new);

	public static String getParentWindowHandle(String key) {
		return windowThreadSafe.get().get(key);
	}

	public static String setParentWindowHandle(String key, String parentWindow) {
		return windowThreadSafe.get().put(key, parentWindow);
	}

	public void unload() {
		windowThreadSafe.remove();
	}

}
