package in.amazon.configconverters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import in.amazon.driver.enums.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

	@Override
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> browserTypeMap = Map.of("CHROME", BrowserType.CHROME);
		return browserTypeMap.getOrDefault(browserName.trim().toUpperCase(), BrowserType.CHROME);
	}

}