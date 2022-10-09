package in.amazon.utils.dynamicxpath;

public final class DynamicXpathService {

	private DynamicXpathService() {}

	public static String generateDynamicXpath(String xpath, Object replacingValueType) {
		return DynamicXpathUtils.getDynamicXpath(xpath, replacingValueType);
	}

	public static String generateDynamicXpath(String xpath, Object replacingValueType1, Object replacingValueType2) {
		return DynamicXpathUtils.getDynamicXpath(xpath, replacingValueType1, replacingValueType2);
	}

}
