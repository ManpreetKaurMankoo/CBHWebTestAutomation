package in.amazon.utils.dynamicxpath;

public final class DynamicXpathUtils {

	private DynamicXpathUtils() {}

	public static String getDynamicXpath(String xpath, Object replacingValueType) {
		return String.format(xpath, replacingValueType);
	}

	public static String getDynamicXpath(String xpath, Object replacingValueType1, Object replacingValueType2) {
		return String.format(xpath, replacingValueType1, replacingValueType2);
	}

}
